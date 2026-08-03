package androidx.compose.ui.platform;

/* compiled from: AndroidViewsHandler.android.kt */
@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0016\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011J\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0017J0\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020%H\u0014J\u0018\u0010)\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020%H\u0014J\b\u0010,\u001a\u00020\u000fH\u0017J\b\u0010-\u001a\u00020\u0013H\u0016R-\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b`\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR-\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00070\u0006j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0007`\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006."}, d2 = {"Landroidx/compose/ui/platform/AndroidViewsHandler;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "holderToLayoutNode", "Ljava/util/HashMap;", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/collections/HashMap;", "getHolderToLayoutNode", "()Ljava/util/HashMap;", "layoutNodeToHolder", "getLayoutNodeToHolder", "dispatchDraw", "", "canvas", "Landroid/graphics/Canvas;", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "drawView", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "invalidateChildInParent", "", com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION, "", "dirty", "Landroid/graphics/Rect;", "onDescendantInvalidated", "child", "Landroid/view/View;", "target", "onLayout", "changed", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE, "", "t", com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, "b", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "requestLayout", "shouldDelayChildPressedState", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidViewsHandler extends android.view.ViewGroup {
    public static final int $stable = 8;
    private final java.util.HashMap<androidx.compose.ui.viewinterop.AndroidViewHolder, androidx.compose.ui.node.LayoutNode> holderToLayoutNode;
    private final java.util.HashMap<androidx.compose.ui.node.LayoutNode, androidx.compose.ui.viewinterop.AndroidViewHolder> layoutNodeToHolder;

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent ev) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public java.lang.Void invalidateChildInParent(int[] location, android.graphics.Rect dirty) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(android.view.View child, android.view.View target) {
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public AndroidViewsHandler(android.content.Context context) {
        super(context);
        setClipChildren(false);
        this.holderToLayoutNode = new java.util.HashMap<>();
        this.layoutNodeToHolder = new java.util.HashMap<>();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public /* bridge */ /* synthetic */ android.view.ViewParent invalidateChildInParent(int[] iArr, android.graphics.Rect rect) {
        return (android.view.ViewParent) invalidateChildInParent(iArr, rect);
    }

    public final java.util.HashMap<androidx.compose.ui.viewinterop.AndroidViewHolder, androidx.compose.ui.node.LayoutNode> getHolderToLayoutNode() {
        return this.holderToLayoutNode;
    }

    public final java.util.HashMap<androidx.compose.ui.node.LayoutNode, androidx.compose.ui.viewinterop.AndroidViewHolder> getLayoutNodeToHolder() {
        return this.layoutNodeToHolder;
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (android.view.View.MeasureSpec.getMode(widthMeasureSpec) != 1073741824) {
            throw new java.lang.IllegalArgumentException("widthMeasureSpec should be EXACTLY".toString());
        }
        if (android.view.View.MeasureSpec.getMode(heightMeasureSpec) != 1073741824) {
            throw new java.lang.IllegalArgumentException("heightMeasureSpec should be EXACTLY".toString());
        }
        setMeasuredDimension(android.view.View.MeasureSpec.getSize(widthMeasureSpec), android.view.View.MeasureSpec.getSize(heightMeasureSpec));
        java.util.Iterator<T> it = this.holderToLayoutNode.keySet().iterator();
        while (it.hasNext()) {
            ((androidx.compose.ui.viewinterop.AndroidViewHolder) it.next()).remeasure();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        for (androidx.compose.ui.viewinterop.AndroidViewHolder androidViewHolder : this.holderToLayoutNode.keySet()) {
            androidViewHolder.layout(androidViewHolder.getLeft(), androidViewHolder.getTop(), androidViewHolder.getRight(), androidViewHolder.getBottom());
        }
    }

    public final void drawView(androidx.compose.ui.viewinterop.AndroidViewHolder view, android.graphics.Canvas canvas) {
        view.draw(canvas);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            androidx.compose.ui.node.LayoutNode layoutNode = this.holderToLayoutNode.get(childAt);
            if (childAt.isLayoutRequested() && layoutNode != null) {
                androidx.compose.ui.node.LayoutNode.requestRemeasure$ui_release$default(layoutNode, false, false, 3, null);
            }
        }
    }
}
