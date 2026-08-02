package com.paypal.oslo.feature.savings.ui.home;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initial", "Loading", "Success", "Error", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeState$Error;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeState$Initial;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeState$Loading;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class SavingsHomeState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private SavingsHomeState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeState$Initial;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Initial INSTANCE = new com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Initial();

        public final int hashCode() {
            return -799913814;
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
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeState$Loading;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Loading INSTANCE = new com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Loading();

        public final int hashCode() {
            return 1883361954;
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
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0014Jr\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b*\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b\u0003\u0010\u0014R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b\u0007\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u0010\u001bR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u0010\u001dR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\b5\u0010\u001fR\u001a\u0010\u0010\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010+\u001a\u0004\b6\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeState$Success;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeState;", "", "isFeatureAvailable", "", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/SavingsHubTileDTO;", "savingsHubData", "isLoading", "electronic1099OptIn", "", "savingsAccountId", "", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/registry/SavingsHubComponentType;", "loadingTileTypes", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "goalForSuccessSheet", "shouldAutoShowTaxPreferencePrompt", "<init>", "(ZLjava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/util/Set;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Z)V", "component1", "()Z", "component2", "()Ljava/util/List;", "component3", "component4", "()Ljava/lang/Boolean;", "component5", "()Ljava/lang/String;", "component6", "()Ljava/util/Set;", "component7", "()Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "component8", "copy", "(ZLjava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/util/Set;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Z)Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeState$Success;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "Ljava/util/List;", "getSavingsHubData", "Ljava/lang/Boolean;", "getElectronic1099OptIn", "Ljava/lang/String;", "getSavingsAccountId", "Ljava/util/Set;", "getLoadingTileTypes", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "getGoalForSuccessSheet", "getShouldAutoShowTaxPreferencePrompt"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeState {
        public static final int $stable = 8;
        private final java.lang.Boolean electronic1099OptIn;
        private final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalForSuccessSheet;
        private final boolean isFeatureAvailable;
        private final boolean isLoading;
        private final java.util.Set<com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType> loadingTileTypes;
        private final java.lang.String savingsAccountId;
        private final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.SavingsHubTileDTO> savingsHubData;
        private final boolean shouldAutoShowTaxPreferencePrompt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Success(boolean z, java.util.List<? extends com.paypal.oslo.feature.savings.domain.model.savingshub.dto.SavingsHubTileDTO> list, boolean z2, java.lang.Boolean bool, java.lang.String str, java.util.Set<? extends com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType> set, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, boolean z3) {
            super("Success", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
            this.isFeatureAvailable = z;
            this.savingsHubData = list;
            this.isLoading = z2;
            this.electronic1099OptIn = bool;
            this.savingsAccountId = str;
            this.loadingTileTypes = set;
            this.goalForSuccessSheet = goalSummaryDTO;
            this.shouldAutoShowTaxPreferencePrompt = z3;
        }

        public final boolean isFeatureAvailable() {
            return this.isFeatureAvailable;
        }

        public /* synthetic */ Success(boolean z, java.util.List list, boolean z2, java.lang.Boolean bool, java.lang.String str, java.util.Set set, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, boolean z3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : str, (i & 32) != 0 ? kotlin.collections.SetsKt.emptySet() : set, (i & 64) == 0 ? goalSummaryDTO : null, (i & 128) == 0 ? z3 : false);
        }

        public final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.SavingsHubTileDTO> getSavingsHubData() {
            return this.savingsHubData;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public final java.lang.Boolean getElectronic1099OptIn() {
            return this.electronic1099OptIn;
        }

        public final java.lang.String getSavingsAccountId() {
            return this.savingsAccountId;
        }

        public final java.util.Set<com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType> getLoadingTileTypes() {
            return this.loadingTileTypes;
        }

        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoalForSuccessSheet() {
            return this.goalForSuccessSheet;
        }

        public final boolean getShouldAutoShowTaxPreferencePrompt() {
            return this.shouldAutoShowTaxPreferencePrompt;
        }

        public final java.lang.String toString() {
            boolean z = this.isFeatureAvailable;
            java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.SavingsHubTileDTO> list = this.savingsHubData;
            boolean z2 = this.isLoading;
            java.lang.Boolean bool = this.electronic1099OptIn;
            java.lang.String str = this.savingsAccountId;
            java.util.Set<com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType> set = this.loadingTileTypes;
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = this.goalForSuccessSheet;
            boolean z3 = this.shouldAutoShowTaxPreferencePrompt;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(isFeatureAvailable=");
            sb.append(z);
            sb.append(", savingsHubData=");
            sb.append(list);
            sb.append(", isLoading=");
            sb.append(z2);
            sb.append(", electronic1099OptIn=");
            sb.append(bool);
            sb.append(", savingsAccountId=");
            sb.append(str);
            sb.append(", loadingTileTypes=");
            sb.append(set);
            sb.append(", goalForSuccessSheet=");
            sb.append(goalSummaryDTO);
            sb.append(", shouldAutoShowTaxPreferencePrompt=");
            sb.append(z3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Boolean.hashCode(this.isFeatureAvailable);
            int hashCode2 = this.savingsHubData.hashCode();
            int hashCode3 = java.lang.Boolean.hashCode(this.isLoading);
            java.lang.Boolean bool = this.electronic1099OptIn;
            int hashCode4 = bool == null ? 0 : bool.hashCode();
            java.lang.String str = this.savingsAccountId;
            int hashCode5 = str == null ? 0 : str.hashCode();
            int hashCode6 = this.loadingTileTypes.hashCode();
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = this.goalForSuccessSheet;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (goalSummaryDTO != null ? goalSummaryDTO.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.shouldAutoShowTaxPreferencePrompt);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Success success = (com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Success) other;
            return this.isFeatureAvailable == success.isFeatureAvailable && kotlin.jvm.internal.Intrinsics.areEqual(this.savingsHubData, success.savingsHubData) && this.isLoading == success.isLoading && kotlin.jvm.internal.Intrinsics.areEqual(this.electronic1099OptIn, success.electronic1099OptIn) && kotlin.jvm.internal.Intrinsics.areEqual(this.savingsAccountId, success.savingsAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.loadingTileTypes, success.loadingTileTypes) && kotlin.jvm.internal.Intrinsics.areEqual(this.goalForSuccessSheet, success.goalForSuccessSheet) && this.shouldAutoShowTaxPreferencePrompt == success.shouldAutoShowTaxPreferencePrompt;
        }

        public final com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Success copy(boolean isFeatureAvailable, java.util.List<? extends com.paypal.oslo.feature.savings.domain.model.savingshub.dto.SavingsHubTileDTO> savingsHubData, boolean isLoading, java.lang.Boolean electronic1099OptIn, java.lang.String savingsAccountId, java.util.Set<? extends com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType> loadingTileTypes, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalForSuccessSheet, boolean shouldAutoShowTaxPreferencePrompt) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsHubData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadingTileTypes, "");
            return new com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Success(isFeatureAvailable, savingsHubData, isLoading, electronic1099OptIn, savingsAccountId, loadingTileTypes, goalForSuccessSheet, shouldAutoShowTaxPreferencePrompt);
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getShouldAutoShowTaxPreferencePrompt() {
            return this.shouldAutoShowTaxPreferencePrompt;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoalForSuccessSheet() {
            return this.goalForSuccessSheet;
        }

        public final java.util.Set<com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType> component6() {
            return this.loadingTileTypes;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getSavingsAccountId() {
            return this.savingsAccountId;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Boolean getElectronic1099OptIn() {
            return this.electronic1099OptIn;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.SavingsHubTileDTO> component2() {
            return this.savingsHubData;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsFeatureAvailable() {
            return this.isFeatureAvailable;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeState$Error;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "NetworkError", "GraphQLError", "UnknownError", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeState$Error$GraphQLError;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeState$Error$NetworkError;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeState$Error$UnknownError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Error extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeState {
        public static final int $stable = 0;

        private Error(java.lang.String str) {
            super(str, null);
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeState$Error$NetworkError;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeState$Error;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NetworkError extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Error {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Error.NetworkError INSTANCE = new com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Error.NetworkError();

            public final int hashCode() {
                return -854376038;
            }

            private NetworkError() {
                super("Error.Network", null);
            }

            public final java.lang.String toString() {
                return "NetworkError";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Error.NetworkError)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeState$Error$GraphQLError;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeState$Error;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeState$Error$GraphQLError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class GraphQLError extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Error {
            public static final int $stable = 0;
            private final java.lang.String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GraphQLError(java.lang.String str) {
                super("Error.GraphQL", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.message = str;
            }

            public final java.lang.String getMessage() {
                return this.message;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.message;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("GraphQLError(message=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.message.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Error.GraphQLError) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Error.GraphQLError) other).message);
            }

            public final com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Error.GraphQLError copy(java.lang.String message) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
                return new com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Error.GraphQLError(message);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getMessage() {
                return this.message;
            }

            public static /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Error.GraphQLError copy$default(com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Error.GraphQLError graphQLError, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = graphQLError.message;
                }
                return graphQLError.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeState$Error$UnknownError;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeState$Error;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeState$Error$UnknownError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class UnknownError extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Error {
            public static final int $stable = 0;
            private final java.lang.String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnknownError(java.lang.String str) {
                super("Error.Unknown", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.message = str;
            }

            public final java.lang.String getMessage() {
                return this.message;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.message;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("UnknownError(message=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.message.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Error.UnknownError) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Error.UnknownError) other).message);
            }

            public final com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Error.UnknownError copy(java.lang.String message) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
                return new com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Error.UnknownError(message);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getMessage() {
                return this.message;
            }

            public static /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Error.UnknownError copy$default(com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Error.UnknownError unknownError, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = unknownError.message;
                }
                return unknownError.copy(str);
            }
        }

        public /* synthetic */ Error(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    public /* synthetic */ SavingsHomeState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
