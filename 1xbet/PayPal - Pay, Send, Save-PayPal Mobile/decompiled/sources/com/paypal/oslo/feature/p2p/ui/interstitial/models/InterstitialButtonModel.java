package com.paypal.oslo.feature.p2p.ui.interstitial.models;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialButtonModel;", "", "", "text", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction;", "action", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction;)Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialButtonModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getText", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction;", "getAction"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class InterstitialButtonModel {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction action;
    private final java.lang.String text;

    public InterstitialButtonModel(java.lang.String str, com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction interstitialAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interstitialAction, "");
        this.text = str;
        this.action = interstitialAction;
    }

    public final java.lang.String getText() {
        return this.text;
    }

    public final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction getAction() {
        return this.action;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.text;
        com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction interstitialAction = this.action;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InterstitialButtonModel(text=");
        sb.append(str);
        sb.append(", action=");
        sb.append(interstitialAction);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.text.hashCode() * 31) + this.action.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel interstitialButtonModel = (com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.text, interstitialButtonModel.text) && kotlin.jvm.internal.Intrinsics.areEqual(this.action, interstitialButtonModel.action);
    }

    public final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel copy(java.lang.String text, com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        return new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel(text, action);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction getAction() {
        return this.action;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getText() {
        return this.text;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel copy$default(com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel interstitialButtonModel, java.lang.String str, com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction interstitialAction, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = interstitialButtonModel.text;
        }
        if ((i & 2) != 0) {
            interstitialAction = interstitialButtonModel.action;
        }
        return interstitialButtonModel.copy(str, interstitialAction);
    }
}
