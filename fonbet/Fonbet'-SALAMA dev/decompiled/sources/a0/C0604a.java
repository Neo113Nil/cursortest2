package a0;

import C0.RunnableC0085d;
import C0.p;
import P.U;
import Y4.D;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import com.google.android.gms.internal.ads.zzbbd;
import java.util.Arrays;
import java.util.WeakHashMap;

/* renamed from: a0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0604a {

    /* renamed from: x, reason: collision with root package name */
    public static final p f7927x = new p(1);

    /* renamed from: a, reason: collision with root package name */
    public int f7928a;

    /* renamed from: b, reason: collision with root package name */
    public int f7929b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f7931d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f7932e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f7933f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f7934g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f7935h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f7936i;
    public int[] j;

    /* renamed from: k, reason: collision with root package name */
    public int f7937k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f7938l;

    /* renamed from: m, reason: collision with root package name */
    public final float f7939m;

    /* renamed from: n, reason: collision with root package name */
    public float f7940n;

    /* renamed from: o, reason: collision with root package name */
    public int f7941o;

    /* renamed from: p, reason: collision with root package name */
    public final int f7942p;

    /* renamed from: q, reason: collision with root package name */
    public int f7943q;

    /* renamed from: r, reason: collision with root package name */
    public final OverScroller f7944r;

    /* renamed from: s, reason: collision with root package name */
    public final D f7945s;

    /* renamed from: t, reason: collision with root package name */
    public View f7946t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7947u;

    /* renamed from: v, reason: collision with root package name */
    public final ViewGroup f7948v;

    /* renamed from: c, reason: collision with root package name */
    public int f7930c = -1;

    /* renamed from: w, reason: collision with root package name */
    public final RunnableC0085d f7949w = new RunnableC0085d(this, 28);

    public C0604a(Context context, ViewGroup viewGroup, D d7) {
        this.f7948v = viewGroup;
        this.f7945s = d7;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i7 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f7942p = i7;
        this.f7941o = i7;
        this.f7929b = viewConfiguration.getScaledTouchSlop();
        this.f7939m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f7940n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f7944r = new OverScroller(context, f7927x);
    }

    public static C0604a i(ViewGroup viewGroup, float f7, D d7) {
        C0604a c0604a = new C0604a(viewGroup.getContext(), viewGroup, d7);
        c0604a.f7929b = (int) ((1.0f / f7) * c0604a.f7929b);
        return c0604a;
    }

    public static boolean m(View view, int i7, int i8) {
        return view != null && i7 >= view.getLeft() && i7 < view.getRight() && i8 >= view.getTop() && i8 < view.getBottom();
    }

    public final void a() {
        b();
        if (this.f7928a == 2) {
            OverScroller overScroller = this.f7944r;
            overScroller.getCurrX();
            overScroller.getCurrY();
            overScroller.abortAnimation();
            int currX = overScroller.getCurrX();
            overScroller.getCurrY();
            this.f7945s.J(this.f7946t, currX);
        }
        s(0);
    }

    public final void b() {
        this.f7930c = -1;
        float[] fArr = this.f7931d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f7932e, 0.0f);
            Arrays.fill(this.f7933f, 0.0f);
            Arrays.fill(this.f7934g, 0.0f);
            Arrays.fill(this.f7935h, 0);
            Arrays.fill(this.f7936i, 0);
            Arrays.fill(this.j, 0);
            this.f7937k = 0;
        }
        VelocityTracker velocityTracker = this.f7938l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f7938l = null;
        }
    }

    public final void c(View view, int i7) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f7948v;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f7946t = view;
        this.f7930c = i7;
        this.f7945s.H(view);
        s(1);
    }

    public final boolean d(float f7, float f8, int i7, int i8) {
        float abs = Math.abs(f7);
        float abs2 = Math.abs(f8);
        if ((this.f7935h[i7] & i8) != i8 || (this.f7943q & i8) == 0 || (this.j[i7] & i8) == i8) {
            return false;
        }
        int i9 = this.f7936i[i7];
        if ((i9 & i8) == i8) {
            return false;
        }
        int i10 = this.f7929b;
        float f9 = i10;
        return (abs > f9 || abs2 > f9) && (i9 & i8) == 0 && abs > ((float) i10);
    }

    public final boolean e(View view, float f7) {
        return view != null && this.f7945s.u(view) > 0 && Math.abs(f7) > ((float) this.f7929b);
    }

    public final void f(int i7) {
        float[] fArr = this.f7931d;
        if (fArr != null) {
            int i8 = this.f7937k;
            int i9 = 1 << i7;
            if ((i8 & i9) != 0) {
                fArr[i7] = 0.0f;
                this.f7932e[i7] = 0.0f;
                this.f7933f[i7] = 0.0f;
                this.f7934g[i7] = 0.0f;
                this.f7935h[i7] = 0;
                this.f7936i[i7] = 0;
                this.j[i7] = 0;
                this.f7937k = (~i9) & i8;
            }
        }
    }

    public final int g(int i7, int i8, int i9) {
        if (i7 == 0) {
            return 0;
        }
        float width = this.f7948v.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i7) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i8);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i7) / i9) + 1.0f) * 256.0f), 600);
    }

    public final boolean h() {
        if (this.f7928a == 2) {
            OverScroller overScroller = this.f7944r;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f7946t.getLeft();
            int top = currY - this.f7946t.getTop();
            if (left != 0) {
                View view = this.f7946t;
                WeakHashMap weakHashMap = U.f5037a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f7946t;
                WeakHashMap weakHashMap2 = U.f5037a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f7945s.J(this.f7946t, currX);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f7948v.post(this.f7949w);
            }
        }
        return this.f7928a == 2;
    }

    public final View j(int i7, int i8) {
        ViewGroup viewGroup = this.f7948v;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f7945s.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i7 >= childAt.getLeft() && i7 < childAt.getRight() && i8 >= childAt.getTop() && i8 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean k(int i7, int i8, int i9, int i10) {
        float f7;
        float f8;
        float f9;
        float f10;
        int left = this.f7946t.getLeft();
        int top = this.f7946t.getTop();
        int i11 = i7 - left;
        int i12 = i8 - top;
        OverScroller overScroller = this.f7944r;
        if (i11 == 0 && i12 == 0) {
            overScroller.abortAnimation();
            s(0);
            return false;
        }
        View view = this.f7946t;
        int i13 = (int) this.f7940n;
        int i14 = (int) this.f7939m;
        int abs = Math.abs(i9);
        if (abs < i13) {
            i9 = 0;
        } else if (abs > i14) {
            i9 = i9 > 0 ? i14 : -i14;
        }
        int i15 = (int) this.f7940n;
        int abs2 = Math.abs(i10);
        if (abs2 < i15) {
            i10 = 0;
        } else if (abs2 > i14) {
            i10 = i10 > 0 ? i14 : -i14;
        }
        int abs3 = Math.abs(i11);
        int abs4 = Math.abs(i12);
        int abs5 = Math.abs(i9);
        int abs6 = Math.abs(i10);
        int i16 = abs5 + abs6;
        int i17 = abs3 + abs4;
        if (i9 != 0) {
            f7 = abs5;
            f8 = i16;
        } else {
            f7 = abs3;
            f8 = i17;
        }
        float f11 = f7 / f8;
        if (i10 != 0) {
            f9 = abs6;
            f10 = i16;
        } else {
            f9 = abs4;
            f10 = i17;
        }
        overScroller.startScroll(left, top, i11, i12, (int) ((g(i12, i10, 0) * (f9 / f10)) + (g(i11, i9, this.f7945s.u(view)) * f11)));
        s(2);
        return true;
    }

    public final boolean l(int i7) {
        if ((this.f7937k & (1 << i7)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i7 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void n(MotionEvent motionEvent) {
        int i7;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            b();
        }
        if (this.f7938l == null) {
            this.f7938l = VelocityTracker.obtain();
        }
        this.f7938l.addMovement(motionEvent);
        D d7 = this.f7945s;
        int i8 = 0;
        if (actionMasked == 0) {
            float x4 = motionEvent.getX();
            float y4 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View j = j((int) x4, (int) y4);
            q(x4, y4, pointerId);
            w(j, pointerId);
            if ((this.f7935h[pointerId] & this.f7943q) != 0) {
                d7.G(pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f7928a == 1) {
                o();
            }
            b();
            return;
        }
        if (actionMasked == 2) {
            if (this.f7928a != 1) {
                int pointerCount = motionEvent.getPointerCount();
                while (i8 < pointerCount) {
                    int pointerId2 = motionEvent.getPointerId(i8);
                    if (l(pointerId2)) {
                        float x7 = motionEvent.getX(i8);
                        float y5 = motionEvent.getY(i8);
                        float f7 = x7 - this.f7931d[pointerId2];
                        p(f7, y5 - this.f7932e[pointerId2], pointerId2);
                        if (this.f7928a != 1) {
                            View j3 = j((int) x7, (int) y5);
                            if (e(j3, f7) && w(j3, pointerId2)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i8++;
                }
                r(motionEvent);
                return;
            }
            if (l(this.f7930c)) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f7930c);
                float x8 = motionEvent.getX(findPointerIndex);
                float y7 = motionEvent.getY(findPointerIndex);
                float[] fArr = this.f7933f;
                int i9 = this.f7930c;
                int i10 = (int) (x8 - fArr[i9]);
                int i11 = (int) (y7 - this.f7934g[i9]);
                int left = this.f7946t.getLeft() + i10;
                this.f7946t.getTop();
                int left2 = this.f7946t.getLeft();
                int top = this.f7946t.getTop();
                if (i10 != 0) {
                    left = d7.i(this.f7946t, left);
                    WeakHashMap weakHashMap = U.f5037a;
                    this.f7946t.offsetLeftAndRight(left - left2);
                }
                if (i11 != 0) {
                    int j7 = d7.j(this.f7946t);
                    View view = this.f7946t;
                    int i12 = j7 - top;
                    WeakHashMap weakHashMap2 = U.f5037a;
                    view.offsetTopAndBottom(i12);
                }
                if (i10 != 0 || i11 != 0) {
                    d7.J(this.f7946t, left);
                }
                r(motionEvent);
                return;
            }
            return;
        }
        if (actionMasked == 3) {
            if (this.f7928a == 1) {
                this.f7947u = true;
                d7.K(this.f7946t, 0.0f);
                this.f7947u = false;
                if (this.f7928a == 1) {
                    s(0);
                }
            }
            b();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x9 = motionEvent.getX(actionIndex);
            float y8 = motionEvent.getY(actionIndex);
            q(x9, y8, pointerId3);
            if (this.f7928a == 0) {
                w(j((int) x9, (int) y8), pointerId3);
                if ((this.f7935h[pointerId3] & this.f7943q) != 0) {
                    d7.G(pointerId3);
                    return;
                }
                return;
            }
            if (m(this.f7946t, (int) x9, (int) y8)) {
                w(this.f7946t, pointerId3);
                return;
            }
            return;
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f7928a == 1 && pointerId4 == this.f7930c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i8 >= pointerCount2) {
                    i7 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i8);
                if (pointerId5 != this.f7930c) {
                    View j8 = j((int) motionEvent.getX(i8), (int) motionEvent.getY(i8));
                    View view2 = this.f7946t;
                    if (j8 == view2 && w(view2, pointerId5)) {
                        i7 = this.f7930c;
                        break;
                    }
                }
                i8++;
            }
            if (i7 == -1) {
                o();
            }
        }
        f(pointerId4);
    }

    public final void o() {
        VelocityTracker velocityTracker = this.f7938l;
        float f7 = this.f7939m;
        velocityTracker.computeCurrentVelocity(zzbbd.zzq.zzf, f7);
        float xVelocity = this.f7938l.getXVelocity(this.f7930c);
        float f8 = this.f7940n;
        float abs = Math.abs(xVelocity);
        if (abs < f8) {
            xVelocity = 0.0f;
        } else if (abs > f7) {
            if (xVelocity <= 0.0f) {
                f7 = -f7;
            }
            xVelocity = f7;
        }
        Math.abs(this.f7938l.getYVelocity(this.f7930c));
        this.f7947u = true;
        this.f7945s.K(this.f7946t, xVelocity);
        this.f7947u = false;
        if (this.f7928a == 1) {
            s(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [Y4.D] */
    public final void p(float f7, float f8, int i7) {
        boolean d7 = d(f7, f8, i7, 1);
        boolean z4 = d7;
        if (d(f8, f7, i7, 4)) {
            z4 = (d7 ? 1 : 0) | 4;
        }
        boolean z7 = z4;
        if (d(f7, f8, i7, 2)) {
            z7 = (z4 ? 1 : 0) | 2;
        }
        ?? r02 = z7;
        if (d(f8, f7, i7, 8)) {
            r02 = (z7 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.f7936i;
            iArr[i7] = iArr[i7] | r02;
            this.f7945s.F(r02, i7);
        }
    }

    public final void q(float f7, float f8, int i7) {
        float[] fArr = this.f7931d;
        if (fArr == null || fArr.length <= i7) {
            int i8 = i7 + 1;
            float[] fArr2 = new float[i8];
            float[] fArr3 = new float[i8];
            float[] fArr4 = new float[i8];
            float[] fArr5 = new float[i8];
            int[] iArr = new int[i8];
            int[] iArr2 = new int[i8];
            int[] iArr3 = new int[i8];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f7932e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f7933f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f7934g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f7935h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f7936i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f7931d = fArr2;
            this.f7932e = fArr3;
            this.f7933f = fArr4;
            this.f7934g = fArr5;
            this.f7935h = iArr;
            this.f7936i = iArr2;
            this.j = iArr3;
        }
        float[] fArr9 = this.f7931d;
        this.f7933f[i7] = f7;
        fArr9[i7] = f7;
        float[] fArr10 = this.f7932e;
        this.f7934g[i7] = f8;
        fArr10[i7] = f8;
        int[] iArr7 = this.f7935h;
        int i9 = (int) f7;
        int i10 = (int) f8;
        ViewGroup viewGroup = this.f7948v;
        int i11 = i9 < viewGroup.getLeft() + this.f7941o ? 1 : 0;
        if (i10 < viewGroup.getTop() + this.f7941o) {
            i11 |= 4;
        }
        if (i9 > viewGroup.getRight() - this.f7941o) {
            i11 |= 2;
        }
        if (i10 > viewGroup.getBottom() - this.f7941o) {
            i11 |= 8;
        }
        iArr7[i7] = i11;
        this.f7937k |= 1 << i7;
    }

    public final void r(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i7 = 0; i7 < pointerCount; i7++) {
            int pointerId = motionEvent.getPointerId(i7);
            if (l(pointerId)) {
                float x4 = motionEvent.getX(i7);
                float y4 = motionEvent.getY(i7);
                this.f7933f[pointerId] = x4;
                this.f7934g[pointerId] = y4;
            }
        }
    }

    public final void s(int i7) {
        this.f7948v.removeCallbacks(this.f7949w);
        if (this.f7928a != i7) {
            this.f7928a = i7;
            this.f7945s.I(i7);
            if (this.f7928a == 0) {
                this.f7946t = null;
            }
        }
    }

    public final void t(int i7, int i8) {
        if (!this.f7947u) {
            throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        }
        k(i7, i8, (int) this.f7938l.getXVelocity(this.f7930c), (int) this.f7938l.getYVelocity(this.f7930c));
    }

    public final boolean u(MotionEvent motionEvent) {
        View j;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            b();
        }
        if (this.f7938l == null) {
            this.f7938l = VelocityTracker.obtain();
        }
        this.f7938l.addMovement(motionEvent);
        D d7 = this.f7945s;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x4 = motionEvent.getX(actionIndex);
                            float y4 = motionEvent.getY(actionIndex);
                            q(x4, y4, pointerId);
                            int i7 = this.f7928a;
                            if (i7 == 0) {
                                if ((this.f7935h[pointerId] & this.f7943q) != 0) {
                                    d7.G(pointerId);
                                }
                            } else if (i7 == 2 && (j = j((int) x4, (int) y4)) == this.f7946t) {
                                w(j, pointerId);
                            }
                        } else if (actionMasked == 6) {
                            f(motionEvent.getPointerId(actionIndex));
                        }
                    }
                } else if (this.f7931d != null && this.f7932e != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i8 = 0; i8 < pointerCount; i8++) {
                        int pointerId2 = motionEvent.getPointerId(i8);
                        if (l(pointerId2)) {
                            float x7 = motionEvent.getX(i8);
                            float y5 = motionEvent.getY(i8);
                            float f7 = x7 - this.f7931d[pointerId2];
                            float f8 = y5 - this.f7932e[pointerId2];
                            View j3 = j((int) x7, (int) y5);
                            boolean z4 = j3 != null && e(j3, f7);
                            if (z4) {
                                int left = j3.getLeft();
                                int i9 = d7.i(j3, ((int) f7) + left);
                                j3.getTop();
                                d7.j(j3);
                                int u4 = d7.u(j3);
                                if (u4 == 0) {
                                    break;
                                }
                                if (u4 > 0 && i9 == left) {
                                    break;
                                }
                            }
                            p(f7, f8, pointerId2);
                            if (this.f7928a == 1) {
                                break;
                            }
                            if (z4 && w(j3, pointerId2)) {
                                break;
                            }
                        }
                    }
                    r(motionEvent);
                }
            }
            b();
        } else {
            float x8 = motionEvent.getX();
            float y7 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            q(x8, y7, pointerId3);
            View j7 = j((int) x8, (int) y7);
            if (j7 == this.f7946t && this.f7928a == 2) {
                w(j7, pointerId3);
            }
            if ((this.f7935h[pointerId3] & this.f7943q) != 0) {
                d7.G(pointerId3);
            }
        }
        return this.f7928a == 1;
    }

    public final boolean v(View view, int i7, int i8) {
        this.f7946t = view;
        this.f7930c = -1;
        boolean k7 = k(i7, i8, 0, 0);
        if (!k7 && this.f7928a == 0 && this.f7946t != null) {
            this.f7946t = null;
        }
        return k7;
    }

    public final boolean w(View view, int i7) {
        if (view == this.f7946t && this.f7930c == i7) {
            return true;
        }
        if (view == null || !this.f7945s.d0(view)) {
            return false;
        }
        this.f7930c = i7;
        c(view, i7);
        return true;
    }
}
