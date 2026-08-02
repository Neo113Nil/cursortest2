package com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\"\u001a\u00020\u001d8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/Actions;", "", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "ctx", "Lcom/paypal/oslo/feature/bnplacquisition/config/NfcLockScreenConfig;", "nfcLockScreenConfig", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;Lcom/paypal/oslo/feature/bnplacquisition/config/NfcLockScreenConfig;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;Lcom/paypal/oslo/feature/bnplacquisition/config/NfcLockScreenConfig;)Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/Actions;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "getCtx", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/bnplacquisition/config/NfcLockScreenConfig;", "getScreenLock", "()Lcom/paypal/oslo/feature/bnplacquisition/config/NfcLockScreenConfig;", "screenLock", "Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/BnplVirtualCardOverviewApiConfig;", "virtualCardOverviewApi$delegate", "Lkotlin/Lazy;", "getVirtualCardOverviewApi", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/BnplVirtualCardOverviewApiConfig;", "virtualCardOverviewApi"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Actions {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx;
    private final com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: virtualCardOverviewApi$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy virtualCardOverviewApi;

    public Actions(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext, com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig nfcLockScreenConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nfcLockScreenConfig, "");
        this.ctx = configContext;
        this.getHighResolutionOutputSizeshNQ4ISI = nfcLockScreenConfig;
        this.virtualCardOverviewApi = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.Actions$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.Actions.m12490$r8$lambda$wxHmzYlQoX7eirdS438O2ct71A(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.Actions.this);
            }
        });
    }

    public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
        return this.ctx;
    }

    /* renamed from: getScreenLock, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.BnplVirtualCardOverviewApiConfig getVirtualCardOverviewApi() {
        return (com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.BnplVirtualCardOverviewApiConfig) this.virtualCardOverviewApi.getValue();
    }

    /* renamed from: $r8$lambda$w-xHmzYlQoX7eirdS438O2ct71A, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.BnplVirtualCardOverviewApiConfig m12490$r8$lambda$wxHmzYlQoX7eirdS438O2ct71A(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.Actions actions) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.BnplVirtualCardOverviewApiConfig(actions.ctx);
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext = this.ctx;
        com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig nfcLockScreenConfig = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Actions(ctx=");
        sb.append(configContext);
        sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(nfcLockScreenConfig);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.ctx.hashCode() * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.Actions)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.Actions actions = (com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.Actions) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.ctx, actions.ctx) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, actions.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.Actions copy(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx, com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig nfcLockScreenConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ctx, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nfcLockScreenConfig, "");
        return new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.Actions(ctx, nfcLockScreenConfig);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
        return this.ctx;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.Actions copy$default(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.Actions actions, com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext, com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig nfcLockScreenConfig, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            configContext = actions.ctx;
        }
        if ((i & 2) != 0) {
            nfcLockScreenConfig = actions.getHighResolutionOutputSizeshNQ4ISI;
        }
        return actions.copy(configContext, nfcLockScreenConfig);
    }
}
