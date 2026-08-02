package Fb0;

import Cb0.g;
import De.C2862e;
import Hb0.f;
import Kb0.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import dc0.C6144H;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import jc0.C7339b;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qd0.C9025a;
import ru.ozon.app.android.abtool.AbToolBaseApi;
import ru.ozon.app.android.abtool.AbToolLibsApi;
import ru.ozon.app.android.abtool.AbToolNamespace;
import ru.ozon.id.nativeauth.sso2.Sso2MobileConfigResponseDTO;
import xe.C10720e0;
import xe.C10727i;
import xe.C10754w;
import xe.InterfaceC10750u;
import xe.M;
import xe.N;

/* loaded from: classes7.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C2862e f9289a = N.a(C10720e0.a());

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final InterfaceC10750u<i> f9290b = C10754w.a();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final InterfaceC10750u<g> f9291c = C10754w.a();

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final InterfaceC10750u<Pair<Long, Long>> f9292d = C10754w.a();

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final InterfaceC10750u<Long> f9293e = C10754w.a();

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final InterfaceC10750u<Long> f9294f = C10754w.a();

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f9295g = 0;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.core.OzonIdInitializerKt$launchInitTracking$1", f = "OzonIdInitializer.kt", l = {76, 77, 78, 79, 80}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        Object f9296d;

        /* renamed from: e, reason: collision with root package name */
        Object f9297e;

        /* renamed from: f, reason: collision with root package name */
        long f9298f;

        /* renamed from: g, reason: collision with root package name */
        long f9299g;

        /* renamed from: h, reason: collision with root package name */
        long f9300h;

        /* renamed from: i, reason: collision with root package name */
        int f9301i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ K f9302j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(K k11, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f9302j = k11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f9302j, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x006b, code lost:
        
            if (r14 == r0) goto L34;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            i iVar;
            Object s11;
            g gVar;
            i iVar2;
            long longValue;
            i iVar3;
            long j11;
            long j12;
            g gVar2;
            long j13;
            long j14;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f9301i;
            if (i11 == 0) {
                Sc.s.b(obj);
                InterfaceC10750u interfaceC10750u = o.f9290b;
                this.f9301i = 1;
                obj = interfaceC10750u.s(this);
            } else {
                if (i11 != 1) {
                    if (i11 == 2) {
                        iVar = (i) this.f9296d;
                        Sc.s.b(obj);
                        g gVar3 = (g) obj;
                        InterfaceC10750u<Pair<Long, Long>> h11 = o.h();
                        this.f9296d = iVar;
                        this.f9297e = gVar3;
                        this.f9301i = 3;
                        s11 = h11.s(this);
                        if (s11 != aVar) {
                            i iVar4 = iVar;
                            gVar = gVar3;
                            obj = s11;
                            iVar2 = iVar4;
                            Pair pair = (Pair) obj;
                            longValue = ((Number) pair.a()).longValue();
                            long longValue2 = ((Number) pair.b()).longValue();
                            InterfaceC10750u<Long> j15 = o.j();
                            this.f9296d = iVar2;
                            this.f9297e = gVar;
                            this.f9298f = longValue;
                            this.f9299g = longValue2;
                            this.f9301i = 4;
                            obj = j15.s(this);
                            if (obj != aVar) {
                            }
                        }
                        return aVar;
                    }
                    if (i11 == 3) {
                        gVar = (g) this.f9297e;
                        iVar2 = (i) this.f9296d;
                        Sc.s.b(obj);
                        Pair pair2 = (Pair) obj;
                        longValue = ((Number) pair2.a()).longValue();
                        long longValue22 = ((Number) pair2.b()).longValue();
                        InterfaceC10750u<Long> j152 = o.j();
                        this.f9296d = iVar2;
                        this.f9297e = gVar;
                        this.f9298f = longValue;
                        this.f9299g = longValue22;
                        this.f9301i = 4;
                        obj = j152.s(this);
                        if (obj != aVar) {
                            iVar3 = iVar2;
                            j11 = longValue22;
                            long longValue3 = ((Number) obj).longValue();
                            InterfaceC10750u<Long> i12 = o.i();
                            this.f9296d = iVar3;
                            this.f9297e = gVar;
                            this.f9298f = longValue;
                            this.f9299g = j11;
                            this.f9300h = longValue3;
                            this.f9301i = 5;
                            obj = i12.s(this);
                            if (obj != aVar) {
                            }
                        }
                        return aVar;
                    }
                    if (i11 != 4) {
                        if (i11 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        long j16 = this.f9300h;
                        j12 = this.f9299g;
                        long j17 = this.f9298f;
                        g gVar4 = (g) this.f9297e;
                        iVar3 = (i) this.f9296d;
                        Sc.s.b(obj);
                        j14 = j16;
                        j13 = j17;
                        gVar2 = gVar4;
                        o.a(j13, j12, j14, ((Number) obj).longValue(), gVar2, iVar3, this.f9302j);
                        return Unit.f71690a;
                    }
                    j11 = this.f9299g;
                    longValue = this.f9298f;
                    gVar = (g) this.f9297e;
                    iVar3 = (i) this.f9296d;
                    Sc.s.b(obj);
                    long longValue32 = ((Number) obj).longValue();
                    InterfaceC10750u<Long> i122 = o.i();
                    this.f9296d = iVar3;
                    this.f9297e = gVar;
                    this.f9298f = longValue;
                    this.f9299g = j11;
                    this.f9300h = longValue32;
                    this.f9301i = 5;
                    obj = i122.s(this);
                    if (obj != aVar) {
                        j12 = j11;
                        gVar2 = gVar;
                        j13 = longValue;
                        j14 = longValue32;
                        o.a(j13, j12, j14, ((Number) obj).longValue(), gVar2, iVar3, this.f9302j);
                        return Unit.f71690a;
                    }
                    return aVar;
                }
                Sc.s.b(obj);
            }
            i iVar5 = (i) obj;
            InterfaceC10750u interfaceC10750u2 = o.f9291c;
            this.f9296d = iVar5;
            this.f9301i = 2;
            Object s12 = interfaceC10750u2.s(this);
            if (s12 != aVar) {
                iVar = iVar5;
                obj = s12;
                g gVar32 = (g) obj;
                InterfaceC10750u<Pair<Long, Long>> h112 = o.h();
                this.f9296d = iVar;
                this.f9297e = gVar32;
                this.f9301i = 3;
                s11 = h112.s(this);
                if (s11 != aVar) {
                }
            }
            return aVar;
        }
    }

    public static final void a(long j11, long j12, long j13, long j14, g gVar, i iVar, K k11) {
        td0.f.b(f9289a, null, new j(j13, j11, k11, j12, j14, iVar, gVar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(K k11, kotlin.coroutines.jvm.internal.c cVar) {
        q qVar;
        int i11;
        e eVar;
        K k12;
        Tc.j jVar;
        long j11;
        Sso2MobileConfigResponseDTO sso2MobileConfigResponseDTO;
        Iterator it;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i12 = qVar.f9314i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                qVar.f9314i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = qVar.f9313h;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = qVar.f9314i;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    long currentTimeMillis = System.currentTimeMillis();
                    e primaryDomain = k11.N().getPrimaryDomain();
                    Tc.j c11 = primaryDomain.n() ? C7339b.c() : C7339b.b();
                    hd0.i value = k11.X().f().getValue();
                    qVar.f9309d = k11;
                    qVar.f9310e = primaryDomain;
                    qVar.f9311f = c11;
                    qVar.f9312g = currentTimeMillis;
                    qVar.f9314i = 1;
                    Object f7 = value.f(qVar);
                    if (f7 == aVar) {
                        return aVar;
                    }
                    eVar = primaryDomain;
                    obj = f7;
                    k12 = k11;
                    jVar = c11;
                    j11 = currentTimeMillis;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j11 = qVar.f9312g;
                    jVar = qVar.f9311f;
                    eVar = qVar.f9310e;
                    k12 = qVar.f9309d;
                    Sc.s.b(obj);
                }
                sso2MobileConfigResponseDTO = (Sso2MobileConfigResponseDTO) obj;
                if (sso2MobileConfigResponseDTO != null || (r8 = sso2MobileConfigResponseDTO.getAllDomains()) == null) {
                    Set<String> set = kotlin.collections.M.f71699a;
                }
                LinkedHashSet f11 = e0.f(e0.f(e0.h(eVar.j()), jVar), set);
                ArrayList arrayList = new ArrayList();
                it = f11.iterator();
                while (it.hasNext()) {
                    String a11 = hd0.n.a((String) it.next());
                    URI e11 = a11 != null ? cc0.c.e(a11) : null;
                    if (e11 != null) {
                        arrayList.add(e11);
                    }
                }
                k12.t().e().getValue().g(k12.t().l().getValue().a(), arrayList, false);
                return new Long(System.currentTimeMillis() - j11);
            }
        }
        qVar = new q(cVar);
        Object obj2 = qVar.f9313h;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = qVar.f9314i;
        if (i11 != 0) {
        }
        sso2MobileConfigResponseDTO = (Sso2MobileConfigResponseDTO) obj2;
        if (sso2MobileConfigResponseDTO != null) {
        }
        Set<String> set2 = kotlin.collections.M.f71699a;
        LinkedHashSet f112 = e0.f(e0.f(e0.h(eVar.j()), jVar), set2);
        ArrayList arrayList2 = new ArrayList();
        it = f112.iterator();
        while (it.hasNext()) {
        }
        k12.t().e().getValue().g(k12.t().l().getValue().a(), arrayList2, false);
        return new Long(System.currentTimeMillis() - j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(K k11, kotlin.coroutines.jvm.internal.c cVar) {
        k kVar;
        int i11;
        long currentTimeMillis;
        long j11;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i12 = kVar.f9274f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                kVar.f9274f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = kVar.f9273e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = kVar.f9274f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    currentTimeMillis = System.currentTimeMillis();
                    if (!((Boolean) k11.z().getValue().b(f.o.f10813a)).booleanValue()) {
                        C6144H value = k11.t().j().getValue();
                        kVar.f9272d = currentTimeMillis;
                        kVar.f9274f = 1;
                        if (value.d(kVar) == aVar) {
                            return aVar;
                        }
                        j11 = currentTimeMillis;
                    }
                    return new Long(System.currentTimeMillis() - currentTimeMillis);
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j11 = kVar.f9272d;
                Sc.s.b(obj);
                currentTimeMillis = j11;
                return new Long(System.currentTimeMillis() - currentTimeMillis);
            }
        }
        kVar = new k(cVar);
        Object obj2 = kVar.f9273e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = kVar.f9274f;
        if (i11 != 0) {
        }
        currentTimeMillis = j11;
        return new Long(System.currentTimeMillis() - currentTimeMillis);
    }

    @NotNull
    public static final InterfaceC10750u<Pair<Long, Long>> h() {
        return f9292d;
    }

    @NotNull
    public static final InterfaceC10750u<Long> i() {
        return f9294f;
    }

    @NotNull
    public static final InterfaceC10750u<Long> j() {
        return f9293e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(K k11, kotlin.coroutines.jvm.internal.c cVar) {
        m mVar;
        int i11;
        long j11;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i12 = mVar.f9281g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                mVar.f9281g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = mVar.f9280f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = mVar.f9281g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    long currentTimeMillis = System.currentTimeMillis();
                    n nVar = new n(k11, null);
                    mVar.f9278d = k11;
                    mVar.f9279e = currentTimeMillis;
                    mVar.f9281g = 1;
                    if (N.d(nVar, mVar) == aVar) {
                        return aVar;
                    }
                    j11 = currentTimeMillis;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j11 = mVar.f9279e;
                    k11 = mVar.f9278d;
                    Sc.s.b(obj);
                }
                k11.L().getValue().b(new g.a());
                return new Long(System.currentTimeMillis() - j11);
            }
        }
        mVar = new m(cVar);
        Object obj2 = mVar.f9280f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = mVar.f9281g;
        if (i11 != 0) {
        }
        k11.L().getValue().b(new g.a());
        return new Long(System.currentTimeMillis() - j11);
    }

    public static final void l(@NotNull K k11) {
        Intrinsics.checkNotNullParameter(k11, "<this>");
        Intrinsics.checkNotNullParameter(k11, "<this>");
        Ld0.e d11 = k11.G().d(AbToolBaseApi.class);
        AbToolLibsApi abToolLibsApi = d11 instanceof AbToolLibsApi ? (AbToolLibsApi) d11 : null;
        if (abToolLibsApi == null || !abToolLibsApi.getBoolean(C9025a.a().getName(), C9025a.a().getServiceName(), AbToolNamespace.PLATFORM_MOBILE)) {
            return;
        }
        td0.f.b(f9289a, null, new a(k11, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(@NotNull K k11, long j11, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        p pVar;
        Object obj;
        Wc.a aVar;
        int i11;
        K k12;
        long j12;
        K k13;
        long j13;
        long j14;
        K k14 = k11;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i12 = pVar.f9308i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                pVar.f9308i = i12 - LinearLayoutManager.INVALID_OFFSET;
                obj = pVar.f9307h;
                aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = pVar.f9308i;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    pVar.f9303d = k14;
                    pVar.f9304e = k14;
                    pVar.f9305f = j11;
                    pVar.f9308i = 1;
                    obj = g(k14, pVar);
                    if (obj != aVar) {
                        k12 = k14;
                        j12 = j11;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j15 = pVar.f9306g;
                    long j16 = pVar.f9305f;
                    k14 = pVar.f9304e;
                    k13 = pVar.f9303d;
                    Sc.s.b(obj);
                    j14 = j15;
                    j13 = j16;
                    long longValue = ((Number) obj).longValue();
                    long currentTimeMillis = System.currentTimeMillis();
                    k14.m().registerActivityLifecycleCallbacks(k14.k().getValue());
                    k14.m().registerComponentCallbacks(new l(k14));
                    i iVar = new i(j13, j14, longValue, System.currentTimeMillis() - currentTimeMillis);
                    k14.P().a();
                    r rVar = new r(k14, null);
                    C2862e c2862e = f9289a;
                    C10727i.c(c2862e, null, null, rVar, 3);
                    td0.f.b(c2862e, null, new s(k14, null));
                    f9290b.complete(iVar);
                    return k13;
                }
                j12 = pVar.f9305f;
                k14 = pVar.f9304e;
                k12 = pVar.f9303d;
                Sc.s.b(obj);
                long longValue2 = ((Number) obj).longValue();
                pVar.f9303d = k12;
                pVar.f9304e = k14;
                pVar.f9305f = j12;
                pVar.f9306g = longValue2;
                pVar.f9308i = 2;
                obj = k(k14, pVar);
                if (obj != aVar) {
                    k13 = k12;
                    j13 = j12;
                    j14 = longValue2;
                    long longValue3 = ((Number) obj).longValue();
                    long currentTimeMillis2 = System.currentTimeMillis();
                    k14.m().registerActivityLifecycleCallbacks(k14.k().getValue());
                    k14.m().registerComponentCallbacks(new l(k14));
                    i iVar2 = new i(j13, j14, longValue3, System.currentTimeMillis() - currentTimeMillis2);
                    k14.P().a();
                    r rVar2 = new r(k14, null);
                    C2862e c2862e2 = f9289a;
                    C10727i.c(c2862e2, null, null, rVar2, 3);
                    td0.f.b(c2862e2, null, new s(k14, null));
                    f9290b.complete(iVar2);
                    return k13;
                }
                return aVar;
            }
        }
        pVar = new p(cVar);
        obj = pVar.f9307h;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i11 = pVar.f9308i;
        if (i11 != 0) {
        }
        long longValue22 = ((Number) obj).longValue();
        pVar.f9303d = k12;
        pVar.f9304e = k14;
        pVar.f9305f = j12;
        pVar.f9306g = longValue22;
        pVar.f9308i = 2;
        obj = k(k14, pVar);
        if (obj != aVar) {
        }
        return aVar;
    }
}
