package Bc0;

import De.C2862e;
import Kb0.K;
import Sc.InterfaceC4008j;
import Sc.r;
import Sc.s;
import We.E;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import ru.ozon.id.nativeauth.data.api.MtsApi;
import ud0.EnumC10041a;
import xe.C10720e0;
import xe.C10737n;
import xe.M;
import xe.N;
import xe.f1;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final K f3526a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2862e f3527b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<ConnectivityManager> f3528c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private Oc0.a f3529d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Oc0.e> f3530e;

    static final class a extends AbstractC7737t implements Function0<ConnectivityManager> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ConnectivityManager invoke() {
            return (ConnectivityManager) androidx.core.content.a.getSystemService(f.this.f3526a.m(), ConnectivityManager.class);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.di.MobileIdDiModule$initMtsApi$1", f = "MobileIdDiModule.kt", l = {66}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f3532d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f.this.new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f3532d;
            f fVar = f.this;
            if (i11 == 0) {
                s.b(obj);
                EnumC10041a a11 = fVar.f3526a.s().getValue().a(null);
                a11.getClass();
                boolean z11 = a11 == EnumC10041a.Cellular2G || a11 == EnumC10041a.Cellular3G || a11 == EnumC10041a.Cellular4G;
                fVar.f3529d = Oc0.a.a(fVar.f(), z11 ? f.d(fVar, null) : null, false, false, a11, 2);
                if (!z11 && fVar.f().c()) {
                    this.f3532d = 1;
                    obj = f1.c(5000L, new g(fVar, null), this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            Network network = (Network) obj;
            if (network == null) {
                return Unit.f71690a;
            }
            fVar.f3529d = Oc0.a.a(fVar.f(), f.d(fVar, network), false, true, fVar.f3526a.s().getValue().a(network), 2);
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function0<Oc0.e> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Oc0.e invoke() {
            f fVar = f.this;
            return new Oc0.e(fVar.f3526a.N(), fVar.f3526a.M().o(), fVar.f3526a.r());
        }
    }

    public f(@NotNull K di) {
        Intrinsics.checkNotNullParameter(di, "di");
        this.f3526a = di;
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.f3527b = N.a(He.b.f10879b);
        this.f3528c = Sc.k.b(new a());
        this.f3529d = new Oc0.a(0);
        this.f3530e = Sc.k.b(new c());
    }

    public static final void c(f fVar, C10737n c10737n) {
        InterfaceC4008j<ConnectivityManager> interfaceC4008j = fVar.f3528c;
        if (interfaceC4008j.getValue() == null) {
            r.Companion companion = r.INSTANCE;
            c10737n.resumeWith(null);
            return;
        }
        NetworkRequest build = new NetworkRequest.Builder().addTransportType(0).addCapability(12).build();
        i iVar = new i(c10737n);
        ConnectivityManager value = interfaceC4008j.getValue();
        if (value != null) {
            value.requestNetwork(build, iVar);
        }
        c10737n.q(new h(fVar, iVar));
    }

    public static final MtsApi d(f fVar, Network network) {
        fVar.getClass();
        E.a aVar = new E.a();
        if (network != null) {
            SocketFactory socketFactory = network.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getSocketFactory(...)");
            aVar.Z(socketFactory);
        }
        Proxy proxy = Proxy.NO_PROXY;
        aVar.W();
        aVar.a(fVar.f3526a.M().n().getValue());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar.d(90L, timeUnit);
        aVar.X(60L, timeUnit);
        aVar.b0(60L, timeUnit);
        aVar.f(60L, timeUnit);
        Retrofit build = new Retrofit.Builder().baseUrl("http://mobileid").client(new E(aVar)).build();
        Intrinsics.f(build);
        return (MtsApi) build.create(MtsApi.class);
    }

    @NotNull
    public final Oc0.a f() {
        return this.f3529d;
    }

    @NotNull
    public final InterfaceC4008j<Oc0.e> g() {
        return this.f3530e;
    }

    public final void h(boolean z11) {
        this.f3529d = Oc0.a.a(this.f3529d, null, z11, false, null, 13);
        td0.f.b(this.f3527b, null, new b(null));
    }
}
