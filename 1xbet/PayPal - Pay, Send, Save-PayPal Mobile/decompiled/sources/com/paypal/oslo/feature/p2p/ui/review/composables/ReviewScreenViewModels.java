package com.paypal.oslo.feature.p2p.ui.review.composables;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0080\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b*\u0010+Jt\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014HÆ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00103\u001a\u000202HÖ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00106\u001a\u000205HÖ\u0001¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b;\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b=\u0010\u001dR\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\b?\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\bA\u0010!R\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bC\u0010#R\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\bE\u0010%R\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010F\u001a\u0004\bG\u0010'R\u001a\u0010\u0013\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010H\u001a\u0004\bI\u0010)R\u001a\u0010\u0015\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010J\u001a\u0004\bK\u0010+"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/composables/ReviewScreenViewModels;", "", "Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/ReviewViewModel;", "reviewViewModel", "Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/ContactSectionViewModel;", "contactSectionViewModel", "Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/EditAmountViewModel;", "editAmountViewModel", "Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/PaymentMethodAccordionViewModel;", "paymentMethodAccordionViewModel", "Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/PaymentTypeAccordionViewModel;", "paymentTypeAccordionViewModel", "Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/ShippingAccordionViewModel;", "shippingAccordionViewModel", "Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/CurrencyConversionViewModel;", "currencyConversionViewModel", "Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/NoteViewModel;", "noteViewModel", "Lcom/paypal/oslo/feature/p2p/ui/transfer/viewmodels/TransferViewModel;", "transferViewModel", "Lcom/paypal/oslo/feature/moneymovement/api/transfer/TransferScreenComponents;", "transferScreenComponents", "<init>", "(Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/ReviewViewModel;Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/ContactSectionViewModel;Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/EditAmountViewModel;Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/PaymentMethodAccordionViewModel;Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/PaymentTypeAccordionViewModel;Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/ShippingAccordionViewModel;Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/CurrencyConversionViewModel;Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/NoteViewModel;Lcom/paypal/oslo/feature/p2p/ui/transfer/viewmodels/TransferViewModel;Lcom/paypal/oslo/feature/moneymovement/api/transfer/TransferScreenComponents;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/ReviewViewModel;", "component2", "()Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/ContactSectionViewModel;", "component3", "()Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/EditAmountViewModel;", "component4", "()Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/PaymentMethodAccordionViewModel;", "component5", "()Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/PaymentTypeAccordionViewModel;", "component6", "()Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/ShippingAccordionViewModel;", "component7", "()Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/CurrencyConversionViewModel;", "component8", "()Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/NoteViewModel;", "component9", "()Lcom/paypal/oslo/feature/p2p/ui/transfer/viewmodels/TransferViewModel;", "component10", "()Lcom/paypal/oslo/feature/moneymovement/api/transfer/TransferScreenComponents;", "copy", "(Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/ReviewViewModel;Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/ContactSectionViewModel;Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/EditAmountViewModel;Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/PaymentMethodAccordionViewModel;Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/PaymentTypeAccordionViewModel;Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/ShippingAccordionViewModel;Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/CurrencyConversionViewModel;Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/NoteViewModel;Lcom/paypal/oslo/feature/p2p/ui/transfer/viewmodels/TransferViewModel;Lcom/paypal/oslo/feature/moneymovement/api/transfer/TransferScreenComponents;)Lcom/paypal/oslo/feature/p2p/ui/review/composables/ReviewScreenViewModels;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/ReviewViewModel;", "getReviewViewModel", "Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/ContactSectionViewModel;", "getContactSectionViewModel", "Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/EditAmountViewModel;", "getEditAmountViewModel", "Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/PaymentMethodAccordionViewModel;", "getPaymentMethodAccordionViewModel", "Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/PaymentTypeAccordionViewModel;", "getPaymentTypeAccordionViewModel", "Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/ShippingAccordionViewModel;", "getShippingAccordionViewModel", "Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/CurrencyConversionViewModel;", "getCurrencyConversionViewModel", "Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/NoteViewModel;", "getNoteViewModel", "Lcom/paypal/oslo/feature/p2p/ui/transfer/viewmodels/TransferViewModel;", "getTransferViewModel", "Lcom/paypal/oslo/feature/moneymovement/api/transfer/TransferScreenComponents;", "getTransferScreenComponents"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReviewScreenViewModels {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel contactSectionViewModel;
    private final com.paypal.oslo.feature.p2p.ui.review.viewmodels.CurrencyConversionViewModel currencyConversionViewModel;
    private final com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel editAmountViewModel;
    private final com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel noteViewModel;
    private final com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel paymentMethodAccordionViewModel;
    private final com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel paymentTypeAccordionViewModel;
    private final com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel reviewViewModel;
    private final com.paypal.oslo.feature.p2p.ui.review.viewmodels.ShippingAccordionViewModel shippingAccordionViewModel;
    private final com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents transferScreenComponents;
    private final com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel transferViewModel;

    public ReviewScreenViewModels(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel reviewViewModel, com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel contactSectionViewModel, com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel editAmountViewModel, com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel paymentMethodAccordionViewModel, com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel paymentTypeAccordionViewModel, com.paypal.oslo.feature.p2p.ui.review.viewmodels.ShippingAccordionViewModel shippingAccordionViewModel, com.paypal.oslo.feature.p2p.ui.review.viewmodels.CurrencyConversionViewModel currencyConversionViewModel, com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel noteViewModel, com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel transferViewModel, com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents transferScreenComponents) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSectionViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editAmountViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentMethodAccordionViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTypeAccordionViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shippingAccordionViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyConversionViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(noteViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferScreenComponents, "");
        this.reviewViewModel = reviewViewModel;
        this.contactSectionViewModel = contactSectionViewModel;
        this.editAmountViewModel = editAmountViewModel;
        this.paymentMethodAccordionViewModel = paymentMethodAccordionViewModel;
        this.paymentTypeAccordionViewModel = paymentTypeAccordionViewModel;
        this.shippingAccordionViewModel = shippingAccordionViewModel;
        this.currencyConversionViewModel = currencyConversionViewModel;
        this.noteViewModel = noteViewModel;
        this.transferViewModel = transferViewModel;
        this.transferScreenComponents = transferScreenComponents;
    }

    public final com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel getReviewViewModel() {
        return this.reviewViewModel;
    }

    public final com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel getContactSectionViewModel() {
        return this.contactSectionViewModel;
    }

    public final com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel getEditAmountViewModel() {
        return this.editAmountViewModel;
    }

    public final com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel getPaymentMethodAccordionViewModel() {
        return this.paymentMethodAccordionViewModel;
    }

    public final com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel getPaymentTypeAccordionViewModel() {
        return this.paymentTypeAccordionViewModel;
    }

    public final com.paypal.oslo.feature.p2p.ui.review.viewmodels.ShippingAccordionViewModel getShippingAccordionViewModel() {
        return this.shippingAccordionViewModel;
    }

    public final com.paypal.oslo.feature.p2p.ui.review.viewmodels.CurrencyConversionViewModel getCurrencyConversionViewModel() {
        return this.currencyConversionViewModel;
    }

    public final com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel getNoteViewModel() {
        return this.noteViewModel;
    }

    public final com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel getTransferViewModel() {
        return this.transferViewModel;
    }

    public final com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents getTransferScreenComponents() {
        return this.transferScreenComponents;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel reviewViewModel = this.reviewViewModel;
        com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel contactSectionViewModel = this.contactSectionViewModel;
        com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel editAmountViewModel = this.editAmountViewModel;
        com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel paymentMethodAccordionViewModel = this.paymentMethodAccordionViewModel;
        com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel paymentTypeAccordionViewModel = this.paymentTypeAccordionViewModel;
        com.paypal.oslo.feature.p2p.ui.review.viewmodels.ShippingAccordionViewModel shippingAccordionViewModel = this.shippingAccordionViewModel;
        com.paypal.oslo.feature.p2p.ui.review.viewmodels.CurrencyConversionViewModel currencyConversionViewModel = this.currencyConversionViewModel;
        com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel noteViewModel = this.noteViewModel;
        com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel transferViewModel = this.transferViewModel;
        com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents transferScreenComponents = this.transferScreenComponents;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReviewScreenViewModels(reviewViewModel=");
        sb.append(reviewViewModel);
        sb.append(", contactSectionViewModel=");
        sb.append(contactSectionViewModel);
        sb.append(", editAmountViewModel=");
        sb.append(editAmountViewModel);
        sb.append(", paymentMethodAccordionViewModel=");
        sb.append(paymentMethodAccordionViewModel);
        sb.append(", paymentTypeAccordionViewModel=");
        sb.append(paymentTypeAccordionViewModel);
        sb.append(", shippingAccordionViewModel=");
        sb.append(shippingAccordionViewModel);
        sb.append(", currencyConversionViewModel=");
        sb.append(currencyConversionViewModel);
        sb.append(", noteViewModel=");
        sb.append(noteViewModel);
        sb.append(", transferViewModel=");
        sb.append(transferViewModel);
        sb.append(", transferScreenComponents=");
        sb.append(transferScreenComponents);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((((((((this.reviewViewModel.hashCode() * 31) + this.contactSectionViewModel.hashCode()) * 31) + this.editAmountViewModel.hashCode()) * 31) + this.paymentMethodAccordionViewModel.hashCode()) * 31) + this.paymentTypeAccordionViewModel.hashCode()) * 31) + this.shippingAccordionViewModel.hashCode()) * 31) + this.currencyConversionViewModel.hashCode()) * 31) + this.noteViewModel.hashCode()) * 31) + this.transferViewModel.hashCode()) * 31) + this.transferScreenComponents.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels reviewScreenViewModels = (com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.reviewViewModel, reviewScreenViewModels.reviewViewModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.contactSectionViewModel, reviewScreenViewModels.contactSectionViewModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.editAmountViewModel, reviewScreenViewModels.editAmountViewModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentMethodAccordionViewModel, reviewScreenViewModels.paymentMethodAccordionViewModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentTypeAccordionViewModel, reviewScreenViewModels.paymentTypeAccordionViewModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.shippingAccordionViewModel, reviewScreenViewModels.shippingAccordionViewModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyConversionViewModel, reviewScreenViewModels.currencyConversionViewModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.noteViewModel, reviewScreenViewModels.noteViewModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.transferViewModel, reviewScreenViewModels.transferViewModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.transferScreenComponents, reviewScreenViewModels.transferScreenComponents);
    }

    public final com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels copy(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel reviewViewModel, com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel contactSectionViewModel, com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel editAmountViewModel, com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel paymentMethodAccordionViewModel, com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel paymentTypeAccordionViewModel, com.paypal.oslo.feature.p2p.ui.review.viewmodels.ShippingAccordionViewModel shippingAccordionViewModel, com.paypal.oslo.feature.p2p.ui.review.viewmodels.CurrencyConversionViewModel currencyConversionViewModel, com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel noteViewModel, com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel transferViewModel, com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents transferScreenComponents) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSectionViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editAmountViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentMethodAccordionViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTypeAccordionViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shippingAccordionViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyConversionViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(noteViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferScreenComponents, "");
        return new com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels(reviewViewModel, contactSectionViewModel, editAmountViewModel, paymentMethodAccordionViewModel, paymentTypeAccordionViewModel, shippingAccordionViewModel, currencyConversionViewModel, noteViewModel, transferViewModel, transferScreenComponents);
    }

    /* renamed from: component9, reason: from getter */
    public final com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel getTransferViewModel() {
        return this.transferViewModel;
    }

    /* renamed from: component8, reason: from getter */
    public final com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel getNoteViewModel() {
        return this.noteViewModel;
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.p2p.ui.review.viewmodels.CurrencyConversionViewModel getCurrencyConversionViewModel() {
        return this.currencyConversionViewModel;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.p2p.ui.review.viewmodels.ShippingAccordionViewModel getShippingAccordionViewModel() {
        return this.shippingAccordionViewModel;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel getPaymentTypeAccordionViewModel() {
        return this.paymentTypeAccordionViewModel;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel getPaymentMethodAccordionViewModel() {
        return this.paymentMethodAccordionViewModel;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel getEditAmountViewModel() {
        return this.editAmountViewModel;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel getContactSectionViewModel() {
        return this.contactSectionViewModel;
    }

    /* renamed from: component10, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents getTransferScreenComponents() {
        return this.transferScreenComponents;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel getReviewViewModel() {
        return this.reviewViewModel;
    }
}
