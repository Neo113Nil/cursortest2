package com.paypal.oslo.feature.bnplservicing.ui.plandetails;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\n\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\n\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateToMakePayment", "ShowPaymentSchedule", "ShowUsedVccHalfSheet", "NavigateBack", "SendPaymentSuccessResult", "ShowTooltip", "ShowPayIn30InfoSheet", "ShowTurnOffAutopaySheet", "ShowDocumentsHalfSheet", "ShowSnoozeHalfSheet", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect$NavigateToMakePayment;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect$SendPaymentSuccessResult;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect$ShowDocumentsHalfSheet;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect$ShowPayIn30InfoSheet;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect$ShowPaymentSchedule;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect$ShowSnoozeHalfSheet;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect$ShowTooltip;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect$ShowTurnOffAutopaySheet;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect$ShowUsedVccHalfSheet;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class PlanDetailsUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect$NavigateToMakePayment;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect;", "", "planId", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect$NavigateToMakePayment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPlanId", "getCpi"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToMakePayment extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect {
        public static final int $stable = 0;
        private final java.lang.String cpi;
        private final java.lang.String planId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToMakePayment(java.lang.String str, java.lang.String str2) {
            super("NavigateToMakePayment", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.planId = str;
            this.cpi = str2;
        }

        public final java.lang.String getCpi() {
            return this.cpi;
        }

        public final java.lang.String getPlanId() {
            return this.planId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.planId;
            java.lang.String str2 = this.cpi;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToMakePayment(planId=");
            sb.append(str);
            sb.append(", cpi=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.planId.hashCode() * 31) + this.cpi.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.NavigateToMakePayment)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.NavigateToMakePayment navigateToMakePayment = (com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.NavigateToMakePayment) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.planId, navigateToMakePayment.planId) && kotlin.jvm.internal.Intrinsics.areEqual(this.cpi, navigateToMakePayment.cpi);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.NavigateToMakePayment copy(java.lang.String planId, java.lang.String cpi) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpi, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.NavigateToMakePayment(planId, cpi);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCpi() {
            return this.cpi;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPlanId() {
            return this.planId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.NavigateToMakePayment copy$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.NavigateToMakePayment navigateToMakePayment, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToMakePayment.planId;
            }
            if ((i & 2) != 0) {
                str2 = navigateToMakePayment.cpi;
            }
            return navigateToMakePayment.copy(str, str2);
        }
    }

    private PlanDetailsUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect$ShowPaymentSchedule;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paymentschedule/PaymentScheduleUiModel;", "paymentScheduleUiModel", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/paymentschedule/PaymentScheduleUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/paymentschedule/PaymentScheduleUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/paymentschedule/PaymentScheduleUiModel;)Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect$ShowPaymentSchedule;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paymentschedule/PaymentScheduleUiModel;", "getPaymentScheduleUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowPaymentSchedule extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleUiModel paymentScheduleUiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowPaymentSchedule(com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleUiModel paymentScheduleUiModel) {
            super("ShowPaymentSchedule", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentScheduleUiModel, "");
            this.paymentScheduleUiModel = paymentScheduleUiModel;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleUiModel getPaymentScheduleUiModel() {
            return this.paymentScheduleUiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleUiModel paymentScheduleUiModel = this.paymentScheduleUiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowPaymentSchedule(paymentScheduleUiModel=");
            sb.append(paymentScheduleUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.paymentScheduleUiModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowPaymentSchedule) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentScheduleUiModel, ((com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowPaymentSchedule) other).paymentScheduleUiModel);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowPaymentSchedule copy(com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleUiModel paymentScheduleUiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentScheduleUiModel, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowPaymentSchedule(paymentScheduleUiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleUiModel getPaymentScheduleUiModel() {
            return this.paymentScheduleUiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowPaymentSchedule copy$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowPaymentSchedule showPaymentSchedule, com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleUiModel paymentScheduleUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentScheduleUiModel = showPaymentSchedule.paymentScheduleUiModel;
            }
            return showPaymentSchedule.copy(paymentScheduleUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect$ShowUsedVccHalfSheet;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/VirtualCardModel;", "model", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/VirtualCardModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/VirtualCardModel;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/VirtualCardModel;)Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect$ShowUsedVccHalfSheet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/VirtualCardModel;", "getModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowUsedVccHalfSheet extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect {
        public static final int $stable;
        private final com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.VirtualCardModel model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowUsedVccHalfSheet(com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.VirtualCardModel virtualCardModel) {
            super("ShowUsedVccHalfSheet", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(virtualCardModel, "");
            this.model = virtualCardModel;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.VirtualCardModel getModel() {
            return this.model;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.VirtualCardModel virtualCardModel = this.model;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowUsedVccHalfSheet(model=");
            sb.append(virtualCardModel);
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
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowUsedVccHalfSheet) && kotlin.jvm.internal.Intrinsics.areEqual(this.model, ((com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowUsedVccHalfSheet) other).model);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowUsedVccHalfSheet copy(com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.VirtualCardModel model) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowUsedVccHalfSheet(model);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.VirtualCardModel getModel() {
            return this.model;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowUsedVccHalfSheet copy$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowUsedVccHalfSheet showUsedVccHalfSheet, com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.VirtualCardModel virtualCardModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                virtualCardModel = showUsedVccHalfSheet.model;
            }
            return showUsedVccHalfSheet.copy(virtualCardModel);
        }

        static {
            int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.NavigateBack();

        public final int hashCode() {
            return 160483778;
        }

        private NavigateBack() {
            super("NavigateBack", null);
        }

        public final java.lang.String toString() {
            return "NavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect$SendPaymentSuccessResult;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect$SendPaymentSuccessResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SendPaymentSuccessResult extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SendPaymentSuccessResult(java.lang.String str) {
            super("SendPaymentSuccessResult", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SendPaymentSuccessResult(message=");
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
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.SendPaymentSuccessResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.SendPaymentSuccessResult) other).message);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.SendPaymentSuccessResult copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.SendPaymentSuccessResult(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.SendPaymentSuccessResult copy$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.SendPaymentSuccessResult sendPaymentSuccessResult, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = sendPaymentSuccessResult.message;
            }
            return sendPaymentSuccessResult.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect$ShowTooltip;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/PlanSummaryItem;", "item", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/PlanSummaryItem;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/PlanSummaryItem;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/PlanSummaryItem;)Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect$ShowTooltip;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/PlanSummaryItem;", "getItem"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowTooltip extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect {
        public static final int $stable;
        private final com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem item;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowTooltip(com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem planSummaryItem) {
            super("ShowTooltip", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planSummaryItem, "");
            this.item = planSummaryItem;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem getItem() {
            return this.item;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem planSummaryItem = this.item;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowTooltip(item=");
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
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowTooltip) && kotlin.jvm.internal.Intrinsics.areEqual(this.item, ((com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowTooltip) other).item);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowTooltip copy(com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem item) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowTooltip(item);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem getItem() {
            return this.item;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowTooltip copy$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowTooltip showTooltip, com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem planSummaryItem, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                planSummaryItem = showTooltip.item;
            }
            return showTooltip.copy(planSummaryItem);
        }

        static {
            int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect$ShowPayIn30InfoSheet;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "buttonText", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component2", "component3", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect$ShowPayIn30InfoSheet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getTitle", "getDescription", "getButtonText"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowPayIn30InfoSheet extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect {
        public static final int $stable;
        private final com.paypal.oslo.core.commonui.utils.RefText buttonText;
        private final com.paypal.oslo.core.commonui.utils.RefText description;
        private final com.paypal.oslo.core.commonui.utils.RefText title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowPayIn30InfoSheet(com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, com.paypal.oslo.core.commonui.utils.RefText refText3) {
            super("ShowPayIn30InfoSheet", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText3, "");
            this.title = refText;
            this.description = refText2;
            this.buttonText = refText3;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
            return this.title;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getDescription() {
            return this.description;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getButtonText() {
            return this.buttonText;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.commonui.utils.RefText refText = this.title;
            com.paypal.oslo.core.commonui.utils.RefText refText2 = this.description;
            com.paypal.oslo.core.commonui.utils.RefText refText3 = this.buttonText;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowPayIn30InfoSheet(title=");
            sb.append(refText);
            sb.append(", description=");
            sb.append(refText2);
            sb.append(", buttonText=");
            sb.append(refText3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.buttonText.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowPayIn30InfoSheet)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowPayIn30InfoSheet showPayIn30InfoSheet = (com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowPayIn30InfoSheet) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.title, showPayIn30InfoSheet.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, showPayIn30InfoSheet.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.buttonText, showPayIn30InfoSheet.buttonText);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowPayIn30InfoSheet copy(com.paypal.oslo.core.commonui.utils.RefText title, com.paypal.oslo.core.commonui.utils.RefText description, com.paypal.oslo.core.commonui.utils.RefText buttonText) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonText, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowPayIn30InfoSheet(title, description, buttonText);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getButtonText() {
            return this.buttonText;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getDescription() {
            return this.description;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
            return this.title;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowPayIn30InfoSheet copy$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowPayIn30InfoSheet showPayIn30InfoSheet, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, com.paypal.oslo.core.commonui.utils.RefText refText3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                refText = showPayIn30InfoSheet.title;
            }
            if ((i & 2) != 0) {
                refText2 = showPayIn30InfoSheet.description;
            }
            if ((i & 4) != 0) {
                refText3 = showPayIn30InfoSheet.buttonText;
            }
            return showPayIn30InfoSheet.copy(refText, refText2, refText3);
        }

        static {
            int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect$ShowTurnOffAutopaySheet;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect;", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/TurnOffAutopayModel;", "model", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/TurnOffAutopayModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/TurnOffAutopayModel;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/TurnOffAutopayModel;)Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect$ShowTurnOffAutopaySheet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/TurnOffAutopayModel;", "getModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowTurnOffAutopaySheet extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect {
        public static final int $stable;
        private final com.paypal.oslo.feature.bnplservicing.ui.autopay.TurnOffAutopayModel model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowTurnOffAutopaySheet(com.paypal.oslo.feature.bnplservicing.ui.autopay.TurnOffAutopayModel turnOffAutopayModel) {
            super("ShowTurnOffAutopaySheet", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(turnOffAutopayModel, "");
            this.model = turnOffAutopayModel;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.autopay.TurnOffAutopayModel getModel() {
            return this.model;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.ui.autopay.TurnOffAutopayModel turnOffAutopayModel = this.model;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowTurnOffAutopaySheet(model=");
            sb.append(turnOffAutopayModel);
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
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowTurnOffAutopaySheet) && kotlin.jvm.internal.Intrinsics.areEqual(this.model, ((com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowTurnOffAutopaySheet) other).model);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowTurnOffAutopaySheet copy(com.paypal.oslo.feature.bnplservicing.ui.autopay.TurnOffAutopayModel model) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowTurnOffAutopaySheet(model);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.autopay.TurnOffAutopayModel getModel() {
            return this.model;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowTurnOffAutopaySheet copy$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowTurnOffAutopaySheet showTurnOffAutopaySheet, com.paypal.oslo.feature.bnplservicing.ui.autopay.TurnOffAutopayModel turnOffAutopayModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                turnOffAutopayModel = showTurnOffAutopaySheet.model;
            }
            return showTurnOffAutopaySheet.copy(turnOffAutopayModel);
        }

        static {
            int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect$ShowDocumentsHalfSheet;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect;", "Lcom/paypal/oslo/feature/bnplservicing/ui/document/DocumentsHalfSheetModel;", "model", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/document/DocumentsHalfSheetModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/document/DocumentsHalfSheetModel;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/document/DocumentsHalfSheetModel;)Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect$ShowDocumentsHalfSheet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/document/DocumentsHalfSheetModel;", "getModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowDocumentsHalfSheet extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowDocumentsHalfSheet(com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel documentsHalfSheetModel) {
            super("ShowDocumentsHalfSheet", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentsHalfSheetModel, "");
            this.model = documentsHalfSheetModel;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel getModel() {
            return this.model;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel documentsHalfSheetModel = this.model;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowDocumentsHalfSheet(model=");
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
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowDocumentsHalfSheet) && kotlin.jvm.internal.Intrinsics.areEqual(this.model, ((com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowDocumentsHalfSheet) other).model);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowDocumentsHalfSheet copy(com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel model) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowDocumentsHalfSheet(model);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel getModel() {
            return this.model;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowDocumentsHalfSheet copy$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowDocumentsHalfSheet showDocumentsHalfSheet, com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel documentsHalfSheetModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                documentsHalfSheetModel = showDocumentsHalfSheet.model;
            }
            return showDocumentsHalfSheet.copy(documentsHalfSheetModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect$ShowSnoozeHalfSheet;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeHalfSheetArgs;", "args", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeHalfSheetArgs;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeHalfSheetArgs;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeHalfSheetArgs;)Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect$ShowSnoozeHalfSheet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/snooze/SnoozeHalfSheetArgs;", "getArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowSnoozeHalfSheet extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeHalfSheetArgs args;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowSnoozeHalfSheet(com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeHalfSheetArgs snoozeHalfSheetArgs) {
            super("ShowSnoozeHalfSheet", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(snoozeHalfSheetArgs, "");
            this.args = snoozeHalfSheetArgs;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeHalfSheetArgs getArgs() {
            return this.args;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeHalfSheetArgs snoozeHalfSheetArgs = this.args;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowSnoozeHalfSheet(args=");
            sb.append(snoozeHalfSheetArgs);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.args.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowSnoozeHalfSheet) && kotlin.jvm.internal.Intrinsics.areEqual(this.args, ((com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowSnoozeHalfSheet) other).args);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowSnoozeHalfSheet copy(com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeHalfSheetArgs args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowSnoozeHalfSheet(args);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeHalfSheetArgs getArgs() {
            return this.args;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowSnoozeHalfSheet copy$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowSnoozeHalfSheet showSnoozeHalfSheet, com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeHalfSheetArgs snoozeHalfSheetArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                snoozeHalfSheetArgs = showSnoozeHalfSheet.args;
            }
            return showSnoozeHalfSheet.copy(snoozeHalfSheetArgs);
        }
    }

    public /* synthetic */ PlanDetailsUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
