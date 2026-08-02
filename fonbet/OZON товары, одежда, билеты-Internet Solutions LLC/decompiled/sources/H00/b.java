package H00;

import Sc.k;
import Sc.n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonLogger.core.h;
import sj.e;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    private static boolean f10447c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f10449e = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static a f10445a = a.C0214a.a();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f10446b = true;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final Object f10448d = k.a(n.PUBLICATION, C0215b.f10451b);

    public interface a {

        /* renamed from: H00.b$a$a, reason: collision with other inner class name */
        public static final class C0214a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private static final H00.a f10450a = new H00.a();

            @NotNull
            public static H00.a a() {
                return f10450a;
            }
        }

        void logError(@NotNull Throwable th2);
    }

    /* renamed from: H00.b$b, reason: collision with other inner class name */
    static final class C0215b extends AbstractC7737t implements Function0<sj.d> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0215b f10451b = new C0215b(0);

        @Override // kotlin.jvm.functions.Function0
        public final sj.d invoke() {
            return e.f98817f.q(new sj.a("Frameworks", "Composer&Navigation", Boolean.TRUE, "Composer"));
        }
    }

    @NotNull
    public static a a() {
        return f10445a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @NotNull
    public static h b() {
        return (h) f10448d.getValue();
    }

    public static boolean c() {
        return f10447c && f10446b;
    }

    public static void d(boolean z11) {
        f10447c = z11;
    }

    public static void e(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        f10445a = aVar;
    }

    public static void f(boolean z11) {
        f10446b = z11;
    }
}
