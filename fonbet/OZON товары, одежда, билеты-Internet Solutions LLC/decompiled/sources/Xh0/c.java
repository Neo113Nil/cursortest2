package Xh0;

import Qj0.U;
import Yh0.c;
import Yh0.f;
import Yh0.g;
import Yh0.n;
import android.app.Activity;
import ei0.InterfaceC6369b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import qj.C9067a;
import ru.ozon.app.android.OzonApplication;

/* loaded from: classes7.dex */
public interface c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f34471a = 0;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f34472a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static n f34473b;

        @NotNull
        public static n a() {
            n nVar = f34473b;
            if (nVar != null) {
                return nVar;
            }
            throw new IllegalStateException("Before getting StartupTimeTracker, StartupTimeTracker#startTracking method must be called.");
        }

        public static void b(OzonApplication app, b configuration) {
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            if (f34473b != null) {
                Yh0.c.f35083a.getClass();
                c.a.b(Xh0.b.f34470b);
                return;
            }
            f.c("StartupTimeTracker initial step");
            f.b(app);
            c.a aVar = Yh0.c.f35083a;
            b.InterfaceC0625b a11 = configuration.a();
            aVar.getClass();
            Yh0.c a12 = c.a.a(a11);
            f34473b = new n(app, configuration, new g(configuration, new C9067a(app), a12), a12);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final d<? extends Activity> f34474a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f34475b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final InterfaceC0625b.a f34476c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f34477d;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final d<? extends Activity> f34478a;

            /* renamed from: b, reason: collision with root package name */
            private boolean f34479b;

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            private InterfaceC0625b.a f34480c;

            public a(@NotNull d<? extends Activity> stopTrackingActivityClass) {
                Intrinsics.checkNotNullParameter(stopTrackingActivityClass, "stopTrackingActivityClass");
                this.f34478a = stopTrackingActivityClass;
                this.f34480c = InterfaceC0625b.a.f34481a;
            }

            @NotNull
            public final b a() {
                return new b(this.f34478a, this.f34479b, this.f34480c);
            }

            @NotNull
            public final void b() {
                this.f34479b = true;
            }
        }

        /* renamed from: Xh0.c$b$b, reason: collision with other inner class name */
        public interface InterfaceC0625b {

            /* renamed from: Xh0.c$b$b$a */
            public static final class a implements InterfaceC0625b {

                /* renamed from: a, reason: collision with root package name */
                @NotNull
                public static final a f34481a = new a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return -1410432517;
                }

                @NotNull
                public final String toString() {
                    return "Disabled";
                }
            }

            /* renamed from: Xh0.c$b$b$b, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0626b implements InterfaceC0625b {

                /* renamed from: a, reason: collision with root package name */
                @NotNull
                private final Yh0.a f34482a;

                public C0626b() {
                    Yh0.a logger = new Yh0.a();
                    Intrinsics.checkNotNullParameter(logger, "logger");
                    this.f34482a = logger;
                }

                @NotNull
                public final Yh0.a a() {
                    return this.f34482a;
                }
            }
        }

        public b(d stopTrackingActivityClass, boolean z11, InterfaceC0625b.a loggingConfiguration) {
            Intrinsics.checkNotNullParameter(stopTrackingActivityClass, "stopTrackingActivityClass");
            Intrinsics.checkNotNullParameter(loggingConfiguration, "loggingConfiguration");
            this.f34474a = stopTrackingActivityClass;
            this.f34475b = z11;
            this.f34476c = loggingConfiguration;
            this.f34477d = false;
        }

        @NotNull
        public final InterfaceC0625b a() {
            return this.f34476c;
        }

        public final boolean b() {
            return this.f34477d;
        }

        @NotNull
        public final d<? extends Activity> c() {
            return this.f34474a;
        }

        public final boolean d() {
            return this.f34475b;
        }

        public final void e(boolean z11) {
            this.f34477d = z11;
        }
    }

    void a(@NotNull String str);

    void b(@NotNull Function1<? super U, Unit> function1);

    void c(@NotNull InterfaceC6369b interfaceC6369b);
}
