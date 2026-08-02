package com.paypal.oslo.feature.ads.ui;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJ8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u0003\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/ads/ui/AdVisibilityInfo;", "", "", "isVisible", "", "visiblePercentage", "Landroidx/compose/ui/geometry/Rect;", "bounds", "isAboveThreshold", "<init>", "(ZFLandroidx/compose/ui/geometry/Rect;Z)V", "component1", "()Z", "component2", "()F", "component3", "()Landroidx/compose/ui/geometry/Rect;", "component4", "copy", "(ZFLandroidx/compose/ui/geometry/Rect;Z)Lcom/paypal/oslo/feature/ads/ui/AdVisibilityInfo;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getVisiblePercentage", "Landroidx/compose/ui/geometry/Rect;", "getBounds"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AdVisibilityInfo {
    public static final int $stable = 0;
    private final androidx.compose.ui.geometry.Rect bounds;
    private final boolean isAboveThreshold;
    private final boolean isVisible;
    private final float visiblePercentage;

    public AdVisibilityInfo(boolean z, float f, androidx.compose.ui.geometry.Rect rect, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "");
        this.isVisible = z;
        this.visiblePercentage = f;
        this.bounds = rect;
        this.isAboveThreshold = z2;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final float getVisiblePercentage() {
        return this.visiblePercentage;
    }

    public final androidx.compose.ui.geometry.Rect getBounds() {
        return this.bounds;
    }

    public final boolean isAboveThreshold() {
        return this.isAboveThreshold;
    }

    public final java.lang.String toString() {
        boolean z = this.isVisible;
        float f = this.visiblePercentage;
        androidx.compose.ui.geometry.Rect rect = this.bounds;
        boolean z2 = this.isAboveThreshold;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AdVisibilityInfo(isVisible=");
        sb.append(z);
        sb.append(", visiblePercentage=");
        sb.append(f);
        sb.append(", bounds=");
        sb.append(rect);
        sb.append(", isAboveThreshold=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((java.lang.Boolean.hashCode(this.isVisible) * 31) + java.lang.Float.hashCode(this.visiblePercentage)) * 31) + this.bounds.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isAboveThreshold);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.ads.ui.AdVisibilityInfo)) {
            return false;
        }
        com.paypal.oslo.feature.ads.ui.AdVisibilityInfo adVisibilityInfo = (com.paypal.oslo.feature.ads.ui.AdVisibilityInfo) other;
        return this.isVisible == adVisibilityInfo.isVisible && java.lang.Float.compare(this.visiblePercentage, adVisibilityInfo.visiblePercentage) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.bounds, adVisibilityInfo.bounds) && this.isAboveThreshold == adVisibilityInfo.isAboveThreshold;
    }

    public final com.paypal.oslo.feature.ads.ui.AdVisibilityInfo copy(boolean isVisible, float visiblePercentage, androidx.compose.ui.geometry.Rect bounds, boolean isAboveThreshold) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bounds, "");
        return new com.paypal.oslo.feature.ads.ui.AdVisibilityInfo(isVisible, visiblePercentage, bounds, isAboveThreshold);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsAboveThreshold() {
        return this.isAboveThreshold;
    }

    /* renamed from: component3, reason: from getter */
    public final androidx.compose.ui.geometry.Rect getBounds() {
        return this.bounds;
    }

    /* renamed from: component2, reason: from getter */
    public final float getVisiblePercentage() {
        return this.visiblePercentage;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    public static /* synthetic */ com.paypal.oslo.feature.ads.ui.AdVisibilityInfo copy$default(com.paypal.oslo.feature.ads.ui.AdVisibilityInfo adVisibilityInfo, boolean z, float f, androidx.compose.ui.geometry.Rect rect, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = adVisibilityInfo.isVisible;
        }
        if ((i & 2) != 0) {
            f = adVisibilityInfo.visiblePercentage;
        }
        if ((i & 4) != 0) {
            rect = adVisibilityInfo.bounds;
        }
        if ((i & 8) != 0) {
            z2 = adVisibilityInfo.isAboveThreshold;
        }
        return adVisibilityInfo.copy(z, f, rect, z2);
    }
}
