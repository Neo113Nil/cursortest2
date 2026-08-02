package Ig;

import Jg.C3396a;
import Sc.k;
import Sc.n;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Hg.c f12491a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f12492b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Ig.b f12493c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C3396a f12494d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Object f12495e;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f12496a;

        /* renamed from: Ig.c$a$a, reason: collision with other inner class name */
        public static final class C0249a {

            /* renamed from: a, reason: collision with root package name */
            private boolean f12497a;

            public final boolean a() {
                return this.f12497a;
            }

            public final void b() {
                this.f12497a = true;
            }
        }

        public a(C0249a c0249a) {
            this.f12496a = c0249a.a();
        }

        public final boolean a() {
            return this.f12496a;
        }
    }

    static final class b extends AbstractC7737t implements Function0<Boolean> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            boolean z11;
            boolean z12;
            boolean z13 = true;
            if (!c.this.f12492b.a()) {
                try {
                    String str = "ru.ok.tracer.lite.crash.report" + ((char) ((kotlin.random.c.INSTANCE.d() * Integer.parseInt("0")) + 46)) + "SeemsUnused";
                    z11 = !Class.forName(str).getName().equals(str);
                } catch (Throwable unused) {
                    z11 = true;
                }
                if (z11) {
                    try {
                        Class.forName("ru.ok.tracer.Tracer");
                        z12 = true;
                    } catch (Throwable unused2) {
                        z12 = false;
                    }
                    if (!z12) {
                        z13 = false;
                    }
                }
            }
            return Boolean.valueOf(z13);
        }
    }

    public c(@NotNull Hg.c tracer, @NotNull a configuration) {
        Intrinsics.checkNotNullParameter(tracer, "tracer");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f12491a = tracer;
        this.f12492b = configuration;
        this.f12493c = new Ig.b();
        this.f12494d = new C3396a(tracer, "com.vk.id.tracking.tracer");
        this.f12495e = k.a(n.NONE, new b());
    }

    public static void a(c this$0, Throwable e11) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(e11, "$e");
        C3396a c3396a = this$0.f12494d;
        List<Ig.a> a11 = this$0.f12493c.a();
        Hg.c tracer = this$0.f12491a;
        Intrinsics.checkNotNullParameter(tracer, "tracer");
        c3396a.a(e11, a11, tracer.i().a());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static void d(c cVar, Throwable e11) {
        cVar.getClass();
        Intrinsics.checkNotNullParameter(e11, "e");
        if (((Boolean) cVar.f12495e.getValue()).booleanValue()) {
            Hg.c tracer = cVar.f12491a;
            Intrinsics.checkNotNullParameter(tracer, "tracer");
            tracer.d().a().execute(new AB.a(1, cVar, e11));
        }
    }

    public final void c(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.f12493c.b(msg);
    }
}
