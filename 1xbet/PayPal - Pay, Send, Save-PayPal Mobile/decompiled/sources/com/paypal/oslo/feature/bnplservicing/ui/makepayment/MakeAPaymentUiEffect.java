package com.paypal.oslo.feature.bnplservicing.ui.makepayment;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", com.knotapi.knot.utilities.Constants.META_BACK_BUTTON, "ShowPaymentError", "NavigateToPaymentSuccess", "NavigateToChangePaymentMethod", "OpenPaymentAuthorization", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiEffect$Back;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiEffect$NavigateToChangePaymentMethod;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiEffect$NavigateToPaymentSuccess;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiEffect$OpenPaymentAuthorization;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiEffect$ShowPaymentError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class MakeAPaymentUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiEffect$Back;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Back extends com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect.Back INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect.Back();

        public final int hashCode() {
            return 597520194;
        }

        private Back() {
            super(com.knotapi.knot.utilities.Constants.META_BACK_BUTTON, null);
        }

        public final java.lang.String toString() {
            return com.knotapi.knot.utilities.Constants.META_BACK_BUTTON;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect.Back)) {
                return false;
            }
            return true;
        }
    }

    private MakeAPaymentUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiEffect$ShowPaymentError;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowPaymentError extends com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect.ShowPaymentError INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect.ShowPaymentError();

        public final int hashCode() {
            return 212687130;
        }

        private ShowPaymentError() {
            super("ShowPaymentError", null);
        }

        public final java.lang.String toString() {
            return "ShowPaymentError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect.ShowPaymentError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiEffect$NavigateToPaymentSuccess;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiEffect;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/uimodels/PaymentSuccessUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/uimodels/PaymentSuccessUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/uimodels/PaymentSuccessUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/uimodels/PaymentSuccessUiModel;)Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiEffect$NavigateToPaymentSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/uimodels/PaymentSuccessUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToPaymentSuccess extends com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect {
        public static final int $stable = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        private final com.paypal.oslo.feature.bnplservicing.ui.makepayment.uimodels.PaymentSuccessUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToPaymentSuccess(com.paypal.oslo.feature.bnplservicing.ui.makepayment.uimodels.PaymentSuccessUiModel paymentSuccessUiModel) {
            super("NavigateToPaymentSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentSuccessUiModel, "");
            this.uiModel = paymentSuccessUiModel;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.makepayment.uimodels.PaymentSuccessUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.ui.makepayment.uimodels.PaymentSuccessUiModel paymentSuccessUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToPaymentSuccess(uiModel=");
            sb.append(paymentSuccessUiModel);
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
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect.NavigateToPaymentSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect.NavigateToPaymentSuccess) other).uiModel);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect.NavigateToPaymentSuccess copy(com.paypal.oslo.feature.bnplservicing.ui.makepayment.uimodels.PaymentSuccessUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect.NavigateToPaymentSuccess(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.makepayment.uimodels.PaymentSuccessUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect.NavigateToPaymentSuccess copy$default(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect.NavigateToPaymentSuccess navigateToPaymentSuccess, com.paypal.oslo.feature.bnplservicing.ui.makepayment.uimodels.PaymentSuccessUiModel paymentSuccessUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentSuccessUiModel = navigateToPaymentSuccess.uiModel;
            }
            return navigateToPaymentSuccess.copy(paymentSuccessUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiEffect$NavigateToChangePaymentMethod;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiEffect;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiHalfSheetModel;", "model", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiHalfSheetModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiHalfSheetModel;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiHalfSheetModel;)Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiEffect$NavigateToChangePaymentMethod;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiHalfSheetModel;", "getModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToChangePaymentMethod extends com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetModel model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToChangePaymentMethod(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetModel changeFiHalfSheetModel) {
            super("NavigateToChangePaymentMethod", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(changeFiHalfSheetModel, "");
            this.model = changeFiHalfSheetModel;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetModel getModel() {
            return this.model;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetModel changeFiHalfSheetModel = this.model;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToChangePaymentMethod(model=");
            sb.append(changeFiHalfSheetModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.model.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect.NavigateToChangePaymentMethod) && kotlin.jvm.internal.Intrinsics.areEqual(this.model, ((com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect.NavigateToChangePaymentMethod) other).model);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect.NavigateToChangePaymentMethod copy(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetModel model) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect.NavigateToChangePaymentMethod(model);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetModel getModel() {
            return this.model;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect.NavigateToChangePaymentMethod copy$default(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect.NavigateToChangePaymentMethod navigateToChangePaymentMethod, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetModel changeFiHalfSheetModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                changeFiHalfSheetModel = navigateToChangePaymentMethod.model;
            }
            return navigateToChangePaymentMethod.copy(changeFiHalfSheetModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiEffect$OpenPaymentAuthorization;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiEffect;", "Lcom/paypal/oslo/feature/bnplservicing/ui/document/DocumentsHalfSheetModel;", "model", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/document/DocumentsHalfSheetModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/document/DocumentsHalfSheetModel;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/document/DocumentsHalfSheetModel;)Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiEffect$OpenPaymentAuthorization;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/document/DocumentsHalfSheetModel;", "getModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenPaymentAuthorization extends com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenPaymentAuthorization(com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel documentsHalfSheetModel) {
            super("OpenPaymentAuthorization", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentsHalfSheetModel, "");
            this.model = documentsHalfSheetModel;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel getModel() {
            return this.model;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel documentsHalfSheetModel = this.model;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenPaymentAuthorization(model=");
            sb.append(documentsHalfSheetModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.model.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect.OpenPaymentAuthorization) && kotlin.jvm.internal.Intrinsics.areEqual(this.model, ((com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect.OpenPaymentAuthorization) other).model);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect.OpenPaymentAuthorization copy(com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel model) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect.OpenPaymentAuthorization(model);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel getModel() {
            return this.model;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect.OpenPaymentAuthorization copy$default(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect.OpenPaymentAuthorization openPaymentAuthorization, com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel documentsHalfSheetModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                documentsHalfSheetModel = openPaymentAuthorization.model;
            }
            return openPaymentAuthorization.copy(documentsHalfSheetModel);
        }
    }

    public /* synthetic */ MakeAPaymentUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
