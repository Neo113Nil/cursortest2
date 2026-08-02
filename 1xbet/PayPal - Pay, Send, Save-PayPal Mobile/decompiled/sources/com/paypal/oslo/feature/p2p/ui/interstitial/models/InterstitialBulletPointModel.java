package com.paypal.oslo.feature.p2p.ui.interstitial.models;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialBulletPointModel;", "", "", "text", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialIconSource;", "iconSource", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialIconSource;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialIconSource;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialIconSource;)Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialBulletPointModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getText", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialIconSource;", "getIconSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class InterstitialBulletPointModel {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialIconSource iconSource;
    private final java.lang.String text;

    public InterstitialBulletPointModel(java.lang.String str, com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialIconSource interstitialIconSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.text = str;
        this.iconSource = interstitialIconSource;
    }

    public /* synthetic */ InterstitialBulletPointModel(java.lang.String str, com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialIconSource interstitialIconSource, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : interstitialIconSource);
    }

    public final java.lang.String getText() {
        return this.text;
    }

    public final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialIconSource getIconSource() {
        return this.iconSource;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.text;
        com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialIconSource interstitialIconSource = this.iconSource;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InterstitialBulletPointModel(text=");
        sb.append(str);
        sb.append(", iconSource=");
        sb.append(interstitialIconSource);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.text.hashCode();
        com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialIconSource interstitialIconSource = this.iconSource;
        return (hashCode * 31) + (interstitialIconSource == null ? 0 : interstitialIconSource.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBulletPointModel)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBulletPointModel interstitialBulletPointModel = (com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBulletPointModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.text, interstitialBulletPointModel.text) && kotlin.jvm.internal.Intrinsics.areEqual(this.iconSource, interstitialBulletPointModel.iconSource);
    }

    public final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBulletPointModel copy(java.lang.String text, com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialIconSource iconSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        return new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBulletPointModel(text, iconSource);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialIconSource getIconSource() {
        return this.iconSource;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getText() {
        return this.text;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBulletPointModel copy$default(com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBulletPointModel interstitialBulletPointModel, java.lang.String str, com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialIconSource interstitialIconSource, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = interstitialBulletPointModel.text;
        }
        if ((i & 2) != 0) {
            interstitialIconSource = interstitialBulletPointModel.iconSource;
        }
        return interstitialBulletPointModel.copy(str, interstitialIconSource);
    }
}
