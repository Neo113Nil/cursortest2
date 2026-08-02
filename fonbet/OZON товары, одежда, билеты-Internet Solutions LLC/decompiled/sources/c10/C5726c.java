package c10;

import L00.j;
import P4.f;
import Sc.InterfaceC4008j;
import Sc.k;
import a10.AbstractC4920h;
import a10.C4915c;
import a10.C4919g;
import a10.InterfaceC4918f;
import android.util.LruCache;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: c10.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C5726c extends AbstractC4920h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4918f f56314a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f56315b;

    /* renamed from: c10.c$a */
    /* loaded from: classes3.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f56316a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final j f56317b;

        /* renamed from: c, reason: collision with root package name */
        private final long f56318c;

        public a(@NotNull String uuid, @NotNull j response, long j11) {
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            Intrinsics.checkNotNullParameter(response, "response");
            this.f56316a = uuid;
            this.f56317b = response;
            this.f56318c = j11;
        }

        @NotNull
        public final j a() {
            return this.f56317b;
        }

        public final long b() {
            return this.f56318c;
        }

        @NotNull
        public final String c() {
            return this.f56316a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!a.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.composer.network.redirect.server.ServerRedirectPerformanceHandler.ServerRedirect");
            a aVar = (a) obj;
            return Intrinsics.d(this.f56316a, aVar.f56316a) && Intrinsics.d(this.f56317b, aVar.f56317b);
        }

        public final int hashCode() {
            return this.f56316a.hashCode() + (this.f56317b.hashCode() * 31);
        }
    }

    /* renamed from: c10.c$b */
    static final class b extends AbstractC7737t implements Function0<LruCache<String, a>> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f56319b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final LruCache<String, a> invoke() {
            return new LruCache<>(5);
        }
    }

    public C5726c(@NotNull InterfaceC4918f redirectListener) {
        Intrinsics.checkNotNullParameter(redirectListener, "redirectListener");
        this.f56314a = redirectListener;
        this.f56315b = k.b(b.f56319b);
    }

    @NotNull
    public final C4915c c(@NotNull j response, @NotNull String redirectLink, String str) {
        N00.a aVar;
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
        ((LruCache) this.f56315b.getValue()).put(str, new a(k11, response, System.nanoTime()));
        this.f56314a.onRedirect(k11, response, a10.k.SERVER);
        return new C4915c(str, redirectLink);
    }

    public final C4919g d(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        a aVar = (a) ((LruCache) this.f56315b.getValue()).remove(key);
        if (aVar == null) {
            return null;
        }
        long b11 = aVar.b();
        long nanoTime = System.nanoTime();
        this.f56314a.onRedirectCompleted(aVar.c(), aVar.a(), a10.k.SERVER);
        return new C4919g(TimeUnit.NANOSECONDS.toMicros(nanoTime - b11) / 1000.0d, null);
    }
}
