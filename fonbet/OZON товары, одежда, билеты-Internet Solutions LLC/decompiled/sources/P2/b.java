package P2;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.Y;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: v, reason: collision with root package name */
    private static final Interpolator f21669v = new a();

    /* renamed from: a, reason: collision with root package name */
    private int f21670a;

    /* renamed from: b, reason: collision with root package name */
    private int f21671b;

    /* renamed from: d, reason: collision with root package name */
    private float[] f21673d;

    /* renamed from: e, reason: collision with root package name */
    private float[] f21674e;

    /* renamed from: f, reason: collision with root package name */
    private float[] f21675f;

    /* renamed from: g, reason: collision with root package name */
    private float[] f21676g;

    /* renamed from: h, reason: collision with root package name */
    private int[] f21677h;

    /* renamed from: i, reason: collision with root package name */
    private int[] f21678i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f21679j;

    /* renamed from: k, reason: collision with root package name */
    private int f21680k;

    /* renamed from: l, reason: collision with root package name */
    private VelocityTracker f21681l;

    /* renamed from: m, reason: collision with root package name */
    private float f21682m;

    /* renamed from: n, reason: collision with root package name */
    private float f21683n;

    /* renamed from: o, reason: collision with root package name */
    private int f21684o;

    /* renamed from: p, reason: collision with root package name */
    private OverScroller f21685p;

    /* renamed from: q, reason: collision with root package name */
    private final c f21686q;

    /* renamed from: r, reason: collision with root package name */
    private View f21687r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f21688s;

    /* renamed from: t, reason: collision with root package name */
    private final CoordinatorLayout f21689t;

    /* renamed from: c, reason: collision with root package name */
    private int f21672c = -1;

    /* renamed from: u, reason: collision with root package name */
    private final Runnable f21690u = new RunnableC0426b();

    final class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f7) {
            float f11 = f7 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* renamed from: P2.b$b, reason: collision with other inner class name */
    final class RunnableC0426b implements Runnable {
        RunnableC0426b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b.this.q(0);
        }
    }

    public static abstract class c {
        public abstract int clampViewPositionHorizontal(@NonNull View view, int i11, int i12);

        public abstract int clampViewPositionVertical(@NonNull View view, int i11, int i12);

        public int getOrderedChildIndex(int i11) {
            return i11;
        }

        public int getViewHorizontalDragRange(@NonNull View view) {
            return 0;
        }

        public int getViewVerticalDragRange(@NonNull View view) {
            return 0;
        }

        public void onViewCaptured(@NonNull View view, int i11) {
        }

        public abstract void onViewDragStateChanged(int i11);

        public abstract void onViewPositionChanged(@NonNull View view, int i11, int i12, int i13, int i14);

        public abstract void onViewReleased(@NonNull View view, float f7, float f11);

        public abstract boolean tryCaptureView(@NonNull View view, int i11);
    }

    private b(@NonNull Context context, @NonNull CoordinatorLayout coordinatorLayout, @NonNull c cVar) {
        if (coordinatorLayout == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f21689t = coordinatorLayout;
        this.f21686q = cVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f21684o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f21671b = viewConfiguration.getScaledTouchSlop();
        this.f21682m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f21683n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f21685p = new OverScroller(context, f21669v);
    }

    private boolean c(View view, float f7, float f11) {
        if (view == null) {
            return false;
        }
        c cVar = this.f21686q;
        boolean z11 = cVar.getViewHorizontalDragRange(view) > 0;
        boolean z12 = cVar.getViewVerticalDragRange(view) > 0;
        if (!z11 || !z12) {
            return z11 ? Math.abs(f7) > ((float) this.f21671b) : z12 && Math.abs(f11) > ((float) this.f21671b);
        }
        float f12 = (f11 * f11) + (f7 * f7);
        int i11 = this.f21671b;
        return f12 > ((float) (i11 * i11));
    }

    private void d(int i11) {
        float[] fArr = this.f21673d;
        if (fArr != null) {
            int i12 = this.f21680k;
            int i13 = 1 << i11;
            if ((i12 & i13) != 0) {
                fArr[i11] = 0.0f;
                this.f21674e[i11] = 0.0f;
                this.f21675f[i11] = 0.0f;
                this.f21676g[i11] = 0.0f;
                this.f21677h[i11] = 0;
                this.f21678i[i11] = 0;
                this.f21679j[i11] = 0;
                this.f21680k = (~i13) & i12;
            }
        }
    }

    private int e(int i11, int i12, int i13) {
        if (i11 == 0) {
            return 0;
        }
        float width = this.f21689t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i11) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i12);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i11) / i13) + 1.0f) * 256.0f), 600);
    }

    public static b g(@NonNull CoordinatorLayout coordinatorLayout, @NonNull c cVar) {
        return new b(coordinatorLayout.getContext(), coordinatorLayout, cVar);
    }

    public static b h(@NonNull CoordinatorLayout coordinatorLayout, @NonNull c cVar) {
        b g10 = g(coordinatorLayout, cVar);
        g10.f21671b = (int) (3.3333333f * g10.f21671b);
        return g10;
    }

    private boolean j(int i11, int i12, int i13, int i14) {
        float f7;
        float f11;
        float f12;
        float f13;
        int left = this.f21687r.getLeft();
        int top = this.f21687r.getTop();
        int i15 = i11 - left;
        int i16 = i12 - top;
        OverScroller overScroller = this.f21685p;
        if (i15 == 0 && i16 == 0) {
            overScroller.abortAnimation();
            q(0);
            return false;
        }
        View view = this.f21687r;
        int i17 = (int) this.f21683n;
        int i18 = (int) this.f21682m;
        int abs = Math.abs(i13);
        if (abs < i17) {
            i13 = 0;
        } else if (abs > i18) {
            i13 = i13 > 0 ? i18 : -i18;
        }
        int abs2 = Math.abs(i14);
        if (abs2 < i17) {
            i14 = 0;
        } else if (abs2 > i18) {
            i14 = i14 > 0 ? i18 : -i18;
        }
        int abs3 = Math.abs(i15);
        int abs4 = Math.abs(i16);
        int abs5 = Math.abs(i13);
        int abs6 = Math.abs(i14);
        int i19 = abs5 + abs6;
        int i21 = abs3 + abs4;
        if (i13 != 0) {
            f7 = abs5;
            f11 = i19;
        } else {
            f7 = abs3;
            f11 = i21;
        }
        float f14 = f7 / f11;
        if (i14 != 0) {
            f12 = abs6;
            f13 = i19;
        } else {
            f12 = abs4;
            f13 = i21;
        }
        float f15 = f12 / f13;
        c cVar = this.f21686q;
        overScroller.startScroll(left, top, i15, i16, (int) ((e(i16, i14, cVar.getViewVerticalDragRange(view)) * f15) + (e(i15, i13, cVar.getViewHorizontalDragRange(view)) * f14)));
        q(2);
        return true;
    }

    private boolean l(int i11) {
        if ((this.f21680k & (1 << i11)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i11 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    private void n() {
        VelocityTracker velocityTracker = this.f21681l;
        float f7 = this.f21682m;
        velocityTracker.computeCurrentVelocity(1000, f7);
        float xVelocity = this.f21681l.getXVelocity(this.f21672c);
        float f11 = this.f21683n;
        float abs = Math.abs(xVelocity);
        if (abs < f11) {
            xVelocity = 0.0f;
        } else if (abs > f7) {
            xVelocity = xVelocity > 0.0f ? f7 : -f7;
        }
        float yVelocity = this.f21681l.getYVelocity(this.f21672c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f11) {
            f7 = 0.0f;
        } else if (abs2 <= f7) {
            f7 = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f7 = -f7;
        }
        this.f21688s = true;
        this.f21686q.onViewReleased(this.f21687r, xVelocity, f7);
        this.f21688s = false;
        if (this.f21670a == 1) {
            q(0);
        }
    }

    private void o(float f7, int i11, float f11) {
        float[] fArr = this.f21673d;
        if (fArr == null || fArr.length <= i11) {
            int i12 = i11 + 1;
            float[] fArr2 = new float[i12];
            float[] fArr3 = new float[i12];
            float[] fArr4 = new float[i12];
            float[] fArr5 = new float[i12];
            int[] iArr = new int[i12];
            int[] iArr2 = new int[i12];
            int[] iArr3 = new int[i12];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f21674e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f21675f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f21676g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f21677h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f21678i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f21679j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f21673d = fArr2;
            this.f21674e = fArr3;
            this.f21675f = fArr4;
            this.f21676g = fArr5;
            this.f21677h = iArr;
            this.f21678i = iArr2;
            this.f21679j = iArr3;
        }
        float[] fArr9 = this.f21673d;
        this.f21675f[i11] = f7;
        fArr9[i11] = f7;
        float[] fArr10 = this.f21674e;
        this.f21676g[i11] = f11;
        fArr10[i11] = f11;
        int[] iArr7 = this.f21677h;
        int i13 = (int) f7;
        int i14 = (int) f11;
        CoordinatorLayout coordinatorLayout = this.f21689t;
        int left = coordinatorLayout.getLeft();
        int i15 = this.f21684o;
        int i16 = i13 < left + i15 ? 1 : 0;
        if (i14 < coordinatorLayout.getTop() + i15) {
            i16 |= 4;
        }
        if (i13 > coordinatorLayout.getRight() - i15) {
            i16 |= 2;
        }
        if (i14 > coordinatorLayout.getBottom() - i15) {
            i16 |= 8;
        }
        iArr7[i11] = i16;
        this.f21680k |= 1 << i11;
    }

    private void p(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i11 = 0; i11 < pointerCount; i11++) {
            int pointerId = motionEvent.getPointerId(i11);
            if (l(pointerId)) {
                float x11 = motionEvent.getX(i11);
                float y11 = motionEvent.getY(i11);
                this.f21675f[pointerId] = x11;
                this.f21676g[pointerId] = y11;
            }
        }
    }

    public final void a() {
        this.f21672c = -1;
        float[] fArr = this.f21673d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f21674e, 0.0f);
            Arrays.fill(this.f21675f, 0.0f);
            Arrays.fill(this.f21676g, 0.0f);
            Arrays.fill(this.f21677h, 0);
            Arrays.fill(this.f21678i, 0);
            Arrays.fill(this.f21679j, 0);
            this.f21680k = 0;
        }
        VelocityTracker velocityTracker = this.f21681l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f21681l = null;
        }
    }

    public final void b(int i11, @NonNull View view) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f21689t;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.f21687r = view;
        this.f21672c = i11;
        this.f21686q.onViewCaptured(view, i11);
        q(1);
    }

    public final boolean f() {
        if (this.f21670a == 2) {
            OverScroller overScroller = this.f21685p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f21687r.getLeft();
            int top = currY - this.f21687r.getTop();
            if (left != 0) {
                View view = this.f21687r;
                int i11 = Y.f42258g;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f21687r;
                int i12 = Y.f42258g;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f21686q.onViewPositionChanged(this.f21687r, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f21689t.post(this.f21690u);
            }
        }
        return this.f21670a == 2;
    }

    public final View i(int i11, int i12) {
        CoordinatorLayout coordinatorLayout = this.f21689t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = coordinatorLayout.getChildAt(this.f21686q.getOrderedChildIndex(childCount));
            if (i11 >= childAt.getLeft() && i11 < childAt.getRight() && i12 >= childAt.getTop() && i12 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final int k() {
        return this.f21671b;
    }

    public final void m(@NonNull MotionEvent motionEvent) {
        int i11;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f21681l == null) {
            this.f21681l = VelocityTracker.obtain();
        }
        this.f21681l.addMovement(motionEvent);
        int i12 = 0;
        if (actionMasked == 0) {
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View i13 = i((int) x11, (int) y11);
            o(x11, pointerId, y11);
            u(pointerId, i13);
            int i14 = this.f21677h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f21670a == 1) {
                n();
            }
            a();
            return;
        }
        c cVar = this.f21686q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f21670a == 1) {
                    this.f21688s = true;
                    cVar.onViewReleased(this.f21687r, 0.0f, 0.0f);
                    this.f21688s = false;
                    if (this.f21670a == 1) {
                        q(0);
                    }
                }
                a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x12 = motionEvent.getX(actionIndex);
                float y12 = motionEvent.getY(actionIndex);
                o(x12, pointerId2, y12);
                if (this.f21670a == 0) {
                    u(pointerId2, i((int) x12, (int) y12));
                    int i15 = this.f21677h[pointerId2];
                    return;
                }
                int i16 = (int) x12;
                int i17 = (int) y12;
                View view = this.f21687r;
                if (view != null && i16 >= view.getLeft() && i16 < view.getRight() && i17 >= view.getTop() && i17 < view.getBottom()) {
                    u(pointerId2, this.f21687r);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f21670a == 1 && pointerId3 == this.f21672c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i12 >= pointerCount) {
                        i11 = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i12);
                    if (pointerId4 != this.f21672c) {
                        View i18 = i((int) motionEvent.getX(i12), (int) motionEvent.getY(i12));
                        View view2 = this.f21687r;
                        if (i18 == view2 && u(pointerId4, view2)) {
                            i11 = this.f21672c;
                            break;
                        }
                    }
                    i12++;
                }
                if (i11 == -1) {
                    n();
                }
            }
            d(pointerId3);
            return;
        }
        if (this.f21670a == 1) {
            if (l(this.f21672c)) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f21672c);
                float x13 = motionEvent.getX(findPointerIndex);
                float y13 = motionEvent.getY(findPointerIndex);
                float[] fArr = this.f21675f;
                int i19 = this.f21672c;
                int i21 = (int) (x13 - fArr[i19]);
                int i22 = (int) (y13 - this.f21676g[i19]);
                int left = this.f21687r.getLeft() + i21;
                int top = this.f21687r.getTop() + i22;
                int left2 = this.f21687r.getLeft();
                int top2 = this.f21687r.getTop();
                if (i21 != 0) {
                    left = cVar.clampViewPositionHorizontal(this.f21687r, left, i21);
                    int i23 = Y.f42258g;
                    this.f21687r.offsetLeftAndRight(left - left2);
                }
                int i24 = left;
                if (i22 != 0) {
                    top = cVar.clampViewPositionVertical(this.f21687r, top, i22);
                    int i25 = Y.f42258g;
                    this.f21687r.offsetTopAndBottom(top - top2);
                }
                int i26 = top;
                if (i21 != 0 || i22 != 0) {
                    this.f21686q.onViewPositionChanged(this.f21687r, i24, i26, i24 - left2, i26 - top2);
                }
                p(motionEvent);
                return;
            }
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        while (i12 < pointerCount2) {
            int pointerId5 = motionEvent.getPointerId(i12);
            if (l(pointerId5)) {
                float x14 = motionEvent.getX(i12);
                float y14 = motionEvent.getY(i12);
                float f7 = x14 - this.f21673d[pointerId5];
                float f11 = y14 - this.f21674e[pointerId5];
                Math.abs(f7);
                Math.abs(f11);
                int i27 = this.f21677h[pointerId5];
                Math.abs(f11);
                Math.abs(f7);
                int i28 = this.f21677h[pointerId5];
                Math.abs(f7);
                Math.abs(f11);
                int i29 = this.f21677h[pointerId5];
                Math.abs(f11);
                Math.abs(f7);
                int i31 = this.f21677h[pointerId5];
                if (this.f21670a != 1) {
                    View i32 = i((int) x14, (int) y14);
                    if (c(i32, f7, f11) && u(pointerId5, i32)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i12++;
        }
        p(motionEvent);
    }

    final void q(int i11) {
        this.f21689t.removeCallbacks(this.f21690u);
        if (this.f21670a != i11) {
            this.f21670a = i11;
            this.f21686q.onViewDragStateChanged(i11);
            if (this.f21670a == 0) {
                this.f21687r = null;
            }
        }
    }

    public final boolean r(int i11, int i12) {
        if (this.f21688s) {
            return j(i11, i12, (int) this.f21681l.getXVelocity(this.f21672c), (int) this.f21681l.getYVelocity(this.f21672c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ce, code lost:
    
        if (r12 != r11) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(@NonNull MotionEvent motionEvent) {
        View i11;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f21681l == null) {
            this.f21681l = VelocityTracker.obtain();
        }
        this.f21681l.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x11 = motionEvent.getX(actionIndex);
                            float y11 = motionEvent.getY(actionIndex);
                            o(x11, pointerId, y11);
                            int i12 = this.f21670a;
                            if (i12 == 0) {
                                int i13 = this.f21677h[pointerId];
                            } else if (i12 == 2 && (i11 = i((int) x11, (int) y11)) == this.f21687r) {
                                u(pointerId, i11);
                            }
                        } else if (actionMasked == 6) {
                            d(motionEvent.getPointerId(actionIndex));
                        }
                    }
                } else if (this.f21673d != null && this.f21674e != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i14 = 0; i14 < pointerCount; i14++) {
                        int pointerId2 = motionEvent.getPointerId(i14);
                        if (l(pointerId2)) {
                            float x12 = motionEvent.getX(i14);
                            float y12 = motionEvent.getY(i14);
                            float f7 = x12 - this.f21673d[pointerId2];
                            float f11 = y12 - this.f21674e[pointerId2];
                            View i15 = i((int) x12, (int) y12);
                            boolean z11 = i15 != null && c(i15, f7, f11);
                            if (z11) {
                                int left = i15.getLeft();
                                int i16 = (int) f7;
                                c cVar = this.f21686q;
                                int clampViewPositionHorizontal = cVar.clampViewPositionHorizontal(i15, left + i16, i16);
                                int top = i15.getTop();
                                int i17 = (int) f11;
                                int clampViewPositionVertical = cVar.clampViewPositionVertical(i15, top + i17, i17);
                                int viewHorizontalDragRange = cVar.getViewHorizontalDragRange(i15);
                                int viewVerticalDragRange = cVar.getViewVerticalDragRange(i15);
                                if (viewHorizontalDragRange != 0) {
                                    if (viewHorizontalDragRange > 0) {
                                    }
                                }
                                if (viewVerticalDragRange == 0) {
                                    break;
                                }
                                if (viewVerticalDragRange > 0 && clampViewPositionVertical == top) {
                                    break;
                                }
                            }
                            Math.abs(f7);
                            Math.abs(f11);
                            int i18 = this.f21677h[pointerId2];
                            Math.abs(f11);
                            Math.abs(f7);
                            int i19 = this.f21677h[pointerId2];
                            Math.abs(f7);
                            Math.abs(f11);
                            int i21 = this.f21677h[pointerId2];
                            Math.abs(f11);
                            Math.abs(f7);
                            int i22 = this.f21677h[pointerId2];
                            if (this.f21670a == 1) {
                                break;
                            }
                            if (z11 && u(pointerId2, i15)) {
                                break;
                            }
                        }
                    }
                    p(motionEvent);
                }
            }
            a();
        } else {
            float x13 = motionEvent.getX();
            float y13 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            o(x13, pointerId3, y13);
            View i23 = i((int) x13, (int) y13);
            if (i23 == this.f21687r && this.f21670a == 2) {
                u(pointerId3, i23);
            }
            int i24 = this.f21677h[pointerId3];
        }
        return this.f21670a == 1;
    }

    public final boolean t(@NonNull View view, int i11, int i12) {
        this.f21687r = view;
        this.f21672c = -1;
        boolean j11 = j(i11, i12, 0, 0);
        if (!j11 && this.f21670a == 0 && this.f21687r != null) {
            this.f21687r = null;
        }
        return j11;
    }

    final boolean u(int i11, View view) {
        if (view == this.f21687r && this.f21672c == i11) {
            return true;
        }
        if (view == null || !this.f21686q.tryCaptureView(view, i11)) {
            return false;
        }
        this.f21672c = i11;
        b(i11, view);
        return true;
    }
}
