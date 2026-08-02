package Hg;

import Sc.k;
import Sc.n;
import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zg.C11120a;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f10942a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Context f10943b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f10944c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f10945d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Hg.a f10946e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Og.b f10947f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Pg.b f10948g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Kg.a f10949h;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Pc.a<? extends String> f10950a;

        /* renamed from: b, reason: collision with root package name */
        private final int f10951b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final Pc.a<? extends String> f10952c;

        /* renamed from: d, reason: collision with root package name */
        private final Executor f10953d;

        /* renamed from: Hg.c$a$a, reason: collision with other inner class name */
        public static final class C0221a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private Pc.a<String> f10954a = C11120a.a("https://sdk-api.apptracer.ru");

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private Pc.a<? extends String> f10955b = C11120a.a(null);

            /* renamed from: c, reason: collision with root package name */
            private int f10956c = -1;

            /* renamed from: d, reason: collision with root package name */
            private ExecutorService f10957d;

            @NotNull
            public final Pc.a<String> a() {
                return this.f10954a;
            }

            public final Executor b() {
                return this.f10957d;
            }

            @NotNull
            public final Pc.a<? extends String> c() {
                return this.f10955b;
            }

            public final int d() {
                return this.f10956c;
            }

            public final void e(ExecutorService executorService) {
                this.f10957d = executorService;
            }
        }

        public a(C0221a c0221a) {
            this.f10950a = c0221a.a();
            this.f10951b = c0221a.d();
            this.f10952c = c0221a.c();
            this.f10953d = c0221a.b();
        }

        @NotNull
        public final String a() {
            String str = this.f10950a.get();
            Intrinsics.checkNotNullExpressionValue(str, "apiUrlProvider.get()");
            return str;
        }

        public final Executor b() {
            return this.f10953d;
        }

        @NotNull
        public final Pc.a<? extends String> c() {
            return this.f10952c;
        }

        public final int d() {
            return this.f10951b;
        }
    }

    public c(@NotNull Context context, @NotNull a configuration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("com.vk.id.tracking.tracer", "libraryPackageName");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f10942a = configuration;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.f10943b = applicationContext;
        n nVar = n.NONE;
        this.f10944c = k.a(nVar, new e(this));
        this.f10945d = k.a(nVar, new d(this));
        this.f10946e = new Hg.a();
        this.f10947f = new Og.b(context, configuration.d());
        this.f10948g = new Pg.b(configuration.b());
        this.f10949h = new Kg.a(context);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final Qg.b a(c cVar) {
        return (Qg.b) cVar.f10944c.getValue();
    }

    @NotNull
    public final a b() {
        return this.f10942a;
    }

    @NotNull
    public final Context c() {
        return this.f10943b;
    }

    @NotNull
    public final Pg.b d() {
        return this.f10948g;
    }

    @NotNull
    public final Og.b e() {
        return this.f10947f;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [Sc.j, java.lang.Object] */
    public final String f() {
        String str = this.f10942a.c().get();
        if (str != null) {
            return str;
        }
        Qg.b bVar = (Qg.b) this.f10944c.getValue();
        if (bVar != null) {
            return bVar.appToken();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @NotNull
    public final b g() {
        return (b) this.f10945d.getValue();
    }

    @NotNull
    public final Kg.a h() {
        return this.f10949h;
    }

    @NotNull
    public final Hg.a i() {
        return this.f10946e;
    }

    public final void j(String str) {
        Intrinsics.checkNotNullParameter("ClientId", "key");
        this.f10946e.b(str);
    }
}
