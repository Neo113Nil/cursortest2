package Za0;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.M0;
import Am.C2438a;
import B0.A0;
import Sc.s;
import ab0.C4991a;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import cb0.C5797a;
import db0.InterfaceC6135a;
import eb0.C6340a;
import eb0.f;
import fb0.C6494c;
import fb0.C6495d;
import fb0.InterfaceC6492a;
import hb0.C6908d;
import hb0.InterfaceC6906b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e extends w0 {

    /* renamed from: l, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f35756l = {C2438a.c(e.class, "uiStateStore", "getUiStateStore()Lru/ozon/host/config/debug/menu/presentation/state/utils/UIStateStore;", 0), C2438a.c(e.class, "changeEnvThrottle", "getChangeEnvThrottle()Lru/ozon/host/config/debug/menu/utils/ThrottleJob;", 0), C2438a.c(e.class, "resetToDefaultThrottle", "getResetToDefaultThrottle()Lru/ozon/host/config/debug/menu/utils/ThrottleJob;", 0)};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ka0.a f35757a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Oa0.a f35758b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Oa0.c f35759c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Oa0.e f35760d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Oa0.d f35761e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C6494c f35762f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final M0<InterfaceC6135a> f35763g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final C6908d f35764h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C6908d f35765i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final c f35766j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final d f35767k;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.host.config.debug.menu.presentation.screen.main.MainScreenViewModel$1", f = "MainScreenViewModel.kt", l = {69}, m = "invokeSuspend")
    static final class a extends j implements Function2<List<? extends Ma0.a>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        List f35768d;

        /* renamed from: e, reason: collision with root package name */
        ArrayList f35769e;

        /* renamed from: f, reason: collision with root package name */
        eb0.c f35770f;

        /* renamed from: g, reason: collision with root package name */
        eb0.g f35771g;

        /* renamed from: h, reason: collision with root package name */
        int f35772h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f35773i;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Ta0.a f35775k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Ta0.a aVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f35775k = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = e.this.new a(this.f35775k, dVar);
            aVar.f35773i = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(List<? extends Ma0.a> list, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(list, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            eb0.c cVar;
            Object a11;
            eb0.c cVar2;
            InterfaceC6492a interfaceC6492a;
            ArrayList arrayList;
            List<eb0.d> list;
            eb0.g gVar;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f35772h;
            if (i11 == 0) {
                s.b(obj);
                List list2 = (List) this.f35773i;
                e eVar = e.this;
                if (eVar.f35759c.invoke()) {
                    c onClick = eVar.f35766j;
                    Intrinsics.checkNotNullParameter(onClick, "onClick");
                    eb0.c cVar3 = new eb0.c();
                    cVar3.b(onClick);
                    cVar = cVar3;
                } else {
                    cVar = null;
                }
                InterfaceC6492a j02 = e.j0(eVar);
                List<eb0.d> b11 = C4991a.b(this.f35775k.invoke());
                List list3 = list2;
                ArrayList arrayList2 = new ArrayList(C7714v.z(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    Ma0.a aVar2 = (Ma0.a) it.next();
                    Intrinsics.checkNotNullParameter(aVar2, "<this>");
                    arrayList2.add(new C6340a(aVar2.a(), aVar2.c(), aVar2.d(), aVar2.b(), new C6340a.C0976a(A0.b("HostConfig.", aVar2.a(), "Env"), A0.b("HostConfig.", aVar2.a(), "Env.Value"), A0.b("HostConfig.", aVar2.a(), "Env.Icon"))));
                    it = it;
                    eVar = eVar;
                    b11 = b11;
                }
                e eVar2 = eVar;
                List<eb0.d> list4 = b11;
                d onClick2 = eVar2.f35767k;
                Intrinsics.checkNotNullParameter(onClick2, "onClick");
                eb0.g gVar2 = new eb0.g(new eb0.f(new f.a()));
                gVar2.c(onClick2);
                Oa0.d dVar = eVar2.f35761e;
                this.f35773i = j02;
                this.f35768d = list4;
                this.f35769e = arrayList2;
                this.f35770f = cVar;
                this.f35771g = gVar2;
                this.f35772h = 1;
                a11 = dVar.a(this);
                if (a11 == aVar) {
                    return aVar;
                }
                cVar2 = cVar;
                interfaceC6492a = j02;
                arrayList = arrayList2;
                list = list4;
                gVar = gVar2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eb0.g gVar3 = this.f35771g;
                eb0.c cVar4 = this.f35770f;
                ArrayList arrayList3 = this.f35769e;
                list = this.f35768d;
                InterfaceC6492a interfaceC6492a2 = (InterfaceC6492a) this.f35773i;
                s.b(obj);
                gVar = gVar3;
                cVar2 = cVar4;
                interfaceC6492a = interfaceC6492a2;
                a11 = obj;
                arrayList = arrayList3;
            }
            interfaceC6492a.a(new InterfaceC6135a.C0956a(list, arrayList, cVar2, gVar, ((Boolean) a11).booleanValue()));
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.host.config.debug.menu.presentation.screen.main.MainScreenViewModel$onResetConfigClick$1$1", f = "MainScreenViewModel.kt", l = {48}, m = "invokeSuspend")
    static final class b extends j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f35776d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return e.this.new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f35776d;
            if (i11 == 0) {
                s.b(obj);
                Oa0.e eVar = e.this.f35760d;
                this.f35776d = 1;
                if (eVar.a(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [Za0.c] */
    /* JADX WARN: Type inference failed for: r4v9, types: [Za0.d] */
    public e(@NotNull Ta0.a getHostAppInfo, @NotNull Oa0.b getHostAppEnvironments, @NotNull Ka0.a reloadApp, @NotNull Oa0.a changeHostAppEnvironment, @NotNull Oa0.c isChangedEnvironment, @NotNull Oa0.e resetEnvironmentToDefault, @NotNull Oa0.d isNetworkProdUseCase) {
        Intrinsics.checkNotNullParameter(getHostAppInfo, "getHostAppInfo");
        Intrinsics.checkNotNullParameter(getHostAppEnvironments, "getHostAppEnvironments");
        Intrinsics.checkNotNullParameter(reloadApp, "reloadApp");
        Intrinsics.checkNotNullParameter(changeHostAppEnvironment, "changeHostAppEnvironment");
        Intrinsics.checkNotNullParameter(isChangedEnvironment, "isChangedEnvironment");
        Intrinsics.checkNotNullParameter(resetEnvironmentToDefault, "resetEnvironmentToDefault");
        Intrinsics.checkNotNullParameter(isNetworkProdUseCase, "isNetworkProdUseCase");
        this.f35757a = reloadApp;
        this.f35758b = changeHostAppEnvironment;
        this.f35759c = isChangedEnvironment;
        this.f35760d = resetEnvironmentToDefault;
        this.f35761e = isNetworkProdUseCase;
        C6494c a11 = C6495d.a(InterfaceC6135a.b.f61453a);
        this.f35762f = a11;
        this.f35763g = ((InterfaceC6492a) a11.getValue(this, f35756l[0])).getState();
        this.f35764h = new C6908d();
        this.f35765i = new C6908d();
        this.f35766j = new eb0.e() { // from class: Za0.c
            @Override // eb0.e
            public final void a() {
                e.e0(e.this);
            }
        };
        this.f35767k = new eb0.e() { // from class: Za0.d
            @Override // eb0.e
            public final void a() {
                e.d0(e.this);
            }
        };
        C2399j.C(new C2408n0(getHostAppEnvironments.invoke(), new a(getHostAppInfo, null)), x0.a(this));
    }

    public static void d0(e eVar) {
        ((InterfaceC6906b) eVar.f35765i.getValue(eVar, f35756l[2])).a(eVar.new b(null));
    }

    public static void e0(e eVar) {
        eVar.f35757a.invoke();
    }

    public static final InterfaceC6492a j0(e eVar) {
        eVar.getClass();
        return (InterfaceC6492a) eVar.f35762f.getValue(eVar, f35756l[0]);
    }

    @NotNull
    public final M0<InterfaceC6135a> getState() {
        return this.f35763g;
    }

    public final void m0(@NotNull C5797a intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        ((InterfaceC6906b) this.f35764h.getValue(this, f35756l[1])).a(new f(this, intent, null));
    }
}
