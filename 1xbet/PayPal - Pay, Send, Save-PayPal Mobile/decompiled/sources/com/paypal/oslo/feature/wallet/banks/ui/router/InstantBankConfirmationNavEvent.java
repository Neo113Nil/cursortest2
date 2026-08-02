package com.paypal.oslo.feature.wallet.banks.ui.router;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/router/InstantBankConfirmationNavEvent;", "", "<init>", "()V", "NavigateToEntryPoint", "ExitFlow", "Lcom/paypal/oslo/feature/wallet/banks/ui/router/InstantBankConfirmationNavEvent$ExitFlow;", "Lcom/paypal/oslo/feature/wallet/banks/ui/router/InstantBankConfirmationNavEvent$NavigateToEntryPoint;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class InstantBankConfirmationNavEvent {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/router/InstantBankConfirmationNavEvent$NavigateToEntryPoint;", "Lcom/paypal/oslo/feature/wallet/banks/ui/router/InstantBankConfirmationNavEvent;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "destination", "<init>", "(Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "copy", "(Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;)Lcom/paypal/oslo/feature/wallet/banks/ui/router/InstantBankConfirmationNavEvent$NavigateToEntryPoint;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "getDestination"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToEntryPoint extends com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.wallet.wallet.ui.Destination destination;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToEntryPoint(com.paypal.oslo.feature.wallet.wallet.ui.Destination destination) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
            this.destination = destination;
        }

        public final com.paypal.oslo.feature.wallet.wallet.ui.Destination getDestination() {
            return this.destination;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.wallet.ui.Destination destination = this.destination;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToEntryPoint(destination=");
            sb.append(destination);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.destination.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent.NavigateToEntryPoint) && kotlin.jvm.internal.Intrinsics.areEqual(this.destination, ((com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent.NavigateToEntryPoint) other).destination);
        }

        public final com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent.NavigateToEntryPoint copy(com.paypal.oslo.feature.wallet.wallet.ui.Destination destination) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
            return new com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent.NavigateToEntryPoint(destination);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.wallet.ui.Destination getDestination() {
            return this.destination;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent.NavigateToEntryPoint copy$default(com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent.NavigateToEntryPoint navigateToEntryPoint, com.paypal.oslo.feature.wallet.wallet.ui.Destination destination, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                destination = navigateToEntryPoint.destination;
            }
            return navigateToEntryPoint.copy(destination);
        }
    }

    private InstantBankConfirmationNavEvent() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/router/InstantBankConfirmationNavEvent$ExitFlow;", "Lcom/paypal/oslo/feature/wallet/banks/ui/router/InstantBankConfirmationNavEvent;", "Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult;", "result", "<init>", "(Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult;", "copy", "(Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult;)Lcom/paypal/oslo/feature/wallet/banks/ui/router/InstantBankConfirmationNavEvent$ExitFlow;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult;", "getResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ExitFlow extends com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExitFlow(com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult bankFlowNavResult) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankFlowNavResult, "");
            this.result = bankFlowNavResult;
        }

        public final com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult getResult() {
            return this.result;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult bankFlowNavResult = this.result;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ExitFlow(result=");
            sb.append(bankFlowNavResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.result.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent.ExitFlow) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent.ExitFlow) other).result);
        }

        public final com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent.ExitFlow copy(com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult result) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            return new com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent.ExitFlow(result);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult getResult() {
            return this.result;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent.ExitFlow copy$default(com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent.ExitFlow exitFlow, com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult bankFlowNavResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bankFlowNavResult = exitFlow.result;
            }
            return exitFlow.copy(bankFlowNavResult);
        }
    }

    public /* synthetic */ InstantBankConfirmationNavEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
