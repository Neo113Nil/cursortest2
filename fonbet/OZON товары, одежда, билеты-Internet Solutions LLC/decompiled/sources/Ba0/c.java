package Ba0;

import I1.w;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import ib0.C7041b;
import id.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.m;
import lb0.C7915b;
import org.jetbrains.annotations.NotNull;
import za0.InterfaceC11014a;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f3353b = {w.c(c.class, "configuration", "getConfiguration()Lru/ozon/host/config/debug/menu/HostConfigDebugMenuConfiguration;", 0)};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f3352a = new c();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final f f3354c = C7041b.a(a.f3357b);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f3355d = k.b(b.f3358b);

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final Object f3356e = k.a(n.NONE, C0080c.f3359b);

    static final class a extends AbstractC7737t implements Function0<String> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f3357b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ String invoke() {
            return "HostConfigDebugMenuConfiguration is null. Need before call HostConfigDebugMenu.init method";
        }
    }

    static final class b extends AbstractC7737t implements Function0<Ja0.b> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f3358b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final Ja0.b invoke() {
            return Ja0.a.a().create(c.a(c.f3352a).a().c().a());
        }
    }

    /* renamed from: Ba0.c$c, reason: collision with other inner class name */
    static final class C0080c extends AbstractC7737t implements Function0<InterfaceC11014a> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0080c f3359b = new C0080c(0);

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC11014a invoke() {
            return (InterfaceC11014a) c.a(c.f3352a).a().e(InterfaceC11014a.class);
        }
    }

    private c() {
    }

    public static final d a(c cVar) {
        cVar.getClass();
        return (d) f3354c.getValue(cVar, f3353b[0]);
    }

    @NotNull
    public static Fa0.a b() {
        return ((Ja0.b) f3355d.getValue()).a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @NotNull
    public static InterfaceC11014a c() {
        return (InterfaceC11014a) f3356e.getValue();
    }

    public final void d(@NotNull C7915b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        f3354c.setValue(this, f3353b[0], configuration);
    }
}
