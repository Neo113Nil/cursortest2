package com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/reasonselection/mvi/ReportCardReasonSelectionEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateToReportFlow", "NavigateBack", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/reasonselection/mvi/ReportCardReasonSelectionEffect$NavigateBack;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/reasonselection/mvi/ReportCardReasonSelectionEffect$NavigateToReportFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class ReportCardReasonSelectionEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ReportCardReasonSelectionEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/reasonselection/mvi/ReportCardReasonSelectionEffect$NavigateToReportFlow;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/reasonselection/mvi/ReportCardReasonSelectionEffect;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/ReportCardReason;", "reason", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/ReportCardReason;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/ReportCardReason;", "copy", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/ReportCardReason;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/reasonselection/mvi/ReportCardReasonSelectionEffect$NavigateToReportFlow;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/ReportCardReason;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToReportFlow extends com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToReportFlow(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason reportCardReason) {
            super("NavigateToReportFlow", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reportCardReason, "");
            this.reason = reportCardReason;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason reportCardReason = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToReportFlow(reason=");
            sb.append(reportCardReason);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.reason.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionEffect.NavigateToReportFlow) && this.reason == ((com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionEffect.NavigateToReportFlow) other).reason;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionEffect.NavigateToReportFlow copy(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionEffect.NavigateToReportFlow(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionEffect.NavigateToReportFlow copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionEffect.NavigateToReportFlow navigateToReportFlow, com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason reportCardReason, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                reportCardReason = navigateToReportFlow.reason;
            }
            return navigateToReportFlow.copy(reportCardReason);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/reasonselection/mvi/ReportCardReasonSelectionEffect$NavigateBack;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/reasonselection/mvi/ReportCardReasonSelectionEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionEffect.NavigateBack();

        public final int hashCode() {
            return -1396076588;
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
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ ReportCardReasonSelectionEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
