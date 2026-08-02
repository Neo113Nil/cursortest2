package com.paypal.oslo.feature.qrc.ui.review;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\u001c\u001d\u001e\u001fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0011\u0010\r\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u000f\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0011\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00128G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\fR\u0011\u0010\u0019\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\fR\u0011\u0010\u001b\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\f\u0082\u0001\u0004 !\"#"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "", "getShouldShowLowBalanceBottomSheet", "()Z", "shouldShowLowBalanceBottomSheet", "getShouldShowNoFIBottomSheet", "shouldShowNoFIBottomSheet", "getShowConversionOptionsSheet", "showConversionOptionsSheet", "Lcom/paypal/oslo/feature/qrc/ui/review/CurrencyConversionUiData;", "getConversionData", "()Lcom/paypal/oslo/feature/qrc/ui/review/CurrencyConversionUiData;", "conversionData", "getCanMakePayment", "canMakePayment", "getShouldShowScrim", "shouldShowScrim", "getShouldShowScrimLoader", "shouldShowScrimLoader", "Initial", "Loading", "Error", "Content", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiState$Content;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiState$Error;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiState$Initial;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiState$Loading;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class PaymentReviewUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiState$Initial;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Initial INSTANCE = new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Initial();

        public final int hashCode() {
            return -495027634;
        }

        private Initial() {
            super("PaymentReviewUiState.Initial", null);
        }

        public final java.lang.String toString() {
            return "Initial";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Initial)) {
                return false;
            }
            return true;
        }
    }

    private PaymentReviewUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiState$Loading;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiState;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "navArgs", "<init>", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "copy", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;)Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiState$Loading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "getNavArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs navArgs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs) {
            super("PaymentReviewUiState.Loading", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcSessionNavArgs, "");
            this.navArgs = qrcSessionNavArgs;
        }

        public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs getNavArgs() {
            return this.navArgs;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs = this.navArgs;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(navArgs=");
            sb.append(qrcSessionNavArgs);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.navArgs.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Loading) && kotlin.jvm.internal.Intrinsics.areEqual(this.navArgs, ((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Loading) other).navArgs);
        }

        public final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Loading copy(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs navArgs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navArgs, "");
            return new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Loading(navArgs);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs getNavArgs() {
            return this.navArgs;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Loading copy$default(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Loading loading, com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                qrcSessionNavArgs = loading.navArgs;
            }
            return loading.copy(qrcSessionNavArgs);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiState$Error;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiState;", "", "isRecoverable", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiState$Error;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState {
        public static final int $stable = 0;
        private final boolean isRecoverable;

        public Error(boolean z) {
            super("PaymentReviewUiState.Error", null);
            this.isRecoverable = z;
        }

        public final boolean isRecoverable() {
            return this.isRecoverable;
        }

        public final java.lang.String toString() {
            boolean z = this.isRecoverable;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(isRecoverable=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.isRecoverable);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Error) && this.isRecoverable == ((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Error) other).isRecoverable;
        }

        public final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Error copy(boolean isRecoverable) {
            return new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Error(isRecoverable);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsRecoverable() {
            return this.isRecoverable;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Error copy$default(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Error error, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = error.isRecoverable;
            }
            return error.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiState$Content;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiState;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiModel;", "copy", "(Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiModel;)Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiState$Content;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Content extends com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiModel uiModel;

        public final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiModel getUiModel() {
            return this.uiModel;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiModel paymentReviewUiModel) {
            super(paymentReviewUiModel.getHasError() ? "PaymentReviewUiState.Error" : "PaymentReviewUiState.Content", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentReviewUiModel, "");
            this.uiModel = paymentReviewUiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiModel paymentReviewUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Content(uiModel=");
            sb.append(paymentReviewUiModel);
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
            return (other instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content) other).uiModel);
        }

        public final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content copy(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content copy$default(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content content, com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiModel paymentReviewUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentReviewUiModel = content.uiModel;
            }
            return content.copy(paymentReviewUiModel);
        }
    }

    public final boolean getShouldShowLowBalanceBottomSheet() {
        return (this instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content) && ((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content) this).getUiModel().getShowLowBalanceBottomSheet();
    }

    public final boolean getShouldShowNoFIBottomSheet() {
        return (this instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content) && ((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content) this).getUiModel().getShowNoFiBottomSheet();
    }

    public final boolean getShowConversionOptionsSheet() {
        return (this instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content) && ((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content) this).getUiModel().getShowConversionOptionsSheet();
    }

    public final com.paypal.oslo.feature.qrc.ui.review.CurrencyConversionUiData getConversionData() {
        com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiModel uiModel;
        com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content content = this instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content ? (com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content) this : null;
        if (content == null || (uiModel = content.getUiModel()) == null) {
            return null;
        }
        return uiModel.getCurrencyConversionData();
    }

    public final boolean getCanMakePayment() {
        return (this instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content) && ((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content) this).getUiModel().getCanMakePayment();
    }

    public final boolean getShouldShowScrim() {
        return (this instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content) && ((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content) this).getUiModel().isPaymentInProgress();
    }

    public final boolean getShouldShowScrimLoader() {
        return (this instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content) && ((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content) this).getUiModel().isPaymentOptionsLoading();
    }

    public /* synthetic */ PaymentReviewUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
