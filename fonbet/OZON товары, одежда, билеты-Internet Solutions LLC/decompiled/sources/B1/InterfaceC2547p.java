package B1;

import k1.C7464j;
import org.jetbrains.annotations.NotNull;

/* renamed from: B1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2547p {

    /* renamed from: B1.p$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private static final C0051a f2138a = new C0051a();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private static final d f2139b = new d();

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private static final c f2140c = new c();

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private static final e f2141d = new e();

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private static final C2549s f2142e = new C2549s();

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private static final b f2143f = new b();

        /* renamed from: B1.p$a$a, reason: collision with other inner class name */
        public static final class C0051a implements InterfaceC2547p {
            @Override // B1.InterfaceC2547p
            public final long a(long j11, long j12) {
                float max = Math.max(C7464j.f(j12) / C7464j.f(j11), C7464j.d(j12) / C7464j.d(j11));
                return t0.a(max, max);
            }
        }

        /* renamed from: B1.p$a$b */
        public static final class b implements InterfaceC2547p {
            @Override // B1.InterfaceC2547p
            public final long a(long j11, long j12) {
                return t0.a(C7464j.f(j12) / C7464j.f(j11), C2548q.b(j11, j12));
            }
        }

        /* renamed from: B1.p$a$c */
        public static final class c implements InterfaceC2547p {
            @Override // B1.InterfaceC2547p
            public final long a(long j11, long j12) {
                float b11 = C2548q.b(j11, j12);
                return t0.a(b11, b11);
            }
        }

        /* renamed from: B1.p$a$d */
        public static final class d implements InterfaceC2547p {
            @Override // B1.InterfaceC2547p
            public final long a(long j11, long j12) {
                float c11 = C2548q.c(j11, j12);
                return t0.a(c11, c11);
            }
        }

        /* renamed from: B1.p$a$e */
        public static final class e implements InterfaceC2547p {
            @Override // B1.InterfaceC2547p
            public final long a(long j11, long j12) {
                if (C7464j.f(j11) <= C7464j.f(j12) && C7464j.d(j11) <= C7464j.d(j12)) {
                    return t0.a(1.0f, 1.0f);
                }
                float c11 = C2548q.c(j11, j12);
                return t0.a(c11, c11);
            }
        }

        @NotNull
        public static C0051a a() {
            return f2138a;
        }

        @NotNull
        public static b b() {
            return f2143f;
        }

        @NotNull
        public static c c() {
            return f2140c;
        }

        @NotNull
        public static d d() {
            return f2139b;
        }

        @NotNull
        public static e e() {
            return f2141d;
        }

        @NotNull
        public static C2549s f() {
            return f2142e;
        }
    }

    long a(long j11, long j12);
}
