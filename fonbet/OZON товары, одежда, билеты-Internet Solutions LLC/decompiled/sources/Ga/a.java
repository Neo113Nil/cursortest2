package Ga;

import Ja.f;
import Ja.g;
import Ja.i;
import Ja.j;
import java.util.ArrayList;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Oa.c f9873a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Na.a f9874b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ArrayList f9875c;

    /* renamed from: Ga.a$a, reason: collision with other inner class name */
    public static final class C0201a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Oa.c f9876a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final ArrayList f9877b;

        public C0201a(@NotNull Oa.c engine) {
            Intrinsics.checkNotNullParameter(engine, "engine");
            this.f9876a = engine;
            this.f9877b = new ArrayList();
        }

        @NotNull
        public final a a() {
            Na.a aVar;
            aVar = Na.a.f18884c;
            Oa.c cVar = this.f9876a;
            return new a(cVar, aVar, C7714v.q0(new c(cVar), this.f9877b));
        }
    }

    public static final class b {
        public static a a(Oa.c engine) {
            Intrinsics.checkNotNullParameter(engine, "engine");
            Ga.b apply = Ga.b.f9879b;
            Intrinsics.checkNotNullParameter(apply, "apply");
            C0201a c0201a = new C0201a(engine);
            apply.getClass();
            Intrinsics.checkNotNullParameter(c0201a, "$this$null");
            return c0201a.a();
        }
    }

    private static final class c implements Ja.c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Oa.c f9878a;

        public c(@NotNull Oa.c httpExecutor) {
            Intrinsics.checkNotNullParameter(httpExecutor, "httpExecutor");
            this.f9878a = httpExecutor;
        }

        @Override // Ja.c
        @NotNull
        public final j a(@NotNull f pipeline) {
            Intrinsics.checkNotNullParameter(pipeline, "pipeline");
            return this.f9878a.b(pipeline.getRequest(), pipeline.a());
        }
    }

    public a(@NotNull Oa.c engine, @NotNull Na.a pool, @NotNull ArrayList interceptors) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        this.f9873a = engine;
        this.f9874b = pool;
        this.f9875c = interceptors;
    }

    @NotNull
    public final j a(@NotNull i request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Na.a pool = this.f9874b;
        Intrinsics.checkNotNullParameter(pool, "pool");
        return g.a(new f.b(), this.f9873a, request, this.f9875c).b(request);
    }

    @NotNull
    public final Ga.c b() {
        return this.f9873a;
    }
}
