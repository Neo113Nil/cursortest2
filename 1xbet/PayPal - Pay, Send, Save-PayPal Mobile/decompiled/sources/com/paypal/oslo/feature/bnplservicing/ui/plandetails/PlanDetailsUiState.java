package com.paypal.oslo.feature.bnplservicing.ui.plandetails;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Loading", "Success", "Error", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiState$Error;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiState$Loading;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class PlanDetailsUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private PlanDetailsUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiState$Loading;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiState;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiModel;)Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiState$Loading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiModel uiModel;

        public Loading(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiModel planDetailsUiModel) {
            super("Loading", null);
            this.uiModel = planDetailsUiModel;
        }

        public /* synthetic */ Loading(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiModel planDetailsUiModel, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : planDetailsUiModel);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiModel planDetailsUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(uiModel=");
            sb.append(planDetailsUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiModel planDetailsUiModel = this.uiModel;
            if (planDetailsUiModel == null) {
                return 0;
            }
            return planDetailsUiModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState.Loading) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState.Loading) other).uiModel);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState.Loading copy(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiModel uiModel) {
            return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState.Loading(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState.Loading copy$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState.Loading loading, com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiModel planDetailsUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                planDetailsUiModel = loading.uiModel;
            }
            return loading.copy(planDetailsUiModel);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Loading() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiState$Success;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiState;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiModel;", "uiModel", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiHalfSheetModel;", "changeFiHalfSheetModel", "", "", "newlyAddedFiIds", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiModel;Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiHalfSheetModel;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiModel;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiHalfSheetModel;", "component3", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiModel;Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiHalfSheetModel;Ljava/util/List;)Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiModel;", "getUiModel", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiHalfSheetModel;", "getChangeFiHalfSheetModel", "Ljava/util/List;", "getNewlyAddedFiIds"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetModel changeFiHalfSheetModel;
        private final java.util.List<java.lang.String> newlyAddedFiIds;
        private final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiModel planDetailsUiModel, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetModel changeFiHalfSheetModel, java.util.List<java.lang.String> list) {
            super("Success", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planDetailsUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.uiModel = planDetailsUiModel;
            this.changeFiHalfSheetModel = changeFiHalfSheetModel;
            this.newlyAddedFiIds = list;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiModel getUiModel() {
            return this.uiModel;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetModel getChangeFiHalfSheetModel() {
            return this.changeFiHalfSheetModel;
        }

        public /* synthetic */ Success(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiModel planDetailsUiModel, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetModel changeFiHalfSheetModel, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(planDetailsUiModel, (i & 2) != 0 ? null : changeFiHalfSheetModel, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
        }

        public final java.util.List<java.lang.String> getNewlyAddedFiIds() {
            return this.newlyAddedFiIds;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiModel planDetailsUiModel = this.uiModel;
            com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetModel changeFiHalfSheetModel = this.changeFiHalfSheetModel;
            java.util.List<java.lang.String> list = this.newlyAddedFiIds;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(uiModel=");
            sb.append(planDetailsUiModel);
            sb.append(", changeFiHalfSheetModel=");
            sb.append(changeFiHalfSheetModel);
            sb.append(", newlyAddedFiIds=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.uiModel.hashCode();
            com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetModel changeFiHalfSheetModel = this.changeFiHalfSheetModel;
            return (((hashCode * 31) + (changeFiHalfSheetModel == null ? 0 : changeFiHalfSheetModel.hashCode())) * 31) + this.newlyAddedFiIds.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState.Success success = (com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, success.uiModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.changeFiHalfSheetModel, success.changeFiHalfSheetModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.newlyAddedFiIds, success.newlyAddedFiIds);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState.Success copy(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiModel uiModel, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetModel changeFiHalfSheetModel, java.util.List<java.lang.String> newlyAddedFiIds) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newlyAddedFiIds, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState.Success(uiModel, changeFiHalfSheetModel, newlyAddedFiIds);
        }

        public final java.util.List<java.lang.String> component3() {
            return this.newlyAddedFiIds;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetModel getChangeFiHalfSheetModel() {
            return this.changeFiHalfSheetModel;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiModel getUiModel() {
            return this.uiModel;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState.Success copy$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState.Success success, com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiModel planDetailsUiModel, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetModel changeFiHalfSheetModel, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                planDetailsUiModel = success.uiModel;
            }
            if ((i & 2) != 0) {
                changeFiHalfSheetModel = success.changeFiHalfSheetModel;
            }
            if ((i & 4) != 0) {
                list = success.newlyAddedFiIds;
            }
            return success.copy(planDetailsUiModel, changeFiHalfSheetModel, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiState$Error;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState.Error INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState.Error();

        public final int hashCode() {
            return 2040148408;
        }

        private Error() {
            super("Error", null);
        }

        public final java.lang.String toString() {
            return "Error";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState.Error)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ PlanDetailsUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
