package b10;

import L00.j;
import P4.f;
import Pk0.c;
import Sc.InterfaceC4008j;
import Sc.k;
import a10.AbstractC4920h;
import a10.C4915c;
import a10.C4919g;
import a10.InterfaceC4918f;
import android.util.LruCache;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class b extends AbstractC4920h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4918f f55475a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f55476b;

    /* loaded from: classes3.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f55477a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final j f55478b;

        /* renamed from: c, reason: collision with root package name */
        private final long f55479c;

        /* renamed from: d, reason: collision with root package name */
        private final double f55480d;

        public a(@NotNull String uuid, @NotNull j response, long j11, double d11) {
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            Intrinsics.checkNotNullParameter(response, "response");
            this.f55477a = uuid;
            this.f55478b = response;
            this.f55479c = j11;
            this.f55480d = d11;
        }

        public static a a(a aVar, long j11, double d11) {
            j response = aVar.f55478b;
            String uuid = aVar.f55477a;
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            Intrinsics.checkNotNullParameter(response, "response");
            return new a(uuid, response, j11, d11);
        }

        public final double b() {
            return this.f55480d;
        }

        public final long c() {
            return this.f55479c;
        }

        @NotNull
        public final j d() {
            return this.f55478b;
        }

        @NotNull
        public final String e() {
            return this.f55477a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f55477a, aVar.f55477a) && Intrinsics.d(this.f55478b, aVar.f55478b) && this.f55479c == aVar.f55479c && Double.compare(this.f55480d, aVar.f55480d) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.f55480d) + c.a((this.f55478b.hashCode() + (this.f55477a.hashCode() * 31)) * 31, 31, this.f55479c);
        }

        @NotNull
        public final String toString() {
            return "RegularRedirect(uuid=" + this.f55477a + ", response=" + this.f55478b + ", redirectTimeStart=" + this.f55479c + ", redirectTimeElapsed=" + this.f55480d + ")";
        }
    }

    /* renamed from: b10.b$b, reason: collision with other inner class name */
    static final class C0829b extends AbstractC7737t implements Function0<LruCache<String, a>> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0829b f55481b = new C0829b(0);

        @Override // kotlin.jvm.functions.Function0
        public final LruCache<String, a> invoke() {
            return new LruCache<>(5);
        }
    }

    public b(@NotNull InterfaceC4918f redirectListener) {
        Intrinsics.checkNotNullParameter(redirectListener, "redirectListener");
        this.f55475a = redirectListener;
        this.f55476b = k.b(C0829b.f55481b);
    }

    private final LruCache<String, a> d() {
        return (LruCache) this.f55476b.getValue();
    }

    public final void c(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (d()) {
            try {
                a aVar = d().get(key);
                if (aVar != null) {
                    d().put(key, a.a(aVar, -1L, aVar.b() + (aVar.c() == -1 ? 0.0d : TimeUnit.NANOSECONDS.toMicros(System.nanoTime() - r2) / 1000.0d)));
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NotNull
    public final C4915c e(@NotNull j response, @NotNull String redirectLink, String str) {
        N00.a aVar;
        j jVar;
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(redirectLink, "redirectLink");
        if (str == null) {
            str = f.b("toString(...)");
        }
        N00.a e11 = response.e();
        aVar = N00.a.f18344z;
        if (Intrinsics.d(e11, aVar)) {
            return new C4915c(str, redirectLink);
        }
        String k11 = response.h().k();
        if (e11.m() == 0) {
            synchronized (d()) {
                try {
                    if (d().get(str) == null) {
                        jVar = response;
                        d().put(str, new a(k11, jVar, System.nanoTime(), 0.0d));
                    } else {
                        jVar = response;
                    }
                    Unit unit = Unit.f71690a;
                } finally {
                }
            }
            this.f55475a.onRedirect(k11, jVar, a10.k.REGULAR);
            return new C4915c(str, redirectLink);
        }
        double micros = TimeUnit.NANOSECONDS.toMicros(System.nanoTime() - r0) / 1000.0d;
        synchronized (d()) {
            try {
                a aVar2 = d().get(str);
                if (aVar2 != null) {
                    d().put(str, a.a(aVar2, aVar2.c() == -1 ? System.nanoTime() : aVar2.c(), aVar2.b() + micros));
                } else {
                    d().put(str, new a(k11, response, System.nanoTime(), micros));
                }
            } finally {
            }
        }
        this.f55475a.onRedirect(k11, response, a10.k.REGULAR);
        return new C4915c(str, redirectLink);
    }

    public final C4919g f(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        a remove = d().remove(key);
        if (remove == null) {
            return null;
        }
        double b11 = remove.b();
        this.f55475a.onRedirectCompleted(remove.e(), remove.d(), a10.k.REGULAR);
        return new C4919g(b11, new C4919g.a(b11));
    }
}
