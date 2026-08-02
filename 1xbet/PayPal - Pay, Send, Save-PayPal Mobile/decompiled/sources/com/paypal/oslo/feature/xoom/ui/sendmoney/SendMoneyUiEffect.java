package com.paypal.oslo.feature.xoom.ui.sendmoney;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\b\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\b\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateToAccountLinking", "NavigateToForbiddenUserScreen", "NavigateToErrorScreen", "NavigateToHomeDestination", "NavigateToInterstitialScreen", "NavigateToInactiveUserScreen", "NavigateToPreviousScreen", "OpenExternalUri", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyUiEffect$NavigateToAccountLinking;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyUiEffect$NavigateToErrorScreen;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyUiEffect$NavigateToForbiddenUserScreen;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyUiEffect$NavigateToHomeDestination;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyUiEffect$NavigateToInactiveUserScreen;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyUiEffect$NavigateToInterstitialScreen;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyUiEffect$NavigateToPreviousScreen;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyUiEffect$OpenExternalUri;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class SendMoneyUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private SendMoneyUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyUiEffect$NavigateToAccountLinking;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToAccountLinking extends com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToAccountLinking INSTANCE = new com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToAccountLinking();

        public final int hashCode() {
            return 1487549088;
        }

        private NavigateToAccountLinking() {
            super("NavigateToAccountLinking", null);
        }

        public final java.lang.String toString() {
            return "NavigateToAccountLinking";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToAccountLinking)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyUiEffect$NavigateToForbiddenUserScreen;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyUiEffect;", "", "titleRes", "descriptionRes", "primaryButtonTextRes", "<init>", "(III)V", "component1", "()I", "component2", "component3", "copy", "(III)Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyUiEffect$NavigateToForbiddenUserScreen;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getTitleRes", "getDescriptionRes", "getPrimaryButtonTextRes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToForbiddenUserScreen extends com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect {
        public static final int $stable = 0;
        private final int descriptionRes;
        private final int primaryButtonTextRes;
        private final int titleRes;

        public NavigateToForbiddenUserScreen(int i, int i2, int i3) {
            super("NavigateToForbiddenUserScreen", null);
            this.titleRes = i;
            this.descriptionRes = i2;
            this.primaryButtonTextRes = i3;
        }

        public final int getTitleRes() {
            return this.titleRes;
        }

        public final int getDescriptionRes() {
            return this.descriptionRes;
        }

        public final int getPrimaryButtonTextRes() {
            return this.primaryButtonTextRes;
        }

        public final java.lang.String toString() {
            int i = this.titleRes;
            int i2 = this.descriptionRes;
            int i3 = this.primaryButtonTextRes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToForbiddenUserScreen(titleRes=");
            sb.append(i);
            sb.append(", descriptionRes=");
            sb.append(i2);
            sb.append(", primaryButtonTextRes=");
            sb.append(i3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((java.lang.Integer.hashCode(this.titleRes) * 31) + java.lang.Integer.hashCode(this.descriptionRes)) * 31) + java.lang.Integer.hashCode(this.primaryButtonTextRes);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToForbiddenUserScreen)) {
                return false;
            }
            com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToForbiddenUserScreen navigateToForbiddenUserScreen = (com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToForbiddenUserScreen) other;
            return this.titleRes == navigateToForbiddenUserScreen.titleRes && this.descriptionRes == navigateToForbiddenUserScreen.descriptionRes && this.primaryButtonTextRes == navigateToForbiddenUserScreen.primaryButtonTextRes;
        }

        public final com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToForbiddenUserScreen copy(int titleRes, int descriptionRes, int primaryButtonTextRes) {
            return new com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToForbiddenUserScreen(titleRes, descriptionRes, primaryButtonTextRes);
        }

        /* renamed from: component3, reason: from getter */
        public final int getPrimaryButtonTextRes() {
            return this.primaryButtonTextRes;
        }

        /* renamed from: component2, reason: from getter */
        public final int getDescriptionRes() {
            return this.descriptionRes;
        }

        /* renamed from: component1, reason: from getter */
        public final int getTitleRes() {
            return this.titleRes;
        }

        public static /* synthetic */ com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToForbiddenUserScreen copy$default(com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToForbiddenUserScreen navigateToForbiddenUserScreen, int i, int i2, int i3, int i4, java.lang.Object obj) {
            if ((i4 & 1) != 0) {
                i = navigateToForbiddenUserScreen.titleRes;
            }
            if ((i4 & 2) != 0) {
                i2 = navigateToForbiddenUserScreen.descriptionRes;
            }
            if ((i4 & 4) != 0) {
                i3 = navigateToForbiddenUserScreen.primaryButtonTextRes;
            }
            return navigateToForbiddenUserScreen.copy(i, i2, i3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyUiEffect$NavigateToErrorScreen;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToErrorScreen extends com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToErrorScreen INSTANCE = new com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToErrorScreen();

        public final int hashCode() {
            return -603679025;
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
            if (!(other instanceof com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToErrorScreen)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyUiEffect$NavigateToHomeDestination;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToHomeDestination extends com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToHomeDestination INSTANCE = new com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToHomeDestination();

        public final int hashCode() {
            return 1547087466;
        }

        private NavigateToHomeDestination() {
            super("NavigateToHomeDestination", null);
        }

        public final java.lang.String toString() {
            return "NavigateToHomeDestination";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToHomeDestination)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyUiEffect$NavigateToInterstitialScreen;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToInterstitialScreen extends com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToInterstitialScreen INSTANCE = new com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToInterstitialScreen();

        public final int hashCode() {
            return -1383474147;
        }

        private NavigateToInterstitialScreen() {
            super("NavigateToInterstitialScreen", null);
        }

        public final java.lang.String toString() {
            return "NavigateToInterstitialScreen";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToInterstitialScreen)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyUiEffect$NavigateToInactiveUserScreen;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyUiEffect;", "Lcom/paypal/oslo/feature/xoom/domain/model/FailedPaymentInfo;", "failedPaymentInfo", "<init>", "(Lcom/paypal/oslo/feature/xoom/domain/model/FailedPaymentInfo;)V", "component1", "()Lcom/paypal/oslo/feature/xoom/domain/model/FailedPaymentInfo;", "copy", "(Lcom/paypal/oslo/feature/xoom/domain/model/FailedPaymentInfo;)Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyUiEffect$NavigateToInactiveUserScreen;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/xoom/domain/model/FailedPaymentInfo;", "getFailedPaymentInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToInactiveUserScreen extends com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.xoom.domain.model.FailedPaymentInfo failedPaymentInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToInactiveUserScreen(com.paypal.oslo.feature.xoom.domain.model.FailedPaymentInfo failedPaymentInfo) {
            super("NavigateToInactiveUserScreen", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failedPaymentInfo, "");
            this.failedPaymentInfo = failedPaymentInfo;
        }

        public final com.paypal.oslo.feature.xoom.domain.model.FailedPaymentInfo getFailedPaymentInfo() {
            return this.failedPaymentInfo;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.xoom.domain.model.FailedPaymentInfo failedPaymentInfo = this.failedPaymentInfo;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToInactiveUserScreen(failedPaymentInfo=");
            sb.append(failedPaymentInfo);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.failedPaymentInfo.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToInactiveUserScreen) && kotlin.jvm.internal.Intrinsics.areEqual(this.failedPaymentInfo, ((com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToInactiveUserScreen) other).failedPaymentInfo);
        }

        public final com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToInactiveUserScreen copy(com.paypal.oslo.feature.xoom.domain.model.FailedPaymentInfo failedPaymentInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failedPaymentInfo, "");
            return new com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToInactiveUserScreen(failedPaymentInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.xoom.domain.model.FailedPaymentInfo getFailedPaymentInfo() {
            return this.failedPaymentInfo;
        }

        public static /* synthetic */ com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToInactiveUserScreen copy$default(com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToInactiveUserScreen navigateToInactiveUserScreen, com.paypal.oslo.feature.xoom.domain.model.FailedPaymentInfo failedPaymentInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                failedPaymentInfo = navigateToInactiveUserScreen.failedPaymentInfo;
            }
            return navigateToInactiveUserScreen.copy(failedPaymentInfo);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyUiEffect$NavigateToPreviousScreen;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToPreviousScreen extends com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToPreviousScreen INSTANCE = new com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToPreviousScreen();

        public final int hashCode() {
            return 564094504;
        }

        private NavigateToPreviousScreen() {
            super("NavigateToPreviousScreen", null);
        }

        public final java.lang.String toString() {
            return "NavigateToPreviousScreen";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToPreviousScreen)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyUiEffect$OpenExternalUri;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyUiEffect;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyUiEffect$OpenExternalUri;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenExternalUri extends com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect {
        public static final int $stable = 0;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenExternalUri(java.lang.String str) {
            super("OpenExternalUri", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenExternalUri(url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.OpenExternalUri) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.OpenExternalUri) other).url);
        }

        public final com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.OpenExternalUri copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.OpenExternalUri(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.OpenExternalUri copy$default(com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.OpenExternalUri openExternalUri, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = openExternalUri.url;
            }
            return openExternalUri.copy(str);
        }
    }

    public /* synthetic */ SendMoneyUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
