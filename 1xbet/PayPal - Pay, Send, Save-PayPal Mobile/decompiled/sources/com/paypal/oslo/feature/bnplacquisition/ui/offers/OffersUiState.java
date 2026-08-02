package com.paypal.oslo.feature.bnplacquisition.ui.offers;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initial", "Loading", "Success", "Error", "Decline", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiState$Decline;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiState$Error;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiState$Initial;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiState$Loading;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class OffersUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private OffersUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiState$Initial;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Initial INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Initial();

        public final int hashCode() {
            return -1365394203;
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiState$Loading;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiState$Loading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel offersUiModel) {
            super("Loading", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offersUiModel, "");
            this.uiModel = offersUiModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel offersUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(uiModel=");
            sb.append(offersUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.uiModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Loading) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Loading) other).uiModel);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Loading copy(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Loading(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Loading copy$default(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Loading loading, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel offersUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                offersUiModel = loading.uiModel;
            }
            return loading.copy(offersUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiState$Success;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiModel;", "uiModel", "", "showError", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiModel;Z)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiModel;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiModel;Z)Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiState$Success;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiModel;", "getUiModel", "Z", "getShowError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState {
        public static final int $stable = 8;
        private final boolean showError;
        private final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel offersUiModel, boolean z) {
            super("Success", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offersUiModel, "");
            this.uiModel = offersUiModel;
            this.showError = z;
        }

        public /* synthetic */ Success(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel offersUiModel, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(offersUiModel, (i & 2) != 0 ? false : z);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel getUiModel() {
            return this.uiModel;
        }

        public final boolean getShowError() {
            return this.showError;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel offersUiModel = this.uiModel;
            boolean z = this.showError;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(uiModel=");
            sb.append(offersUiModel);
            sb.append(", showError=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.uiModel.hashCode() * 31) + java.lang.Boolean.hashCode(this.showError);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Success success = (com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, success.uiModel) && this.showError == success.showError;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Success copy(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel uiModel, boolean showError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Success(uiModel, showError);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShowError() {
            return this.showError;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Success copy$default(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Success success, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel offersUiModel, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                offersUiModel = success.uiModel;
            }
            if ((i & 2) != 0) {
                z = success.showError;
            }
            return success.copy(offersUiModel, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiState$Error;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "errorContent", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "getErrorContent", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel errorContent;
        private final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel offersUiModel) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenErrorUiModel, "");
            this.errorContent = fullscreenErrorUiModel;
            this.uiModel = offersUiModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getErrorContent() {
            return this.errorContent;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel = this.errorContent;
            com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel offersUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorContent=");
            sb.append(fullscreenErrorUiModel);
            sb.append(", uiModel=");
            sb.append(offersUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.errorContent.hashCode();
            com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel offersUiModel = this.uiModel;
            return (hashCode * 31) + (offersUiModel == null ? 0 : offersUiModel.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Error error = (com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorContent, error.errorContent) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, error.uiModel);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Error copy(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel errorContent, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorContent, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Error(errorContent, uiModel);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel getUiModel() {
            return this.uiModel;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getErrorContent() {
            return this.errorContent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Error copy$default(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Error error, com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel offersUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fullscreenErrorUiModel = error.errorContent;
            }
            if ((i & 2) != 0) {
                offersUiModel = error.uiModel;
            }
            return error.copy(fullscreenErrorUiModel, offersUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiState$Decline;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "declineContent", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiState$Decline;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "getDeclineContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Decline extends com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel declineContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Decline(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel) {
            super("Decline", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenErrorUiModel, "");
            this.declineContent = fullscreenErrorUiModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getDeclineContent() {
            return this.declineContent;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel = this.declineContent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Decline(declineContent=");
            sb.append(fullscreenErrorUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.declineContent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Decline) && kotlin.jvm.internal.Intrinsics.areEqual(this.declineContent, ((com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Decline) other).declineContent);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Decline copy(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel declineContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declineContent, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Decline(declineContent);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getDeclineContent() {
            return this.declineContent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Decline copy$default(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Decline decline, com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fullscreenErrorUiModel = decline.declineContent;
            }
            return decline.copy(fullscreenErrorUiModel);
        }
    }

    public /* synthetic */ OffersUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
