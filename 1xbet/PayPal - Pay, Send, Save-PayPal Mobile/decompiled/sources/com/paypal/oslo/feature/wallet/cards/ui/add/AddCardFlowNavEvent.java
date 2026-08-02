package com.paypal.oslo.feature.wallet.cards.ui.add;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/add/AddCardFlowNavEvent;", "", "NavigateToScanner", "NavigateToForm", "ExitFlow", "NavigateToSuccess", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/AddCardFlowNavEvent$ExitFlow;", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/AddCardFlowNavEvent$NavigateToForm;", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/AddCardFlowNavEvent$NavigateToScanner;", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/AddCardFlowNavEvent$NavigateToSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface AddCardFlowNavEvent {

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/add/AddCardFlowNavEvent$NavigateToScanner;", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/AddCardFlowNavEvent;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NavigateToScanner implements com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent.NavigateToScanner INSTANCE = new com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent.NavigateToScanner();

        private NavigateToScanner() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/add/AddCardFlowNavEvent$NavigateToForm;", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/AddCardFlowNavEvent;", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/screen/AddCardScreenArgs;", "screenArgs", "<init>", "(Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/screen/AddCardScreenArgs;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/screen/AddCardScreenArgs;", "copy", "(Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/screen/AddCardScreenArgs;)Lcom/paypal/oslo/feature/wallet/cards/ui/add/AddCardFlowNavEvent$NavigateToForm;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/screen/AddCardScreenArgs;", "getScreenArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToForm implements com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent {
        public static final int $stable = ((com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options.$stable | com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config.$stable) | com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.$stable) | com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext.$stable;
        private final com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenArgs screenArgs;

        public NavigateToForm(com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenArgs addCardScreenArgs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addCardScreenArgs, "");
            this.screenArgs = addCardScreenArgs;
        }

        public final com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenArgs getScreenArgs() {
            return this.screenArgs;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenArgs addCardScreenArgs = this.screenArgs;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToForm(screenArgs=");
            sb.append(addCardScreenArgs);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.screenArgs.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent.NavigateToForm) && kotlin.jvm.internal.Intrinsics.areEqual(this.screenArgs, ((com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent.NavigateToForm) other).screenArgs);
        }

        public final com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent.NavigateToForm copy(com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenArgs screenArgs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenArgs, "");
            return new com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent.NavigateToForm(screenArgs);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenArgs getScreenArgs() {
            return this.screenArgs;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent.NavigateToForm copy$default(com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent.NavigateToForm navigateToForm, com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenArgs addCardScreenArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                addCardScreenArgs = navigateToForm.screenArgs;
            }
            return navigateToForm.copy(addCardScreenArgs);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/add/AddCardFlowNavEvent$ExitFlow;", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/AddCardFlowNavEvent;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult;", "result", "<init>", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult;", "copy", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult;)Lcom/paypal/oslo/feature/wallet/cards/ui/add/AddCardFlowNavEvent$ExitFlow;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult;", "getResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ExitFlow implements com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent {
        public static final int $stable = com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.$stable;
        private final com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult result;

        public ExitFlow(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult addCardFlowNavResult) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addCardFlowNavResult, "");
            this.result = addCardFlowNavResult;
        }

        public final com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult getResult() {
            return this.result;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult addCardFlowNavResult = this.result;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ExitFlow(result=");
            sb.append(addCardFlowNavResult);
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
            return (other instanceof com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent.ExitFlow) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent.ExitFlow) other).result);
        }

        public final com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent.ExitFlow copy(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult result) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            return new com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent.ExitFlow(result);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult getResult() {
            return this.result;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent.ExitFlow copy$default(com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent.ExitFlow exitFlow, com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult addCardFlowNavResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                addCardFlowNavResult = exitFlow.result;
            }
            return exitFlow.copy(addCardFlowNavResult);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/add/AddCardFlowNavEvent$NavigateToSuccess;", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/AddCardFlowNavEvent;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult;", "result", "<init>", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult;", "copy", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult;)Lcom/paypal/oslo/feature/wallet/cards/ui/add/AddCardFlowNavEvent$NavigateToSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult;", "getResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToSuccess implements com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent {
        public static final int $stable = com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.$stable;
        private final com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult result;

        public NavigateToSuccess(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult addCardFlowNavResult) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addCardFlowNavResult, "");
            this.result = addCardFlowNavResult;
        }

        public final com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult getResult() {
            return this.result;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult addCardFlowNavResult = this.result;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToSuccess(result=");
            sb.append(addCardFlowNavResult);
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
            return (other instanceof com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent.NavigateToSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent.NavigateToSuccess) other).result);
        }

        public final com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent.NavigateToSuccess copy(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult result) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            return new com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent.NavigateToSuccess(result);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult getResult() {
            return this.result;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent.NavigateToSuccess copy$default(com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent.NavigateToSuccess navigateToSuccess, com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult addCardFlowNavResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                addCardFlowNavResult = navigateToSuccess.result;
            }
            return navigateToSuccess.copy(addCardFlowNavResult);
        }
    }
}
