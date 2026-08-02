package Zb0;

import Fb0.f;
import Ic0.i;
import Kb0.K;
import Sc.InterfaceC4008j;
import Sc.k;
import bc0.C5643b;
import f3.C6410b;
import f3.C6411c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.logout.data.api.LogoutComposerApi;
import ru.ozon.id.logout.data.d;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final K f35805a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Mb0.b> f35806b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<d> f35807c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<LogoutComposerApi> f35808d;

    /* renamed from: Zb0.a$a, reason: collision with other inner class name */
    static final class C0675a extends AbstractC7737t implements Function0<Mb0.b> {
        C0675a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Mb0.b invoke() {
            a aVar = a.this;
            return new Mb0.b(aVar.d(), aVar.f35805a.K(), aVar.f35805a.t().h().getValue());
        }
    }

    static final class b extends AbstractC7737t implements Function0<LogoutComposerApi> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LogoutComposerApi invoke() {
            return (LogoutComposerApi) a.this.f35805a.M().r().getValue().create(LogoutComposerApi.class);
        }
    }

    static final class c extends AbstractC7737t implements Function0<d> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final d invoke() {
            a aVar = a.this;
            f N11 = aVar.f35805a.N();
            InterfaceC4008j<i> p11 = aVar.f35805a.M().p();
            return new d(N11, aVar.f35808d, aVar.f35805a.W().f(), p11, aVar.f35805a.z());
        }
    }

    public a(@NotNull K di) {
        Intrinsics.checkNotNullParameter(di, "di");
        this.f35805a = di;
        this.f35806b = k.b(new C0675a());
        this.f35807c = k.b(new c());
        this.f35808d = k.b(new b());
    }

    @NotNull
    public final InterfaceC4008j<Mb0.b> c() {
        return this.f35806b;
    }

    @NotNull
    public final InterfaceC4008j<d> d() {
        return this.f35807c;
    }

    @NotNull
    public final C6410b e() {
        C6411c c6411c = new C6411c();
        c6411c.a(N.b(C5643b.class), new Zb0.b(this));
        return c6411c.b();
    }
}
