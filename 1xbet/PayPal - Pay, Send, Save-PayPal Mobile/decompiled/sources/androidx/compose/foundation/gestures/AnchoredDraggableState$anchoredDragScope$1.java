package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u000bR$\u0010\r\u001a\u0004\u0018\u00018\u00008\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u0004\u0018\u00018\u00008\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\"\u0010\u0016\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableState$anchoredDragScope$1;", "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "", "newOffset", "lastKnownVelocity", "", "dragTo", "(FF)V", "", "isMovingForward", "updateIfNeeded", "(Z)V", "updateBounds", "leftBound", "Ljava/lang/Object;", "getLeftBound", "()Ljava/lang/Object;", "setLeftBound", "(Ljava/lang/Object;)V", "rightBound", "getRightBound", "setRightBound", "distance", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getDistance", "()F", "setDistance", "(F)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnchoredDraggableState$anchoredDragScope$1 implements androidx.compose.foundation.gestures.AnchoredDragScope {
    private float distance = Float.NaN;
    final /* synthetic */ androidx.compose.foundation.gestures.AnchoredDraggableState<T> getHighSpeedVideoSizes;
    private T leftBound;
    private T rightBound;

    AnchoredDraggableState$anchoredDragScope$1(androidx.compose.foundation.gestures.AnchoredDraggableState<T> anchoredDraggableState) {
        this.getHighSpeedVideoSizes = anchoredDraggableState;
    }

    public final T getLeftBound() {
        return this.leftBound;
    }

    public final void setLeftBound(T t) {
        this.leftBound = t;
    }

    public final T getRightBound() {
        return this.rightBound;
    }

    public final void setRightBound(T t) {
        this.rightBound = t;
    }

    public final float getDistance() {
        return this.distance;
    }

    public final void setDistance(float f) {
        this.distance = f;
    }

    @Override // androidx.compose.foundation.gestures.AnchoredDragScope
    public final void dragTo(float newOffset, float lastKnownVelocity) {
        float offset = this.getHighSpeedVideoSizes.getOffset();
        this.getHighSpeedVideoSizes.setOffset(newOffset);
        this.getHighSpeedVideoSizes.setLastVelocity(lastKnownVelocity);
        if (java.lang.Float.isNaN(offset)) {
            return;
        }
        updateIfNeeded(newOffset >= offset);
    }

    public final void updateIfNeeded(boolean isMovingForward) {
        updateBounds(isMovingForward);
        if (java.lang.Math.abs(this.getHighSpeedVideoSizes.getOffset() - this.getHighSpeedVideoSizes.getAnchors().positionOf(this.getHighSpeedVideoSizes.getCurrentValue())) >= this.distance / 2.0f) {
            java.lang.Object obj = isMovingForward ? this.rightBound : this.leftBound;
            if (obj == null) {
                obj = this.getHighSpeedVideoSizes.getCurrentValue();
            }
            if (((java.lang.Boolean) this.getHighSpeedVideoSizes.getConfirmValueChange$foundation().invoke(obj)).booleanValue()) {
                this.getHighSpeedVideoSizes.setCurrentValue(obj);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15, types: [T, java.lang.Object] */
    public final void updateBounds(boolean isMovingForward) {
        if (this.getHighSpeedVideoSizes.getOffset() == this.getHighSpeedVideoSizes.getAnchors().positionOf(this.getHighSpeedVideoSizes.getCurrentValue())) {
            java.lang.Object closestAnchor = this.getHighSpeedVideoSizes.getAnchors().closestAnchor(this.getHighSpeedVideoSizes.getOffset() + (isMovingForward ? 1.0f : -1.0f), isMovingForward);
            T t = closestAnchor;
            if (closestAnchor == null) {
                t = this.getHighSpeedVideoSizes.getCurrentValue();
            }
            if (isMovingForward) {
                this.leftBound = this.getHighSpeedVideoSizes.getCurrentValue();
                this.rightBound = t;
            } else {
                this.leftBound = t;
                this.rightBound = this.getHighSpeedVideoSizes.getCurrentValue();
            }
        } else {
            java.lang.Object closestAnchor2 = this.getHighSpeedVideoSizes.getAnchors().closestAnchor(this.getHighSpeedVideoSizes.getOffset(), false);
            T t2 = closestAnchor2;
            if (closestAnchor2 == null) {
                t2 = this.getHighSpeedVideoSizes.getCurrentValue();
            }
            java.lang.Object closestAnchor3 = this.getHighSpeedVideoSizes.getAnchors().closestAnchor(this.getHighSpeedVideoSizes.getOffset(), true);
            T t3 = closestAnchor3;
            if (closestAnchor3 == null) {
                t3 = this.getHighSpeedVideoSizes.getCurrentValue();
            }
            this.leftBound = t2;
            this.rightBound = t3;
        }
        androidx.compose.foundation.gestures.DraggableAnchors anchors = this.getHighSpeedVideoSizes.getAnchors();
        T t4 = this.leftBound;
        kotlin.jvm.internal.Intrinsics.checkNotNull(t4);
        float positionOf = anchors.positionOf(t4);
        androidx.compose.foundation.gestures.DraggableAnchors anchors2 = this.getHighSpeedVideoSizes.getAnchors();
        T t5 = this.rightBound;
        kotlin.jvm.internal.Intrinsics.checkNotNull(t5);
        this.distance = java.lang.Math.abs(positionOf - anchors2.positionOf(t5));
    }
}
