package J00;

import A00.a;
import Ae.C;
import Ae.C2380A;
import Ae.C2399j;
import Ae.C2405m;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import H00.b;
import L00.g;
import Sc.r;
import Sc.s;
import a10.C4916d;
import androidx.recyclerview.widget.LinearLayoutManager;
import di0.C6201a;
import di0.C6203c;
import i10.C6996b;
import i10.C6997c;
import i10.h;
import i10.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import k10.EnumC7467b;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;
import n10.InterfaceC8418b;
import org.jetbrains.annotations.NotNull;
import x00.C10622a;
import xe.C10727i;
import z00.C10970a;
import z00.f;

/* loaded from: classes7.dex */
public final class b<I extends C7854a> implements J00.a<I> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final L00.d f13551a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final K00.i<I> f13552b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Collection<QZ.g> f13553c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final A00.b f13554d;

    /* renamed from: e, reason: collision with root package name */
    private final RZ.a f13555e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC8418b f13556f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C10622a f13557g;

    /* renamed from: h, reason: collision with root package name */
    private final E00.a f13558h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final z00.h<I> f13559i;

    /* renamed from: j, reason: collision with root package name */
    private final C00.a f13560j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final I00.a<I> f13561k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final C6996b f13562l;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final L00.g f13563a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final i10.h f13564b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final L00.i f13565c;

        public a(@NotNull i10.h requestState, @NotNull L00.g request, @NotNull L00.i extras) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(requestState, "requestState");
            Intrinsics.checkNotNullParameter(extras, "extras");
            this.f13563a = request;
            this.f13564b = requestState;
            this.f13565c = extras;
        }

        @NotNull
        public final L00.i a() {
            return this.f13565c;
        }

        @NotNull
        public final L00.g b() {
            return this.f13563a;
        }

        @NotNull
        public final i10.h c() {
            return this.f13564b;
        }
    }

    /* renamed from: J00.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C0255b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13566a;

        static {
            int[] iArr = new int[i10.g.values().length];
            try {
                iArr[i10.g.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i10.g.POST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f13566a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.middleware.MiddlewareImpl$execute$1", f = "Middleware.kt", l = {90}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC2397i<? super A00.a>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f13567d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f13568e;

        c() {
            super(2, null);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = new c(2, dVar);
            cVar.f13568e = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC2397i<? super A00.a> interfaceC2397i, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(interfaceC2397i, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f13567d;
            if (i11 == 0) {
                s.b(obj);
                InterfaceC2397i interfaceC2397i = (InterfaceC2397i) this.f13568e;
                a.w wVar = new a.w();
                this.f13567d = 1;
                if (interfaceC2397i.emit(wVar, this) == aVar) {
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

    /* loaded from: classes3.dex */
    static final class d extends AbstractC7737t implements Function0<String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z00.c f13569b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(z00.c cVar) {
            super(0);
            this.f13569b = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "No widgets parsing from ErrorStateModel - " + this.f13569b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull L00.d callFactory, @NotNull K00.i<I> repository, @NotNull Collection<? extends QZ.g> interceptors, @NotNull A00.b eventLoadingCallback, RZ.a aVar, InterfaceC8418b interfaceC8418b, @NotNull C10622a dispatchersProvider, E00.a aVar2, @NotNull z00.h<I> pageIssueFactory, C00.a aVar3, @NotNull I00.a<I> itemMapper, @NotNull C6996b pageNumberHolder) {
        Intrinsics.checkNotNullParameter(callFactory, "callFactory");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(eventLoadingCallback, "eventLoadingCallback");
        Intrinsics.checkNotNullParameter(dispatchersProvider, "dispatchersProvider");
        Intrinsics.checkNotNullParameter(pageIssueFactory, "pageIssueFactory");
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
        Intrinsics.checkNotNullParameter(pageNumberHolder, "pageNumberHolder");
        this.f13551a = callFactory;
        this.f13552b = repository;
        this.f13553c = interceptors;
        this.f13554d = eventLoadingCallback;
        this.f13555e = aVar;
        this.f13556f = interfaceC8418b;
        this.f13557g = dispatchersProvider;
        this.f13558h = aVar2;
        this.f13559i = pageIssueFactory;
        this.f13560j = aVar3;
        this.f13561k = itemMapper;
        this.f13562l = pageNumberHolder;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0182 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0099 -> B:10:0x00a5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(b bVar, a.s sVar, a aVar, int i11, Function1 function1, kotlin.coroutines.jvm.internal.c cVar) {
        f fVar;
        int i12;
        int i13;
        L00.g gVar;
        L00.i iVar;
        ArrayList arrayList;
        a.s sVar2;
        Function1 function12;
        f fVar2;
        a aVar2;
        L00.i iVar2;
        b bVar2 = bVar;
        boolean z11 = true;
        bVar2.getClass();
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f13599m;
            if ((i14 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                fVar.f13599m = i14 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = fVar.f13597k;
                Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
                i12 = fVar.f13599m;
                if (i12 != 0) {
                    s.b(obj);
                    L00.g b11 = aVar.b();
                    L00.i a11 = aVar.a();
                    i13 = i11;
                    ArrayList arrayList2 = new ArrayList(i13);
                    bVar2.f13562l.c();
                    gVar = b11;
                    iVar = a11;
                    arrayList = arrayList2;
                    sVar2 = sVar;
                    function12 = function1;
                    fVar2 = fVar;
                    aVar2 = aVar;
                    if (arrayList.size() < i13) {
                    }
                    P00.k kVar = (P00.k) C7714v.K(arrayList);
                    if (arrayList.size() == 1) {
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i15 = fVar.f13596j;
                    ArrayList arrayList3 = fVar.f13595i;
                    L00.g gVar2 = fVar.f13594h;
                    Function1 function13 = fVar.f13593g;
                    a aVar4 = (a) fVar.f13592f;
                    a.s sVar3 = fVar.f13591e;
                    b bVar3 = fVar.f13590d;
                    s.b(obj);
                    Object obj2 = ((r) obj).getF26106a();
                    int i16 = i15;
                    bVar2 = bVar3;
                    ArrayList arrayList4 = arrayList3;
                    function12 = function13;
                    f fVar3 = fVar;
                    aVar2 = aVar4;
                    r.Companion companion = r.INSTANCE;
                    if (obj2 instanceof r.b) {
                        s.b(obj2);
                        P00.k kVar2 = (P00.k) obj2;
                        arrayList4.add(kVar2);
                        kVar2.f().o(new Integer(bVar2.f13562l.b()));
                        String f7 = kVar2.f().f();
                        if (f7 != null && !((Boolean) function12.invoke(kVar2)).booleanValue()) {
                            sVar3.d().l();
                            iVar2 = L00.i.f16111b;
                            i10.h c11 = aVar2.c();
                            h.c d11 = c11.d();
                            Intrinsics.g(d11, "null cannot be cast to non-null type ru.ozon.composer.state.ComposerRequestState.PageRef.Deeplink");
                            i10.h a12 = i10.h.a(c11, h.c.a.b((h.c.a) d11, null, null, f7, 11), null, null, null, null, 46);
                            gVar2.getClass();
                            g.a aVar5 = new g.a(gVar2);
                            aVar5.g(f7);
                            aVar5.h(a12.i());
                            int i17 = C0255b.f13566a[a12.h().ordinal()];
                            if (i17 == 1) {
                                aVar5.b();
                            } else {
                                if (i17 != 2) {
                                    throw new Sc.o();
                                }
                                aVar5.i();
                            }
                            L00.g a13 = aVar5.a();
                            Iterator<T> it = bVar2.f13553c.iterator();
                            while (it.hasNext()) {
                                a13 = ((QZ.g) it.next()).interceptRequest(a12, a13, iVar2);
                            }
                            a.s sVar4 = sVar3;
                            iVar = iVar2;
                            sVar2 = sVar4;
                            ArrayList arrayList5 = arrayList4;
                            gVar = a13;
                            fVar2 = fVar3;
                            i13 = i16;
                            arrayList = arrayList5;
                            if (arrayList.size() < i13) {
                                fVar2.f13590d = bVar2;
                                fVar2.f13591e = sVar2;
                                fVar2.f13592f = aVar2;
                                fVar2.f13593g = function12;
                                fVar2.f13594h = gVar;
                                fVar2.f13595i = arrayList;
                                fVar2.f13596j = i13;
                                fVar2.f13599m = 1;
                                Object n11 = bVar2.n(sVar2, gVar, iVar, fVar2);
                                if (n11 == aVar3) {
                                    return aVar3;
                                }
                                sVar3 = sVar2;
                                obj2 = n11;
                                int i18 = i13;
                                fVar3 = fVar2;
                                gVar2 = gVar;
                                arrayList4 = arrayList;
                                i16 = i18;
                                r.Companion companion2 = r.INSTANCE;
                                if (obj2 instanceof r.b) {
                                }
                            }
                            P00.k kVar3 = (P00.k) C7714v.K(arrayList);
                            if (arrayList.size() == 1) {
                                return kVar3;
                            }
                            bVar2.getClass();
                            ArrayList W02 = C7714v.W0(kVar3.d());
                            ArrayList W03 = C7714v.W0(kVar3.c());
                            Map<String, String> l11 = kVar3.f().l();
                            LinkedHashMap u11 = l11 != null ? U.u(l11) : null;
                            Map<String, T00.l> m11 = kVar3.f().m();
                            LinkedHashMap u12 = m11 != null ? U.u(m11) : null;
                            LinkedHashMap widgetsAnalyticsState = U.u(kVar3.b().d());
                            LinkedHashMap pageAnalyticsState = U.u(kVar3.b().b());
                            LinkedHashMap trackingTokenAliases = U.u(kVar3.b().c());
                            ArrayList W04 = C7714v.W0(kVar3.e().d());
                            int size = arrayList.size();
                            int i19 = 1;
                            while (i19 < size) {
                                P00.k kVar4 = (P00.k) arrayList.get(i19);
                                List<I> d12 = kVar4.d();
                                boolean z12 = z11;
                                ArrayList arrayList6 = new ArrayList();
                                for (Object obj3 : d12) {
                                    P00.k kVar5 = kVar3;
                                    ArrayList arrayList7 = arrayList;
                                    if (((C7854a) obj3).k() != ru.ozon.composer.ui.widget.c.f94864a) {
                                        arrayList6.add(obj3);
                                    }
                                    kVar3 = kVar5;
                                    arrayList = arrayList7;
                                }
                                W02.addAll(arrayList6);
                                W03.addAll(kVar4.c());
                                widgetsAnalyticsState.putAll(kVar4.b().d());
                                pageAnalyticsState.putAll(kVar4.b().b());
                                trackingTokenAliases.putAll(kVar4.b().c());
                                W04.addAll(kVar4.e().d());
                                i19++;
                                kVar3 = kVar3;
                                z11 = z12;
                            }
                            P00.k kVar6 = kVar3;
                            P00.k kVar7 = (P00.k) C7714v.X(arrayList);
                            L00.j g10 = kVar7.g();
                            T00.a b12 = T00.a.b(kVar7.f(), null, u11, u12, 383);
                            kVar7.b().getClass();
                            Intrinsics.checkNotNullParameter(widgetsAnalyticsState, "widgetsAnalyticsState");
                            Intrinsics.checkNotNullParameter(pageAnalyticsState, "pageAnalyticsState");
                            Intrinsics.checkNotNullParameter(trackingTokenAliases, "trackingTokenAliases");
                            return new P00.k(g10, b12, W02, W03, new P00.a(widgetsAnalyticsState, pageAnalyticsState, trackingTokenAliases), S00.a.b(kVar7.e(), kVar6.e().c(), W04, null, 21));
                        }
                    } else if (arrayList4.isEmpty()) {
                        Throwable b13 = r.b(obj2);
                        Intrinsics.f(b13);
                        throw b13;
                    }
                    arrayList = arrayList4;
                    P00.k kVar32 = (P00.k) C7714v.K(arrayList);
                    if (arrayList.size() == 1) {
                    }
                }
            }
        }
        fVar = new f(bVar2, cVar);
        Object obj4 = fVar.f13597k;
        Wc.a aVar32 = Wc.a.COROUTINE_SUSPENDED;
        i12 = fVar.f13599m;
        if (i12 != 0) {
        }
    }

    public static final void g(b bVar, a.o oVar, L00.i iVar) {
        f.c a11;
        P00.k<I> o11;
        bVar.getClass();
        if ((oVar.g() instanceof a.r) || (a11 = C10970a.a(oVar.f())) == null || (o11 = bVar.o(a11, iVar)) == null) {
            return;
        }
        oVar.h(new a.C2369j<>(o11, a11));
    }

    public static final void h(b bVar, a.p pVar, L00.i iVar, C6997c c6997c) {
        P00.k<I> o11;
        bVar.getClass();
        if ((pVar.f() instanceof C4916d) || (pVar.g() instanceof a.r) || (o11 = bVar.o(bVar.f13559i.createIssue(pVar, c6997c, pVar.f()), iVar)) == null) {
            return;
        }
        pVar.h(new a.C2369j<>(o11));
    }

    public static final void i(b bVar, P00.k kVar, a.InterfaceC0008a interfaceC0008a, C6997c c6997c) {
        Integer num;
        l20.d c11;
        T00.a b11;
        Integer d11;
        List<I> a11;
        bVar.getClass();
        A00.a b12 = interfaceC0008a.b();
        boolean z11 = b12 instanceof a.u;
        C6996b c6996b = bVar.f13562l;
        if (z11) {
            c6996b.c();
        } else if (b12 instanceof a.r.b) {
            k.a<I> e11 = c6997c.e();
            int i11 = 0;
            if (e11 == null || (a11 = e11.a()) == null) {
                num = null;
            } else {
                Iterator<I> it = a11.iterator();
                int i12 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i12 = -1;
                        break;
                    }
                    T00.a b13 = it.next().c().b();
                    if (Intrinsics.d(b13 != null ? b13.c() : null, ((a.r.b) b12).f())) {
                        break;
                    } else {
                        i12++;
                    }
                }
                num = Integer.valueOf(i12);
            }
            C7854a c7854a = num != null ? (C7854a) C7714v.Q(num.intValue() - 1, c6997c.e().a()) : null;
            if (c7854a != null && (c11 = c7854a.c()) != null && (b11 = c11.b()) != null && (d11 = b11.d()) != null) {
                i11 = d11.intValue();
            }
            c6996b.a(i11);
        }
        if (kVar.d().isEmpty()) {
            return;
        }
        kVar.f().o(Integer.valueOf(c6996b.b()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static L00.i j(A00.a aVar) {
        Tc.d builder = new Tc.d();
        if (aVar instanceof a.N) {
            builder.putAll(((a.N) aVar).c());
        }
        builder.put(A00.a.class, aVar);
        Intrinsics.checkNotNullParameter(builder, "builder");
        return new L00.i(builder.u());
    }

    private final a k(A00.a aVar, String str, i10.h hVar, h.c.a aVar2, L00.i iVar, C6997c<I> c6997c) {
        String obj;
        Rg.a a11;
        String f7;
        Collection<QZ.g> collection = this.f13553c;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            hVar = ((QZ.g) it.next()).interceptState(hVar, aVar);
        }
        long b11 = c6997c.k().b();
        g.a aVar3 = new g.a();
        aVar3.g(str);
        aVar3.h(hVar.i());
        RZ.a aVar4 = this.f13555e;
        if (aVar4 != null && !aVar4.e().f()) {
            aVar4.b().c();
            Rg.a a12 = aVar4.b().a();
            String g10 = a12 != null ? a12.g() : null;
            if (g10 != null) {
                aVar3.e("x-page-view-id", g10);
            }
        } else if (aVar instanceof a.u) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            aVar3.e("x-page-view-id", uuid);
        } else {
            T00.e h11 = c6997c.m().h();
            String g11 = h11 != null ? h11.g() : null;
            if (g11 != null) {
                aVar3.e("x-page-view-id", g11);
            }
        }
        if (aVar4 != null) {
            Sg.a b12 = aVar4.b();
            while (true) {
                a11 = b12.a();
                if (a11 == null) {
                    b12 = b12.d();
                    if (b12 == null) {
                        a11 = null;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (a11 == null) {
                a11 = aVar4.c().a();
            }
            if (a11 != null) {
                if (aVar instanceof a.u.C0013a) {
                    f7 = a11.f();
                } else {
                    Rg.a h12 = a11.h();
                    f7 = h12 != null ? h12.f() : null;
                }
                if (f7 != null) {
                    aVar3.e("x-page-previous", f7);
                }
            }
        }
        int i11 = C0255b.f13566a[hVar.h().ordinal()];
        if (i11 == 1) {
            aVar3.b();
        } else {
            if (i11 != 2) {
                throw new Sc.o();
            }
            aVar3.i();
        }
        Object obj2 = aVar2.d().get("redirectKey");
        if (obj2 != null && (obj = obj2.toString()) != null) {
            String str2 = kotlin.text.h.K(obj) ? null : obj;
            if (str2 != null) {
                aVar3.j(str2);
            }
        }
        L00.g a13 = aVar3.a();
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            a13 = ((QZ.g) it2.next()).interceptRequest(hVar, a13, iVar);
        }
        C6201a beginTrace = C6203c.f61631a.beginTrace(a13.k());
        C6201a.f(beginTrace, EnumC7467b.COMPOSER_REQUEST_PREPARE_TIME_START, b11, false, 4);
        C6201a.f(beginTrace, EnumC7467b.TOTAL_TIME_START, b11, false, 4);
        this.f13554d.onLoadStarted(aVar, a13);
        return new a(hVar, a13, iVar);
    }

    private final InterfaceC2395h<A00.a> m(a.InterfaceC0008a<? extends A00.a> interfaceC0008a, L00.i iVar, C6997c<I> c6997c) {
        i10.h a11 = interfaceC0008a.a();
        h.c d11 = a11.d();
        if (d11 instanceof h.c.b) {
            A00.a b11 = interfaceC0008a.b();
            return new C(new g(new C2408n0(C2399j.A(new h(this, (h.c.b) d11, iVar, null)), new i(this, interfaceC0008a, c6997c, null)), this, b11, iVar), new j(this, b11, iVar, c6997c, null));
        }
        if (!(d11 instanceof h.c.a)) {
            throw new Sc.o();
        }
        h.c.a aVar = (h.c.a) d11;
        A00.a b12 = interfaceC0008a.b();
        String c11 = aVar.c();
        return (c11 == null || kotlin.text.h.K(c11)) ? C2399j.t() : C2399j.A(new e(this, interfaceC0008a, k(b12, c11, a11, aVar, iVar, c6997c), iVar, c6997c, b12, c11, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e A[Catch: all -> 0x00cc, Exception -> 0x00d0, CancellationException -> 0x00d3, TryCatch #1 {Exception -> 0x00d0, blocks: (B:14:0x0084, B:16:0x008e, B:17:0x00d7, B:57:0x0074), top: B:56:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f0 A[Catch: all -> 0x0044, TryCatch #3 {all -> 0x0044, blocks: (B:11:0x003d, B:24:0x00e8, B:26:0x00f0, B:27:0x0119), top: B:10:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012b A[Catch: all -> 0x00cc, TryCatch #7 {all -> 0x00cc, blocks: (B:14:0x0084, B:16:0x008e, B:17:0x00d7, B:34:0x0123, B:36:0x012b, B:37:0x0162, B:38:0x016f, B:54:0x0062, B:57:0x0074), top: B:53:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(a.InterfaceC0008a interfaceC0008a, L00.g gVar, L00.i iVar, kotlin.coroutines.jvm.internal.c cVar) {
        J00.c cVar2;
        int i11;
        L00.c a11;
        a.InterfaceC0008a interfaceC0008a2;
        b<I> bVar;
        L00.c cVar3;
        P00.k kVar;
        L00.g gVar2 = gVar;
        try {
            if (cVar instanceof J00.c) {
                cVar2 = (J00.c) cVar;
                int i12 = cVar2.f13576j;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    cVar2.f13576j = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = cVar2.f13574h;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = cVar2.f13576j;
                    if (i11 != 0) {
                        s.b(obj);
                        a11 = this.f13551a.a(gVar2);
                        try {
                            try {
                                He.b a12 = this.f13557g.a();
                                J00.d dVar = new J00.d(this, a11, iVar, null);
                                cVar2.f13570d = this;
                                interfaceC0008a2 = interfaceC0008a;
                                try {
                                    try {
                                        cVar2.f13571e = interfaceC0008a2;
                                        cVar2.f13572f = gVar2;
                                        cVar2.f13573g = a11;
                                        cVar2.f13576j = 1;
                                        obj = C10727i.f(a12, dVar, cVar2);
                                        if (obj == aVar) {
                                            return aVar;
                                        }
                                        bVar = this;
                                    } catch (Exception e11) {
                                        e = e11;
                                        cVar3 = a11;
                                        ru.ozon.android.ozonLogger.core.c cVar4 = ru.ozon.android.ozonLogger.core.c.DEBUG;
                                        if (H00.b.c()) {
                                            H00.b.b().e(cVar4, Thread.currentThread() + ": " + ((Object) ("close fetching " + interfaceC0008a2)), "ComposerStore", null, Boolean.TRUE);
                                        }
                                        r.Companion companion = r.INSTANCE;
                                        r.b a13 = s.a(e);
                                        cVar3.a();
                                        return a13;
                                    }
                                } catch (CancellationException e12) {
                                    e = e12;
                                    bVar = this;
                                    ru.ozon.android.ozonLogger.core.c cVar5 = ru.ozon.android.ozonLogger.core.c.DEBUG;
                                    if (H00.b.c()) {
                                        H00.b.b().e(cVar5, Thread.currentThread() + ": " + ((Object) ("cancel fetching " + a11.c().j() + " " + interfaceC0008a2)), "ComposerStore", null, Boolean.TRUE);
                                    }
                                    bVar.f13554d.onLoadCanceled(interfaceC0008a2.b(), gVar2.k());
                                    throw e;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                cVar3 = a11;
                                cVar3.a();
                                throw th;
                            }
                        } catch (CancellationException e13) {
                            e = e13;
                            interfaceC0008a2 = interfaceC0008a;
                        } catch (Exception e14) {
                            e = e14;
                            interfaceC0008a2 = interfaceC0008a;
                            cVar3 = a11;
                            ru.ozon.android.ozonLogger.core.c cVar42 = ru.ozon.android.ozonLogger.core.c.DEBUG;
                            if (H00.b.c()) {
                            }
                            r.Companion companion2 = r.INSTANCE;
                            r.b a132 = s.a(e);
                            cVar3.a();
                            return a132;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        cVar3 = cVar2.f13573g;
                        L00.g gVar3 = cVar2.f13572f;
                        a.InterfaceC0008a interfaceC0008a3 = cVar2.f13571e;
                        bVar = cVar2.f13570d;
                        try {
                            try {
                                s.b(obj);
                                interfaceC0008a2 = interfaceC0008a3;
                                a11 = cVar3;
                                gVar2 = gVar3;
                            } catch (Throwable th3) {
                                th = th3;
                                cVar3.a();
                                throw th;
                            }
                        } catch (CancellationException e15) {
                            e = e15;
                            interfaceC0008a2 = interfaceC0008a3;
                            a11 = cVar3;
                            gVar2 = gVar3;
                            ru.ozon.android.ozonLogger.core.c cVar52 = ru.ozon.android.ozonLogger.core.c.DEBUG;
                            if (H00.b.c()) {
                            }
                            bVar.f13554d.onLoadCanceled(interfaceC0008a2.b(), gVar2.k());
                            throw e;
                        } catch (Exception e16) {
                            e = e16;
                            interfaceC0008a2 = interfaceC0008a3;
                            ru.ozon.android.ozonLogger.core.c cVar422 = ru.ozon.android.ozonLogger.core.c.DEBUG;
                            if (H00.b.c()) {
                            }
                            r.Companion companion22 = r.INSTANCE;
                            r.b a1322 = s.a(e);
                            cVar3.a();
                            return a1322;
                        }
                    }
                    P00.k kVar2 = (P00.k) obj;
                    ru.ozon.android.ozonLogger.core.c cVar6 = ru.ozon.android.ozonLogger.core.c.DEBUG;
                    if (H00.b.c()) {
                        kVar = kVar2;
                    } else {
                        kVar = kVar2;
                        H00.b.b().e(cVar6, Thread.currentThread() + ": " + ((Object) ("fetch succeed " + kVar2.g().h().j() + " " + interfaceC0008a2)), "ComposerStore", null, Boolean.TRUE);
                    }
                    r.Companion companion3 = r.INSTANCE;
                    a11.a();
                    return kVar;
                }
            }
            P00.k kVar22 = (P00.k) obj;
            ru.ozon.android.ozonLogger.core.c cVar62 = ru.ozon.android.ozonLogger.core.c.DEBUG;
            if (H00.b.c()) {
            }
            r.Companion companion32 = r.INSTANCE;
            a11.a();
            return kVar;
        } catch (CancellationException e17) {
            e = e17;
            ru.ozon.android.ozonLogger.core.c cVar522 = ru.ozon.android.ozonLogger.core.c.DEBUG;
            if (H00.b.c()) {
            }
            bVar.f13554d.onLoadCanceled(interfaceC0008a2.b(), gVar2.k());
            throw e;
        }
        cVar2 = new J00.c(this, cVar);
        Object obj2 = cVar2.f13574h;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = cVar2.f13576j;
        if (i11 != 0) {
        }
    }

    private final P00.k<I> o(z00.f fVar, L00.i iVar) {
        try {
            E00.a aVar = this.f13558h;
            z00.c createErrorState = aVar != null ? aVar.createErrorState(fVar) : null;
            if (createErrorState != null && !createErrorState.a().isEmpty()) {
                P00.k<I> a11 = this.f13552b.a(createErrorState.a(), iVar);
                if (!((ArrayList) a11.d()).isEmpty()) {
                    return a11;
                }
                H00.c.e(new d(createErrorState));
                return null;
            }
            return null;
        } catch (Exception e11) {
            if (H00.b.a() != b.a.C0214a.a()) {
                H00.b.a().logError(e11);
            }
            H00.c.a(e11);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final InterfaceC2395h<A00.a> l(@NotNull A00.a event, @NotNull C6997c<I> state) {
        String b11;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(state, "state");
        if (event instanceof a.u.C0013a) {
            return C2399j.A(new o((a.u.C0013a) event, this, null));
        }
        if (event instanceof a.InterfaceC0008a) {
            if ((event instanceof a.C2373n) || (event instanceof a.q)) {
                a.InterfaceC0008a<? extends A00.a> interfaceC0008a = (a.InterfaceC0008a) event;
                return m(interfaceC0008a, j(interfaceC0008a.b()), state);
            }
            if (!(event instanceof a.s)) {
                if ((event instanceof a.v) && !state.o().f()) {
                    return new C2380A(m((a.InterfaceC0008a) event, j(((a.v) event).d()), state), new c());
                }
                return C2399j.t();
            }
            a.s sVar = (a.s) event;
            L00.i j11 = j(sVar.d());
            a.u.b d11 = sVar.d();
            h.c.a e11 = sVar.e();
            String c11 = e11.c();
            if (c11 == null || kotlin.text.h.K(c11)) {
                return C2399j.t();
            }
            A00.e f7 = sVar.f();
            return new C(new k(C2399j.B(C2399j.A(new l(this, sVar, k(d11, c11, sVar.a(), e11, j11, state), f7, new n(f7, new AtomicBoolean(false)), null)), this.f13557g.a()), this, d11, j11), new m(this, d11, c11, j11, state, null));
        }
        if (event instanceof a.r.C0012a) {
            h.c d12 = state.l().d();
            h.c.a aVar = d12 instanceof h.c.a ? (h.c.a) d12 : null;
            String c12 = aVar != null ? aVar.c() : null;
            return (c12 == null || kotlin.text.h.K(c12) || !state.b(((a.r.C0012a) event).d())) ? C2399j.t() : new C2405m(event);
        }
        if (!(event instanceof a.AbstractC2361b)) {
            if (event instanceof a.C) {
                return new C2405m(((a.C) event).d());
            }
            if (event instanceof A00.e) {
                return i10.d.a(state.e()) ? C2399j.t() : new C2405m(event);
            }
            if (!(event instanceof a.C2368i)) {
                return new C2405m(event);
            }
            C6203c.f61631a.a();
            return new C2405m(event);
        }
        RZ.a aVar2 = this.f13555e;
        if (aVar2 == null) {
            return C2399j.t();
        }
        VZ.c e12 = aVar2.e();
        TZ.a d13 = aVar2.d();
        a.AbstractC2361b abstractC2361b = (a.AbstractC2361b) event;
        if (abstractC2361b instanceof a.E) {
            i10.e d14 = state.o().d();
            if (d14 == null) {
                return C2399j.t();
            }
            e12.e(d14.f(), d14.e(), !(d14.c() instanceof a.u.C0013a));
            e12.a();
            z00.f c13 = state.o().c();
            if (c13 == null) {
                c13 = d14.b();
            }
            if (c13 instanceof f.c) {
                f.c cVar = (f.c) c13;
                if (cVar.d() && (b11 = cVar.b()) != null) {
                    d13.c(cVar.c(), b11);
                }
            }
            InterfaceC8418b interfaceC8418b = this.f13556f;
            if (interfaceC8418b != null) {
                interfaceC8418b.onPageReady(d14.d(), d14.f());
            }
        } else if (abstractC2361b instanceof a.L) {
            e12.b();
        } else if (abstractC2361b instanceof a.B) {
            e12.d();
        } else {
            if (!(abstractC2361b instanceof a.D)) {
                throw new Sc.o();
            }
            a.D d15 = (a.D) event;
            d13.b(d15.e(), d15.d());
        }
        return new C2405m(event);
    }
}
