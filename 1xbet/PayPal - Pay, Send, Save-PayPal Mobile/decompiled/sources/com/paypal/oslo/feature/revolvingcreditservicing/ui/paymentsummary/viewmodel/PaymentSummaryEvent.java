package com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\r\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\r\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "OnViewCreated", "OnCancelPaymentClicked", "OnCancelPaymentBottomSheetDismissed", "OnConfirmCancelPayment", "OnPaymentCanceled", "OnCancelPaymentFailed", "OnCancelPaymentRetryClicked", "OnDataLoaded", "OnDataLoadFailed", "OnRetryFetchPaymentSummaryClicked", "OnMakePaymentClicked", "OnAutopayIconClicked", "OnPaymentItemClicked", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent$OnAutopayIconClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent$OnCancelPaymentBottomSheetDismissed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent$OnCancelPaymentClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent$OnCancelPaymentFailed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent$OnCancelPaymentRetryClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent$OnConfirmCancelPayment;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent$OnDataLoadFailed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent$OnDataLoaded;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent$OnMakePaymentClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent$OnPaymentCanceled;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent$OnPaymentItemClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent$OnRetryFetchPaymentSummaryClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent$OnViewCreated;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class PaymentSummaryEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private PaymentSummaryEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent$OnViewCreated;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentsummary/PaymentSummaryOverview;", "paymentSummaryOverview", "", "creditAccountId", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentsummary/PaymentSummaryOverview;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentsummary/PaymentSummaryOverview;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentsummary/PaymentSummaryOverview;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent$OnViewCreated;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentsummary/PaymentSummaryOverview;", "getPaymentSummaryOverview", "Ljava/lang/String;", "getCreditAccountId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnViewCreated extends com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 8;
        private final java.lang.String creditAccountId;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryOverview paymentSummaryOverview;

        public OnViewCreated(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryOverview paymentSummaryOverview, java.lang.String str) {
            super("OnViewCreated", null);
            this.paymentSummaryOverview = paymentSummaryOverview;
            this.creditAccountId = str;
        }

        public /* synthetic */ OnViewCreated(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryOverview paymentSummaryOverview, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : paymentSummaryOverview, (i & 2) != 0 ? null : str);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryOverview getPaymentSummaryOverview() {
            return this.paymentSummaryOverview;
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryOverview paymentSummaryOverview = this.paymentSummaryOverview;
            java.lang.String str = this.creditAccountId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnViewCreated(paymentSummaryOverview=");
            sb.append(paymentSummaryOverview);
            sb.append(", creditAccountId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryOverview paymentSummaryOverview = this.paymentSummaryOverview;
            int hashCode = paymentSummaryOverview == null ? 0 : paymentSummaryOverview.hashCode();
            java.lang.String str = this.creditAccountId;
            return (hashCode * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnViewCreated)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnViewCreated onViewCreated = (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnViewCreated) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.paymentSummaryOverview, onViewCreated.paymentSummaryOverview) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, onViewCreated.creditAccountId);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnViewCreated copy(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryOverview paymentSummaryOverview, java.lang.String creditAccountId) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnViewCreated(paymentSummaryOverview, creditAccountId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryOverview getPaymentSummaryOverview() {
            return this.paymentSummaryOverview;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnViewCreated copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnViewCreated onViewCreated, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryOverview paymentSummaryOverview, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentSummaryOverview = onViewCreated.paymentSummaryOverview;
            }
            if ((i & 2) != 0) {
                str = onViewCreated.creditAccountId;
            }
            return onViewCreated.copy(paymentSummaryOverview, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OnViewCreated() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent$OnCancelPaymentClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent;", "", "repaymentId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent$OnCancelPaymentClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getRepaymentId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCancelPaymentClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent {
        public static final int $stable = 0;
        private final java.lang.String repaymentId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnCancelPaymentClicked(java.lang.String str) {
            super("OnCancelPaymentClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.repaymentId = str;
        }

        public final java.lang.String getRepaymentId() {
            return this.repaymentId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.repaymentId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnCancelPaymentClicked(repaymentId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.repaymentId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnCancelPaymentClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.repaymentId, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnCancelPaymentClicked) other).repaymentId);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnCancelPaymentClicked copy(java.lang.String repaymentId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repaymentId, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnCancelPaymentClicked(repaymentId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getRepaymentId() {
            return this.repaymentId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnCancelPaymentClicked copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnCancelPaymentClicked onCancelPaymentClicked, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onCancelPaymentClicked.repaymentId;
            }
            return onCancelPaymentClicked.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent$OnCancelPaymentBottomSheetDismissed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCancelPaymentBottomSheetDismissed extends com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnCancelPaymentBottomSheetDismissed INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnCancelPaymentBottomSheetDismissed();

        public final int hashCode() {
            return 240765120;
        }

        private OnCancelPaymentBottomSheetDismissed() {
            super("OnCancelPaymentBottomSheetDismissed", null);
        }

        public final java.lang.String toString() {
            return "OnCancelPaymentBottomSheetDismissed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnCancelPaymentBottomSheetDismissed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent$OnConfirmCancelPayment;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnConfirmCancelPayment extends com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnConfirmCancelPayment INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnConfirmCancelPayment();

        public final int hashCode() {
            return -638145139;
        }

        private OnConfirmCancelPayment() {
            super("OnConfirmCancelPayment", null);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            return "OnConfirmCancelPayment";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnConfirmCancelPayment)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent$OnPaymentCanceled;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPaymentCanceled extends com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnPaymentCanceled INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnPaymentCanceled();

        public final int hashCode() {
            return -1980702242;
        }

        private OnPaymentCanceled() {
            super("OnPaymentCanceled", null);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            return "OnPaymentCanceled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnPaymentCanceled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent$OnCancelPaymentFailed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCancelPaymentFailed extends com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnCancelPaymentFailed INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnCancelPaymentFailed();

        public final int hashCode() {
            return -1547635928;
        }

        private OnCancelPaymentFailed() {
            super("OnCancelPaymentFailed", null);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            return "OnCancelPaymentFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnCancelPaymentFailed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent$OnCancelPaymentRetryClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "", "repaymentId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent$OnCancelPaymentRetryClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getRepaymentId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCancelPaymentRetryClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final java.lang.String repaymentId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnCancelPaymentRetryClicked(java.lang.String str) {
            super("OnCancelPaymentRetryClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.repaymentId = str;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String getRepaymentId() {
            return this.repaymentId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.repaymentId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnCancelPaymentRetryClicked(repaymentId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.repaymentId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnCancelPaymentRetryClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.repaymentId, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnCancelPaymentRetryClicked) other).repaymentId);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnCancelPaymentRetryClicked copy(java.lang.String repaymentId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repaymentId, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnCancelPaymentRetryClicked(repaymentId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getRepaymentId() {
            return this.repaymentId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnCancelPaymentRetryClicked copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnCancelPaymentRetryClicked onCancelPaymentRetryClicked, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onCancelPaymentRetryClicked.repaymentId;
            }
            return onCancelPaymentRetryClicked.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent$OnDataLoaded;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/uimodel/PaymentSummaryScreenUiModel;", "paymentSummaryUiModel", "", "creditAccountId", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/uimodel/PaymentSummaryScreenUiModel;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/uimodel/PaymentSummaryScreenUiModel;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/uimodel/PaymentSummaryScreenUiModel;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent$OnDataLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/uimodel/PaymentSummaryScreenUiModel;", "getPaymentSummaryUiModel", "Ljava/lang/String;", "getCreditAccountId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDataLoaded extends com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 8;
        private final java.lang.String creditAccountId;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSummaryScreenUiModel paymentSummaryUiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnDataLoaded(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSummaryScreenUiModel paymentSummaryScreenUiModel, java.lang.String str) {
            super("OnDataLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentSummaryScreenUiModel, "");
            this.paymentSummaryUiModel = paymentSummaryScreenUiModel;
            this.creditAccountId = str;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSummaryScreenUiModel getPaymentSummaryUiModel() {
            return this.paymentSummaryUiModel;
        }

        public /* synthetic */ OnDataLoaded(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSummaryScreenUiModel paymentSummaryScreenUiModel, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(paymentSummaryScreenUiModel, (i & 2) != 0 ? paymentSummaryScreenUiModel.getCreditAccountId() : str);
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSummaryScreenUiModel paymentSummaryScreenUiModel = this.paymentSummaryUiModel;
            java.lang.String str = this.creditAccountId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnDataLoaded(paymentSummaryUiModel=");
            sb.append(paymentSummaryScreenUiModel);
            sb.append(", creditAccountId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.paymentSummaryUiModel.hashCode();
            java.lang.String str = this.creditAccountId;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnDataLoaded)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnDataLoaded onDataLoaded = (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnDataLoaded) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.paymentSummaryUiModel, onDataLoaded.paymentSummaryUiModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, onDataLoaded.creditAccountId);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnDataLoaded copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSummaryScreenUiModel paymentSummaryUiModel, java.lang.String creditAccountId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentSummaryUiModel, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnDataLoaded(paymentSummaryUiModel, creditAccountId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSummaryScreenUiModel getPaymentSummaryUiModel() {
            return this.paymentSummaryUiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnDataLoaded copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnDataLoaded onDataLoaded, com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSummaryScreenUiModel paymentSummaryScreenUiModel, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentSummaryScreenUiModel = onDataLoaded.paymentSummaryUiModel;
            }
            if ((i & 2) != 0) {
                str = onDataLoaded.creditAccountId;
            }
            return onDataLoaded.copy(paymentSummaryScreenUiModel, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent$OnDataLoadFailed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDataLoadFailed extends com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnDataLoadFailed INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnDataLoadFailed();

        public final int hashCode() {
            return 1724019470;
        }

        private OnDataLoadFailed() {
            super("OnDataLoadFailed", null);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            return "OnDataLoadFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnDataLoadFailed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent$OnRetryFetchPaymentSummaryClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRetryFetchPaymentSummaryClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnRetryFetchPaymentSummaryClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnRetryFetchPaymentSummaryClicked();

        public final int hashCode() {
            return 1118085780;
        }

        private OnRetryFetchPaymentSummaryClicked() {
            super("OnRetryFetchPaymentSummaryClicked", null);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            return "OnRetryFetchPaymentSummaryClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnRetryFetchPaymentSummaryClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent$OnMakePaymentClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnMakePaymentClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnMakePaymentClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnMakePaymentClicked();

        public final int hashCode() {
            return -2062194864;
        }

        private OnMakePaymentClicked() {
            super("OnMakePaymentClicked", null);
        }

        public final java.lang.String toString() {
            return "OnMakePaymentClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnMakePaymentClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent$OnAutopayIconClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnAutopayIconClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnAutopayIconClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnAutopayIconClicked();

        public final int hashCode() {
            return -1808684650;
        }

        private OnAutopayIconClicked() {
            super("OnAutopayIconClicked", null);
        }

        public final java.lang.String toString() {
            return "OnAutopayIconClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnAutopayIconClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent$OnPaymentItemClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentActivity;", "repaymentActivity", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentActivity;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentActivity;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentActivity;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent$OnPaymentItemClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentActivity;", "getRepaymentActivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPaymentItemClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity repaymentActivity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnPaymentItemClicked(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity repaymentActivity) {
            super("OnPaymentItemClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repaymentActivity, "");
            this.repaymentActivity = repaymentActivity;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity getRepaymentActivity() {
            return this.repaymentActivity;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity repaymentActivity = this.repaymentActivity;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPaymentItemClicked(repaymentActivity=");
            sb.append(repaymentActivity);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.repaymentActivity.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnPaymentItemClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.repaymentActivity, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnPaymentItemClicked) other).repaymentActivity);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnPaymentItemClicked copy(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity repaymentActivity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repaymentActivity, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnPaymentItemClicked(repaymentActivity);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity getRepaymentActivity() {
            return this.repaymentActivity;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnPaymentItemClicked copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnPaymentItemClicked onPaymentItemClicked, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity repaymentActivity, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                repaymentActivity = onPaymentItemClicked.repaymentActivity;
            }
            return onPaymentItemClicked.copy(repaymentActivity);
        }
    }

    public /* synthetic */ PaymentSummaryEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
