package androidx.compose.ui.graphics.layer.view;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J%\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#J'\u0010)\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020$2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0000¢\u0006\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,"}, d2 = {"Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "changed", "", "l", "t", "r", util.h.xy.cb.b.f1091, "", "onLayout", "(ZIIII)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "requestLayout", "()V", "forceLayout", "", "location", "Landroid/graphics/Rect;", "dirty", "Landroid/view/ViewParent;", "invalidateChildInParent", "([ILandroid/graphics/Rect;)Landroid/view/ViewParent;", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "getChildCount", "()I", "Landroidx/compose/ui/graphics/Canvas;", "Landroid/view/View;", "view", "", "drawingTime", "drawChild$ui_graphics", "(Landroidx/compose/ui/graphics/Canvas;Landroid/view/View;J)V", "getHighSpeedVideoSizes", "Z", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class DrawChildContainer extends android.view.ViewGroup {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean Camera2StreamConfigurationMap;

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public android.view.ViewParent invalidateChildInParent(int[] location, android.graphics.Rect dirty) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }

    public DrawChildContainer(android.content.Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        setTag(androidx.compose.ui.graphics.R.id.hide_graphics_layer_in_inspector_tag, java.lang.Boolean.TRUE);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
        int childCount = super.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            kotlin.jvm.internal.Intrinsics.checkNotNull(childAt, "");
            if (((androidx.compose.ui.graphics.layer.ViewLayer) childAt).getIsInvalidated()) {
                this.Camera2StreamConfigurationMap = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.Camera2StreamConfigurationMap = false;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.Camera2StreamConfigurationMap) {
            return super.getChildCount();
        }
        return 0;
    }

    public final void drawChild$ui_graphics(androidx.compose.ui.graphics.Canvas canvas, android.view.View view, long drawingTime) {
        super.drawChild(androidx.compose.ui.graphics.AndroidCanvas_androidKt.getNativeCanvas(canvas), view, drawingTime);
    }
}
