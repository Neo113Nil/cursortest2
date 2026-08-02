package L00;

import L00.j;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final g f16069a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final L00.b f16070b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final N00.b f16071c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private AtomicReference<a> f16072d;

    public interface a {
        void cancel();
    }

    /* loaded from: classes3.dex */
    static final class b extends AbstractC7737t implements Function0<String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K f16073b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(K k11) {
            super(0);
            this.f16073b = k11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Ej.b.a(this.f16073b.f71785a, "Redirect was called with successful status code ");
        }
    }

    public c(@NotNull g request, @NotNull L00.b api, @NotNull N00.b networkMetricsProvider) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(networkMetricsProvider, "networkMetricsProvider");
        this.f16069a = request;
        this.f16070b = api;
        this.f16071c = networkMetricsProvider;
        this.f16072d = new AtomicReference<>(null);
    }

    public final void a() {
        a andSet = this.f16072d.getAndSet(null);
        if (andSet != null) {
            andSet.cancel();
        }
    }

    @NotNull
    public final j b() {
        j a11;
        g gVar = this.f16069a;
        try {
            a11 = this.f16070b.execute(this);
        } catch (a10.j e11) {
            K k11 = new K();
            k11.f71785a = e11.a();
            String message = e11.getMessage();
            int i11 = k11.f71785a;
            if (200 <= i11 && i11 < 300) {
                H00.c.e(new b(k11));
                k11.f71785a = 302;
                message = "Temporary Redirect";
            }
            a11 = j.b.a(gVar, k11.f71785a, message, null, e11.b(), e11.d());
        }
        a11.l(this.f16071c.provide(gVar.k(), a11));
        return a11;
    }

    @NotNull
    public final g c() {
        return this.f16069a;
    }

    public final void d(@NotNull a cancellable) {
        Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        this.f16072d.set(cancellable);
    }
}
