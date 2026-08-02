package com.paypal.oslo.feature.activity.domain.ledger.models;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nJ\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActionCardModel;", "", "", "bodyTextRes", "ctaLabelRes", "", "imageUrl", "<init>", "(IILjava/lang/String;)V", "component1", "()I", "component2", "component3", "()Ljava/lang/String;", "copy", "(IILjava/lang/String;)Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActionCardModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getBodyTextRes", "getCtaLabelRes", "Ljava/lang/String;", "getImageUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActionCardModel {
    public static final int $stable = 0;
    private final int bodyTextRes;
    private final int ctaLabelRes;
    private final java.lang.String imageUrl;

    public ActionCardModel(int i, int i2, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.bodyTextRes = i;
        this.ctaLabelRes = i2;
        this.imageUrl = str;
    }

    public final int getBodyTextRes() {
        return this.bodyTextRes;
    }

    public final int getCtaLabelRes() {
        return this.ctaLabelRes;
    }

    public final java.lang.String getImageUrl() {
        return this.imageUrl;
    }

    public final java.lang.String toString() {
        int i = this.bodyTextRes;
        int i2 = this.ctaLabelRes;
        java.lang.String str = this.imageUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActionCardModel(bodyTextRes=");
        sb.append(i);
        sb.append(", ctaLabelRes=");
        sb.append(i2);
        sb.append(", imageUrl=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Integer.hashCode(this.bodyTextRes) * 31) + java.lang.Integer.hashCode(this.ctaLabelRes)) * 31) + this.imageUrl.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.domain.ledger.models.ActionCardModel)) {
            return false;
        }
        com.paypal.oslo.feature.activity.domain.ledger.models.ActionCardModel actionCardModel = (com.paypal.oslo.feature.activity.domain.ledger.models.ActionCardModel) other;
        return this.bodyTextRes == actionCardModel.bodyTextRes && this.ctaLabelRes == actionCardModel.ctaLabelRes && kotlin.jvm.internal.Intrinsics.areEqual(this.imageUrl, actionCardModel.imageUrl);
    }

    public final com.paypal.oslo.feature.activity.domain.ledger.models.ActionCardModel copy(int bodyTextRes, int ctaLabelRes, java.lang.String imageUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageUrl, "");
        return new com.paypal.oslo.feature.activity.domain.ledger.models.ActionCardModel(bodyTextRes, ctaLabelRes, imageUrl);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCtaLabelRes() {
        return this.ctaLabelRes;
    }

    /* renamed from: component1, reason: from getter */
    public final int getBodyTextRes() {
        return this.bodyTextRes;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.ledger.models.ActionCardModel copy$default(com.paypal.oslo.feature.activity.domain.ledger.models.ActionCardModel actionCardModel, int i, int i2, java.lang.String str, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = actionCardModel.bodyTextRes;
        }
        if ((i3 & 2) != 0) {
            i2 = actionCardModel.ctaLabelRes;
        }
        if ((i3 & 4) != 0) {
            str = actionCardModel.imageUrl;
        }
        return actionCardModel.copy(i, i2, str);
    }
}
