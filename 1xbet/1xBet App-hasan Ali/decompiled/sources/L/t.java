package L;

import A0.RunnableC0049o;
import android.R;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import h0.C1988b;
import h0.C1991e;
import i0.F;
import i4.InterfaceC2015a;
import k4.AbstractC2036a;

/* loaded from: classes.dex */
public final class t extends View {

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f2971p = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f2972q = new int[0];

    /* renamed from: k, reason: collision with root package name */
    public E f2973k;

    /* renamed from: l, reason: collision with root package name */
    public Boolean f2974l;

    /* renamed from: m, reason: collision with root package name */
    public Long f2975m;

    /* renamed from: n, reason: collision with root package name */
    public RunnableC0049o f2976n;

    /* renamed from: o, reason: collision with root package name */
    public kotlin.jvm.internal.m f2977o;

    private final void setRippleState(boolean z3) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f2976n;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l5 = this.f2975m;
        long longValue = currentAnimationTimeMillis - (l5 != null ? l5.longValue() : 0L);
        if (z3 || longValue >= 5) {
            int[] iArr = z3 ? f2971p : f2972q;
            E e3 = this.f2973k;
            if (e3 != null) {
                e3.setState(iArr);
            }
        } else {
            RunnableC0049o runnableC0049o = new RunnableC0049o(3, this);
            this.f2976n = runnableC0049o;
            postDelayed(runnableC0049o, 50L);
        }
        this.f2975m = Long.valueOf(currentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(t tVar) {
        E e3 = tVar.f2973k;
        if (e3 != null) {
            e3.setState(f2972q);
        }
        tVar.f2976n = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(y.l lVar, boolean z3, long j5, int i, long j6, float f, InterfaceC2015a interfaceC2015a) {
        if (this.f2973k == null || !Boolean.valueOf(z3).equals(this.f2974l)) {
            E e3 = new E(z3);
            setBackground(e3);
            this.f2973k = e3;
            this.f2974l = Boolean.valueOf(z3);
        }
        E e5 = this.f2973k;
        kotlin.jvm.internal.l.c(e5);
        this.f2977o = (kotlin.jvm.internal.m) interfaceC2015a;
        Integer num = e5.f2907m;
        if (num == null || num.intValue() != i) {
            e5.f2907m = Integer.valueOf(i);
            D.f2904a.a(e5, i);
        }
        e(f, j5, j6);
        if (z3) {
            e5.setHotspot(C1988b.d(lVar.f21125a), C1988b.e(lVar.f21125a));
        } else {
            e5.setHotspot(e5.getBounds().centerX(), e5.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.f2977o = null;
        RunnableC0049o runnableC0049o = this.f2976n;
        if (runnableC0049o != null) {
            removeCallbacks(runnableC0049o);
            RunnableC0049o runnableC0049o2 = this.f2976n;
            kotlin.jvm.internal.l.c(runnableC0049o2);
            runnableC0049o2.run();
        } else {
            E e3 = this.f2973k;
            if (e3 != null) {
                e3.setState(f2972q);
            }
        }
        E e5 = this.f2973k;
        if (e5 == null) {
            return;
        }
        e5.setVisible(false, false);
        unscheduleDrawable(e5);
    }

    public final void d() {
        setRippleState(false);
    }

    public final void e(float f, long j5, long j6) {
        E e3 = this.f2973k;
        if (e3 == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            f *= 2;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        long b3 = i0.p.b(f, j6);
        i0.p pVar = e3.f2906l;
        if (!(pVar == null ? false : i0.p.c(pVar.f17295a, b3))) {
            e3.f2906l = new i0.p(b3);
            e3.setColor(ColorStateList.valueOf(F.u(b3)));
        }
        Rect rect = new Rect(0, 0, AbstractC2036a.U(C1991e.d(j5)), AbstractC2036a.U(C1991e.b(j5)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        e3.setBounds(rect);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [i4.a, kotlin.jvm.internal.m] */
    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        ?? r1 = this.f2977o;
        if (r1 != 0) {
            r1.invoke();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i5) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z3, int i, int i5, int i6, int i7) {
    }
}
