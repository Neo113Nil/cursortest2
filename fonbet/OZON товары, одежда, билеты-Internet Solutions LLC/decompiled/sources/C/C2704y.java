package C;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.A0;
import androidx.camera.core.impl.C5123v0;
import androidx.camera.core.impl.F;
import androidx.camera.core.impl.F0;
import androidx.camera.core.impl.G;
import androidx.camera.core.impl.T;
import androidx.camera.core.impl.c1;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import t.C9710a;
import t.C9711b;

/* renamed from: C.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2704y implements J.m<C2703x> {

    /* renamed from: H, reason: collision with root package name */
    static final T.a<G.a> f4269H = T.a.a(G.a.class, "camerax.core.appConfig.cameraFactoryProvider");

    /* renamed from: I, reason: collision with root package name */
    static final T.a<F.a> f4270I = T.a.a(F.a.class, "camerax.core.appConfig.deviceSurfaceManagerProvider");

    /* renamed from: J, reason: collision with root package name */
    static final T.a<c1.c> f4271J = T.a.a(c1.c.class, "camerax.core.appConfig.useCaseConfigFactoryProvider");

    /* renamed from: K, reason: collision with root package name */
    static final T.a<Executor> f4272K = T.a.a(Executor.class, "camerax.core.appConfig.cameraExecutor");

    /* renamed from: L, reason: collision with root package name */
    static final T.a<Handler> f4273L = T.a.a(Handler.class, "camerax.core.appConfig.schedulerHandler");

    /* renamed from: M, reason: collision with root package name */
    static final T.a<Integer> f4274M = T.a.a(Integer.TYPE, "camerax.core.appConfig.minimumLoggingLevel");

    /* renamed from: N, reason: collision with root package name */
    static final T.a<C2697q> f4275N = T.a.a(C2697q.class, "camerax.core.appConfig.availableCamerasLimiter");

    /* renamed from: O, reason: collision with root package name */
    static final T.a<Long> f4276O = T.a.a(Long.TYPE, "camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming");

    /* renamed from: P, reason: collision with root package name */
    static final T.a<a0> f4277P = T.a.a(a0.class, "camerax.core.appConfig.cameraProviderInitRetryPolicy");

    /* renamed from: Q, reason: collision with root package name */
    static final T.a<F0> f4278Q = T.a.a(F0.class, "camerax.core.appConfig.quirksSettings");

    /* renamed from: G, reason: collision with root package name */
    private final A0 f4279G;

    /* renamed from: C.y$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final C5123v0 f4280a;

        public a() {
            Object obj;
            C5123v0 R11 = C5123v0.R();
            this.f4280a = R11;
            Object obj2 = null;
            try {
                obj = R11.a(J.m.f12652c);
            } catch (IllegalArgumentException unused) {
                obj = null;
            }
            Class cls = (Class) obj;
            if (cls != null && !cls.equals(C2703x.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            T.a<Class<?>> aVar = J.m.f12652c;
            C5123v0 c5123v0 = this.f4280a;
            c5123v0.U(aVar, C2703x.class);
            try {
                obj2 = c5123v0.a(J.m.f12651b);
            } catch (IllegalArgumentException unused2) {
            }
            if (obj2 == null) {
                c5123v0.U(J.m.f12651b, C2703x.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
        }

        @NonNull
        public final C2704y a() {
            return new C2704y(A0.Q(this.f4280a));
        }

        @NonNull
        public final void b(@NonNull C9710a c9710a) {
            this.f4280a.U(C2704y.f4269H, c9710a);
        }

        @NonNull
        public final void c(@NonNull C9711b c9711b) {
            this.f4280a.U(C2704y.f4270I, c9711b);
        }

        @NonNull
        public final void d(@NonNull t.c cVar) {
            this.f4280a.U(C2704y.f4271J, cVar);
        }
    }

    /* renamed from: C.y$b */
    public interface b {
        @NonNull
        C2704y getCameraXConfig();
    }

    C2704y(A0 a02) {
        this.f4279G = a02;
    }

    public final C2697q P() {
        Object obj;
        try {
            obj = this.f4279G.a(f4275N);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (C2697q) obj;
    }

    public final Executor Q() {
        Object obj;
        try {
            obj = this.f4279G.a(f4272K);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (Executor) obj;
    }

    public final G.a R() {
        Object obj;
        try {
            obj = this.f4279G.a(f4269H);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (G.a) obj;
    }

    public final long S() {
        T.a<Long> aVar = f4276O;
        Object obj = -1L;
        A0 a02 = this.f4279G;
        a02.getClass();
        try {
            obj = a02.a(aVar);
        } catch (IllegalArgumentException unused) {
        }
        return ((Long) obj).longValue();
    }

    @NonNull
    public final a0 T() {
        T.a<a0> aVar = f4277P;
        Object obj = a0.f4153a;
        try {
            obj = this.f4279G.a(aVar);
        } catch (IllegalArgumentException unused) {
        }
        a0 a0Var = (a0) obj;
        Objects.requireNonNull(a0Var);
        return a0Var;
    }

    public final F.a U() {
        Object obj;
        try {
            obj = this.f4279G.a(f4270I);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (F.a) obj;
    }

    public final F0 V() {
        Object obj;
        T.a<F0> aVar = f4278Q;
        A0 a02 = this.f4279G;
        a02.getClass();
        try {
            obj = a02.a(aVar);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (F0) obj;
    }

    public final Handler W() {
        Object obj;
        try {
            obj = this.f4279G.a(f4273L);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (Handler) obj;
    }

    public final c1.c X() {
        Object obj;
        try {
            obj = this.f4279G.a(f4271J);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (c1.c) obj;
    }

    @Override // androidx.camera.core.impl.J0
    @NonNull
    public final androidx.camera.core.impl.T s() {
        return this.f4279G;
    }
}
