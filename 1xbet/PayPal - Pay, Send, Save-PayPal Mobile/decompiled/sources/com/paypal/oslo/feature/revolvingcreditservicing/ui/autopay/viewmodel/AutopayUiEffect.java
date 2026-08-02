package com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateBack", "NavigateToChoosePaymentMethod", "ShowTermsAndConditions", "ShowCancelAutopayBottomSheet", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayUiEffect$NavigateToChoosePaymentMethod;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayUiEffect$ShowCancelAutopayBottomSheet;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayUiEffect$ShowTermsAndConditions;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class AutopayUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private AutopayUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayUiEffect;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/navigation/result/AutopayAction;", "action", "", "effectiveInCurrentBillingCycle", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/navigation/result/AutopayAction;Ljava/lang/Boolean;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/navigation/result/AutopayAction;", "component2", "()Ljava/lang/Boolean;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/navigation/result/AutopayAction;Ljava/lang/Boolean;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayUiEffect$NavigateBack;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/navigation/result/AutopayAction;", "getAction", "Ljava/lang/Boolean;", "getEffectiveInCurrentBillingCycle"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayUiEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayAction action;
        private final java.lang.Boolean effectiveInCurrentBillingCycle;

        public NavigateBack(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayAction autopayAction, java.lang.Boolean bool) {
            super("NavigateBack", null);
            this.action = autopayAction;
            this.effectiveInCurrentBillingCycle = bool;
        }

        public /* synthetic */ NavigateBack(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayAction autopayAction, java.lang.Boolean bool, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : autopayAction, (i & 2) != 0 ? null : bool);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayAction getAction() {
            return this.action;
        }

        public final java.lang.Boolean getEffectiveInCurrentBillingCycle() {
            return this.effectiveInCurrentBillingCycle;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayAction autopayAction = this.action;
            java.lang.Boolean bool = this.effectiveInCurrentBillingCycle;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateBack(action=");
            sb.append(autopayAction);
            sb.append(", effectiveInCurrentBillingCycle=");
            sb.append(bool);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayAction autopayAction = this.action;
            int hashCode = autopayAction == null ? 0 : autopayAction.hashCode();
            java.lang.Boolean bool = this.effectiveInCurrentBillingCycle;
            return (hashCode * 31) + (bool != null ? bool.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayUiEffect.NavigateBack)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayUiEffect.NavigateBack navigateBack = (com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayUiEffect.NavigateBack) other;
            return this.action == navigateBack.action && kotlin.jvm.internal.Intrinsics.areEqual(this.effectiveInCurrentBillingCycle, navigateBack.effectiveInCurrentBillingCycle);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayUiEffect.NavigateBack copy(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayAction action, java.lang.Boolean effectiveInCurrentBillingCycle) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayUiEffect.NavigateBack(action, effectiveInCurrentBillingCycle);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Boolean getEffectiveInCurrentBillingCycle() {
            return this.effectiveInCurrentBillingCycle;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayAction getAction() {
            return this.action;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayUiEffect.NavigateBack copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayUiEffect.NavigateBack navigateBack, com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayAction autopayAction, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                autopayAction = navigateBack.action;
            }
            if ((i & 2) != 0) {
                bool = navigateBack.effectiveInCurrentBillingCycle;
            }
            return navigateBack.copy(autopayAction, bool);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NavigateBack() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayUiEffect$NavigateToChoosePaymentMethod;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayUiEffect;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ChooseWayToPayArgs;", "args", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ChooseWayToPayArgs;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ChooseWayToPayArgs;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ChooseWayToPayArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayUiEffect$NavigateToChoosePaymentMethod;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ChooseWayToPayArgs;", "getArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToChoosePaymentMethod extends com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ChooseWayToPayArgs args;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToChoosePaymentMethod(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ChooseWayToPayArgs chooseWayToPayArgs) {
            super("NavigateToChoosePaymentMethod", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chooseWayToPayArgs, "");
            this.args = chooseWayToPayArgs;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ChooseWayToPayArgs getArgs() {
            return this.args;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ChooseWayToPayArgs chooseWayToPayArgs = this.args;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToChoosePaymentMethod(args=");
            sb.append(chooseWayToPayArgs);
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
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayUiEffect.NavigateToChoosePaymentMethod) && kotlin.jvm.internal.Intrinsics.areEqual(this.args, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayUiEffect.NavigateToChoosePaymentMethod) other).args);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayUiEffect.NavigateToChoosePaymentMethod copy(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ChooseWayToPayArgs args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayUiEffect.NavigateToChoosePaymentMethod(args);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ChooseWayToPayArgs getArgs() {
            return this.args;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayUiEffect.NavigateToChoosePaymentMethod copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayUiEffect.NavigateToChoosePaymentMethod navigateToChoosePaymentMethod, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ChooseWayToPayArgs chooseWayToPayArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                chooseWayToPayArgs = navigateToChoosePaymentMethod.args;
            }
            return navigateToChoosePaymentMethod.copy(chooseWayToPayArgs);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayUiEffect$ShowTermsAndConditions;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayUiEffect;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayUiEffect$ShowTermsAndConditions;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowTermsAndConditions extends com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayUiEffect {
        public static final int $stable = 0;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowTermsAndConditions(java.lang.String str) {
            super("ShowTermsAndConditions", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowTermsAndConditions(url=");
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
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayUiEffect.ShowTermsAndConditions) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayUiEffect.ShowTermsAndConditions) other).url);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayUiEffect.ShowTermsAndConditions copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayUiEffect.ShowTermsAndConditions(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayUiEffect.ShowTermsAndConditions copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayUiEffect.ShowTermsAndConditions showTermsAndConditions, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showTermsAndConditions.url;
            }
            return showTermsAndConditions.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayUiEffect$ShowCancelAutopayBottomSheet;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowCancelAutopayBottomSheet extends com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayUiEffect.ShowCancelAutopayBottomSheet INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayUiEffect.ShowCancelAutopayBottomSheet();

        public final int hashCode() {
            return 613246539;
        }

        private ShowCancelAutopayBottomSheet() {
            super("ShowCancelAutopayBottomSheet", null);
        }

        public final java.lang.String toString() {
            return "ShowCancelAutopayBottomSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayUiEffect.ShowCancelAutopayBottomSheet)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ AutopayUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
