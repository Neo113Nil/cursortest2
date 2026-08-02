package A0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import w0.AbstractC2540a;
import z0.C2731G;

/* renamed from: A0.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0067x0 extends ViewGroup {

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f592k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f593l;

    public C0067x0(Context context) {
        super(context);
        setClipChildren(false);
        this.f592k = new HashMap();
        this.f593l = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<Z0.j, C2731G> getHolderToLayoutNode() {
        return this.f592k;
    }

    public final HashMap<C2731G, Z0.j> getLayoutNodeToHolder() {
        return this.f593l;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i5, int i6, int i7) {
        for (Z0.j jVar : this.f592k.keySet()) {
            jVar.layout(jVar.getLeft(), jVar.getTop(), jVar.getRight(), jVar.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i5) {
        int i6;
        if (!(View.MeasureSpec.getMode(i) == 1073741824)) {
            AbstractC2540a.a("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i5) == 1073741824)) {
            AbstractC2540a.a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i5));
        for (Z0.j jVar : this.f592k.keySet()) {
            int i7 = jVar.f6289E;
            if (i7 != Integer.MIN_VALUE && (i6 = jVar.f6290F) != Integer.MIN_VALUE) {
                jVar.measure(i7, i6);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C2731G c2731g = (C2731G) this.f592k.get(childAt);
            if (childAt.isLayoutRequested() && c2731g != null) {
                C2731G.W(c2731g, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }
}
