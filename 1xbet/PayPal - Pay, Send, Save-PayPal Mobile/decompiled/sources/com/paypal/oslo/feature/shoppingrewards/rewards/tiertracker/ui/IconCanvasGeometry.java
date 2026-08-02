package com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0080\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0015J\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0015J\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0015J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0015J\u0010\u0010#\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0015J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0015J\u0092\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00101\u001a\u000200HÖ\u0001¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b5\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b6\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b7\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b9\u0010\u001aR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b:\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b;\u0010\u0015R\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b<\u0010\u0015R\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b=\u0010\u0015R\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b>\u0010\u0015R\u001a\u0010\u000f\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00108\u001a\u0004\b?\u0010\u001aR\u001a\u0010\u0010\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00103\u001a\u0004\b@\u0010\u0015R\u001a\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00103\u001a\u0004\bA\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/tiertracker/ui/IconCanvasGeometry;", "", "", "centerX", "centerY", "strokePx", "indicatorInnerPx", "Landroidx/compose/ui/geometry/Offset;", "arcTopLeft", "Landroidx/compose/ui/geometry/Size;", "arcSize", "startAngle", "fullSweep", "accentStartAngle", "accentSweep", "indicatorCenter", "crossArm", "crossStroke", "<init>", "(FFFFJJFFFFJFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()F", "component2", "component3", "component4", "component5-F1C5BW0", "()J", "component5", "component6-NH-jbRc", "component6", "component7", "component8", "component9", "component10", "component11-F1C5BW0", "component11", "component12", "component13", "copy-eVhH1xg", "(FFFFJJFFFFJFF)Lcom/paypal/oslo/feature/shoppingrewards/rewards/tiertracker/ui/IconCanvasGeometry;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getCenterX", "getCenterY", "getStrokePx", "getIndicatorInnerPx", "J", "getArcTopLeft-F1C5BW0", "getArcSize-NH-jbRc", "getStartAngle", "getFullSweep", "getAccentStartAngle", "getAccentSweep", "getIndicatorCenter-F1C5BW0", "getCrossArm", "getCrossStroke"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class IconCanvasGeometry {
    public static final int $stable = 0;
    private final float accentStartAngle;
    private final float accentSweep;
    private final long arcSize;
    private final long arcTopLeft;
    private final float centerX;
    private final float centerY;
    private final float crossArm;
    private final float crossStroke;
    private final float fullSweep;
    private final long indicatorCenter;
    private final float indicatorInnerPx;
    private final float startAngle;
    private final float strokePx;

    private IconCanvasGeometry(float f, float f2, float f3, float f4, long j, long j2, float f5, float f6, float f7, float f8, long j3, float f9, float f10) {
        this.centerX = f;
        this.centerY = f2;
        this.strokePx = f3;
        this.indicatorInnerPx = f4;
        this.arcTopLeft = j;
        this.arcSize = j2;
        this.startAngle = f5;
        this.fullSweep = f6;
        this.accentStartAngle = f7;
        this.accentSweep = f8;
        this.indicatorCenter = j3;
        this.crossArm = f9;
        this.crossStroke = f10;
    }

    public final float getCenterX() {
        return this.centerX;
    }

    public final float getCenterY() {
        return this.centerY;
    }

    public final float getStrokePx() {
        return this.strokePx;
    }

    public final float getIndicatorInnerPx() {
        return this.indicatorInnerPx;
    }

    /* renamed from: getArcTopLeft-F1C5BW0, reason: not valid java name */
    public final long m19599getArcTopLeftF1C5BW0() {
        return this.arcTopLeft;
    }

    /* renamed from: getArcSize-NH-jbRc, reason: not valid java name */
    public final long m19598getArcSizeNHjbRc() {
        return this.arcSize;
    }

    public final float getStartAngle() {
        return this.startAngle;
    }

    public final float getFullSweep() {
        return this.fullSweep;
    }

    public final float getAccentStartAngle() {
        return this.accentStartAngle;
    }

    public final float getAccentSweep() {
        return this.accentSweep;
    }

    /* renamed from: getIndicatorCenter-F1C5BW0, reason: not valid java name */
    public final long m19600getIndicatorCenterF1C5BW0() {
        return this.indicatorCenter;
    }

    public final float getCrossArm() {
        return this.crossArm;
    }

    public final float getCrossStroke() {
        return this.crossStroke;
    }

    public final java.lang.String toString() {
        float f = this.centerX;
        float f2 = this.centerY;
        float f3 = this.strokePx;
        float f4 = this.indicatorInnerPx;
        java.lang.String m5760toStringimpl = androidx.compose.ui.geometry.Offset.m5760toStringimpl(this.arcTopLeft);
        java.lang.String m5825toStringimpl = androidx.compose.ui.geometry.Size.m5825toStringimpl(this.arcSize);
        float f5 = this.startAngle;
        float f6 = this.fullSweep;
        float f7 = this.accentStartAngle;
        float f8 = this.accentSweep;
        java.lang.String m5760toStringimpl2 = androidx.compose.ui.geometry.Offset.m5760toStringimpl(this.indicatorCenter);
        float f9 = this.crossArm;
        float f10 = this.crossStroke;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("IconCanvasGeometry(centerX=");
        sb.append(f);
        sb.append(", centerY=");
        sb.append(f2);
        sb.append(", strokePx=");
        sb.append(f3);
        sb.append(", indicatorInnerPx=");
        sb.append(f4);
        sb.append(", arcTopLeft=");
        sb.append(m5760toStringimpl);
        sb.append(", arcSize=");
        sb.append(m5825toStringimpl);
        sb.append(", startAngle=");
        sb.append(f5);
        sb.append(", fullSweep=");
        sb.append(f6);
        sb.append(", accentStartAngle=");
        sb.append(f7);
        sb.append(", accentSweep=");
        sb.append(f8);
        sb.append(", indicatorCenter=");
        sb.append(m5760toStringimpl2);
        sb.append(", crossArm=");
        sb.append(f9);
        sb.append(", crossStroke=");
        sb.append(f10);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((((((((((((((java.lang.Float.hashCode(this.centerX) * 31) + java.lang.Float.hashCode(this.centerY)) * 31) + java.lang.Float.hashCode(this.strokePx)) * 31) + java.lang.Float.hashCode(this.indicatorInnerPx)) * 31) + androidx.compose.ui.geometry.Offset.m5754hashCodeimpl(this.arcTopLeft)) * 31) + androidx.compose.ui.geometry.Size.m5822hashCodeimpl(this.arcSize)) * 31) + java.lang.Float.hashCode(this.startAngle)) * 31) + java.lang.Float.hashCode(this.fullSweep)) * 31) + java.lang.Float.hashCode(this.accentStartAngle)) * 31) + java.lang.Float.hashCode(this.accentSweep)) * 31) + androidx.compose.ui.geometry.Offset.m5754hashCodeimpl(this.indicatorCenter)) * 31) + java.lang.Float.hashCode(this.crossArm)) * 31) + java.lang.Float.hashCode(this.crossStroke);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.IconCanvasGeometry)) {
            return false;
        }
        com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.IconCanvasGeometry iconCanvasGeometry = (com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.IconCanvasGeometry) other;
        return java.lang.Float.compare(this.centerX, iconCanvasGeometry.centerX) == 0 && java.lang.Float.compare(this.centerY, iconCanvasGeometry.centerY) == 0 && java.lang.Float.compare(this.strokePx, iconCanvasGeometry.strokePx) == 0 && java.lang.Float.compare(this.indicatorInnerPx, iconCanvasGeometry.indicatorInnerPx) == 0 && androidx.compose.ui.geometry.Offset.m5749equalsimpl0(this.arcTopLeft, iconCanvasGeometry.arcTopLeft) && androidx.compose.ui.geometry.Size.m5817equalsimpl0(this.arcSize, iconCanvasGeometry.arcSize) && java.lang.Float.compare(this.startAngle, iconCanvasGeometry.startAngle) == 0 && java.lang.Float.compare(this.fullSweep, iconCanvasGeometry.fullSweep) == 0 && java.lang.Float.compare(this.accentStartAngle, iconCanvasGeometry.accentStartAngle) == 0 && java.lang.Float.compare(this.accentSweep, iconCanvasGeometry.accentSweep) == 0 && androidx.compose.ui.geometry.Offset.m5749equalsimpl0(this.indicatorCenter, iconCanvasGeometry.indicatorCenter) && java.lang.Float.compare(this.crossArm, iconCanvasGeometry.crossArm) == 0 && java.lang.Float.compare(this.crossStroke, iconCanvasGeometry.crossStroke) == 0;
    }

    /* renamed from: copy-eVhH1xg, reason: not valid java name */
    public final com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.IconCanvasGeometry m19597copyeVhH1xg(float centerX, float centerY, float strokePx, float indicatorInnerPx, long arcTopLeft, long arcSize, float startAngle, float fullSweep, float accentStartAngle, float accentSweep, long indicatorCenter, float crossArm, float crossStroke) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.IconCanvasGeometry(centerX, centerY, strokePx, indicatorInnerPx, arcTopLeft, arcSize, startAngle, fullSweep, accentStartAngle, accentSweep, indicatorCenter, crossArm, crossStroke, null);
    }

    /* renamed from: component9, reason: from getter */
    public final float getAccentStartAngle() {
        return this.accentStartAngle;
    }

    /* renamed from: component8, reason: from getter */
    public final float getFullSweep() {
        return this.fullSweep;
    }

    /* renamed from: component7, reason: from getter */
    public final float getStartAngle() {
        return this.startAngle;
    }

    /* renamed from: component6-NH-jbRc, reason: not valid java name and from getter */
    public final long getArcSize() {
        return this.arcSize;
    }

    /* renamed from: component5-F1C5BW0, reason: not valid java name and from getter */
    public final long getArcTopLeft() {
        return this.arcTopLeft;
    }

    /* renamed from: component4, reason: from getter */
    public final float getIndicatorInnerPx() {
        return this.indicatorInnerPx;
    }

    /* renamed from: component3, reason: from getter */
    public final float getStrokePx() {
        return this.strokePx;
    }

    /* renamed from: component2, reason: from getter */
    public final float getCenterY() {
        return this.centerY;
    }

    /* renamed from: component13, reason: from getter */
    public final float getCrossStroke() {
        return this.crossStroke;
    }

    /* renamed from: component12, reason: from getter */
    public final float getCrossArm() {
        return this.crossArm;
    }

    /* renamed from: component11-F1C5BW0, reason: not valid java name and from getter */
    public final long getIndicatorCenter() {
        return this.indicatorCenter;
    }

    /* renamed from: component10, reason: from getter */
    public final float getAccentSweep() {
        return this.accentSweep;
    }

    /* renamed from: component1, reason: from getter */
    public final float getCenterX() {
        return this.centerX;
    }

    public /* synthetic */ IconCanvasGeometry(float f, float f2, float f3, float f4, long j, long j2, float f5, float f6, float f7, float f8, long j3, float f9, float f10, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, j, j2, f5, f6, f7, f8, j3, f9, f10);
    }
}
