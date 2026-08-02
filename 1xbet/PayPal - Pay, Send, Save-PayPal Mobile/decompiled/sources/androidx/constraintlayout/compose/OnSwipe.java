package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u001e\u0010\u0015R\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'"}, d2 = {"Landroidx/constraintlayout/compose/OnSwipe;", "", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", io.ktor.http.LinkHeader.Parameters.Anchor, "Landroidx/constraintlayout/compose/SwipeSide;", "side", "Landroidx/constraintlayout/compose/SwipeDirection;", "direction", "", "dragScale", "dragThreshold", "dragAround", "limitBoundsTo", "Landroidx/constraintlayout/compose/SwipeTouchUp;", "onTouchUp", "Landroidx/constraintlayout/compose/SwipeMode;", "mode", "<init>", "(Landroidx/constraintlayout/compose/ConstrainedLayoutReference;Landroidx/constraintlayout/compose/SwipeSide;Landroidx/constraintlayout/compose/SwipeDirection;FFLandroidx/constraintlayout/compose/ConstrainedLayoutReference;Landroidx/constraintlayout/compose/ConstrainedLayoutReference;Landroidx/constraintlayout/compose/SwipeTouchUp;Landroidx/constraintlayout/compose/SwipeMode;)V", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "getAnchor", "()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "Landroidx/constraintlayout/compose/SwipeDirection;", "getDirection", "()Landroidx/constraintlayout/compose/SwipeDirection;", "getDragAround", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getDragScale", "()F", "getDragThreshold", "getLimitBoundsTo", "Landroidx/constraintlayout/compose/SwipeMode;", "getMode", "()Landroidx/constraintlayout/compose/SwipeMode;", "Landroidx/constraintlayout/compose/SwipeTouchUp;", "getOnTouchUp", "()Landroidx/constraintlayout/compose/SwipeTouchUp;", "Landroidx/constraintlayout/compose/SwipeSide;", "getSide", "()Landroidx/constraintlayout/compose/SwipeSide;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnSwipe {
    public static final int $stable = 0;
    private final androidx.constraintlayout.compose.ConstrainedLayoutReference anchor;
    private final androidx.constraintlayout.compose.SwipeDirection direction;
    private final androidx.constraintlayout.compose.ConstrainedLayoutReference dragAround;
    private final float dragScale;
    private final float dragThreshold;
    private final androidx.constraintlayout.compose.ConstrainedLayoutReference limitBoundsTo;
    private final androidx.constraintlayout.compose.SwipeMode mode;
    private final androidx.constraintlayout.compose.SwipeTouchUp onTouchUp;
    private final androidx.constraintlayout.compose.SwipeSide side;

    public OnSwipe(androidx.constraintlayout.compose.ConstrainedLayoutReference constrainedLayoutReference, androidx.constraintlayout.compose.SwipeSide swipeSide, androidx.constraintlayout.compose.SwipeDirection swipeDirection, float f, float f2, androidx.constraintlayout.compose.ConstrainedLayoutReference constrainedLayoutReference2, androidx.constraintlayout.compose.ConstrainedLayoutReference constrainedLayoutReference3, androidx.constraintlayout.compose.SwipeTouchUp swipeTouchUp, androidx.constraintlayout.compose.SwipeMode swipeMode) {
        this.anchor = constrainedLayoutReference;
        this.side = swipeSide;
        this.direction = swipeDirection;
        this.dragScale = f;
        this.dragThreshold = f2;
        this.dragAround = constrainedLayoutReference2;
        this.limitBoundsTo = constrainedLayoutReference3;
        this.onTouchUp = swipeTouchUp;
        this.mode = swipeMode;
    }

    public final androidx.constraintlayout.compose.ConstrainedLayoutReference getAnchor() {
        return this.anchor;
    }

    public final androidx.constraintlayout.compose.SwipeSide getSide() {
        return this.side;
    }

    public final androidx.constraintlayout.compose.SwipeDirection getDirection() {
        return this.direction;
    }

    public final float getDragScale() {
        return this.dragScale;
    }

    public final float getDragThreshold() {
        return this.dragThreshold;
    }

    public final androidx.constraintlayout.compose.ConstrainedLayoutReference getDragAround() {
        return this.dragAround;
    }

    public final androidx.constraintlayout.compose.ConstrainedLayoutReference getLimitBoundsTo() {
        return this.limitBoundsTo;
    }

    public /* synthetic */ OnSwipe(androidx.constraintlayout.compose.ConstrainedLayoutReference constrainedLayoutReference, androidx.constraintlayout.compose.SwipeSide swipeSide, androidx.constraintlayout.compose.SwipeDirection swipeDirection, float f, float f2, androidx.constraintlayout.compose.ConstrainedLayoutReference constrainedLayoutReference2, androidx.constraintlayout.compose.ConstrainedLayoutReference constrainedLayoutReference3, androidx.constraintlayout.compose.SwipeTouchUp swipeTouchUp, androidx.constraintlayout.compose.SwipeMode swipeMode, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(constrainedLayoutReference, swipeSide, swipeDirection, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? 10.0f : f2, (i & 32) != 0 ? null : constrainedLayoutReference2, (i & 64) != 0 ? null : constrainedLayoutReference3, (i & 128) != 0 ? androidx.constraintlayout.compose.SwipeTouchUp.INSTANCE.getAutoComplete() : swipeTouchUp, (i & 256) != 0 ? androidx.constraintlayout.compose.SwipeMode.Companion.velocity$default(androidx.constraintlayout.compose.SwipeMode.INSTANCE, 0.0f, 0.0f, 3, null) : swipeMode);
    }

    public final androidx.constraintlayout.compose.SwipeTouchUp getOnTouchUp() {
        return this.onTouchUp;
    }

    public final androidx.constraintlayout.compose.SwipeMode getMode() {
        return this.mode;
    }
}
