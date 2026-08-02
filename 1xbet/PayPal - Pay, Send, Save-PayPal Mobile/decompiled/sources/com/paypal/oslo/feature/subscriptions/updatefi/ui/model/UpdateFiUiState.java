package com.paypal.oslo.feature.subscriptions.updatefi.ui.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "Success", "Loading", "Error", "BannerState", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$Error;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$Loading;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface UpdateFiUiState extends com.paypal.oslo.core.mvi.UiState {

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ`\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010\u001dR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0016R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b\u000b\u0010\u001aR\u001a\u0010\f\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b1\u0010\u001aR\u001a\u0010\u000e\u001a\u00020\r8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b3\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$Success;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState;", "", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;", "fundingInstruments", "selectedFundingInstrument", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/BalanceFundingInstrumentUiModel;", "balanceFundingInstrumentUiModel", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$BannerState;", "bannerState", "", "isUpdating", "showDisclaimerLabel", "", "name", "<init>", "(Ljava/util/List;Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/BalanceFundingInstrumentUiModel;Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$BannerState;ZZLjava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;", "component3", "()Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/BalanceFundingInstrumentUiModel;", "component4", "()Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$BannerState;", "component5", "()Z", "component6", "component7", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/BalanceFundingInstrumentUiModel;Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$BannerState;ZZLjava/lang/String;)Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$Success;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getFundingInstruments", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;", "getSelectedFundingInstrument", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/BalanceFundingInstrumentUiModel;", "getBalanceFundingInstrumentUiModel", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$BannerState;", "getBannerState", "Z", "getShowDisclaimerLabel", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success implements com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.subscriptions.updatefi.ui.model.BalanceFundingInstrumentUiModel balanceFundingInstrumentUiModel;
        private final com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.BannerState bannerState;
        private final java.util.List<com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel> fundingInstruments;
        private final boolean isUpdating;
        private final java.lang.String name;
        private final com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel selectedFundingInstrument;
        private final boolean showDisclaimerLabel;

        public Success(java.util.List<com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel> list, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel, com.paypal.oslo.feature.subscriptions.updatefi.ui.model.BalanceFundingInstrumentUiModel balanceFundingInstrumentUiModel, com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.BannerState bannerState, boolean z, boolean z2, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerState, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.fundingInstruments = list;
            this.selectedFundingInstrument = fundingInstrumentUiModel;
            this.balanceFundingInstrumentUiModel = balanceFundingInstrumentUiModel;
            this.bannerState = bannerState;
            this.isUpdating = z;
            this.showDisclaimerLabel = z2;
            this.name = str;
        }

        public /* synthetic */ Success(java.util.List list, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel, com.paypal.oslo.feature.subscriptions.updatefi.ui.model.BalanceFundingInstrumentUiModel balanceFundingInstrumentUiModel, com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.BannerState.None none, boolean z, boolean z2, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : fundingInstrumentUiModel, (i & 4) == 0 ? balanceFundingInstrumentUiModel : null, (i & 8) != 0 ? com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.BannerState.None.INSTANCE : none, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? "UpdateFiSuccess" : str);
        }

        public final java.util.List<com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel> getFundingInstruments() {
            return this.fundingInstruments;
        }

        public final com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel getSelectedFundingInstrument() {
            return this.selectedFundingInstrument;
        }

        public final com.paypal.oslo.feature.subscriptions.updatefi.ui.model.BalanceFundingInstrumentUiModel getBalanceFundingInstrumentUiModel() {
            return this.balanceFundingInstrumentUiModel;
        }

        public final com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.BannerState getBannerState() {
            return this.bannerState;
        }

        public final boolean isUpdating() {
            return this.isUpdating;
        }

        public final boolean getShowDisclaimerLabel() {
            return this.showDisclaimerLabel;
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel> list = this.fundingInstruments;
            com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel = this.selectedFundingInstrument;
            com.paypal.oslo.feature.subscriptions.updatefi.ui.model.BalanceFundingInstrumentUiModel balanceFundingInstrumentUiModel = this.balanceFundingInstrumentUiModel;
            com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.BannerState bannerState = this.bannerState;
            boolean z = this.isUpdating;
            boolean z2 = this.showDisclaimerLabel;
            java.lang.String str = this.name;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(fundingInstruments=");
            sb.append(list);
            sb.append(", selectedFundingInstrument=");
            sb.append(fundingInstrumentUiModel);
            sb.append(", balanceFundingInstrumentUiModel=");
            sb.append(balanceFundingInstrumentUiModel);
            sb.append(", bannerState=");
            sb.append(bannerState);
            sb.append(", isUpdating=");
            sb.append(z);
            sb.append(", showDisclaimerLabel=");
            sb.append(z2);
            sb.append(", name=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.fundingInstruments.hashCode();
            com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel = this.selectedFundingInstrument;
            int hashCode2 = fundingInstrumentUiModel == null ? 0 : fundingInstrumentUiModel.hashCode();
            com.paypal.oslo.feature.subscriptions.updatefi.ui.model.BalanceFundingInstrumentUiModel balanceFundingInstrumentUiModel = this.balanceFundingInstrumentUiModel;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + (balanceFundingInstrumentUiModel != null ? balanceFundingInstrumentUiModel.hashCode() : 0)) * 31) + this.bannerState.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isUpdating)) * 31) + java.lang.Boolean.hashCode(this.showDisclaimerLabel)) * 31) + this.name.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.Success success = (com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstruments, success.fundingInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedFundingInstrument, success.selectedFundingInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.balanceFundingInstrumentUiModel, success.balanceFundingInstrumentUiModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.bannerState, success.bannerState) && this.isUpdating == success.isUpdating && this.showDisclaimerLabel == success.showDisclaimerLabel && kotlin.jvm.internal.Intrinsics.areEqual(this.name, success.name);
        }

        public final com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.Success copy(java.util.List<com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel> fundingInstruments, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel selectedFundingInstrument, com.paypal.oslo.feature.subscriptions.updatefi.ui.model.BalanceFundingInstrumentUiModel balanceFundingInstrumentUiModel, com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.BannerState bannerState, boolean isUpdating, boolean showDisclaimerLabel, java.lang.String name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstruments, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerState, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.Success(fundingInstruments, selectedFundingInstrument, balanceFundingInstrumentUiModel, bannerState, isUpdating, showDisclaimerLabel, name2);
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getShowDisclaimerLabel() {
            return this.showDisclaimerLabel;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsUpdating() {
            return this.isUpdating;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.BannerState getBannerState() {
            return this.bannerState;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.updatefi.ui.model.BalanceFundingInstrumentUiModel getBalanceFundingInstrumentUiModel() {
            return this.balanceFundingInstrumentUiModel;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel getSelectedFundingInstrument() {
            return this.selectedFundingInstrument;
        }

        public final java.util.List<com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel> component1() {
            return this.fundingInstruments;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.Success copy$default(com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.Success success, java.util.List list, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel, com.paypal.oslo.feature.subscriptions.updatefi.ui.model.BalanceFundingInstrumentUiModel balanceFundingInstrumentUiModel, com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.BannerState bannerState, boolean z, boolean z2, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = success.fundingInstruments;
            }
            if ((i & 2) != 0) {
                fundingInstrumentUiModel = success.selectedFundingInstrument;
            }
            com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel2 = fundingInstrumentUiModel;
            if ((i & 4) != 0) {
                balanceFundingInstrumentUiModel = success.balanceFundingInstrumentUiModel;
            }
            com.paypal.oslo.feature.subscriptions.updatefi.ui.model.BalanceFundingInstrumentUiModel balanceFundingInstrumentUiModel2 = balanceFundingInstrumentUiModel;
            if ((i & 8) != 0) {
                bannerState = success.bannerState;
            }
            com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.BannerState bannerState2 = bannerState;
            if ((i & 16) != 0) {
                z = success.isUpdating;
            }
            boolean z3 = z;
            if ((i & 32) != 0) {
                z2 = success.showDisclaimerLabel;
            }
            boolean z4 = z2;
            if ((i & 64) != 0) {
                str = success.name;
            }
            return success.copy(list, fundingInstrumentUiModel2, balanceFundingInstrumentUiModel2, bannerState2, z3, z4, str);
        }

        public Success() {
            this(null, null, null, null, false, false, null, 127, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$Loading;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading implements com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.Loading INSTANCE = new com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.Loading();
        private static final java.lang.String name = "UpdateFiLoading";

        public final int hashCode() {
            return 1435517913;
        }

        private Loading() {
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return name;
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007R\u001a\u0010\u0017\u001a\u00020\u00128\u0017X\u0097D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$Error;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "errorContext", "<init>", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;)V", "component1", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "copy", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;)Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "getErrorContext", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error implements com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext;
        private final java.lang.String name;

        public Error(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorContext, "");
            this.errorContext = errorContext;
            this.name = "UpdateFiError";
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext getErrorContext() {
            return this.errorContext;
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext = this.errorContext;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorContext=");
            sb.append(errorContext);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errorContext.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorContext, ((com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.Error) other).errorContext);
        }

        public final com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.Error copy(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorContext, "");
            return new com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.Error(errorContext);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext getErrorContext() {
            return this.errorContext;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.Error copy$default(com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.Error error, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                errorContext = error.errorContext;
            }
            return error.copy(errorContext);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$BannerState;", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, com.google.common.net.HttpHeaders.WARNING, "Error", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$BannerState$Error;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$BannerState$None;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$BannerState$Warning;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface BannerState {

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$BannerState$None;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$BannerState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class None implements com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.BannerState {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.BannerState.None INSTANCE = new com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.BannerState.None();

            public final int hashCode() {
                return -1732748060;
            }

            private None() {
            }

            public final java.lang.String toString() {
                return com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE;
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.BannerState.None)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$BannerState$Warning;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$BannerState;", "ChooseWayToPayIfFirstFiCantCover", "ChooseWayToPayToContinue", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$BannerState$Warning$ChooseWayToPayIfFirstFiCantCover;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$BannerState$Warning$ChooseWayToPayToContinue;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public interface Warning extends com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.BannerState {

            @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$BannerState$Warning$ChooseWayToPayIfFirstFiCantCover;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$BannerState$Warning;", "PayPalBalance", "PayPalDebit", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$BannerState$Warning$ChooseWayToPayIfFirstFiCantCover$PayPalBalance;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$BannerState$Warning$ChooseWayToPayIfFirstFiCantCover$PayPalDebit;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public interface ChooseWayToPayIfFirstFiCantCover extends com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.BannerState.Warning {

                @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$BannerState$Warning$ChooseWayToPayIfFirstFiCantCover$PayPalBalance;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$BannerState$Warning$ChooseWayToPayIfFirstFiCantCover;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final /* data */ class PayPalBalance implements com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.BannerState.Warning.ChooseWayToPayIfFirstFiCantCover {
                    public static final int $stable = 0;
                    public static final com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.BannerState.Warning.ChooseWayToPayIfFirstFiCantCover.PayPalBalance INSTANCE = new com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.BannerState.Warning.ChooseWayToPayIfFirstFiCantCover.PayPalBalance();

                    public final int hashCode() {
                        return -520531509;
                    }

                    private PayPalBalance() {
                    }

                    public final java.lang.String toString() {
                        return "PayPalBalance";
                    }

                    public final boolean equals(java.lang.Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.BannerState.Warning.ChooseWayToPayIfFirstFiCantCover.PayPalBalance)) {
                            return false;
                        }
                        return true;
                    }
                }

                @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$BannerState$Warning$ChooseWayToPayIfFirstFiCantCover$PayPalDebit;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$BannerState$Warning$ChooseWayToPayIfFirstFiCantCover;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final /* data */ class PayPalDebit implements com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.BannerState.Warning.ChooseWayToPayIfFirstFiCantCover {
                    public static final int $stable = 0;
                    public static final com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.BannerState.Warning.ChooseWayToPayIfFirstFiCantCover.PayPalDebit INSTANCE = new com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.BannerState.Warning.ChooseWayToPayIfFirstFiCantCover.PayPalDebit();

                    public final int hashCode() {
                        return -1236572261;
                    }

                    private PayPalDebit() {
                    }

                    public final java.lang.String toString() {
                        return "PayPalDebit";
                    }

                    public final boolean equals(java.lang.Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.BannerState.Warning.ChooseWayToPayIfFirstFiCantCover.PayPalDebit)) {
                            return false;
                        }
                        return true;
                    }
                }
            }

            @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$BannerState$Warning$ChooseWayToPayToContinue;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$BannerState$Warning;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class ChooseWayToPayToContinue implements com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.BannerState.Warning {
                public static final int $stable = 0;
                public static final com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.BannerState.Warning.ChooseWayToPayToContinue INSTANCE = new com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.BannerState.Warning.ChooseWayToPayToContinue();

                public final int hashCode() {
                    return -98147915;
                }

                private ChooseWayToPayToContinue() {
                }

                public final java.lang.String toString() {
                    return "ChooseWayToPayToContinue";
                }

                public final boolean equals(java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.BannerState.Warning.ChooseWayToPayToContinue)) {
                        return false;
                    }
                    return true;
                }
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$BannerState$Error;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$BannerState;", "UpdateFailed", "AddFiFailed", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$BannerState$Error$AddFiFailed;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$BannerState$Error$UpdateFailed;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public interface Error extends com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.BannerState {

            @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$BannerState$Error$UpdateFailed;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$BannerState$Error;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class UpdateFailed implements com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.BannerState.Error {
                public static final int $stable = 0;
                public static final com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.BannerState.Error.UpdateFailed INSTANCE = new com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.BannerState.Error.UpdateFailed();

                public final int hashCode() {
                    return 349751640;
                }

                private UpdateFailed() {
                }

                public final java.lang.String toString() {
                    return "UpdateFailed";
                }

                public final boolean equals(java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.BannerState.Error.UpdateFailed)) {
                        return false;
                    }
                    return true;
                }
            }

            @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$BannerState$Error$AddFiFailed;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiUiState$BannerState$Error;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class AddFiFailed implements com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.BannerState.Error {
                public static final int $stable = 0;
                public static final com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.BannerState.Error.AddFiFailed INSTANCE = new com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.BannerState.Error.AddFiFailed();

                public final int hashCode() {
                    return -1915311761;
                }

                private AddFiFailed() {
                }

                public final java.lang.String toString() {
                    return "AddFiFailed";
                }

                public final boolean equals(java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.BannerState.Error.AddFiFailed)) {
                        return false;
                    }
                    return true;
                }
            }
        }
    }
}
