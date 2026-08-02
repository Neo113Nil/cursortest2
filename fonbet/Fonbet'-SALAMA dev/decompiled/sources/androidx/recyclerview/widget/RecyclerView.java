package androidx.recyclerview.widget;

import B4.V;
import C0.A;
import C0.B;
import C0.C;
import C0.C0083b;
import C0.C0084c;
import C0.C0089h;
import C0.C0091j;
import C0.D;
import C0.E;
import C0.G;
import C0.M;
import C0.RunnableC0085d;
import C0.RunnableC0093l;
import C0.p;
import C0.q;
import C0.s;
import C0.t;
import C0.u;
import C0.v;
import C0.w;
import C0.x;
import C0.y;
import C0.z;
import L.l;
import P.I;
import P.K;
import P.U;
import P.Y;
import P.r;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.ScrollingView;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.ads.zzbbd;
import e1.k;
import e6.C1054c;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import w1.C1722m0;
import w1.C1759x1;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ScrollingView {

    /* renamed from: A0, reason: collision with root package name */
    public static final Class[] f9683A0;

    /* renamed from: B0, reason: collision with root package name */
    public static final p f9684B0;

    /* renamed from: y0, reason: collision with root package name */
    public static final int[] f9685y0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: z0, reason: collision with root package name */
    public static final int[] f9686z0 = {R.attr.clipToPadding};

    /* renamed from: A, reason: collision with root package name */
    public final ArrayList f9687A;

    /* renamed from: B, reason: collision with root package name */
    public final ArrayList f9688B;

    /* renamed from: C, reason: collision with root package name */
    public C0089h f9689C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f9690D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f9691E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f9692F;

    /* renamed from: G, reason: collision with root package name */
    public int f9693G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f9694H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f9695I;

    /* renamed from: J, reason: collision with root package name */
    public int f9696J;

    /* renamed from: K, reason: collision with root package name */
    public final AccessibilityManager f9697K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f9698L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f9699M;

    /* renamed from: N, reason: collision with root package name */
    public int f9700N;

    /* renamed from: O, reason: collision with root package name */
    public final int f9701O;

    /* renamed from: P, reason: collision with root package name */
    public s f9702P;

    /* renamed from: Q, reason: collision with root package name */
    public EdgeEffect f9703Q;

    /* renamed from: R, reason: collision with root package name */
    public EdgeEffect f9704R;

    /* renamed from: S, reason: collision with root package name */
    public EdgeEffect f9705S;

    /* renamed from: T, reason: collision with root package name */
    public EdgeEffect f9706T;

    /* renamed from: U, reason: collision with root package name */
    public t f9707U;

    /* renamed from: V, reason: collision with root package name */
    public int f9708V;

    /* renamed from: W, reason: collision with root package name */
    public int f9709W;

    /* renamed from: a, reason: collision with root package name */
    public final A f9710a;

    /* renamed from: a0, reason: collision with root package name */
    public VelocityTracker f9711a0;

    /* renamed from: b, reason: collision with root package name */
    public SavedState f9712b;

    /* renamed from: b0, reason: collision with root package name */
    public int f9713b0;

    /* renamed from: c, reason: collision with root package name */
    public final C1759x1 f9714c;
    public int c0;

    /* renamed from: d, reason: collision with root package name */
    public final android.support.v4.media.session.t f9715d;

    /* renamed from: d0, reason: collision with root package name */
    public int f9716d0;

    /* renamed from: e, reason: collision with root package name */
    public final C1054c f9717e;

    /* renamed from: e0, reason: collision with root package name */
    public int f9718e0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9719f;

    /* renamed from: f0, reason: collision with root package name */
    public int f9720f0;

    /* renamed from: g0, reason: collision with root package name */
    public final int f9721g0;

    /* renamed from: h0, reason: collision with root package name */
    public final int f9722h0;

    /* renamed from: i0, reason: collision with root package name */
    public final float f9723i0;

    /* renamed from: j0, reason: collision with root package name */
    public final float f9724j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f9725k0;

    /* renamed from: l0, reason: collision with root package name */
    public final E f9726l0;

    /* renamed from: m0, reason: collision with root package name */
    public RunnableC0093l f9727m0;

    /* renamed from: n0, reason: collision with root package name */
    public final C0091j f9728n0;

    /* renamed from: o0, reason: collision with root package name */
    public final C f9729o0;

    /* renamed from: p0, reason: collision with root package name */
    public ArrayList f9730p0;

    /* renamed from: q0, reason: collision with root package name */
    public final V f9731q0;

    /* renamed from: r0, reason: collision with root package name */
    public G f9732r0;

    /* renamed from: s0, reason: collision with root package name */
    public r f9733s0;

    /* renamed from: t0, reason: collision with root package name */
    public final int[] f9734t0;

    /* renamed from: u0, reason: collision with root package name */
    public final int[] f9735u0;

    /* renamed from: v0, reason: collision with root package name */
    public final int[] f9736v0;

    /* renamed from: w0, reason: collision with root package name */
    public final ArrayList f9737w0;

    /* renamed from: x, reason: collision with root package name */
    public final Rect f9738x;

    /* renamed from: x0, reason: collision with root package name */
    public final RunnableC0085d f9739x0;

    /* renamed from: y, reason: collision with root package name */
    public final Rect f9740y;

    /* renamed from: z, reason: collision with root package name */
    public u f9741z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new b();

        /* renamed from: c, reason: collision with root package name */
        public Parcelable f9742c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9742c = parcel.readParcelable(classLoader == null ? u.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeParcelable(this.f9742c, 0);
        }
    }

    static {
        Class cls = Integer.TYPE;
        f9683A0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f9684B0 = new p(0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private r getScrollingChildHelper() {
        if (this.f9733s0 == null) {
            this.f9733s0 = new r(this);
        }
        return this.f9733s0;
    }

    public static void j(View view) {
        if (view == null) {
            return;
        }
        ((v) view.getLayoutParams()).getClass();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i7, int i8) {
        u uVar = this.f9741z;
        if (uVar != null) {
            uVar.getClass();
        }
        super.addFocusables(arrayList, i7, i8);
    }

    public final void b(String str) {
        if (this.f9700N > 0) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + h());
        }
        if (this.f9701O > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + h()));
        }
    }

    public final void c(int i7, int i8) {
        boolean z4;
        EdgeEffect edgeEffect = this.f9703Q;
        if (edgeEffect == null || edgeEffect.isFinished() || i7 <= 0) {
            z4 = false;
        } else {
            this.f9703Q.onRelease();
            z4 = this.f9703Q.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f9705S;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i7 < 0) {
            this.f9705S.onRelease();
            z4 |= this.f9705S.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f9704R;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i8 > 0) {
            this.f9704R.onRelease();
            z4 |= this.f9704R.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f9706T;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i8 < 0) {
            this.f9706T.onRelease();
            z4 |= this.f9706T.isFinished();
        }
        if (z4) {
            WeakHashMap weakHashMap = U.f5037a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof v) && this.f9741z.d((v) layoutParams);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollExtent() {
        u uVar = this.f9741z;
        if (uVar != null && uVar.b()) {
            return this.f9741z.f(this.f9729o0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollOffset() {
        u uVar = this.f9741z;
        if (uVar != null && uVar.b()) {
            this.f9741z.g(this.f9729o0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollRange() {
        u uVar = this.f9741z;
        if (uVar != null && uVar.b()) {
            return this.f9741z.h(this.f9729o0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollExtent() {
        u uVar = this.f9741z;
        if (uVar != null && uVar.c()) {
            return this.f9741z.i(this.f9729o0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollOffset() {
        u uVar = this.f9741z;
        if (uVar != null && uVar.c()) {
            this.f9741z.j(this.f9729o0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollRange() {
        u uVar = this.f9741z;
        if (uVar != null && uVar.c()) {
            return this.f9741z.k(this.f9729o0);
        }
        return 0;
    }

    public final void d() {
        C1759x1 c1759x1 = this.f9714c;
        if (!this.f9692F || this.f9698L) {
            int i7 = l.f4188a;
            Trace.beginSection("RV FullInvalidate");
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            Trace.endSection();
            return;
        }
        if (((ArrayList) c1759x1.f17926c).size() > 0) {
            c1759x1.getClass();
            if (((ArrayList) c1759x1.f17926c).size() > 0) {
                int i8 = l.f4188a;
                Trace.beginSection("RV FullInvalidate");
                Log.e("RecyclerView", "No adapter attached; skipping layout");
                Trace.endSection();
            }
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f7, float f8, boolean z4) {
        return getScrollingChildHelper().a(f7, f8, z4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f7, float f8) {
        return getScrollingChildHelper().b(f7, f8);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i7, int i8, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i7, i8, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i7, int i8, int i9, int i10, int[] iArr) {
        return getScrollingChildHelper().d(i7, i8, i9, i10, iArr, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z4;
        super.draw(canvas);
        ArrayList arrayList = this.f9687A;
        int size = arrayList.size();
        boolean z7 = false;
        for (int i7 = 0; i7 < size; i7++) {
            C0089h c0089h = (C0089h) arrayList.get(i7);
            if (c0089h.f1276l != c0089h.f1278n.getWidth() || c0089h.f1277m != c0089h.f1278n.getHeight()) {
                c0089h.f1276l = c0089h.f1278n.getWidth();
                c0089h.f1277m = c0089h.f1278n.getHeight();
                c0089h.e(0);
            } else if (c0089h.f1286v != 0) {
                if (c0089h.f1279o) {
                    int i8 = c0089h.f1276l;
                    int i9 = c0089h.f1269d;
                    int i10 = i8 - i9;
                    int i11 = 0 - (0 / 2);
                    StateListDrawable stateListDrawable = c0089h.f1267b;
                    stateListDrawable.setBounds(0, 0, i9, 0);
                    int i12 = c0089h.f1277m;
                    Drawable drawable = c0089h.f1268c;
                    drawable.setBounds(0, 0, c0089h.f1270e, i12);
                    RecyclerView recyclerView = c0089h.f1278n;
                    WeakHashMap weakHashMap = U.f5037a;
                    if (recyclerView.getLayoutDirection() == 1) {
                        drawable.draw(canvas);
                        canvas.translate(i9, i11);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(1.0f, 1.0f);
                        canvas.translate(-i9, -i11);
                    } else {
                        canvas.translate(i10, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i11);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i10, -i11);
                    }
                }
                if (c0089h.f1280p) {
                    int i13 = c0089h.f1277m;
                    int i14 = c0089h.f1273h;
                    int i15 = i13 - i14;
                    StateListDrawable stateListDrawable2 = c0089h.f1271f;
                    stateListDrawable2.setBounds(0, 0, 0, i14);
                    int i16 = c0089h.f1276l;
                    Drawable drawable2 = c0089h.f1272g;
                    drawable2.setBounds(0, 0, i16, c0089h.f1274i);
                    canvas.translate(0.0f, i15);
                    drawable2.draw(canvas);
                    canvas.translate(0 - (0 / 2), 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-r9, -i15);
                }
            }
        }
        EdgeEffect edgeEffect = this.f9703Q;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z4 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f9719f ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f9703Q;
            z4 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f9704R;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f9719f) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f9704R;
            z4 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f9705S;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f9719f ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f9705S;
            z4 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f9706T;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f9719f) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f9706T;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z7 = true;
            }
            z4 |= z7;
            canvas.restoreToCount(save4);
        }
        if ((z4 || this.f9707U == null || arrayList.size() <= 0 || !this.f9707U.b()) ? z4 : true) {
            WeakHashMap weakHashMap2 = U.f5037a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e(int i7, int i8) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = U.f5037a;
        setMeasuredDimension(u.e(i7, paddingRight, getMinimumWidth()), u.e(i8, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final boolean f(int i7, int i8, int[] iArr, int[] iArr2, int i9) {
        return getScrollingChildHelper().c(i7, i8, iArr, iArr2, i9);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i7) {
        int i8;
        this.f9741z.getClass();
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i7);
        if (findNextFocus != null && !findNextFocus.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i7);
            }
            o(findNextFocus, null);
            return view;
        }
        if (findNextFocus != null && findNextFocus != this && i(findNextFocus) != null) {
            if (view == null || i(view) == null) {
                return findNextFocus;
            }
            int width = view.getWidth();
            int height = view.getHeight();
            Rect rect = this.f9738x;
            char c3 = 0;
            rect.set(0, 0, width, height);
            int width2 = findNextFocus.getWidth();
            int height2 = findNextFocus.getHeight();
            Rect rect2 = this.f9740y;
            rect2.set(0, 0, width2, height2);
            offsetDescendantRectToMyCoords(view, rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect2);
            RecyclerView recyclerView = this.f9741z.f1315b;
            WeakHashMap weakHashMap = U.f5037a;
            int i9 = recyclerView.getLayoutDirection() == 1 ? -1 : 1;
            int i10 = rect.left;
            int i11 = rect2.left;
            if ((i10 < i11 || rect.right <= i11) && rect.right < rect2.right) {
                i8 = 1;
            } else {
                int i12 = rect.right;
                int i13 = rect2.right;
                i8 = ((i12 > i13 || i10 >= i13) && i10 > i11) ? -1 : 0;
            }
            int i14 = rect.top;
            int i15 = rect2.top;
            if ((i14 < i15 || rect.bottom <= i15) && rect.bottom < rect2.bottom) {
                c3 = 1;
            } else {
                int i16 = rect.bottom;
                int i17 = rect2.bottom;
                if ((i16 > i17 || i14 >= i17) && i14 > i15) {
                    c3 = 65535;
                }
            }
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 17) {
                        if (i7 != 33) {
                            if (i7 != 66) {
                                if (i7 != 130) {
                                    throw new IllegalArgumentException("Invalid direction: " + i7 + h());
                                }
                                if (c3 > 0) {
                                    return findNextFocus;
                                }
                            } else if (i8 > 0) {
                                return findNextFocus;
                            }
                        } else if (c3 < 0) {
                            return findNextFocus;
                        }
                    } else if (i8 < 0) {
                        return findNextFocus;
                    }
                } else {
                    if (c3 > 0) {
                        return findNextFocus;
                    }
                    if (c3 == 0 && i8 * i9 >= 0) {
                        return findNextFocus;
                    }
                }
            } else {
                if (c3 < 0) {
                    return findNextFocus;
                }
                if (c3 == 0 && i8 * i9 <= 0) {
                    return findNextFocus;
                }
            }
        }
        return super.focusSearch(view, i7);
    }

    public final boolean g(int i7, int i8, int i9, int i10, int[] iArr, int i11) {
        return getScrollingChildHelper().d(0, 0, 0, 0, iArr, i11, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        u uVar = this.f9741z;
        if (uVar != null) {
            return uVar.l();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        u uVar = this.f9741z;
        if (uVar != null) {
            return uVar.m(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    public q getAdapter() {
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        u uVar = this.f9741z;
        if (uVar == null) {
            return super.getBaseline();
        }
        uVar.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i7, int i8) {
        return super.getChildDrawingOrder(i7, i8);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f9719f;
    }

    public G getCompatAccessibilityDelegate() {
        return this.f9732r0;
    }

    public s getEdgeEffectFactory() {
        return this.f9702P;
    }

    public t getItemAnimator() {
        return this.f9707U;
    }

    public int getItemDecorationCount() {
        return this.f9687A.size();
    }

    public u getLayoutManager() {
        return this.f9741z;
    }

    public int getMaxFlingVelocity() {
        return this.f9722h0;
    }

    public int getMinFlingVelocity() {
        return this.f9721g0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public w getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f9725k0;
    }

    public z getRecycledViewPool() {
        A a2 = this.f9710a;
        if (((z) a2.f1216f) == null) {
            z zVar = new z();
            zVar.f1323a = new SparseArray();
            zVar.f1324b = 0;
            a2.f1216f = zVar;
        }
        return (z) a2.f1216f;
    }

    public int getScrollState() {
        return this.f9708V;
    }

    public final String h() {
        return " " + super.toString() + ", adapter:null, layout:" + this.f9741z + ", context:" + getContext();
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View i(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        return null;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f9690D;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f5105d;
    }

    public final boolean k(int i7) {
        return getScrollingChildHelper().f(1);
    }

    public final boolean l() {
        return !this.f9692F || this.f9698L || ((ArrayList) this.f9714c.f17926c).size() > 0;
    }

    public final void m() {
        int h02 = this.f9715d.h0();
        for (int i7 = 0; i7 < h02; i7++) {
            ((v) this.f9715d.g0(i7).getLayoutParams()).f1322b = true;
        }
        ArrayList arrayList = (ArrayList) this.f9710a.f1214d;
        if (arrayList.size() > 0) {
            throw k.c(arrayList, 0);
        }
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f9709W) {
            int i7 = actionIndex == 0 ? 1 : 0;
            this.f9709W = motionEvent.getPointerId(i7);
            int x4 = (int) (motionEvent.getX(i7) + 0.5f);
            this.f9716d0 = x4;
            this.f9713b0 = x4;
            int y4 = (int) (motionEvent.getY(i7) + 0.5f);
            this.f9718e0 = y4;
            this.c0 = y4;
        }
    }

    public final void o(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f9738x;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof v) {
            v vVar = (v) layoutParams;
            if (!vVar.f1322b) {
                int i7 = rect.left;
                Rect rect2 = vVar.f1321a;
                rect.left = i7 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f9741z.G(this, view, this.f9738x, !this.f9692F, view2 == null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r1 >= 30.0f) goto L19;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        float f7;
        super.onAttachedToWindow();
        boolean z4 = false;
        this.f9700N = 0;
        this.f9690D = true;
        if (this.f9692F && !isLayoutRequested()) {
            z4 = true;
        }
        this.f9692F = z4;
        u uVar = this.f9741z;
        if (uVar != null) {
            uVar.f1318e = true;
        }
        ThreadLocal threadLocal = RunnableC0093l.f1297e;
        RunnableC0093l runnableC0093l = (RunnableC0093l) threadLocal.get();
        this.f9727m0 = runnableC0093l;
        if (runnableC0093l == null) {
            RunnableC0093l runnableC0093l2 = new RunnableC0093l();
            runnableC0093l2.f1299a = new ArrayList();
            runnableC0093l2.f1302d = new ArrayList();
            this.f9727m0 = runnableC0093l2;
            WeakHashMap weakHashMap = U.f5037a;
            Display display = getDisplay();
            if (!isInEditMode() && display != null) {
                f7 = display.getRefreshRate();
            }
            f7 = 60.0f;
            RunnableC0093l runnableC0093l3 = this.f9727m0;
            runnableC0093l3.f1301c = (long) (1.0E9f / f7);
            threadLocal.set(runnableC0093l3);
        }
        this.f9727m0.f1299a.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t tVar = this.f9707U;
        if (tVar != null) {
            tVar.a();
        }
        setScrollState(0);
        E e7 = this.f9726l0;
        e7.f1229x.removeCallbacks(e7);
        e7.f1225c.abortAnimation();
        this.f9690D = false;
        u uVar = this.f9741z;
        if (uVar != null) {
            uVar.f1318e = false;
            uVar.z(this);
        }
        this.f9737w0.clear();
        removeCallbacks(this.f9739x0);
        this.f9717e.getClass();
        while (M.f1244a.a() != null) {
        }
        RunnableC0093l runnableC0093l = this.f9727m0;
        if (runnableC0093l != null) {
            runnableC0093l.f1299a.remove(this);
            this.f9727m0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f9687A;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((C0089h) arrayList.get(i7)).getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f7;
        float f8;
        if (this.f9741z != null && !this.f9694H && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f7 = this.f9741z.c() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f9741z.b()) {
                    f8 = motionEvent.getAxisValue(10);
                    if (f7 == 0.0f || f8 != 0.0f) {
                        q((int) (f8 * this.f9723i0), (int) (f7 * this.f9724j0), motionEvent);
                    }
                }
                f8 = 0.0f;
                if (f7 == 0.0f) {
                }
                q((int) (f8 * this.f9723i0), (int) (f7 * this.f9724j0), motionEvent);
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f9741z.c()) {
                        f7 = -axisValue;
                        f8 = 0.0f;
                        if (f7 == 0.0f) {
                        }
                        q((int) (f8 * this.f9723i0), (int) (f7 * this.f9724j0), motionEvent);
                    } else if (this.f9741z.b()) {
                        f8 = axisValue;
                        f7 = 0.0f;
                        if (f7 == 0.0f) {
                        }
                        q((int) (f8 * this.f9723i0), (int) (f7 * this.f9724j0), motionEvent);
                    }
                }
                f7 = 0.0f;
                f8 = 0.0f;
                if (f7 == 0.0f) {
                }
                q((int) (f8 * this.f9723i0), (int) (f7 * this.f9724j0), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        if (this.f9694H) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.f9689C = null;
        }
        ArrayList arrayList = this.f9688B;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            C0089h c0089h = (C0089h) arrayList.get(i7);
            if (c0089h.c(motionEvent) && action != 3) {
                this.f9689C = c0089h;
                p();
                setScrollState(0);
                return true;
            }
        }
        u uVar = this.f9741z;
        if (uVar == null) {
            return false;
        }
        boolean b7 = uVar.b();
        boolean c3 = this.f9741z.c();
        if (this.f9711a0 == null) {
            this.f9711a0 = VelocityTracker.obtain();
        }
        this.f9711a0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f9695I) {
                this.f9695I = false;
            }
            this.f9709W = motionEvent.getPointerId(0);
            int x4 = (int) (motionEvent.getX() + 0.5f);
            this.f9716d0 = x4;
            this.f9713b0 = x4;
            int y4 = (int) (motionEvent.getY() + 0.5f);
            this.f9718e0 = y4;
            this.c0 = y4;
            if (this.f9708V == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
            int[] iArr = this.f9736v0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i8 = b7;
            if (c3) {
                i8 = (b7 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i8, 0);
        } else if (actionMasked == 1) {
            this.f9711a0.clear();
            s(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f9709W);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f9709W + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x7 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y5 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f9708V != 1) {
                int i9 = x7 - this.f9713b0;
                int i10 = y5 - this.c0;
                if (b7 == 0 || Math.abs(i9) <= this.f9720f0) {
                    z4 = false;
                } else {
                    this.f9716d0 = x7;
                    z4 = true;
                }
                if (c3 && Math.abs(i10) > this.f9720f0) {
                    this.f9718e0 = y5;
                    z4 = true;
                }
                if (z4) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            p();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.f9709W = motionEvent.getPointerId(actionIndex);
            int x8 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f9716d0 = x8;
            this.f9713b0 = x8;
            int y7 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f9718e0 = y7;
            this.c0 = y7;
        } else if (actionMasked == 6) {
            n(motionEvent);
        }
        return this.f9708V == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i7, int i8, int i9, int i10) {
        int i11 = l.f4188a;
        Trace.beginSection("RV OnLayout");
        Log.e("RecyclerView", "No adapter attached; skipping layout");
        Trace.endSection();
        this.f9692F = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        u uVar = this.f9741z;
        if (uVar == null) {
            e(i7, i8);
            return;
        }
        if (uVar.y()) {
            View.MeasureSpec.getMode(i7);
            View.MeasureSpec.getMode(i8);
            this.f9741z.f1315b.e(i7, i8);
        } else {
            if (this.f9691E) {
                this.f9741z.f1315b.e(i7, i8);
                return;
            }
            C c3 = this.f9729o0;
            if (c3.f1222e) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            c3.getClass();
            this.f9693G++;
            this.f9741z.f1315b.e(i7, i8);
            if (this.f9693G < 1) {
                this.f9693G = 1;
            }
            this.f9693G--;
            c3.f1220c = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i7, Rect rect) {
        if (this.f9700N > 0) {
            return false;
        }
        return super.onRequestFocusInDescendants(i7, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f9712b = savedState;
        super.onRestoreInstanceState(savedState.f9102a);
        u uVar = this.f9741z;
        if (uVar == null || (parcelable2 = this.f9712b.f9742c) == null) {
            return;
        }
        uVar.B(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f9712b;
        if (savedState2 != null) {
            savedState.f9742c = savedState2.f9742c;
        } else {
            u uVar = this.f9741z;
            if (uVar != null) {
                savedState.f9742c = uVar.C();
            } else {
                savedState.f9742c = null;
            }
        }
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        if (i7 == i9 && i8 == i10) {
            return;
        }
        this.f9706T = null;
        this.f9704R = null;
        this.f9705S = null;
        this.f9703Q = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x024c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        if (this.f9694H || this.f9695I) {
            return false;
        }
        int action = motionEvent.getAction();
        C0089h c0089h = this.f9689C;
        if (c0089h != null) {
            if (action != 0) {
                if (c0089h.f1281q != 0) {
                    if (motionEvent.getAction() == 0) {
                        boolean b7 = c0089h.b(motionEvent.getX(), motionEvent.getY());
                        boolean a2 = c0089h.a(motionEvent.getX(), motionEvent.getY());
                        if (b7 || a2) {
                            if (a2) {
                                c0089h.f1282r = 1;
                                c0089h.f1275k = (int) motionEvent.getX();
                            } else if (b7) {
                                c0089h.f1282r = 2;
                                c0089h.j = (int) motionEvent.getY();
                            }
                            c0089h.e(2);
                        }
                    } else if (motionEvent.getAction() == 1 && c0089h.f1281q == 2) {
                        c0089h.j = 0.0f;
                        c0089h.f1275k = 0.0f;
                        c0089h.e(1);
                        c0089h.f1282r = 0;
                    } else if (motionEvent.getAction() == 2 && c0089h.f1281q == 2) {
                        c0089h.f();
                        int i7 = c0089h.f1282r;
                        int i8 = c0089h.f1266a;
                        if (i7 == 1) {
                            float x4 = motionEvent.getX();
                            int[] iArr = c0089h.f1284t;
                            iArr[0] = i8;
                            int i9 = c0089h.f1276l - i8;
                            iArr[1] = i9;
                            float max = Math.max(i8, Math.min(i9, x4));
                            if (Math.abs(0 - max) >= 2.0f) {
                                float f7 = c0089h.f1275k;
                                int computeHorizontalScrollRange = c0089h.f1278n.computeHorizontalScrollRange();
                                c0089h.f1278n.computeHorizontalScrollOffset();
                                int d7 = C0089h.d(f7, max, iArr, computeHorizontalScrollRange, 0, c0089h.f1276l);
                                if (d7 != 0) {
                                    c0089h.f1278n.scrollBy(d7, 0);
                                }
                                c0089h.f1275k = max;
                            }
                        }
                        if (c0089h.f1282r == 2) {
                            float y4 = motionEvent.getY();
                            int[] iArr2 = c0089h.f1283s;
                            iArr2[0] = i8;
                            int i10 = c0089h.f1277m - i8;
                            iArr2[1] = i10;
                            float max2 = Math.max(i8, Math.min(i10, y4));
                            if (Math.abs(0 - max2) >= 2.0f) {
                                float f8 = c0089h.j;
                                int computeVerticalScrollRange = c0089h.f1278n.computeVerticalScrollRange();
                                c0089h.f1278n.computeVerticalScrollOffset();
                                int d8 = C0089h.d(f8, max2, iArr2, computeVerticalScrollRange, 0, c0089h.f1277m);
                                if (d8 != 0) {
                                    c0089h.f1278n.scrollBy(0, d8);
                                }
                                c0089h.j = max2;
                            }
                        }
                    }
                }
                if (action == 3 || action == 1) {
                    this.f9689C = null;
                }
                p();
                setScrollState(0);
                return true;
            }
            this.f9689C = null;
        }
        if (action != 0) {
            ArrayList arrayList = this.f9688B;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                C0089h c0089h2 = (C0089h) arrayList.get(i11);
                if (c0089h2.c(motionEvent)) {
                    this.f9689C = c0089h2;
                    p();
                    setScrollState(0);
                    return true;
                }
            }
        }
        u uVar = this.f9741z;
        if (uVar == null) {
            return false;
        }
        boolean b8 = uVar.b();
        boolean c3 = this.f9741z.c();
        if (this.f9711a0 == null) {
            this.f9711a0 = VelocityTracker.obtain();
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int[] iArr3 = this.f9736v0;
        if (actionMasked == 0) {
            iArr3[1] = 0;
            iArr3[0] = 0;
        }
        obtain.offsetLocation(iArr3[0], iArr3[1]);
        if (actionMasked == 0) {
            this.f9709W = motionEvent.getPointerId(0);
            int x7 = (int) (motionEvent.getX() + 0.5f);
            this.f9716d0 = x7;
            this.f9713b0 = x7;
            int y5 = (int) (motionEvent.getY() + 0.5f);
            this.f9718e0 = y5;
            this.c0 = y5;
            int i12 = b8;
            if (c3) {
                i12 = (b8 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i12, 0);
        } else {
            if (actionMasked == 1) {
                this.f9711a0.addMovement(obtain);
                VelocityTracker velocityTracker = this.f9711a0;
                int i13 = this.f9722h0;
                velocityTracker.computeCurrentVelocity(zzbbd.zzq.zzf, i13);
                float f9 = b8 != 0 ? -this.f9711a0.getXVelocity(this.f9709W) : 0.0f;
                float f10 = c3 ? -this.f9711a0.getYVelocity(this.f9709W) : 0.0f;
                if (f9 != 0.0f || f10 != 0.0f) {
                    int i14 = (int) f9;
                    int i15 = (int) f10;
                    u uVar2 = this.f9741z;
                    if (uVar2 == null) {
                        Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    } else if (!this.f9694H) {
                        boolean b9 = uVar2.b();
                        boolean c4 = this.f9741z.c();
                        int i16 = this.f9721g0;
                        if (b9 == 0 || Math.abs(i14) < i16) {
                            i14 = 0;
                        }
                        if (!c4 || Math.abs(i15) < i16) {
                            i15 = 0;
                        }
                        if (i14 != 0 || i15 != 0) {
                            float f11 = i14;
                            float f12 = i15;
                            if (!dispatchNestedPreFling(f11, f12)) {
                                boolean z7 = b9 != 0 || c4;
                                dispatchNestedFling(f11, f12, z7);
                                int i17 = b9;
                                if (z7) {
                                    if (c4) {
                                        i17 = (b9 ? 1 : 0) | 2;
                                    }
                                    getScrollingChildHelper().g(i17, 1);
                                    int i18 = -i13;
                                    int max3 = Math.max(i18, Math.min(i14, i13));
                                    int max4 = Math.max(i18, Math.min(i15, i13));
                                    E e7 = this.f9726l0;
                                    e7.f1229x.setScrollState(2);
                                    e7.f1224b = 0;
                                    e7.f1223a = 0;
                                    e7.f1225c.fling(0, 0, max3, max4, Integer.MIN_VALUE, f.API_PRIORITY_OTHER, Integer.MIN_VALUE, f.API_PRIORITY_OTHER);
                                    e7.a();
                                    p();
                                    obtain.recycle();
                                    return true;
                                }
                            }
                        }
                    }
                }
                setScrollState(0);
                p();
                obtain.recycle();
                return true;
            }
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f9709W);
                if (findPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f9709W + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x8 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                int y7 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                int i19 = this.f9716d0 - x8;
                int i20 = this.f9718e0 - y7;
                boolean f13 = f(i19, i20, this.f9735u0, this.f9734t0, 0);
                int[] iArr4 = this.f9734t0;
                if (f13) {
                    int[] iArr5 = this.f9735u0;
                    i19 -= iArr5[0];
                    i20 -= iArr5[1];
                    obtain.offsetLocation(iArr4[0], iArr4[1]);
                    iArr3[0] = iArr3[0] + iArr4[0];
                    iArr3[1] = iArr3[1] + iArr4[1];
                }
                if (this.f9708V != 1) {
                    if (b8 != 0) {
                        int abs = Math.abs(i19);
                        int i21 = this.f9720f0;
                        if (abs > i21) {
                            i19 = i19 > 0 ? i19 - i21 : i19 + i21;
                            z4 = true;
                            if (c3) {
                                int abs2 = Math.abs(i20);
                                int i22 = this.f9720f0;
                                if (abs2 > i22) {
                                    i20 = i20 > 0 ? i20 - i22 : i20 + i22;
                                    z4 = true;
                                }
                            }
                            if (z4) {
                                setScrollState(1);
                            }
                        }
                    }
                    z4 = false;
                    if (c3) {
                    }
                    if (z4) {
                    }
                }
                int i23 = i20;
                if (this.f9708V == 1) {
                    this.f9716d0 = x8 - iArr4[0];
                    this.f9718e0 = y7 - iArr4[1];
                    q(b8 != 0 ? i19 : 0, c3 ? i23 : 0, obtain);
                    RunnableC0093l runnableC0093l = this.f9727m0;
                    if (runnableC0093l != null && (i19 != 0 || i23 != 0)) {
                        runnableC0093l.a(this, i19, i23);
                    }
                }
            } else if (actionMasked == 3) {
                p();
                setScrollState(0);
            } else if (actionMasked == 5) {
                this.f9709W = motionEvent.getPointerId(actionIndex);
                int x9 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f9716d0 = x9;
                this.f9713b0 = x9;
                int y8 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f9718e0 = y8;
                this.c0 = y8;
            } else if (actionMasked == 6) {
                n(motionEvent);
            }
        }
        this.f9711a0.addMovement(obtain);
        obtain.recycle();
        return true;
    }

    public final void p() {
        VelocityTracker velocityTracker = this.f9711a0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z4 = false;
        s(0);
        EdgeEffect edgeEffect = this.f9703Q;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z4 = this.f9703Q.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f9704R;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z4 |= this.f9704R.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f9705S;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z4 |= this.f9705S.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f9706T;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z4 |= this.f9706T.isFinished();
        }
        if (z4) {
            WeakHashMap weakHashMap = U.f5037a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(int i7, int i8, MotionEvent motionEvent) {
        d();
        if (!this.f9687A.isEmpty()) {
            invalidate();
        }
        boolean z4 = false;
        boolean z7 = true;
        if (g(0, 0, 0, 0, this.f9734t0, 0)) {
            int i9 = this.f9716d0;
            int[] iArr = this.f9734t0;
            int i10 = iArr[0];
            this.f9716d0 = i9 - i10;
            int i11 = this.f9718e0;
            int i12 = iArr[1];
            this.f9718e0 = i11 - i12;
            if (motionEvent != null) {
                motionEvent.offsetLocation(i10, i12);
            }
            int[] iArr2 = this.f9736v0;
            iArr2[0] = iArr2[0] + iArr[0];
            iArr2[1] = iArr2[1] + iArr[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x4 = motionEvent.getX();
                float f7 = 0;
                float y4 = motionEvent.getY();
                if (f7 < 0.0f) {
                    if (this.f9703Q == null) {
                        this.f9702P.getClass();
                        EdgeEffect edgeEffect = new EdgeEffect(getContext());
                        this.f9703Q = edgeEffect;
                        if (this.f9719f) {
                            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                        } else {
                            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
                        }
                    }
                    V.d.a(this.f9703Q, (-f7) / getWidth(), 1.0f - (y4 / getHeight()));
                } else {
                    if (f7 > 0.0f) {
                        if (this.f9705S == null) {
                            this.f9702P.getClass();
                            EdgeEffect edgeEffect2 = new EdgeEffect(getContext());
                            this.f9705S = edgeEffect2;
                            if (this.f9719f) {
                                edgeEffect2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                            } else {
                                edgeEffect2.setSize(getMeasuredHeight(), getMeasuredWidth());
                            }
                        }
                        V.d.a(this.f9705S, f7 / getWidth(), y4 / getHeight());
                    }
                    if (f7 >= 0.0f) {
                        if (this.f9704R == null) {
                            this.f9702P.getClass();
                            EdgeEffect edgeEffect3 = new EdgeEffect(getContext());
                            this.f9704R = edgeEffect3;
                            if (this.f9719f) {
                                edgeEffect3.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                            } else {
                                edgeEffect3.setSize(getMeasuredWidth(), getMeasuredHeight());
                            }
                        }
                        V.d.a(this.f9704R, (-f7) / getHeight(), x4 / getWidth());
                    } else if (f7 > 0.0f) {
                        if (this.f9706T == null) {
                            this.f9702P.getClass();
                            EdgeEffect edgeEffect4 = new EdgeEffect(getContext());
                            this.f9706T = edgeEffect4;
                            if (this.f9719f) {
                                edgeEffect4.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                            } else {
                                edgeEffect4.setSize(getMeasuredWidth(), getMeasuredHeight());
                            }
                        }
                        V.d.a(this.f9706T, f7 / getHeight(), 1.0f - (x4 / getWidth()));
                    } else {
                        z7 = z4;
                    }
                    if (!z7 || f7 != 0.0f || f7 != 0.0f) {
                        WeakHashMap weakHashMap = U.f5037a;
                        postInvalidateOnAnimation();
                    }
                }
                z4 = true;
                if (f7 >= 0.0f) {
                }
                if (!z7) {
                }
                WeakHashMap weakHashMap2 = U.f5037a;
                postInvalidateOnAnimation();
            }
            c(i7, i8);
        }
        if (awakenScrollBars()) {
            return;
        }
        invalidate();
    }

    public final void r(int i7, int i8) {
        int i9;
        u uVar = this.f9741z;
        if (uVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f9694H) {
            return;
        }
        int i10 = !uVar.b() ? 0 : i7;
        int i11 = !this.f9741z.c() ? 0 : i8;
        if (i10 == 0 && i11 == 0) {
            return;
        }
        E e7 = this.f9726l0;
        e7.getClass();
        int abs = Math.abs(i10);
        int abs2 = Math.abs(i11);
        boolean z4 = abs > abs2;
        int sqrt = (int) Math.sqrt(0);
        int sqrt2 = (int) Math.sqrt((i11 * i11) + (i10 * i10));
        RecyclerView recyclerView = e7.f1229x;
        int width = z4 ? recyclerView.getWidth() : recyclerView.getHeight();
        int i12 = width / 2;
        float f7 = width;
        float f8 = i12;
        float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f7) - 0.5f) * 0.47123894f)) * f8) + f8;
        if (sqrt > 0) {
            i9 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
        } else {
            if (!z4) {
                abs = abs2;
            }
            i9 = (int) (((abs / f7) + 1.0f) * 300.0f);
        }
        int min = Math.min(i9, 2000);
        p pVar = f9684B0;
        if (e7.f1226d != pVar) {
            e7.f1226d = pVar;
            e7.f1225c = new OverScroller(recyclerView.getContext(), pVar);
        }
        recyclerView.setScrollState(2);
        e7.f1224b = 0;
        e7.f1223a = 0;
        e7.f1225c.startScroll(0, 0, i10, i11, min);
        e7.a();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z4) {
        j(view);
        view.clearAnimation();
        j(view);
        super.removeDetachedView(view, z4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.f9741z.getClass();
        if (this.f9700N <= 0 && view2 != null) {
            o(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        return this.f9741z.G(this, view, rect, z4, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        ArrayList arrayList = this.f9688B;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((C0089h) arrayList.get(i7)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f9693G != 0 || this.f9694H) {
            return;
        }
        super.requestLayout();
    }

    public final void s(int i7) {
        getScrollingChildHelper().h(i7);
    }

    @Override // android.view.View
    public final void scrollBy(int i7, int i8) {
        u uVar = this.f9741z;
        if (uVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f9694H) {
            return;
        }
        boolean b7 = uVar.b();
        boolean c3 = this.f9741z.c();
        if (b7 || c3) {
            if (!b7) {
                i7 = 0;
            }
            if (!c3) {
                i8 = 0;
            }
            q(i7, i8, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i7, int i8) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (this.f9700N <= 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f9696J |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(G g3) {
        this.f9732r0 = g3;
        U.h(this, g3);
    }

    public void setAdapter(q qVar) {
        setLayoutFrozen(false);
        t tVar = this.f9707U;
        if (tVar != null) {
            tVar.a();
        }
        u uVar = this.f9741z;
        A a2 = this.f9710a;
        if (uVar != null) {
            uVar.E();
            this.f9741z.F(a2);
        }
        ((ArrayList) a2.f1213c).clear();
        ArrayList arrayList = (ArrayList) a2.f1214d;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            throw k.c(arrayList, size);
        }
        arrayList.clear();
        C0091j c0091j = ((RecyclerView) a2.f1217x).f9728n0;
        c0091j.getClass();
        c0091j.f1291c = 0;
        C1759x1 c1759x1 = this.f9714c;
        c1759x1.b0((ArrayList) c1759x1.f17926c);
        c1759x1.b0((ArrayList) c1759x1.f17927d);
        ((ArrayList) a2.f1213c).clear();
        ArrayList arrayList2 = (ArrayList) a2.f1214d;
        int size2 = arrayList2.size() - 1;
        if (size2 >= 0) {
            arrayList2.get(size2).getClass();
            throw new ClassCastException();
        }
        arrayList2.clear();
        RecyclerView recyclerView = (RecyclerView) a2.f1217x;
        C0091j c0091j2 = recyclerView.f9728n0;
        c0091j2.getClass();
        c0091j2.f1291c = 0;
        if (((z) a2.f1216f) == null) {
            z zVar = new z();
            zVar.f1323a = new SparseArray();
            zVar.f1324b = 0;
            a2.f1216f = zVar;
        }
        z zVar2 = (z) a2.f1216f;
        if (zVar2.f1324b == 0) {
            SparseArray sparseArray = zVar2.f1323a;
            if (sparseArray.size() > 0) {
                ((y) sparseArray.valueAt(0)).getClass();
                throw null;
            }
        }
        this.f9729o0.f1219b = true;
        this.f9699M = this.f9699M;
        this.f9698L = true;
        int h02 = this.f9715d.h0();
        for (int i7 = 0; i7 < h02; i7++) {
            j(this.f9715d.g0(i7));
        }
        m();
        int size3 = arrayList2.size();
        for (int i8 = 0; i8 < size3; i8++) {
            if (arrayList2.get(i8) != null) {
                throw new ClassCastException();
            }
        }
        int size4 = arrayList2.size() - 1;
        if (size4 >= 0) {
            arrayList2.get(size4).getClass();
            throw new ClassCastException();
        }
        arrayList2.clear();
        C0091j c0091j3 = recyclerView.f9728n0;
        c0091j3.getClass();
        c0091j3.f1291c = 0;
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C0.r rVar) {
        if (rVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z4) {
        if (z4 != this.f9719f) {
            this.f9706T = null;
            this.f9704R = null;
            this.f9705S = null;
            this.f9703Q = null;
        }
        this.f9719f = z4;
        super.setClipToPadding(z4);
        if (this.f9692F) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(s sVar) {
        sVar.getClass();
        this.f9702P = sVar;
        this.f9706T = null;
        this.f9704R = null;
        this.f9705S = null;
        this.f9703Q = null;
    }

    public void setHasFixedSize(boolean z4) {
        this.f9691E = z4;
    }

    public void setItemAnimator(t tVar) {
        t tVar2 = this.f9707U;
        if (tVar2 != null) {
            tVar2.a();
            this.f9707U.f1310a = null;
        }
        this.f9707U = tVar;
        if (tVar != null) {
            tVar.f1310a = this.f9731q0;
        }
    }

    public void setItemViewCacheSize(int i7) {
        A a2 = this.f9710a;
        a2.f1211a = i7;
        a2.p();
    }

    public void setLayoutFrozen(boolean z4) {
        if (z4 != this.f9694H) {
            b("Do not setLayoutFrozen in layout or scroll");
            if (!z4) {
                this.f9694H = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f9694H = true;
            this.f9695I = true;
            setScrollState(0);
            E e7 = this.f9726l0;
            e7.f1229x.removeCallbacks(e7);
            e7.f1225c.abortAnimation();
        }
    }

    public void setLayoutManager(u uVar) {
        R4.c cVar;
        if (uVar == this.f9741z) {
            return;
        }
        setScrollState(0);
        E e7 = this.f9726l0;
        e7.f1229x.removeCallbacks(e7);
        e7.f1225c.abortAnimation();
        u uVar2 = this.f9741z;
        A a2 = this.f9710a;
        if (uVar2 != null) {
            t tVar = this.f9707U;
            if (tVar != null) {
                tVar.a();
            }
            this.f9741z.E();
            this.f9741z.F(a2);
            ((ArrayList) a2.f1213c).clear();
            ArrayList arrayList = (ArrayList) a2.f1214d;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                arrayList.get(size).getClass();
                throw new ClassCastException();
            }
            arrayList.clear();
            C0091j c0091j = ((RecyclerView) a2.f1217x).f9728n0;
            c0091j.getClass();
            c0091j.f1291c = 0;
            if (this.f9690D) {
                u uVar3 = this.f9741z;
                uVar3.f1318e = false;
                uVar3.z(this);
            }
            this.f9741z.I(null);
            this.f9741z = null;
        } else {
            ((ArrayList) a2.f1213c).clear();
            ArrayList arrayList2 = (ArrayList) a2.f1214d;
            int size2 = arrayList2.size() - 1;
            if (size2 >= 0) {
                arrayList2.get(size2).getClass();
                throw new ClassCastException();
            }
            arrayList2.clear();
            C0091j c0091j2 = ((RecyclerView) a2.f1217x).f9728n0;
            c0091j2.getClass();
            c0091j2.f1291c = 0;
        }
        android.support.v4.media.session.t tVar2 = this.f9715d;
        ((C0083b) tVar2.f8077c).D();
        ArrayList arrayList3 = (ArrayList) tVar2.f8078d;
        int size3 = arrayList3.size() - 1;
        while (true) {
            cVar = (R4.c) tVar2.f8076b;
            if (size3 < 0) {
                break;
            }
            j((View) arrayList3.get(size3));
            arrayList3.remove(size3);
            size3--;
        }
        RecyclerView recyclerView = (RecyclerView) cVar.f6064b;
        int childCount = recyclerView.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = recyclerView.getChildAt(i7);
            j(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f9741z = uVar;
        if (uVar != null) {
            if (uVar.f1315b != null) {
                throw new IllegalArgumentException("LayoutManager " + uVar + " is already attached to a RecyclerView:" + uVar.f1315b.h());
            }
            uVar.I(this);
            if (this.f9690D) {
                this.f9741z.f1318e = true;
            }
        }
        a2.p();
        requestLayout();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z4) {
        r scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f5105d) {
            WeakHashMap weakHashMap = U.f5037a;
            I.z(scrollingChildHelper.f5104c);
        }
        scrollingChildHelper.f5105d = z4;
    }

    public void setPreserveFocusAfterLayout(boolean z4) {
        this.f9725k0 = z4;
    }

    public void setRecycledViewPool(z zVar) {
        A a2 = this.f9710a;
        if (((z) a2.f1216f) != null) {
            r1.f1324b--;
        }
        a2.f1216f = zVar;
        if (zVar != null) {
            ((RecyclerView) a2.f1217x).getAdapter();
        }
    }

    public void setScrollState(int i7) {
        if (i7 == this.f9708V) {
            return;
        }
        this.f9708V = i7;
        if (i7 != 2) {
            E e7 = this.f9726l0;
            e7.f1229x.removeCallbacks(e7);
            e7.f1225c.abortAnimation();
        }
        u uVar = this.f9741z;
        if (uVar != null) {
            uVar.D(i7);
        }
        ArrayList arrayList = this.f9730p0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((x) this.f9730p0.get(size)).getClass();
            }
        }
    }

    public void setScrollingTouchSlop(int i7) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i7 != 0) {
            if (i7 == 1) {
                this.f9720f0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i7 + "; using default value");
        }
        this.f9720f0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(D d7) {
        this.f9710a.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i7) {
        return getScrollingChildHelper().g(i7, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        float a2;
        int i8;
        TypedArray typedArray;
        int i9;
        Object[] objArr;
        boolean z4;
        Constructor constructor;
        int i10 = 2;
        boolean z7 = true;
        this.f9710a = new A(this);
        this.f9717e = new C1054c();
        this.f9738x = new Rect();
        this.f9740y = new Rect();
        new RectF();
        this.f9687A = new ArrayList();
        this.f9688B = new ArrayList();
        this.f9693G = 0;
        this.f9698L = false;
        this.f9699M = false;
        this.f9700N = 0;
        this.f9701O = 0;
        this.f9702P = new s();
        C0084c c0084c = new C0084c();
        c0084c.f1310a = null;
        c0084c.f1311b = new ArrayList();
        c0084c.f1312c = 250L;
        c0084c.f1313d = 250L;
        c0084c.f1248e = new ArrayList();
        c0084c.f1249f = new ArrayList();
        c0084c.f1250g = new ArrayList();
        c0084c.f1251h = new ArrayList();
        c0084c.f1252i = new ArrayList();
        c0084c.j = new ArrayList();
        c0084c.f1253k = new ArrayList();
        c0084c.f1254l = new ArrayList();
        c0084c.f1255m = new ArrayList();
        c0084c.f1256n = new ArrayList();
        c0084c.f1257o = new ArrayList();
        this.f9707U = c0084c;
        this.f9708V = 0;
        this.f9709W = -1;
        this.f9723i0 = Float.MIN_VALUE;
        this.f9724j0 = Float.MIN_VALUE;
        this.f9725k0 = true;
        this.f9726l0 = new E(this);
        this.f9728n0 = new C0091j();
        C c3 = new C();
        c3.f1218a = 0;
        c3.f1219b = false;
        c3.f1220c = false;
        c3.f1221d = false;
        c3.f1222e = false;
        this.f9729o0 = c3;
        V v6 = new V(3);
        this.f9731q0 = v6;
        this.f9734t0 = new int[2];
        this.f9735u0 = new int[2];
        this.f9736v0 = new int[2];
        this.f9737w0 = new ArrayList();
        this.f9739x0 = new RunnableC0085d(this, 1 == true ? 1 : 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f9686z0, i7, 0);
            this.f9719f = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.f9719f = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f9720f0 = viewConfiguration.getScaledTouchSlop();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            Method method = Y.f5042a;
            a2 = P.V.a(viewConfiguration);
        } else {
            a2 = Y.a(viewConfiguration, context);
        }
        this.f9723i0 = a2;
        this.f9724j0 = i11 >= 26 ? P.V.b(viewConfiguration) : Y.a(viewConfiguration, context);
        this.f9721g0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f9722h0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f9707U.f1310a = v6;
        this.f9714c = new C1759x1(new C1722m0(this));
        this.f9715d = new android.support.v4.media.session.t(new R4.c(this, i10));
        WeakHashMap weakHashMap = U.f5037a;
        if ((i11 >= 26 ? K.c(this) : 0) == 0 && i11 >= 26) {
            K.m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f9697K = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new G(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, B0.a.f967a, i7, 0);
            String string = obtainStyledAttributes2.getString(7);
            if (obtainStyledAttributes2.getInt(1, -1) == -1) {
                setDescendantFocusability(262144);
            }
            if (obtainStyledAttributes2.getBoolean(2, false)) {
                StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes2.getDrawable(5);
                Drawable drawable = obtainStyledAttributes2.getDrawable(6);
                StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes2.getDrawable(3);
                Drawable drawable2 = obtainStyledAttributes2.getDrawable(4);
                if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                    throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + h());
                }
                Resources resources = getContext().getResources();
                i8 = 4;
                typedArray = obtainStyledAttributes2;
                i9 = 0;
                new C0089h(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.dimen.fastscroll_margin));
            } else {
                i8 = 4;
                typedArray = obtainStyledAttributes2;
                i9 = 0;
            }
            typedArray.recycle();
            if (string != null) {
                String trim = string.trim();
                if (!trim.isEmpty()) {
                    if (trim.charAt(i9) == '.') {
                        trim = context.getPackageName() + trim;
                    } else if (!trim.contains(".")) {
                        trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                    }
                    try {
                        Class<? extends U> asSubclass = (isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).loadClass(trim).asSubclass(u.class);
                        try {
                            constructor = asSubclass.getConstructor(f9683A0);
                            objArr = new Object[i8];
                            objArr[i9] = context;
                            objArr[1] = attributeSet;
                            objArr[2] = Integer.valueOf(i7);
                            objArr[3] = Integer.valueOf(i9);
                            z4 = true;
                        } catch (NoSuchMethodException e7) {
                            try {
                                Constructor constructor2 = asSubclass.getConstructor(null);
                                objArr = null;
                                z4 = true;
                                constructor = constructor2;
                            } catch (NoSuchMethodException e8) {
                                e8.initCause(e7);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e8);
                            }
                        }
                        constructor.setAccessible(z4);
                        setLayoutManager((u) constructor.newInstance(objArr));
                    } catch (ClassCastException e9) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e9);
                    } catch (ClassNotFoundException e10) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e10);
                    } catch (IllegalAccessException e11) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e11);
                    } catch (InstantiationException e12) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e12);
                    } catch (InvocationTargetException e13) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e13);
                    }
                }
            }
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f9685y0, i7, i9);
            z7 = obtainStyledAttributes3.getBoolean(i9, true);
            obtainStyledAttributes3.recycle();
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z7);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        u uVar = this.f9741z;
        if (uVar != null) {
            return uVar.n(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    public void setOnFlingListener(w wVar) {
    }

    @Deprecated
    public void setOnScrollListener(x xVar) {
    }

    public void setRecyclerListener(B b7) {
    }
}
