package com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\b\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\b\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initial", "Loading", "LoadingSingleCategory", "ReadySelection", "ReadyReview", "ReadyConfirmation", "Confirming", "Error", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionState$Confirming;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionState$Error;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionState$Initial;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionState$Loading;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionState$LoadingSingleCategory;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionState$ReadyConfirmation;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionState$ReadyReview;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionState$ReadySelection;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class CategorySelectionState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private CategorySelectionState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionState$Initial;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.Initial INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.Initial();

        public final int hashCode() {
            return -1665189676;
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
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionState$Loading;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.Loading INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.Loading();

        public final int hashCode() {
            return 1018086092;
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
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionState$LoadingSingleCategory;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadingSingleCategory extends com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.LoadingSingleCategory INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.LoadingSingleCategory();

        public final int hashCode() {
            return 795055954;
        }

        private LoadingSingleCategory() {
            super("LoadingSingleCategory", null);
        }

        public final java.lang.String toString() {
            return "LoadingSingleCategory";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.LoadingSingleCategory)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionState$ReadySelection;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionState;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/models/CategorySelectionUiData;", "categorySelectionUiData", "", "showValidationMessage", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/models/CategorySelectionUiData;Z)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/models/CategorySelectionUiData;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/models/CategorySelectionUiData;Z)Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionState$ReadySelection;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/models/CategorySelectionUiData;", "getCategorySelectionUiData", "Z", "getShowValidationMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReadySelection extends com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategorySelectionUiData categorySelectionUiData;
        private final boolean showValidationMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReadySelection(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategorySelectionUiData categorySelectionUiData, boolean z) {
            super("ReadySelection", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(categorySelectionUiData, "");
            this.categorySelectionUiData = categorySelectionUiData;
            this.showValidationMessage = z;
        }

        public /* synthetic */ ReadySelection(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategorySelectionUiData categorySelectionUiData, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(categorySelectionUiData, (i & 2) != 0 ? false : z);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategorySelectionUiData getCategorySelectionUiData() {
            return this.categorySelectionUiData;
        }

        public final boolean getShowValidationMessage() {
            return this.showValidationMessage;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategorySelectionUiData categorySelectionUiData = this.categorySelectionUiData;
            boolean z = this.showValidationMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReadySelection(categorySelectionUiData=");
            sb.append(categorySelectionUiData);
            sb.append(", showValidationMessage=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.categorySelectionUiData.hashCode() * 31) + java.lang.Boolean.hashCode(this.showValidationMessage);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadySelection)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadySelection readySelection = (com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadySelection) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.categorySelectionUiData, readySelection.categorySelectionUiData) && this.showValidationMessage == readySelection.showValidationMessage;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadySelection copy(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategorySelectionUiData categorySelectionUiData, boolean showValidationMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(categorySelectionUiData, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadySelection(categorySelectionUiData, showValidationMessage);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShowValidationMessage() {
            return this.showValidationMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategorySelectionUiData getCategorySelectionUiData() {
            return this.categorySelectionUiData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadySelection copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadySelection readySelection, com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategorySelectionUiData categorySelectionUiData, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                categorySelectionUiData = readySelection.categorySelectionUiData;
            }
            if ((i & 2) != 0) {
                z = readySelection.showValidationMessage;
            }
            return readySelection.copy(categorySelectionUiData, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionState$ReadyReview;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionState;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/models/CategorySelectionUiData;", "categorySelectionUiData", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/models/CategorySelectionUiData;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/models/CategorySelectionUiData;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/models/CategorySelectionUiData;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionState$ReadyReview;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/models/CategorySelectionUiData;", "getCategorySelectionUiData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReadyReview extends com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategorySelectionUiData categorySelectionUiData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReadyReview(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategorySelectionUiData categorySelectionUiData) {
            super("ReadyReview", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(categorySelectionUiData, "");
            this.categorySelectionUiData = categorySelectionUiData;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategorySelectionUiData getCategorySelectionUiData() {
            return this.categorySelectionUiData;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategorySelectionUiData categorySelectionUiData = this.categorySelectionUiData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReadyReview(categorySelectionUiData=");
            sb.append(categorySelectionUiData);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.categorySelectionUiData.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadyReview) && kotlin.jvm.internal.Intrinsics.areEqual(this.categorySelectionUiData, ((com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadyReview) other).categorySelectionUiData);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadyReview copy(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategorySelectionUiData categorySelectionUiData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(categorySelectionUiData, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadyReview(categorySelectionUiData);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategorySelectionUiData getCategorySelectionUiData() {
            return this.categorySelectionUiData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadyReview copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadyReview readyReview, com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategorySelectionUiData categorySelectionUiData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                categorySelectionUiData = readyReview.categorySelectionUiData;
            }
            return readyReview.copy(categorySelectionUiData);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionState$ReadyConfirmation;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionState;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/models/CategorySelectionUiData;", "categorySelectionUiData", "", "enrollmentSuccessful", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/models/CategorySelectionUiData;Z)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/models/CategorySelectionUiData;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/models/CategorySelectionUiData;Z)Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionState$ReadyConfirmation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/models/CategorySelectionUiData;", "getCategorySelectionUiData", "Z", "getEnrollmentSuccessful"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReadyConfirmation extends com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategorySelectionUiData categorySelectionUiData;
        private final boolean enrollmentSuccessful;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReadyConfirmation(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategorySelectionUiData categorySelectionUiData, boolean z) {
            super("ReadyConfirmation", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(categorySelectionUiData, "");
            this.categorySelectionUiData = categorySelectionUiData;
            this.enrollmentSuccessful = z;
        }

        public /* synthetic */ ReadyConfirmation(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategorySelectionUiData categorySelectionUiData, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(categorySelectionUiData, (i & 2) != 0 ? false : z);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategorySelectionUiData getCategorySelectionUiData() {
            return this.categorySelectionUiData;
        }

        public final boolean getEnrollmentSuccessful() {
            return this.enrollmentSuccessful;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategorySelectionUiData categorySelectionUiData = this.categorySelectionUiData;
            boolean z = this.enrollmentSuccessful;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReadyConfirmation(categorySelectionUiData=");
            sb.append(categorySelectionUiData);
            sb.append(", enrollmentSuccessful=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.categorySelectionUiData.hashCode() * 31) + java.lang.Boolean.hashCode(this.enrollmentSuccessful);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadyConfirmation)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadyConfirmation readyConfirmation = (com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadyConfirmation) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.categorySelectionUiData, readyConfirmation.categorySelectionUiData) && this.enrollmentSuccessful == readyConfirmation.enrollmentSuccessful;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadyConfirmation copy(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategorySelectionUiData categorySelectionUiData, boolean enrollmentSuccessful) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(categorySelectionUiData, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadyConfirmation(categorySelectionUiData, enrollmentSuccessful);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getEnrollmentSuccessful() {
            return this.enrollmentSuccessful;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategorySelectionUiData getCategorySelectionUiData() {
            return this.categorySelectionUiData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadyConfirmation copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadyConfirmation readyConfirmation, com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategorySelectionUiData categorySelectionUiData, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                categorySelectionUiData = readyConfirmation.categorySelectionUiData;
            }
            if ((i & 2) != 0) {
                z = readyConfirmation.enrollmentSuccessful;
            }
            return readyConfirmation.copy(categorySelectionUiData, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionState$Confirming;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionState;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/models/CategorySelectionUiData;", "categorySelectionUiData", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/models/CategorySelectionUiData;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/models/CategorySelectionUiData;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/models/CategorySelectionUiData;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionState$Confirming;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/models/CategorySelectionUiData;", "getCategorySelectionUiData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Confirming extends com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategorySelectionUiData categorySelectionUiData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Confirming(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategorySelectionUiData categorySelectionUiData) {
            super("Confirming", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(categorySelectionUiData, "");
            this.categorySelectionUiData = categorySelectionUiData;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategorySelectionUiData getCategorySelectionUiData() {
            return this.categorySelectionUiData;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategorySelectionUiData categorySelectionUiData = this.categorySelectionUiData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Confirming(categorySelectionUiData=");
            sb.append(categorySelectionUiData);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.categorySelectionUiData.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.Confirming) && kotlin.jvm.internal.Intrinsics.areEqual(this.categorySelectionUiData, ((com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.Confirming) other).categorySelectionUiData);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.Confirming copy(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategorySelectionUiData categorySelectionUiData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(categorySelectionUiData, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.Confirming(categorySelectionUiData);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategorySelectionUiData getCategorySelectionUiData() {
            return this.categorySelectionUiData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.Confirming copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.Confirming confirming, com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategorySelectionUiData categorySelectionUiData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                categorySelectionUiData = confirming.categorySelectionUiData;
            }
            return confirming.copy(categorySelectionUiData);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionState$Error;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionState;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;", "errorType", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;", "getErrorType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorStateType) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorStateType, "");
            this.errorType = errorStateType;
        }

        public final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType getErrorType() {
            return this.errorType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorStateType = this.errorType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorType=");
            sb.append(errorStateType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errorType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.Error) && this.errorType == ((com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.Error) other).errorType;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.Error copy(com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.Error(errorType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType getErrorType() {
            return this.errorType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.Error copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.Error error, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorStateType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                errorStateType = error.errorType;
            }
            return error.copy(errorStateType);
        }
    }

    public /* synthetic */ CategorySelectionState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
