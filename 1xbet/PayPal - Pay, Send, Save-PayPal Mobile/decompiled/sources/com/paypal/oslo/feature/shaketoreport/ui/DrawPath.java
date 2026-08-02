package com.paypal.oslo.feature.shaketoreport.ui;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J>\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0012R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b\n\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/shaketoreport/ui/DrawPath;", "", "", "Landroidx/compose/ui/geometry/Offset;", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Redeem.SENDER_CURRENCY, "", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "", "strokeWidth", "", "isEraser", "<init>", "(Ljava/util/List;IFZ)V", "component1", "()Ljava/util/List;", "component2", "()I", "component3", "()F", "component4", "()Z", "copy", "(Ljava/util/List;IFZ)Lcom/paypal/oslo/feature/shaketoreport/ui/DrawPath;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getPoints", com.visa.cbp.getEncExpo.warmup, "getColor", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getStrokeWidth", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class DrawPath {
    public static final int $stable = 8;
    private final int color;
    private final boolean isEraser;
    private final java.util.List<androidx.compose.ui.geometry.Offset> points;
    private final float strokeWidth;

    public DrawPath(java.util.List<androidx.compose.ui.geometry.Offset> list, int i, float f, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.points = list;
        this.color = i;
        this.strokeWidth = f;
        this.isEraser = z;
    }

    public /* synthetic */ DrawPath(java.util.List list, int i, float f, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i, f, (i2 & 8) != 0 ? false : z);
    }

    public final java.util.List<androidx.compose.ui.geometry.Offset> getPoints() {
        return this.points;
    }

    public final int getColor() {
        return this.color;
    }

    public final float getStrokeWidth() {
        return this.strokeWidth;
    }

    public final boolean isEraser() {
        return this.isEraser;
    }

    public final java.lang.String toString() {
        java.util.List<androidx.compose.ui.geometry.Offset> list = this.points;
        int i = this.color;
        float f = this.strokeWidth;
        boolean z = this.isEraser;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DrawPath(points=");
        sb.append(list);
        sb.append(", color=");
        sb.append(i);
        sb.append(", strokeWidth=");
        sb.append(f);
        sb.append(", isEraser=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.points.hashCode() * 31) + java.lang.Integer.hashCode(this.color)) * 31) + java.lang.Float.hashCode(this.strokeWidth)) * 31) + java.lang.Boolean.hashCode(this.isEraser);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.shaketoreport.ui.DrawPath)) {
            return false;
        }
        com.paypal.oslo.feature.shaketoreport.ui.DrawPath drawPath = (com.paypal.oslo.feature.shaketoreport.ui.DrawPath) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.points, drawPath.points) && this.color == drawPath.color && java.lang.Float.compare(this.strokeWidth, drawPath.strokeWidth) == 0 && this.isEraser == drawPath.isEraser;
    }

    public final com.paypal.oslo.feature.shaketoreport.ui.DrawPath copy(java.util.List<androidx.compose.ui.geometry.Offset> points, int color, float strokeWidth, boolean isEraser) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(points, "");
        return new com.paypal.oslo.feature.shaketoreport.ui.DrawPath(points, color, strokeWidth, isEraser);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsEraser() {
        return this.isEraser;
    }

    /* renamed from: component3, reason: from getter */
    public final float getStrokeWidth() {
        return this.strokeWidth;
    }

    /* renamed from: component2, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    public final java.util.List<androidx.compose.ui.geometry.Offset> component1() {
        return this.points;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.shaketoreport.ui.DrawPath copy$default(com.paypal.oslo.feature.shaketoreport.ui.DrawPath drawPath, java.util.List list, int i, float f, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            list = drawPath.points;
        }
        if ((i2 & 2) != 0) {
            i = drawPath.color;
        }
        if ((i2 & 4) != 0) {
            f = drawPath.strokeWidth;
        }
        if ((i2 & 8) != 0) {
            z = drawPath.isEraser;
        }
        return drawPath.copy(list, i, f, z);
    }
}
