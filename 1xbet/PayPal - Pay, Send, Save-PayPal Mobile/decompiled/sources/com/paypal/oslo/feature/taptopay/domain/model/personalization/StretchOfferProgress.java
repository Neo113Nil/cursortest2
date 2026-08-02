package com.paypal.oslo.feature.taptopay.domain.model.personalization;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\bJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/personalization/StretchOfferProgress;", "", "", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lcom/paypal/oslo/feature/taptopay/domain/model/personalization/StretchOfferProgress;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getCount", "getTarget"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class StretchOfferProgress {
    public static final int $stable = 0;
    private final int count;
    private final int target;

    public StretchOfferProgress(int i, int i2) {
        this.count = i;
        this.target = i2;
    }

    public final int getCount() {
        return this.count;
    }

    public final int getTarget() {
        return this.target;
    }

    public final java.lang.String toString() {
        int i = this.count;
        int i2 = this.target;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StretchOfferProgress(count=");
        sb.append(i);
        sb.append(", target=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Integer.hashCode(this.count) * 31) + java.lang.Integer.hashCode(this.target);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferProgress)) {
            return false;
        }
        com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferProgress stretchOfferProgress = (com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferProgress) other;
        return this.count == stretchOfferProgress.count && this.target == stretchOfferProgress.target;
    }

    public final com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferProgress copy(int count, int target) {
        return new com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferProgress(count, target);
    }

    /* renamed from: component2, reason: from getter */
    public final int getTarget() {
        return this.target;
    }

    /* renamed from: component1, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferProgress copy$default(com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferProgress stretchOfferProgress, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = stretchOfferProgress.count;
        }
        if ((i3 & 2) != 0) {
            i2 = stretchOfferProgress.target;
        }
        return stretchOfferProgress.copy(i, i2);
    }
}
