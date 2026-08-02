package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import c2.C5728b;
import java.util.HashMap;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.ui.platform.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5288u0 extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final HashMap<C5728b, D1.H> f41024a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final HashMap<D1.H, C5728b> f41025b;

    public C5288u0(@NotNull Context context) {
        super(context);
        setClipChildren(false);
        this.f41024a = new HashMap<>();
        this.f41025b = new HashMap<>();
    }

    @NotNull
    public final HashMap<C5728b, D1.H> a() {
        return this.f41024a;
    }

    @NotNull
    public final HashMap<D1.H, C5728b> b() {
        return this.f41025b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(@NotNull Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public final void onDescendantInvalidated(@NotNull View view, @NotNull View view2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        for (C5728b c5728b : this.f41024a.keySet()) {
            c5728b.layout(c5728b.getLeft(), c5728b.getTop(), c5728b.getRight(), c5728b.getBottom());
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i11, int i12) {
        if (!(View.MeasureSpec.getMode(i11) == 1073741824)) {
            A1.a.a("widthMeasureSpec should be EXACTLY");
            throw null;
        }
        if (View.MeasureSpec.getMode(i12) != 1073741824) {
            A1.a.a("heightMeasureSpec should be EXACTLY");
            throw null;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i11), View.MeasureSpec.getSize(i12));
        Iterator<T> it = this.f41024a.keySet().iterator();
        while (it.hasNext()) {
            ((C5728b) it.next()).o();
        }
    }

    @Override // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            D1.H h11 = this.f41024a.get(childAt);
            if (childAt.isLayoutRequested() && h11 != null) {
                D1.H.f1(h11, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
