package com.paypal.oslo.feature.bnplservicing.ui.plandetails;

@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0016\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0016 !\"#$%&'()*+,-./012345"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "OnBackClicked", "OnErrorClosed", "OnToastDismiss", "MakeAPaymentClicked", "PaymentScheduleClicked", "TooltipClicked", "ChangeFiClicked", "OnPlanDetailsLoaded", "OnLoadData", "OnError", "PaymentSuccessReceived", "UsedVccClicked", "TurnOffAutopayClicked", "TurnOnAutopayClicked", "PayIn30InfoClicked", "DownloadDocumentsClicked", "PaymentMethodUpdatedSuccessfully", "OnReloadData", "MoreTimeToPayClicked", "ChangeFiDismissed", "OnAddFiSuccess", "OnNewFiConsumed", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$ChangeFiClicked;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$ChangeFiDismissed;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$DownloadDocumentsClicked;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$MakeAPaymentClicked;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$MoreTimeToPayClicked;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$OnAddFiSuccess;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$OnBackClicked;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$OnError;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$OnErrorClosed;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$OnLoadData;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$OnNewFiConsumed;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$OnPlanDetailsLoaded;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$OnReloadData;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$OnToastDismiss;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$PayIn30InfoClicked;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$PaymentMethodUpdatedSuccessfully;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$PaymentScheduleClicked;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$PaymentSuccessReceived;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$TooltipClicked;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$TurnOffAutopayClicked;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$TurnOnAutopayClicked;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$UsedVccClicked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class PlanDetailsEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$OnBackClicked;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent;", "", "sendPaymentResult", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$OnBackClicked;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getSendPaymentResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBackClicked extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent {
        public static final int $stable = 0;
        private final boolean sendPaymentResult;

        public OnBackClicked(boolean z) {
            super("OnBackClicked", null);
            this.sendPaymentResult = z;
        }

        public /* synthetic */ OnBackClicked(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean getSendPaymentResult() {
            return this.sendPaymentResult;
        }

        public final java.lang.String toString() {
            boolean z = this.sendPaymentResult;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBackClicked(sendPaymentResult=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.sendPaymentResult);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnBackClicked) && this.sendPaymentResult == ((com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnBackClicked) other).sendPaymentResult;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnBackClicked copy(boolean sendPaymentResult) {
            return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnBackClicked(sendPaymentResult);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSendPaymentResult() {
            return this.sendPaymentResult;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnBackClicked copy$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnBackClicked onBackClicked, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = onBackClicked.sendPaymentResult;
            }
            return onBackClicked.copy(z);
        }

        public OnBackClicked() {
            this(false, 1, null);
        }
    }

    private PlanDetailsEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$OnErrorClosed;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnErrorClosed extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnErrorClosed INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnErrorClosed();

        public final int hashCode() {
            return -965072990;
        }

        private OnErrorClosed() {
            super("OnErrorClosed", null);
        }

        public final java.lang.String toString() {
            return "OnErrorClosed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnErrorClosed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$OnToastDismiss;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnToastDismiss extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnToastDismiss INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnToastDismiss();

        public final int hashCode() {
            return -713662955;
        }

        private OnToastDismiss() {
            super("OnToastDismiss", null);
        }

        public final java.lang.String toString() {
            return "OnToastDismiss";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnToastDismiss)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$MakeAPaymentClicked;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent;", "", "planId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$MakeAPaymentClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPlanId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MakeAPaymentClicked extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent {
        public static final int $stable = 0;
        private final java.lang.String planId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MakeAPaymentClicked(java.lang.String str) {
            super("MakeAPaymentClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.planId = str;
        }

        public final java.lang.String getPlanId() {
            return this.planId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.planId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MakeAPaymentClicked(planId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.planId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.MakeAPaymentClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.planId, ((com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.MakeAPaymentClicked) other).planId);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.MakeAPaymentClicked copy(java.lang.String planId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planId, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.MakeAPaymentClicked(planId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPlanId() {
            return this.planId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.MakeAPaymentClicked copy$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.MakeAPaymentClicked makeAPaymentClicked, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = makeAPaymentClicked.planId;
            }
            return makeAPaymentClicked.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$PaymentScheduleClicked;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paymentschedule/PaymentScheduleUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/paymentschedule/PaymentScheduleUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/paymentschedule/PaymentScheduleUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/paymentschedule/PaymentScheduleUiModel;)Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$PaymentScheduleClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paymentschedule/PaymentScheduleUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentScheduleClicked extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentScheduleClicked(com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleUiModel paymentScheduleUiModel) {
            super("PaymentScheduleClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentScheduleUiModel, "");
            this.uiModel = paymentScheduleUiModel;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleUiModel paymentScheduleUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentScheduleClicked(uiModel=");
            sb.append(paymentScheduleUiModel);
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
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.PaymentScheduleClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.PaymentScheduleClicked) other).uiModel);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.PaymentScheduleClicked copy(com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.PaymentScheduleClicked(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.PaymentScheduleClicked copy$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.PaymentScheduleClicked paymentScheduleClicked, com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleUiModel paymentScheduleUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentScheduleUiModel = paymentScheduleClicked.uiModel;
            }
            return paymentScheduleClicked.copy(paymentScheduleUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$TooltipClicked;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/PlanSummaryItem;", "item", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/PlanSummaryItem;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/PlanSummaryItem;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/PlanSummaryItem;)Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$TooltipClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/PlanSummaryItem;", "getItem"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TooltipClicked extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent {
        public static final int $stable;
        private final com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem item;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TooltipClicked(com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem planSummaryItem) {
            super("TooltipClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planSummaryItem, "");
            this.item = planSummaryItem;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem getItem() {
            return this.item;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem planSummaryItem = this.item;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TooltipClicked(item=");
            sb.append(planSummaryItem);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.item.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.TooltipClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.item, ((com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.TooltipClicked) other).item);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.TooltipClicked copy(com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem item) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.TooltipClicked(item);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem getItem() {
            return this.item;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.TooltipClicked copy$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.TooltipClicked tooltipClicked, com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem planSummaryItem, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                planSummaryItem = tooltipClicked.item;
            }
            return tooltipClicked.copy(planSummaryItem);
        }

        static {
            int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable;
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$ChangeFiClicked;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent;", "", "creditAccountId", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "creditProductIdentifier", "selectedFundingInstrumentId", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiFlowType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiFlowType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "component3", "component4", "()Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiFlowType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiFlowType;)Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$ChangeFiClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCreditAccountId", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "getCreditProductIdentifier", "getSelectedFundingInstrumentId", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiFlowType;", "getFlowType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ChangeFiClicked extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent {
        public static final int $stable = 0;
        private final java.lang.String creditAccountId;
        private final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier;
        private final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiFlowType flowType;
        private final java.lang.String selectedFundingInstrumentId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChangeFiClicked(java.lang.String str, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, java.lang.String str2, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiFlowType changeFiFlowType) {
            super("ChangeFiClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(changeFiFlowType, "");
            this.creditAccountId = str;
            this.creditProductIdentifier = creditProductIdentifier;
            this.selectedFundingInstrumentId = str2;
            this.flowType = changeFiFlowType;
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        public final java.lang.String getSelectedFundingInstrumentId() {
            return this.selectedFundingInstrumentId;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiFlowType getFlowType() {
            return this.flowType;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.creditAccountId;
            com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier = this.creditProductIdentifier;
            java.lang.String str2 = this.selectedFundingInstrumentId;
            com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiFlowType changeFiFlowType = this.flowType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ChangeFiClicked(creditAccountId=");
            sb.append(str);
            sb.append(", creditProductIdentifier=");
            sb.append(creditProductIdentifier);
            sb.append(", selectedFundingInstrumentId=");
            sb.append(str2);
            sb.append(", flowType=");
            sb.append(changeFiFlowType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.creditAccountId.hashCode() * 31) + this.creditProductIdentifier.hashCode()) * 31) + this.selectedFundingInstrumentId.hashCode()) * 31) + this.flowType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.ChangeFiClicked)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.ChangeFiClicked changeFiClicked = (com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.ChangeFiClicked) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, changeFiClicked.creditAccountId) && this.creditProductIdentifier == changeFiClicked.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedFundingInstrumentId, changeFiClicked.selectedFundingInstrumentId) && this.flowType == changeFiClicked.flowType;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.ChangeFiClicked copy(java.lang.String creditAccountId, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, java.lang.String selectedFundingInstrumentId, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiFlowType flowType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedFundingInstrumentId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowType, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.ChangeFiClicked(creditAccountId, creditProductIdentifier, selectedFundingInstrumentId, flowType);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiFlowType getFlowType() {
            return this.flowType;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getSelectedFundingInstrumentId() {
            return this.selectedFundingInstrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.ChangeFiClicked copy$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.ChangeFiClicked changeFiClicked, java.lang.String str, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, java.lang.String str2, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiFlowType changeFiFlowType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = changeFiClicked.creditAccountId;
            }
            if ((i & 2) != 0) {
                creditProductIdentifier = changeFiClicked.creditProductIdentifier;
            }
            if ((i & 4) != 0) {
                str2 = changeFiClicked.selectedFundingInstrumentId;
            }
            if ((i & 8) != 0) {
                changeFiFlowType = changeFiClicked.flowType;
            }
            return changeFiClicked.copy(str, creditProductIdentifier, str2, changeFiFlowType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$OnPlanDetailsLoaded;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent;", "", "correlationId", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiModel;", "uiModel", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiModel;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiModel;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiModel;)Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$OnPlanDetailsLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPlanDetailsLoaded extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent {
        public static final int $stable = 8;
        private final java.lang.String correlationId;
        private final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnPlanDetailsLoaded(java.lang.String str, com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiModel planDetailsUiModel) {
            super("OnPlanDetailsLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planDetailsUiModel, "");
            this.correlationId = str;
            this.uiModel = planDetailsUiModel;
        }

        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.correlationId;
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiModel planDetailsUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPlanDetailsLoaded(correlationId=");
            sb.append(str);
            sb.append(", uiModel=");
            sb.append(planDetailsUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.correlationId.hashCode() * 31) + this.uiModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnPlanDetailsLoaded)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnPlanDetailsLoaded onPlanDetailsLoaded = (com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnPlanDetailsLoaded) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, onPlanDetailsLoaded.correlationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, onPlanDetailsLoaded.uiModel);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnPlanDetailsLoaded copy(java.lang.String correlationId, com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(correlationId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnPlanDetailsLoaded(correlationId, uiModel);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiModel getUiModel() {
            return this.uiModel;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnPlanDetailsLoaded copy$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnPlanDetailsLoaded onPlanDetailsLoaded, java.lang.String str, com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiModel planDetailsUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onPlanDetailsLoaded.correlationId;
            }
            if ((i & 2) != 0) {
                planDetailsUiModel = onPlanDetailsLoaded.uiModel;
            }
            return onPlanDetailsLoaded.copy(str, planDetailsUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$OnLoadData;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent;", "", "creditAccountId", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$OnLoadData;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCreditAccountId", "getSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnLoadData extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent {
        public static final int $stable = 0;
        private final java.lang.String creditAccountId;
        private final java.lang.String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnLoadData(java.lang.String str, java.lang.String str2) {
            super("OnLoadData", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.creditAccountId = str;
            this.source = str2;
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final java.lang.String getSource() {
            return this.source;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.creditAccountId;
            java.lang.String str2 = this.source;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnLoadData(creditAccountId=");
            sb.append(str);
            sb.append(", source=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.creditAccountId.hashCode() * 31) + this.source.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnLoadData)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnLoadData onLoadData = (com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnLoadData) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, onLoadData.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, onLoadData.source);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnLoadData copy(java.lang.String creditAccountId, java.lang.String source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnLoadData(creditAccountId, source);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSource() {
            return this.source;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnLoadData copy$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnLoadData onLoadData, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onLoadData.creditAccountId;
            }
            if ((i & 2) != 0) {
                str2 = onLoadData.source;
            }
            return onLoadData.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$OnError;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent;", "", "correlationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$OnError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnError extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent {
        public static final int $stable = 0;
        private final java.lang.String correlationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnError(java.lang.String str) {
            super("OnError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.correlationId = str;
        }

        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.correlationId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnError(correlationId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.correlationId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnError) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, ((com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnError) other).correlationId);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnError copy(java.lang.String correlationId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(correlationId, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnError(correlationId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnError copy$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnError onError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onError.correlationId;
            }
            return onError.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$PaymentSuccessReceived;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent;", "", "source", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$PaymentSuccessReceived;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSource", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentSuccessReceived extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent {
        public static final int $stable = 0;
        private final java.lang.String message;
        private final java.lang.String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentSuccessReceived(java.lang.String str, java.lang.String str2) {
            super("PaymentSuccessReceived", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.source = str;
            this.message = str2;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String getSource() {
            return this.source;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.source;
            java.lang.String str2 = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentSuccessReceived(source=");
            sb.append(str);
            sb.append(", message=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.source.hashCode() * 31) + this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.PaymentSuccessReceived)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.PaymentSuccessReceived paymentSuccessReceived = (com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.PaymentSuccessReceived) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.source, paymentSuccessReceived.source) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, paymentSuccessReceived.message);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.PaymentSuccessReceived copy(java.lang.String source, java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.PaymentSuccessReceived(source, message);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getSource() {
            return this.source;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.PaymentSuccessReceived copy$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.PaymentSuccessReceived paymentSuccessReceived, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = paymentSuccessReceived.source;
            }
            if ((i & 2) != 0) {
                str2 = paymentSuccessReceived.message;
            }
            return paymentSuccessReceived.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$UsedVccClicked;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UsedVccClicked extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.UsedVccClicked INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.UsedVccClicked();

        public final int hashCode() {
            return 208968641;
        }

        private UsedVccClicked() {
            super("UsedVccClicked", null);
        }

        public final java.lang.String toString() {
            return "UsedVccClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.UsedVccClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$TurnOffAutopayClicked;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TurnOffAutopayClicked extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.TurnOffAutopayClicked INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.TurnOffAutopayClicked();

        public final int hashCode() {
            return 1312069133;
        }

        private TurnOffAutopayClicked() {
            super("TurnOffAutopayClicked", null);
        }

        public final java.lang.String toString() {
            return "TurnOffAutopayClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.TurnOffAutopayClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$TurnOnAutopayClicked;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent;", "", "creditAccountId", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "creditProductIdentifier", "selectedFundingInstrumentId", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiFlowType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiFlowType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "component3", "component4", "()Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiFlowType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiFlowType;)Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$TurnOnAutopayClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCreditAccountId", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "getCreditProductIdentifier", "getSelectedFundingInstrumentId", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiFlowType;", "getFlowType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TurnOnAutopayClicked extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent {
        public static final int $stable = 0;
        private final java.lang.String creditAccountId;
        private final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier;
        private final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiFlowType flowType;
        private final java.lang.String selectedFundingInstrumentId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TurnOnAutopayClicked(java.lang.String str, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, java.lang.String str2, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiFlowType changeFiFlowType) {
            super("TurnOnAutopayClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(changeFiFlowType, "");
            this.creditAccountId = str;
            this.creditProductIdentifier = creditProductIdentifier;
            this.selectedFundingInstrumentId = str2;
            this.flowType = changeFiFlowType;
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        public final java.lang.String getSelectedFundingInstrumentId() {
            return this.selectedFundingInstrumentId;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiFlowType getFlowType() {
            return this.flowType;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.creditAccountId;
            com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier = this.creditProductIdentifier;
            java.lang.String str2 = this.selectedFundingInstrumentId;
            com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiFlowType changeFiFlowType = this.flowType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TurnOnAutopayClicked(creditAccountId=");
            sb.append(str);
            sb.append(", creditProductIdentifier=");
            sb.append(creditProductIdentifier);
            sb.append(", selectedFundingInstrumentId=");
            sb.append(str2);
            sb.append(", flowType=");
            sb.append(changeFiFlowType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.creditAccountId.hashCode() * 31) + this.creditProductIdentifier.hashCode()) * 31) + this.selectedFundingInstrumentId.hashCode()) * 31) + this.flowType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.TurnOnAutopayClicked)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.TurnOnAutopayClicked turnOnAutopayClicked = (com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.TurnOnAutopayClicked) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, turnOnAutopayClicked.creditAccountId) && this.creditProductIdentifier == turnOnAutopayClicked.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedFundingInstrumentId, turnOnAutopayClicked.selectedFundingInstrumentId) && this.flowType == turnOnAutopayClicked.flowType;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.TurnOnAutopayClicked copy(java.lang.String creditAccountId, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, java.lang.String selectedFundingInstrumentId, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiFlowType flowType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedFundingInstrumentId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowType, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.TurnOnAutopayClicked(creditAccountId, creditProductIdentifier, selectedFundingInstrumentId, flowType);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiFlowType getFlowType() {
            return this.flowType;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getSelectedFundingInstrumentId() {
            return this.selectedFundingInstrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.TurnOnAutopayClicked copy$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.TurnOnAutopayClicked turnOnAutopayClicked, java.lang.String str, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, java.lang.String str2, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiFlowType changeFiFlowType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = turnOnAutopayClicked.creditAccountId;
            }
            if ((i & 2) != 0) {
                creditProductIdentifier = turnOnAutopayClicked.creditProductIdentifier;
            }
            if ((i & 4) != 0) {
                str2 = turnOnAutopayClicked.selectedFundingInstrumentId;
            }
            if ((i & 8) != 0) {
                changeFiFlowType = turnOnAutopayClicked.flowType;
            }
            return turnOnAutopayClicked.copy(str, creditProductIdentifier, str2, changeFiFlowType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$PayIn30InfoClicked;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PayIn30InfoClicked extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.PayIn30InfoClicked INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.PayIn30InfoClicked();

        public final int hashCode() {
            return 599279842;
        }

        private PayIn30InfoClicked() {
            super("PayIn30InfoClicked", null);
        }

        public final java.lang.String toString() {
            return "PayIn30InfoClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.PayIn30InfoClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$DownloadDocumentsClicked;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DownloadDocumentsClicked extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.DownloadDocumentsClicked INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.DownloadDocumentsClicked();

        public final int hashCode() {
            return -1570408598;
        }

        private DownloadDocumentsClicked() {
            super("DownloadDocumentsClicked", null);
        }

        public final java.lang.String toString() {
            return "DownloadDocumentsClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.DownloadDocumentsClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$PaymentMethodUpdatedSuccessfully;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentMethodUpdatedSuccessfully extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.PaymentMethodUpdatedSuccessfully INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.PaymentMethodUpdatedSuccessfully();

        public final int hashCode() {
            return -780553874;
        }

        private PaymentMethodUpdatedSuccessfully() {
            super("PaymentMethodUpdatedSuccessfully", null);
        }

        public final java.lang.String toString() {
            return "PaymentMethodUpdatedSuccessfully";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.PaymentMethodUpdatedSuccessfully)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$OnReloadData;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnReloadData extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnReloadData INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnReloadData();

        public final int hashCode() {
            return 1406880021;
        }

        private OnReloadData() {
            super("OnReloadData", null);
        }

        public final java.lang.String toString() {
            return "OnReloadData";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnReloadData)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$MoreTimeToPayClicked;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MoreTimeToPayClicked extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.MoreTimeToPayClicked INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.MoreTimeToPayClicked();

        public final int hashCode() {
            return -1072488945;
        }

        private MoreTimeToPayClicked() {
            super("MoreTimeToPayClicked", null);
        }

        public final java.lang.String toString() {
            return "MoreTimeToPayClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.MoreTimeToPayClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$ChangeFiDismissed;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ChangeFiDismissed extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.ChangeFiDismissed INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.ChangeFiDismissed();

        public final int hashCode() {
            return -162426813;
        }

        private ChangeFiDismissed() {
            super("ChangeFiDismissed", null);
        }

        public final java.lang.String toString() {
            return "ChangeFiDismissed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.ChangeFiDismissed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$OnAddFiSuccess;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent;", "", "", "newFiIds", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$OnAddFiSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getNewFiIds"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnAddFiSuccess extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent {
        public static final int $stable = 8;
        private final java.util.List<java.lang.String> newFiIds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnAddFiSuccess(java.util.List<java.lang.String> list) {
            super("OnAddFiSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.newFiIds = list;
        }

        public final java.util.List<java.lang.String> getNewFiIds() {
            return this.newFiIds;
        }

        public final java.lang.String toString() {
            java.util.List<java.lang.String> list = this.newFiIds;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnAddFiSuccess(newFiIds=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.newFiIds.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnAddFiSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.newFiIds, ((com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnAddFiSuccess) other).newFiIds);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnAddFiSuccess copy(java.util.List<java.lang.String> newFiIds) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newFiIds, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnAddFiSuccess(newFiIds);
        }

        public final java.util.List<java.lang.String> component1() {
            return this.newFiIds;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnAddFiSuccess copy$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnAddFiSuccess onAddFiSuccess, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = onAddFiSuccess.newFiIds;
            }
            return onAddFiSuccess.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent$OnNewFiConsumed;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnNewFiConsumed extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnNewFiConsumed INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnNewFiConsumed();

        public final int hashCode() {
            return 1047945753;
        }

        private OnNewFiConsumed() {
            super("OnNewFiConsumed", null);
        }

        public final java.lang.String toString() {
            return "OnNewFiConsumed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnNewFiConsumed)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ PlanDetailsEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
