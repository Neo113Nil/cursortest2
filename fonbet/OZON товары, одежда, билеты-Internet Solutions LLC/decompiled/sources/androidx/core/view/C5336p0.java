package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.NonNull;
import androidx.core.view.C5353y0;
import androidx.core.view.Y;
import c3.C5739a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import ru.ozon.app.android.R;

/* renamed from: androidx.core.view.p0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5336p0 {

    /* renamed from: a, reason: collision with root package name */
    private e f42309a;

    /* renamed from: androidx.core.view.p0$b */
    public static abstract class b {
        WindowInsets mDispachedInsets;
        private final int mDispatchMode;

        public b(int i11) {
            this.mDispatchMode = i11;
        }

        public final int getDispatchMode() {
            return this.mDispatchMode;
        }

        public void onEnd(@NonNull C5336p0 c5336p0) {
        }

        public void onPrepare(@NonNull C5336p0 c5336p0) {
        }

        @NonNull
        public abstract C5353y0 onProgress(@NonNull C5353y0 c5353y0, @NonNull List<C5336p0> list);

        @NonNull
        public a onStart(@NonNull C5336p0 c5336p0, @NonNull a aVar) {
            return aVar;
        }
    }

    /* renamed from: androidx.core.view.p0$c */
    private static class c extends e {

        /* renamed from: e, reason: collision with root package name */
        private static final PathInterpolator f42312e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* renamed from: f, reason: collision with root package name */
        private static final C5739a f42313f = new C5739a();

        /* renamed from: g, reason: collision with root package name */
        private static final DecelerateInterpolator f42314g = new DecelerateInterpolator();

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int f42315h = 0;

        /* renamed from: androidx.core.view.p0$c$a */
        private static class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            final b f42316a;

            /* renamed from: b, reason: collision with root package name */
            private C5353y0 f42317b;

            /* renamed from: androidx.core.view.p0$c$a$a, reason: collision with other inner class name */
            final class C0776a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C5336p0 f42318a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C5353y0 f42319b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C5353y0 f42320c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ int f42321d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ View f42322e;

                C0776a(C5336p0 c5336p0, C5353y0 c5353y0, C5353y0 c5353y02, int i11, View view) {
                    this.f42318a = c5336p0;
                    this.f42319b = c5353y0;
                    this.f42320c = c5353y02;
                    this.f42321d = i11;
                    this.f42322e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float f7;
                    int i11;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    C5336p0 c5336p0 = this.f42318a;
                    c5336p0.e(animatedFraction);
                    float b11 = c5336p0.b();
                    int i12 = c.f42315h;
                    C5353y0 c5353y0 = this.f42319b;
                    C5353y0.b bVar = new C5353y0.b(c5353y0);
                    int i13 = 1;
                    while (i13 <= 256) {
                        if ((this.f42321d & i13) == 0) {
                            bVar.b(i13, c5353y0.f(i13));
                            f7 = b11;
                            i11 = 1;
                        } else {
                            androidx.core.graphics.d f11 = c5353y0.f(i13);
                            androidx.core.graphics.d f12 = this.f42320c.f(i13);
                            float f13 = 1.0f - b11;
                            f7 = b11;
                            i11 = 1;
                            bVar.b(i13, C5353y0.n(f11, (int) (((f11.f42126a - f12.f42126a) * f13) + 0.5d), (int) (((f11.f42127b - f12.f42127b) * f13) + 0.5d), (int) (((f11.f42128c - f12.f42128c) * f13) + 0.5d), (int) (((f11.f42129d - f12.f42129d) * f13) + 0.5d)));
                        }
                        i13 <<= i11;
                        b11 = f7;
                    }
                    c.h(this.f42322e, bVar.a(), Collections.singletonList(c5336p0));
                }
            }

            /* renamed from: androidx.core.view.p0$c$a$b */
            final class b extends AnimatorListenerAdapter {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C5336p0 f42323a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ View f42324b;

                b(View view, C5336p0 c5336p0) {
                    this.f42323a = c5336p0;
                    this.f42324b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    C5336p0 c5336p0 = this.f42323a;
                    c5336p0.e(1.0f);
                    c.f(this.f42324b, c5336p0);
                }
            }

            /* renamed from: androidx.core.view.p0$c$a$c, reason: collision with other inner class name */
            final class RunnableC0777c implements Runnable {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ View f42325a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C5336p0 f42326b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ a f42327c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ ValueAnimator f42328d;

                RunnableC0777c(View view, C5336p0 c5336p0, a aVar, ValueAnimator valueAnimator) {
                    this.f42325a = view;
                    this.f42326b = c5336p0;
                    this.f42327c = aVar;
                    this.f42328d = valueAnimator;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    c.i(this.f42325a, this.f42326b, this.f42327c);
                    this.f42328d.start();
                }
            }

            a(@NonNull View view, @NonNull b bVar) {
                this.f42316a = bVar;
                int i11 = Y.f42258g;
                C5353y0 a11 = Y.e.a(view);
                this.f42317b = a11 != null ? new C5353y0.b(a11).a() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f42317b = C5353y0.u(view, windowInsets);
                    return c.j(view, windowInsets);
                }
                C5353y0 u11 = C5353y0.u(view, windowInsets);
                if (this.f42317b == null) {
                    int i11 = Y.f42258g;
                    this.f42317b = Y.e.a(view);
                }
                if (this.f42317b == null) {
                    this.f42317b = u11;
                    return c.j(view, windowInsets);
                }
                b k11 = c.k(view);
                if (k11 != null && Objects.equals(k11.mDispachedInsets, windowInsets)) {
                    return c.j(view, windowInsets);
                }
                C5353y0 c5353y0 = this.f42317b;
                int i12 = 0;
                for (int i13 = 1; i13 <= 256; i13 <<= 1) {
                    if (!u11.f(i13).equals(c5353y0.f(i13))) {
                        i12 |= i13;
                    }
                }
                if (i12 == 0) {
                    return c.j(view, windowInsets);
                }
                C5353y0 c5353y02 = this.f42317b;
                C5336p0 c5336p0 = new C5336p0(i12, c.e(i12, u11, c5353y02), 160L);
                c5336p0.e(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c5336p0.a());
                androidx.core.graphics.d f7 = u11.f(i12);
                androidx.core.graphics.d f11 = c5353y02.f(i12);
                int min = Math.min(f7.f42126a, f11.f42126a);
                int i14 = f7.f42127b;
                int i15 = f11.f42127b;
                int min2 = Math.min(i14, i15);
                int i16 = f7.f42128c;
                int i17 = f11.f42128c;
                int min3 = Math.min(i16, i17);
                int i18 = f7.f42129d;
                int i19 = i12;
                int i21 = f11.f42129d;
                a aVar = new a(androidx.core.graphics.d.b(min, min2, min3, Math.min(i18, i21)), androidx.core.graphics.d.b(Math.max(f7.f42126a, f11.f42126a), Math.max(i14, i15), Math.max(i16, i17), Math.max(i18, i21)));
                c.g(view, c5336p0, windowInsets, false);
                duration.addUpdateListener(new C0776a(c5336p0, u11, c5353y02, i19, view));
                duration.addListener(new b(view, c5336p0));
                G.a(view, new RunnableC0777c(view, c5336p0, aVar, duration));
                this.f42317b = u11;
                return c.j(view, windowInsets);
            }
        }

        static Interpolator e(int i11, C5353y0 c5353y0, C5353y0 c5353y02) {
            return (i11 & 8) != 0 ? c5353y0.f(8).f42129d > c5353y02.f(8).f42129d ? f42312e : f42313f : f42314g;
        }

        static void f(@NonNull View view, @NonNull C5336p0 c5336p0) {
            b k11 = k(view);
            if (k11 != null) {
                k11.onEnd(c5336p0);
                if (k11.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    f(viewGroup.getChildAt(i11), c5336p0);
                }
            }
        }

        static void g(View view, C5336p0 c5336p0, WindowInsets windowInsets, boolean z11) {
            b k11 = k(view);
            if (k11 != null) {
                k11.mDispachedInsets = windowInsets;
                if (!z11) {
                    k11.onPrepare(c5336p0);
                    z11 = k11.getDispatchMode() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    g(viewGroup.getChildAt(i11), c5336p0, windowInsets, z11);
                }
            }
        }

        static void h(@NonNull View view, @NonNull C5353y0 c5353y0, @NonNull List<C5336p0> list) {
            b k11 = k(view);
            if (k11 != null) {
                c5353y0 = k11.onProgress(c5353y0, list);
                if (k11.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    h(viewGroup.getChildAt(i11), c5353y0, list);
                }
            }
        }

        static void i(View view, C5336p0 c5336p0, a aVar) {
            b k11 = k(view);
            if (k11 != null) {
                k11.onStart(c5336p0, aVar);
                if (k11.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    i(viewGroup.getChildAt(i11), c5336p0, aVar);
                }
            }
        }

        @NonNull
        static WindowInsets j(@NonNull View view, @NonNull WindowInsets windowInsets) {
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        static b k(View view) {
            Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
            if (tag instanceof a) {
                return ((a) tag).f42316a;
            }
            return null;
        }
    }

    /* renamed from: androidx.core.view.p0$d */
    private static class d extends e {

        /* renamed from: e, reason: collision with root package name */
        @NonNull
        private final WindowInsetsAnimation f42329e;

        /* renamed from: androidx.core.view.p0$d$a */
        private static class a extends WindowInsetsAnimation$Callback {

            /* renamed from: a, reason: collision with root package name */
            private final b f42330a;

            /* renamed from: b, reason: collision with root package name */
            private List<C5336p0> f42331b;

            /* renamed from: c, reason: collision with root package name */
            private ArrayList<C5336p0> f42332c;

            /* renamed from: d, reason: collision with root package name */
            private final HashMap<WindowInsetsAnimation, C5336p0> f42333d;

            a(@NonNull b bVar) {
                super(bVar.getDispatchMode());
                this.f42333d = new HashMap<>();
                this.f42330a = bVar;
            }

            @NonNull
            private C5336p0 a(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
                C5336p0 c5336p0 = this.f42333d.get(windowInsetsAnimation);
                if (c5336p0 != null) {
                    return c5336p0;
                }
                C5336p0 f7 = C5336p0.f(windowInsetsAnimation);
                this.f42333d.put(windowInsetsAnimation, f7);
                return f7;
            }

            public final void onEnd(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
                this.f42330a.onEnd(a(windowInsetsAnimation));
                this.f42333d.remove(windowInsetsAnimation);
            }

            public final void onPrepare(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
                this.f42330a.onPrepare(a(windowInsetsAnimation));
            }

            @NonNull
            public final WindowInsets onProgress(@NonNull WindowInsets windowInsets, @NonNull List<WindowInsetsAnimation> list) {
                float fraction;
                ArrayList<C5336p0> arrayList = this.f42332c;
                if (arrayList == null) {
                    ArrayList<C5336p0> arrayList2 = new ArrayList<>(list.size());
                    this.f42332c = arrayList2;
                    this.f42331b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation b11 = C5349w0.b(list.get(size));
                    C5336p0 a11 = a(b11);
                    fraction = b11.getFraction();
                    a11.e(fraction);
                    this.f42332c.add(a11);
                }
                return this.f42330a.onProgress(C5353y0.u(null, windowInsets), this.f42331b).t();
            }

            @NonNull
            public final WindowInsetsAnimation.Bounds onStart(@NonNull WindowInsetsAnimation windowInsetsAnimation, @NonNull WindowInsetsAnimation.Bounds bounds) {
                a onStart = this.f42330a.onStart(a(windowInsetsAnimation), a.c(bounds));
                onStart.getClass();
                C5345u0.a();
                return C5343t0.b(onStart.a().d(), onStart.b().d());
            }
        }

        d(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f42329e = windowInsetsAnimation;
        }

        @Override // androidx.core.view.C5336p0.e
        public final long a() {
            long durationMillis;
            durationMillis = this.f42329e.getDurationMillis();
            return durationMillis;
        }

        @Override // androidx.core.view.C5336p0.e
        public final float b() {
            float interpolatedFraction;
            interpolatedFraction = this.f42329e.getInterpolatedFraction();
            return interpolatedFraction;
        }

        @Override // androidx.core.view.C5336p0.e
        public final int c() {
            int typeMask;
            typeMask = this.f42329e.getTypeMask();
            return typeMask;
        }

        @Override // androidx.core.view.C5336p0.e
        public final void d(float f7) {
            this.f42329e.setFraction(f7);
        }
    }

    /* renamed from: androidx.core.view.p0$e */
    private static class e {

        /* renamed from: a, reason: collision with root package name */
        private final int f42334a;

        /* renamed from: b, reason: collision with root package name */
        private float f42335b;

        /* renamed from: c, reason: collision with root package name */
        private final Interpolator f42336c;

        /* renamed from: d, reason: collision with root package name */
        private final long f42337d;

        e(int i11, Interpolator interpolator, long j11) {
            this.f42334a = i11;
            this.f42336c = interpolator;
            this.f42337d = j11;
        }

        public long a() {
            return this.f42337d;
        }

        public float b() {
            Interpolator interpolator = this.f42336c;
            return interpolator != null ? interpolator.getInterpolation(this.f42335b) : this.f42335b;
        }

        public int c() {
            return this.f42334a;
        }

        public void d(float f7) {
            this.f42335b = f7;
        }
    }

    public C5336p0(int i11, Interpolator interpolator, long j11) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f42309a = new d(C5341s0.a(i11, interpolator, j11));
        } else {
            this.f42309a = new c(i11, interpolator, j11);
        }
    }

    static void d(@NonNull View view, b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new d.a(bVar) : null);
            return;
        }
        int i11 = c.f42315h;
        Object tag = view.getTag(R.id.tag_on_apply_window_listener);
        if (bVar == null) {
            view.setTag(R.id.tag_window_insets_animation_callback, null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            return;
        }
        View.OnApplyWindowInsetsListener aVar = new c.a(view, bVar);
        view.setTag(R.id.tag_window_insets_animation_callback, aVar);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(aVar);
        }
    }

    static C5336p0 f(WindowInsetsAnimation windowInsetsAnimation) {
        C5336p0 c5336p0 = new C5336p0(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            c5336p0.f42309a = new d(windowInsetsAnimation);
        }
        return c5336p0;
    }

    public final long a() {
        return this.f42309a.a();
    }

    public final float b() {
        return this.f42309a.b();
    }

    public final int c() {
        return this.f42309a.c();
    }

    public final void e(float f7) {
        this.f42309a.d(f7);
    }

    /* renamed from: androidx.core.view.p0$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.core.graphics.d f42310a;

        /* renamed from: b, reason: collision with root package name */
        private final androidx.core.graphics.d f42311b;

        public a(@NonNull androidx.core.graphics.d dVar, @NonNull androidx.core.graphics.d dVar2) {
            this.f42310a = dVar;
            this.f42311b = dVar2;
        }

        @NonNull
        public static a c(@NonNull WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        @NonNull
        public final androidx.core.graphics.d a() {
            return this.f42310a;
        }

        @NonNull
        public final androidx.core.graphics.d b() {
            return this.f42311b;
        }

        public final String toString() {
            return "Bounds{lower=" + this.f42310a + " upper=" + this.f42311b + "}";
        }

        private a(@NonNull WindowInsetsAnimation.Bounds bounds) {
            Insets lowerBound;
            Insets upperBound;
            lowerBound = bounds.getLowerBound();
            this.f42310a = androidx.core.graphics.d.c(lowerBound);
            upperBound = bounds.getUpperBound();
            this.f42311b = androidx.core.graphics.d.c(upperBound);
        }
    }
}
