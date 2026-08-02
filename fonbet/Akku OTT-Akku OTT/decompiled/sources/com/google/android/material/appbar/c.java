package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;

/* loaded from: classes4.dex */
public abstract class c<V extends View> extends e<V> {

    @Nullable
    public a c;
    public OverScroller d;
    public boolean e;
    public int f;
    public int g;
    public int h;

    @Nullable
    public VelocityTracker i;

    public class a implements Runnable {
        public final CoordinatorLayout a;
        public final V b;

        public a(CoordinatorLayout coordinatorLayout, V v) {
            this.a = coordinatorLayout;
            this.b = v;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c cVar;
            OverScroller overScroller;
            V v = this.b;
            if (v == null || (overScroller = (cVar = c.this).d) == null) {
                return;
            }
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            CoordinatorLayout coordinatorLayout = this.a;
            if (!computeScrollOffset) {
                cVar.g(coordinatorLayout, v);
            } else {
                cVar.i(coordinatorLayout, v, cVar.d.getCurrY());
                ViewCompat.postOnAnimation(v, this);
            }
        }
    }

    public c() {
        this.f = -1;
        this.h = -1;
    }

    public boolean d(V v) {
        return false;
    }

    public int e(@NonNull V v) {
        return -v.getHeight();
    }

    public int f(@NonNull V v) {
        return v.getHeight();
    }

    public void g(CoordinatorLayout coordinatorLayout, V v) {
    }

    public int h(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int clamp;
        int a2 = a();
        if (i2 == 0 || a2 < i2 || a2 > i3 || a2 == (clamp = MathUtils.clamp(i, i2, i3))) {
            return 0;
        }
        f fVar = this.a;
        if (fVar == null) {
            this.b = clamp;
        } else if (fVar.d != clamp) {
            fVar.d = clamp;
            fVar.a();
        }
        return a2 - clamp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(CoordinatorLayout coordinatorLayout, View view, int i) {
        h(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.h < 0) {
            this.h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.e) {
            int i = this.f;
            if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y = (int) motionEvent.getY(findPointerIndex);
                if (Math.abs(y - this.g) > this.h) {
                    this.g = y;
                    return true;
                }
            }
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = d(v) && coordinatorLayout.isPointInChildBounds(v, x, y2);
            this.e = z;
            if (z) {
                this.g = y2;
                this.f = motionEvent.getPointerId(0);
                if (this.i == null) {
                    this.i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c8  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        boolean z;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f);
                if (findPointerIndex != -1) {
                    int y = (int) motionEvent.getY(findPointerIndex);
                    int i = this.g - y;
                    this.g = y;
                    h(coordinatorLayout, v, b() - i, e(v), 0);
                }
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i2 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.f = motionEvent.getPointerId(i2);
                    this.g = (int) (motionEvent.getY(i2) + 0.5f);
                }
            }
            z = false;
            velocityTracker2 = this.i;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !this.e || z;
        }
        VelocityTracker velocityTracker3 = this.i;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.i.computeCurrentVelocity(1000);
            float yVelocity = this.i.getYVelocity(this.f);
            int i3 = -f(v);
            a aVar = this.c;
            if (aVar != null) {
                v.removeCallbacks(aVar);
                this.c = null;
            }
            if (this.d == null) {
                this.d = new OverScroller(v.getContext());
            }
            this.d.fling(0, a(), 0, Math.round(yVelocity), 0, 0, i3, 0);
            if (this.d.computeScrollOffset()) {
                a aVar2 = new a(coordinatorLayout, v);
                this.c = aVar2;
                ViewCompat.postOnAnimation(v, aVar2);
            } else {
                g(coordinatorLayout, v);
            }
            z = true;
            this.e = false;
            this.f = -1;
            velocityTracker = this.i;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.i = null;
            }
            velocityTracker2 = this.i;
            if (velocityTracker2 != null) {
            }
            if (this.e) {
            }
        }
        z = false;
        this.e = false;
        this.f = -1;
        velocityTracker = this.i;
        if (velocityTracker != null) {
        }
        velocityTracker2 = this.i;
        if (velocityTracker2 != null) {
        }
        if (this.e) {
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = -1;
        this.h = -1;
    }
}
