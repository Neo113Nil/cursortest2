package androidx.core.widget;

@java.lang.Deprecated
/* loaded from: classes7.dex */
public final class ScrollerCompat {
    android.widget.OverScroller getHighSpeedVideoSizes;

    @java.lang.Deprecated
    public static androidx.core.widget.ScrollerCompat create(android.content.Context context) {
        return create(context, null);
    }

    @java.lang.Deprecated
    public static androidx.core.widget.ScrollerCompat create(android.content.Context context, android.view.animation.Interpolator interpolator) {
        return new androidx.core.widget.ScrollerCompat(context, interpolator);
    }

    ScrollerCompat(android.content.Context context, android.view.animation.Interpolator interpolator) {
        this.getHighSpeedVideoSizes = interpolator != null ? new android.widget.OverScroller(context, interpolator) : new android.widget.OverScroller(context);
    }

    @java.lang.Deprecated
    public final boolean isFinished() {
        return this.getHighSpeedVideoSizes.isFinished();
    }

    @java.lang.Deprecated
    public final int getCurrX() {
        return this.getHighSpeedVideoSizes.getCurrX();
    }

    @java.lang.Deprecated
    public final int getCurrY() {
        return this.getHighSpeedVideoSizes.getCurrY();
    }

    @java.lang.Deprecated
    public final int getFinalX() {
        return this.getHighSpeedVideoSizes.getFinalX();
    }

    @java.lang.Deprecated
    public final int getFinalY() {
        return this.getHighSpeedVideoSizes.getFinalY();
    }

    @java.lang.Deprecated
    public final float getCurrVelocity() {
        return this.getHighSpeedVideoSizes.getCurrVelocity();
    }

    @java.lang.Deprecated
    public final boolean computeScrollOffset() {
        return this.getHighSpeedVideoSizes.computeScrollOffset();
    }

    @java.lang.Deprecated
    public final void startScroll(int i, int i2, int i3, int i4) {
        this.getHighSpeedVideoSizes.startScroll(i, i2, i3, i4);
    }

    @java.lang.Deprecated
    public final void startScroll(int i, int i2, int i3, int i4, int i5) {
        this.getHighSpeedVideoSizes.startScroll(i, i2, i3, i4, i5);
    }

    @java.lang.Deprecated
    public final void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.getHighSpeedVideoSizes.fling(i, i2, i3, i4, i5, i6, i7, i8);
    }

    @java.lang.Deprecated
    public final void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.getHighSpeedVideoSizes.fling(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
    }

    @java.lang.Deprecated
    public final boolean springBack(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.getHighSpeedVideoSizes.springBack(i, i2, i3, i4, i5, i6);
    }

    @java.lang.Deprecated
    public final void abortAnimation() {
        this.getHighSpeedVideoSizes.abortAnimation();
    }

    @java.lang.Deprecated
    public final void notifyHorizontalEdgeReached(int i, int i2, int i3) {
        this.getHighSpeedVideoSizes.notifyHorizontalEdgeReached(i, i2, i3);
    }

    @java.lang.Deprecated
    public final void notifyVerticalEdgeReached(int i, int i2, int i3) {
        this.getHighSpeedVideoSizes.notifyVerticalEdgeReached(i, i2, i3);
    }

    @java.lang.Deprecated
    public final boolean isOverScrolled() {
        return this.getHighSpeedVideoSizes.isOverScrolled();
    }
}
