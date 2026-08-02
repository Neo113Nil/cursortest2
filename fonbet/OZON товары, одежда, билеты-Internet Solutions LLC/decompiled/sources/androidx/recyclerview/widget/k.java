package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.core.view.Y;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.ConnectionResult;
import ru.ozon.fintech.ui.input.CounterView;

/* loaded from: classes8.dex */
final class k extends RecyclerView.n implements RecyclerView.s {

    /* renamed from: C, reason: collision with root package name */
    private static final int[] f44940C = {R.attr.state_pressed};

    /* renamed from: D, reason: collision with root package name */
    private static final int[] f44941D = new int[0];

    /* renamed from: A, reason: collision with root package name */
    int f44942A;

    /* renamed from: B, reason: collision with root package name */
    private final Runnable f44943B;

    /* renamed from: a, reason: collision with root package name */
    private final int f44944a;

    /* renamed from: b, reason: collision with root package name */
    private final int f44945b;

    /* renamed from: c, reason: collision with root package name */
    final StateListDrawable f44946c;

    /* renamed from: d, reason: collision with root package name */
    final Drawable f44947d;

    /* renamed from: e, reason: collision with root package name */
    private final int f44948e;

    /* renamed from: f, reason: collision with root package name */
    private final int f44949f;

    /* renamed from: g, reason: collision with root package name */
    private final StateListDrawable f44950g;

    /* renamed from: h, reason: collision with root package name */
    private final Drawable f44951h;

    /* renamed from: i, reason: collision with root package name */
    private final int f44952i;

    /* renamed from: j, reason: collision with root package name */
    private final int f44953j;

    /* renamed from: k, reason: collision with root package name */
    int f44954k;

    /* renamed from: l, reason: collision with root package name */
    int f44955l;

    /* renamed from: m, reason: collision with root package name */
    float f44956m;

    /* renamed from: n, reason: collision with root package name */
    int f44957n;

    /* renamed from: o, reason: collision with root package name */
    int f44958o;

    /* renamed from: p, reason: collision with root package name */
    float f44959p;

    /* renamed from: s, reason: collision with root package name */
    private RecyclerView f44962s;

    /* renamed from: z, reason: collision with root package name */
    final ValueAnimator f44969z;

    /* renamed from: q, reason: collision with root package name */
    private int f44960q = 0;

    /* renamed from: r, reason: collision with root package name */
    private int f44961r = 0;

    /* renamed from: t, reason: collision with root package name */
    private boolean f44963t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f44964u = false;

    /* renamed from: v, reason: collision with root package name */
    private int f44965v = 0;

    /* renamed from: w, reason: collision with root package name */
    private int f44966w = 0;

    /* renamed from: x, reason: collision with root package name */
    private final int[] f44967x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    private final int[] f44968y = new int[2];

    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            k kVar = k.this;
            int i11 = kVar.f44942A;
            ValueAnimator valueAnimator = kVar.f44969z;
            if (i11 == 1) {
                valueAnimator.cancel();
            } else if (i11 != 2) {
                return;
            }
            kVar.f44942A = 3;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            valueAnimator.setDuration(CounterView.COUNTER_MAX_DEFAULT);
            valueAnimator.start();
        }
    }

    final class b extends RecyclerView.t {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i11, int i12) {
            k.this.g(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    private class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f44972a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f44972a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f44972a) {
                this.f44972a = false;
                return;
            }
            k kVar = k.this;
            if (((Float) kVar.f44969z.getAnimatedValue()).floatValue() == 0.0f) {
                kVar.f44942A = 0;
                kVar.e(0);
            } else {
                kVar.f44942A = 2;
                kVar.c();
            }
        }
    }

    private class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            k kVar = k.this;
            kVar.f44946c.setAlpha(floatValue);
            kVar.f44947d.setAlpha(floatValue);
            kVar.c();
        }
    }

    k(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i11, int i12, int i13) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f44969z = ofFloat;
        this.f44942A = 0;
        a aVar = new a();
        this.f44943B = aVar;
        b bVar = new b();
        this.f44946c = stateListDrawable;
        this.f44947d = drawable;
        this.f44950g = stateListDrawable2;
        this.f44951h = drawable2;
        this.f44948e = Math.max(i11, stateListDrawable.getIntrinsicWidth());
        this.f44949f = Math.max(i11, drawable.getIntrinsicWidth());
        this.f44952i = Math.max(i11, stateListDrawable2.getIntrinsicWidth());
        this.f44953j = Math.max(i11, drawable2.getIntrinsicWidth());
        this.f44944a = i12;
        this.f44945b = i13;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.f44962s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.f44962s.removeOnItemTouchListener(this);
            this.f44962s.removeOnScrollListener(bVar);
            this.f44962s.removeCallbacks(aVar);
        }
        this.f44962s = recyclerView;
        recyclerView.addItemDecoration(this);
        this.f44962s.addOnItemTouchListener(this);
        this.f44962s.addOnScrollListener(bVar);
    }

    private static int d(float f7, float f11, int[] iArr, int i11, int i12, int i13) {
        int i14 = iArr[1] - iArr[0];
        if (i14 != 0) {
            int i15 = i11 - i13;
            int i16 = (int) (((f11 - f7) / i14) * i15);
            int i17 = i12 + i16;
            if (i17 < i15 && i17 >= 0) {
                return i16;
            }
        }
        return 0;
    }

    final boolean a(float f7, float f11) {
        if (f11 < this.f44961r - this.f44952i) {
            return false;
        }
        int i11 = this.f44958o;
        int i12 = this.f44957n;
        return f7 >= ((float) (i11 - (i12 / 2))) && f7 <= ((float) ((i12 / 2) + i11));
    }

    final boolean b(float f7, float f11) {
        RecyclerView recyclerView = this.f44962s;
        int i11 = Y.f42258g;
        boolean z11 = recyclerView.getLayoutDirection() == 1;
        int i12 = this.f44948e;
        if (!z11 ? f7 >= this.f44960q - i12 : f7 <= i12 / 2) {
            int i13 = this.f44955l;
            int i14 = this.f44954k / 2;
            if (f11 >= i13 - i14 && f11 <= i14 + i13) {
                return true;
            }
        }
        return false;
    }

    final void c() {
        this.f44962s.invalidate();
    }

    final void e(int i11) {
        Runnable runnable = this.f44943B;
        StateListDrawable stateListDrawable = this.f44946c;
        if (i11 == 2 && this.f44965v != 2) {
            stateListDrawable.setState(f44940C);
            this.f44962s.removeCallbacks(runnable);
        }
        if (i11 == 0) {
            c();
        } else {
            f();
        }
        if (this.f44965v == 2 && i11 != 2) {
            stateListDrawable.setState(f44941D);
            this.f44962s.removeCallbacks(runnable);
            this.f44962s.postDelayed(runnable, ru.ozon.composer.compose.widget.scrollable.m.f94768d);
        } else if (i11 == 1) {
            this.f44962s.removeCallbacks(runnable);
            this.f44962s.postDelayed(runnable, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.f44965v = i11;
    }

    public final void f() {
        int i11 = this.f44942A;
        ValueAnimator valueAnimator = this.f44969z;
        if (i11 != 0) {
            if (i11 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f44942A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    final void g(int i11, int i12) {
        int computeVerticalScrollRange = this.f44962s.computeVerticalScrollRange();
        int i13 = this.f44961r;
        int i14 = computeVerticalScrollRange - i13;
        int i15 = this.f44944a;
        this.f44963t = i14 > 0 && i13 >= i15;
        int computeHorizontalScrollRange = this.f44962s.computeHorizontalScrollRange();
        int i16 = this.f44960q;
        boolean z11 = computeHorizontalScrollRange - i16 > 0 && i16 >= i15;
        this.f44964u = z11;
        boolean z12 = this.f44963t;
        if (!z12 && !z11) {
            if (this.f44965v != 0) {
                e(0);
                return;
            }
            return;
        }
        if (z12) {
            float f7 = i13;
            this.f44955l = (int) ((((f7 / 2.0f) + i12) * f7) / computeVerticalScrollRange);
            this.f44954k = Math.min(i13, (i13 * i13) / computeVerticalScrollRange);
        }
        if (this.f44964u) {
            float f11 = i16;
            this.f44958o = (int) ((((f11 / 2.0f) + i11) * f11) / computeHorizontalScrollRange);
            this.f44957n = Math.min(i16, (i16 * i16) / computeHorizontalScrollRange);
        }
        int i17 = this.f44965v;
        if (i17 == 0 || i17 == 1) {
            e(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.A a11) {
        if (this.f44960q != this.f44962s.getWidth() || this.f44961r != this.f44962s.getHeight()) {
            this.f44960q = this.f44962s.getWidth();
            this.f44961r = this.f44962s.getHeight();
            e(0);
            return;
        }
        if (this.f44942A != 0) {
            if (this.f44963t) {
                int i11 = this.f44960q;
                int i12 = this.f44948e;
                int i13 = i11 - i12;
                int i14 = this.f44955l;
                int i15 = this.f44954k;
                int i16 = i14 - (i15 / 2);
                StateListDrawable stateListDrawable = this.f44946c;
                stateListDrawable.setBounds(0, 0, i12, i15);
                int i17 = this.f44961r;
                int i18 = this.f44949f;
                Drawable drawable = this.f44947d;
                drawable.setBounds(0, 0, i18, i17);
                RecyclerView recyclerView2 = this.f44962s;
                int i19 = Y.f42258g;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i12, i16);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate(-i12, -i16);
                } else {
                    canvas.translate(i13, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i16);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i13, -i16);
                }
            }
            if (this.f44964u) {
                int i21 = this.f44961r;
                int i22 = this.f44952i;
                int i23 = i21 - i22;
                int i24 = this.f44958o;
                int i25 = this.f44957n;
                int i26 = i24 - (i25 / 2);
                StateListDrawable stateListDrawable2 = this.f44950g;
                stateListDrawable2.setBounds(0, 0, i25, i22);
                int i27 = this.f44960q;
                int i28 = this.f44953j;
                Drawable drawable2 = this.f44951h;
                drawable2.setBounds(0, 0, i27, i28);
                canvas.translate(0.0f, i23);
                drawable2.draw(canvas);
                canvas.translate(i26, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i26, -i23);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final boolean onInterceptTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        int i11 = this.f44965v;
        if (i11 != 1) {
            return i11 == 2;
        }
        boolean b11 = b(motionEvent.getX(), motionEvent.getY());
        boolean a11 = a(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!b11 && !a11) {
            return false;
        }
        if (a11) {
            this.f44966w = 1;
            this.f44959p = (int) motionEvent.getX();
        } else if (b11) {
            this.f44966w = 2;
            this.f44956m = (int) motionEvent.getY();
        }
        e(2);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void onRequestDisallowInterceptTouchEvent(boolean z11) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void onTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        if (this.f44965v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean b11 = b(motionEvent.getX(), motionEvent.getY());
            boolean a11 = a(motionEvent.getX(), motionEvent.getY());
            if (b11 || a11) {
                if (a11) {
                    this.f44966w = 1;
                    this.f44959p = (int) motionEvent.getX();
                } else if (b11) {
                    this.f44966w = 2;
                    this.f44956m = (int) motionEvent.getY();
                }
                e(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f44965v == 2) {
            this.f44956m = 0.0f;
            this.f44959p = 0.0f;
            e(1);
            this.f44966w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f44965v == 2) {
            f();
            int i11 = this.f44966w;
            int i12 = this.f44945b;
            if (i11 == 1) {
                float x11 = motionEvent.getX();
                int[] iArr = this.f44968y;
                iArr[0] = i12;
                int i13 = this.f44960q - i12;
                iArr[1] = i13;
                float max = Math.max(i12, Math.min(i13, x11));
                if (Math.abs(this.f44958o - max) >= 2.0f) {
                    int d11 = d(this.f44959p, max, iArr, this.f44962s.computeHorizontalScrollRange(), this.f44962s.computeHorizontalScrollOffset(), this.f44960q);
                    if (d11 != 0) {
                        this.f44962s.scrollBy(d11, 0);
                    }
                    this.f44959p = max;
                }
            }
            if (this.f44966w == 2) {
                float y11 = motionEvent.getY();
                int[] iArr2 = this.f44967x;
                iArr2[0] = i12;
                int i14 = this.f44961r - i12;
                iArr2[1] = i14;
                float max2 = Math.max(i12, Math.min(i14, y11));
                if (Math.abs(this.f44955l - max2) < 2.0f) {
                    return;
                }
                int d12 = d(this.f44956m, max2, iArr2, this.f44962s.computeVerticalScrollRange(), this.f44962s.computeVerticalScrollOffset(), this.f44961r);
                if (d12 != 0) {
                    this.f44962s.scrollBy(0, d12);
                }
                this.f44956m = max2;
            }
        }
    }
}
