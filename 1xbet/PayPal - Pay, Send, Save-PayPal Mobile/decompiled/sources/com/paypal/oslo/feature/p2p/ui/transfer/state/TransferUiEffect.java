package com.paypal.oslo.feature.p2p.ui.transfer.state;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "ShowError", "NavigateToReview", "NavigateToCurrencyPicker", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiEffect$NavigateToCurrencyPicker;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiEffect$NavigateToReview;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiEffect$ShowError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class TransferUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private TransferUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiEffect$ShowError;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiEffect;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiEffect$ShowError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowError extends com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowError(java.lang.String str) {
            super("ShowError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public /* synthetic */ ShowError(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowError(message=");
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
            return (other instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect.ShowError) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect.ShowError) other).message);
        }

        public final com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect.ShowError copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect.ShowError(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect.ShowError copy$default(com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect.ShowError showError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showError.message;
            }
            return showError.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ShowError() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiEffect$NavigateToReview;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiEffect;", "", "amount", "intent", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiEffect$NavigateToReview;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAmount", "getIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToReview extends com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect {
        public static final int $stable = 0;
        private final java.lang.String amount;
        private final java.lang.String intent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToReview(java.lang.String str, java.lang.String str2) {
            super("NavigateToReview", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.amount = str;
            this.intent = str2;
        }

        public final java.lang.String getAmount() {
            return this.amount;
        }

        public final java.lang.String getIntent() {
            return this.intent;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.amount;
            java.lang.String str2 = this.intent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToReview(amount=");
            sb.append(str);
            sb.append(", intent=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.amount.hashCode() * 31) + this.intent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect.NavigateToReview)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect.NavigateToReview navigateToReview = (com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect.NavigateToReview) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, navigateToReview.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.intent, navigateToReview.intent);
        }

        public final com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect.NavigateToReview copy(java.lang.String amount, java.lang.String intent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
            return new com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect.NavigateToReview(amount, intent);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getIntent() {
            return this.intent;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect.NavigateToReview copy$default(com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect.NavigateToReview navigateToReview, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToReview.amount;
            }
            if ((i & 2) != 0) {
                str2 = navigateToReview.intent;
            }
            return navigateToReview.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiEffect$NavigateToCurrencyPicker;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiEffect;", "Lcom/paypal/oslo/feature/p2p/api/navigation/CurrencyPickerDestination;", "currencyPickerDestination", "<init>", "(Lcom/paypal/oslo/feature/p2p/api/navigation/CurrencyPickerDestination;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/api/navigation/CurrencyPickerDestination;", "copy", "(Lcom/paypal/oslo/feature/p2p/api/navigation/CurrencyPickerDestination;)Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiEffect$NavigateToCurrencyPicker;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/api/navigation/CurrencyPickerDestination;", "getCurrencyPickerDestination"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToCurrencyPicker extends com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect {
        public static final int $stable = com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination.$stable;
        private final com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination currencyPickerDestination;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToCurrencyPicker(com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination currencyPickerDestination) {
            super("NavigateToCurrencyPicker", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyPickerDestination, "");
            this.currencyPickerDestination = currencyPickerDestination;
        }

        public final com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination getCurrencyPickerDestination() {
            return this.currencyPickerDestination;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination currencyPickerDestination = this.currencyPickerDestination;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToCurrencyPicker(currencyPickerDestination=");
            sb.append(currencyPickerDestination);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.currencyPickerDestination.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect.NavigateToCurrencyPicker) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyPickerDestination, ((com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect.NavigateToCurrencyPicker) other).currencyPickerDestination);
        }

        public final com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect.NavigateToCurrencyPicker copy(com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination currencyPickerDestination) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyPickerDestination, "");
            return new com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect.NavigateToCurrencyPicker(currencyPickerDestination);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination getCurrencyPickerDestination() {
            return this.currencyPickerDestination;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect.NavigateToCurrencyPicker copy$default(com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect.NavigateToCurrencyPicker navigateToCurrencyPicker, com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination currencyPickerDestination, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                currencyPickerDestination = navigateToCurrencyPicker.currencyPickerDestination;
            }
            return navigateToCurrencyPicker.copy(currencyPickerDestination);
        }
    }

    public /* synthetic */ TransferUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
