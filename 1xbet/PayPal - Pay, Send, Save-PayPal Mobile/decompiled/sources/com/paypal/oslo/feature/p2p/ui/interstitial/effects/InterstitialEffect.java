package com.paypal.oslo.feature.p2p.ui.interstitial.effects;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0001\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0001\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/interstitial/effects/InterstitialEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "ButtonAction", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/effects/InterstitialEffect$ButtonAction;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class InterstitialEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private InterstitialEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u0005\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/interstitial/effects/InterstitialEffect$ButtonAction;", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/effects/InterstitialEffect;", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction;", "action", "", "isPrimary", "<init>", "(Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction;Z)V", "component1", "()Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction;Z)Lcom/paypal/oslo/feature/p2p/ui/interstitial/effects/InterstitialEffect$ButtonAction;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction;", "getAction", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ButtonAction extends com.paypal.oslo.feature.p2p.ui.interstitial.effects.InterstitialEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction action;
        private final boolean isPrimary;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ButtonAction(com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction interstitialAction, boolean z) {
            super("ButtonAction", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interstitialAction, "");
            this.action = interstitialAction;
            this.isPrimary = z;
        }

        public final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction getAction() {
            return this.action;
        }

        public final boolean isPrimary() {
            return this.isPrimary;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction interstitialAction = this.action;
            boolean z = this.isPrimary;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ButtonAction(action=");
            sb.append(interstitialAction);
            sb.append(", isPrimary=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.action.hashCode() * 31) + java.lang.Boolean.hashCode(this.isPrimary);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.interstitial.effects.InterstitialEffect.ButtonAction)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.interstitial.effects.InterstitialEffect.ButtonAction buttonAction = (com.paypal.oslo.feature.p2p.ui.interstitial.effects.InterstitialEffect.ButtonAction) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.action, buttonAction.action) && this.isPrimary == buttonAction.isPrimary;
        }

        public final com.paypal.oslo.feature.p2p.ui.interstitial.effects.InterstitialEffect.ButtonAction copy(com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction action, boolean isPrimary) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
            return new com.paypal.oslo.feature.p2p.ui.interstitial.effects.InterstitialEffect.ButtonAction(action, isPrimary);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsPrimary() {
            return this.isPrimary;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction getAction() {
            return this.action;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.interstitial.effects.InterstitialEffect.ButtonAction copy$default(com.paypal.oslo.feature.p2p.ui.interstitial.effects.InterstitialEffect.ButtonAction buttonAction, com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction interstitialAction, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                interstitialAction = buttonAction.action;
            }
            if ((i & 2) != 0) {
                z = buttonAction.isPrimary;
            }
            return buttonAction.copy(interstitialAction, z);
        }
    }

    public /* synthetic */ InterstitialEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
