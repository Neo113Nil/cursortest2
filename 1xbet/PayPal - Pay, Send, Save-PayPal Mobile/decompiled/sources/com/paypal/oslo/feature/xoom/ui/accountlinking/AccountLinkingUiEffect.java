package com.paypal.oslo.feature.xoom.ui.accountlinking;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateToErrorScreen", "NavigateOnAccountsLinked", "Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingUiEffect$NavigateOnAccountsLinked;", "Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingUiEffect$NavigateToErrorScreen;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class AccountLinkingUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private AccountLinkingUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingUiEffect$NavigateToErrorScreen;", "Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToErrorScreen extends com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiEffect.NavigateToErrorScreen INSTANCE = new com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiEffect.NavigateToErrorScreen();

        public final int hashCode() {
            return 652128475;
        }

        private NavigateToErrorScreen() {
            super("NavigateToErrorScreen", null);
        }

        public final java.lang.String toString() {
            return "NavigateToErrorScreen";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiEffect.NavigateToErrorScreen)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingUiEffect$NavigateOnAccountsLinked;", "Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateOnAccountsLinked extends com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiEffect.NavigateOnAccountsLinked INSTANCE = new com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiEffect.NavigateOnAccountsLinked();

        public final int hashCode() {
            return 251918428;
        }

        private NavigateOnAccountsLinked() {
            super("NavigateOnAccountsLinked", null);
        }

        public final java.lang.String toString() {
            return "NavigateOnAccountsLinked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiEffect.NavigateOnAccountsLinked)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ AccountLinkingUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
