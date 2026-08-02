package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0012\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010$\u001a\u00020\t2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0019\u0010(\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\tH\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\fH\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b.\u0010/R3\u00103\u001a\u001e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020100j\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u000201`28\u0007¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R6\u00107\u001a\u001e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020 00j\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020 `28\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u00104\u001a\u0004\b8\u00106"}, d2 = {"Landroidx/compose/ui/platform/AndroidViewsHandler;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "", "changed", "l", "t", "r", util.h.xy.cb.b.f1091, "onLayout", "(ZIIII)V", "Landroid/view/View;", "child", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "onDescendantInvalidated", "(Landroid/view/View;Landroid/view/View;)V", "", "location", "Landroid/graphics/Rect;", "dirty", "", "invalidateChildInParent", "([ILandroid/graphics/Rect;)Ljava/lang/Void;", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "view", "Landroid/graphics/Canvas;", "canvas", "drawView", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Landroid/graphics/Canvas;)V", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "requestLayout", "()V", "shouldDelayChildPressedState", "()Z", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "Ljava/util/HashMap;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/collections/getHighSpeedVideoFpsRangesFor;", "holderToLayoutNode", "Ljava/util/HashMap;", "getHolderToLayoutNode", "()Ljava/util/HashMap;", "layoutNodeToHolder", "getLayoutNodeToHolder"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidViewsHandler extends android.view.ViewGroup {
    public static final int $stable = 8;
    private final java.util.HashMap<androidx.compose.ui.viewinterop.AndroidViewHolder, androidx.compose.ui.node.LayoutNode> holderToLayoutNode;
    private final java.util.HashMap<androidx.compose.ui.node.LayoutNode, androidx.compose.ui.viewinterop.AndroidViewHolder> layoutNodeToHolder;

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(android.graphics.Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(android.view.MotionEvent ev) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final java.lang.Void invalidateChildInParent(int[] location, android.graphics.Rect dirty) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(android.view.View child, android.view.View target) {
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public AndroidViewsHandler(android.content.Context context) {
        super(context);
        setClipChildren(false);
        this.holderToLayoutNode = new java.util.HashMap<>();
        this.layoutNodeToHolder = new java.util.HashMap<>();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ android.view.ViewParent invalidateChildInParent(int[] iArr, android.graphics.Rect rect) {
        return (android.view.ViewParent) invalidateChildInParent(iArr, rect);
    }

    public final java.util.HashMap<androidx.compose.ui.viewinterop.AndroidViewHolder, androidx.compose.ui.node.LayoutNode> getHolderToLayoutNode() {
        return this.holderToLayoutNode;
    }

    public final java.util.HashMap<androidx.compose.ui.node.LayoutNode, androidx.compose.ui.viewinterop.AndroidViewHolder> getLayoutNodeToHolder() {
        return this.layoutNodeToHolder;
    }

    @Override // android.view.View
    protected final void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (android.view.View.MeasureSpec.getMode(widthMeasureSpec) != 1073741824) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("widthMeasureSpec should be EXACTLY");
        }
        if (android.view.View.MeasureSpec.getMode(heightMeasureSpec) != 1073741824) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(android.view.View.MeasureSpec.getSize(widthMeasureSpec), android.view.View.MeasureSpec.getSize(heightMeasureSpec));
        java.util.Iterator<T> it = this.holderToLayoutNode.keySet().iterator();
        while (it.hasNext()) {
            ((androidx.compose.ui.viewinterop.AndroidViewHolder) it.next()).remeasure();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean changed, int l, int t, int r, int b) {
        for (androidx.compose.ui.viewinterop.AndroidViewHolder androidViewHolder : this.holderToLayoutNode.keySet()) {
            androidViewHolder.layout(androidViewHolder.getLeft(), androidViewHolder.getTop(), androidViewHolder.getRight(), androidViewHolder.getBottom());
        }
    }

    public final void drawView(androidx.compose.ui.viewinterop.AndroidViewHolder view, android.graphics.Canvas canvas) {
        view.draw(canvas);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            androidx.compose.ui.node.LayoutNode layoutNode = this.holderToLayoutNode.get(childAt);
            if (childAt.isLayoutRequested() && layoutNode != null) {
                androidx.compose.ui.node.LayoutNode.requestRemeasure$ui$default(layoutNode, false, false, false, 7, null);
            }
        }
    }
}
