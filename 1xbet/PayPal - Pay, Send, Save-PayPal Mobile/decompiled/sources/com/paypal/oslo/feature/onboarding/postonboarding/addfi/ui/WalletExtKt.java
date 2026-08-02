package com.paypal.oslo.feature.onboarding.postonboarding.addfi.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/Transition;", "Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$NavAction;", "toEndNavAction", "(Ljava/util/Set;)Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$NavAction;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class WalletExtKt {
    public static final com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction toEndNavAction(java.util.Set<? extends com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition> set) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        java.util.Set<? extends com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition> set2 = set;
        boolean z2 = set2 instanceof java.util.Collection;
        boolean z3 = false;
        if (!z2 || !set2.isEmpty()) {
            java.util.Iterator<T> it = set2.iterator();
            while (it.hasNext()) {
                if (((com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition) it.next()) instanceof com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Close) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z2 || !set2.isEmpty()) {
            java.util.Iterator<T> it2 = set2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition) it2.next()) instanceof com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Skip) {
                    z3 = true;
                    break;
                }
            }
        }
        if (z) {
            return com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction.CLOSE;
        }
        if (z3) {
            return com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction.SKIP;
        }
        return null;
    }
}
