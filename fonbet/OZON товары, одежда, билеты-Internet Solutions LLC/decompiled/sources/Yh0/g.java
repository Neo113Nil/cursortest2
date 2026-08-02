package Yh0;

import Qj0.B;
import Qj0.C3882b;
import Qj0.U;
import Qj0.t0;
import Xh0.a;
import Xh0.c;
import ed.C6345a;
import ei0.InterfaceC6369b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qj.C9067a;
import ru.ozon.android.networkinfo.models.ConnectionType;
import ru.ozon.tracker.performance.ObjectTypes;
import ru.ozon.tracker.performance.a;

/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c.b f35091a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C9067a f35092b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final c f35093c;

    /* renamed from: d, reason: collision with root package name */
    private volatile InterfaceC6369b f35094d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f35095e;

    /* renamed from: f, reason: collision with root package name */
    private Xh0.a f35096f;

    /* loaded from: classes3.dex */
    static final class a extends AbstractC7737t implements Function0<String> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f35097b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Method modifyTrace has already been called.";
        }
    }

    /* loaded from: classes3.dex */
    static final class b extends AbstractC7737t implements Function0<String> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f35098b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ String invoke() {
            return "For modifying trace flag traceModifyEnabled in Configuration must be set to true.";
        }
    }

    public g(@NotNull c.b configuration, @NotNull C9067a networkInfoProvider, @NotNull c logger) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f35091a = configuration;
        this.f35092b = networkInfoProvider;
        this.f35093c = logger;
    }

    private static void a(InterfaceC6369b interfaceC6369b, ConnectionType connectionType, kotlin.reflect.d dVar, List list, Function1 function1) {
        U beginTrace = interfaceC6369b.beginTrace("application_startup_time");
        C3882b c3882b = new C3882b(connectionType);
        int i11 = U.f23535i;
        beginTrace.n(c3882b, true);
        String simpleName = C6345a.b(dVar).getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        beginTrace.n(new t0(simpleName), true);
        beginTrace.n(new B(ObjectTypes.APPLICATION), true);
        if (!list.isEmpty()) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new a.C2147a(((a.b) it.next()).b(), (float) (kotlin.time.b.i(r3.a()) / 1000000)));
            }
            beginTrace.n(new ru.ozon.tracker.performance.a(arrayList), true);
        }
        function1.invoke(beginTrace);
        interfaceC6369b.endTrace("application_startup_time");
    }

    private final void d(Xh0.a aVar, Function1<? super U, Unit> function1) {
        InterfaceC6369b interfaceC6369b = this.f35094d;
        if (interfaceC6369b == null) {
            throw new IllegalArgumentException("OzonTracker must be set by using StartupTimeTracker#setOzonTracker before using it.");
        }
        c.b bVar = this.f35091a;
        boolean b11 = bVar.b();
        C9067a c9067a = this.f35092b;
        if (!b11) {
            a(interfaceC6369b, C9067a.g(c9067a), bVar.c(), aVar.c(), new i(aVar));
            return;
        }
        ConnectionType g10 = C9067a.g(c9067a);
        int i11 = 30;
        a(interfaceC6369b, g10, bVar.c(), C7714v.K0(aVar.c(), 30), new j(aVar));
        int size = aVar.c().size();
        if (size > 30) {
            while (i11 < size) {
                List<a.b> c11 = aVar.c();
                int i12 = i11 + 30;
                int size2 = aVar.c().size();
                if (i12 <= size2) {
                    size2 = i12;
                }
                a(interfaceC6369b, g10, bVar.c(), c11.subList(i11, size2), function1);
                i11 = i12;
            }
        }
    }

    public final synchronized void b(@NotNull Function1<? super U, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (this.f35095e) {
            this.f35093c.a(a.f35097b);
            return;
        }
        this.f35095e = true;
        if (!this.f35091a.d()) {
            this.f35093c.a(b.f35098b);
            return;
        }
        InterfaceC6369b interfaceC6369b = this.f35094d;
        if (interfaceC6369b == null) {
            throw new IllegalArgumentException("OzonTracker must be set by using StartupTimeTracker#setOzonTracker before using it.");
        }
        action.invoke(interfaceC6369b.beginTrace("application_startup_time"));
        Xh0.a aVar = this.f35096f;
        if (aVar != null) {
            d(aVar, action);
        }
    }

    public final synchronized void c(@NotNull Xh0.a time) {
        try {
            Intrinsics.checkNotNullParameter(time, "time");
            if (this.f35091a.d() && !this.f35095e) {
                this.f35096f = time;
            }
            d(time, h.f35099b);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void e(@NotNull InterfaceC6369b ozonTracker) {
        Intrinsics.checkNotNullParameter(ozonTracker, "ozonTracker");
        this.f35094d = ozonTracker;
    }
}
