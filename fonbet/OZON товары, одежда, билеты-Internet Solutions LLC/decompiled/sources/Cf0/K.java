package Cf0;

import Sc.InterfaceC4008j;
import We.E;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf0.AbstractC8919b;
import pf0.AbstractC8922e;
import pf0.EnumC8923f;
import q20.InterfaceC8978a;
import q20.InterfaceC8979b;
import qj.C9067a;
import ru.ozon.app.android.abtool.AbToolBaseApi;
import ru.ozon.app.android.abtool.AbToolNamespace;
import tf0.InterfaceC9871a;
import xb0.InterfaceC10696a;
import xb0.InterfaceC10697b;
import za0.InterfaceC11014a;

/* loaded from: classes7.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2761b f4863a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Ld0.c f4864b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<AbstractC8922e> f4865c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C9067a> f4866d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f4867e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f4868f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f4869g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f4870h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f4871i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f4872j;

    static final class a extends AbstractC7737t implements Function0<AbToolBaseApi> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbToolBaseApi invoke() {
            return (AbToolBaseApi) K.this.f4864b.d(AbToolBaseApi.class);
        }
    }

    static final class b extends AbstractC7737t implements Function0<InterfaceC8979b> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC8979b invoke() {
            return (InterfaceC8979b) K.this.f4864b.e(InterfaceC8978a.class);
        }
    }

    static final class c extends AbstractC7737t implements Function0<InterfaceC11014a> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC11014a invoke() {
            return (InterfaceC11014a) K.this.f4864b.e(InterfaceC11014a.class);
        }
    }

    static final class d extends AbstractC7737t implements Function0<We.E> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final We.E invoke() {
            E.a aVar = new E.a();
            K k11 = K.this;
            k11.getClass();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            aVar.f(0L, timeUnit);
            aVar.X(0L, timeUnit);
            aVar.b0(0L, timeUnit);
            aVar.d(60L, timeUnit);
            aVar.h(K.c(k11).getCookieJar());
            return new We.E(aVar);
        }
    }

    static final class e extends AbstractC7737t implements Function0<InterfaceC10697b> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC10697b invoke() {
            return (InterfaceC10697b) K.this.f4864b.e(InterfaceC10696a.class);
        }
    }

    static final class f extends AbstractC7737t implements Function0<List<? extends AbstractC8922e>> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends AbstractC8922e> invoke() {
            K k11 = K.this;
            List list = k11.f4865c;
            List<Ld0.f> f7 = k11.f4864b.f();
            ArrayList arrayList = new ArrayList();
            for (Object obj : f7) {
                if (obj instanceof AbstractC8922e) {
                    arrayList.add(obj);
                }
            }
            ArrayList p02 = C7714v.p0(arrayList, list);
            C2761b c2761b = k11.f4863a;
            c2761b.getClass();
            return C7714v.p0(C7714v.b0(new C2767h(), new C2768i(), new C2769j(), new C2770k(c2761b), new C2771l(), new C2772m()), p02);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public K(@NotNull C2761b interceptorsProvider, @NotNull Ld0.c store, @NotNull List<? extends AbstractC8922e> hostInterceptors, @NotNull InterfaceC4008j<C9067a> networkInfoProvider) {
        Intrinsics.checkNotNullParameter(interceptorsProvider, "interceptorsProvider");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(hostInterceptors, "hostInterceptors");
        Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        this.f4863a = interceptorsProvider;
        this.f4864b = store;
        this.f4865c = hostInterceptors;
        this.f4866d = networkInfoProvider;
        this.f4867e = Sc.k.b(new f());
        this.f4868f = Sc.k.b(new e());
        this.f4869g = Sc.k.b(new b());
        this.f4870h = Sc.k.b(new c());
        this.f4871i = Sc.k.b(new a());
        this.f4872j = Sc.k.b(new d());
    }

    public static final InterfaceC10697b c(K k11) {
        return (InterfaceC10697b) k11.f4868f.getValue();
    }

    private final void f(We.E e11, pf0.i iVar) {
        if (((InterfaceC8979b) this.f4869g.getValue()).c() == q20.c.PROD_BUILDS_ALL_USERS) {
            return;
        }
        J j11 = pf0.m.f80514a;
        if (j11 == null) {
            throw new RuntimeException("NetworkDi must be initialized.");
        }
        j11.n().b(e11, iVar);
    }

    @NotNull
    public final We.E e(@NotNull pf0.i networkClientConfig) {
        Object obj;
        AbstractC8919b.AbstractC1361b name;
        String a11;
        String string;
        Intrinsics.checkNotNullParameter(networkClientConfig, "networkClientConfig");
        We.E e11 = (We.E) this.f4872j.getValue();
        e11.getClass();
        E.a aVar = new E.a(e11);
        aVar.k(new eg0.d(this.f4866d, networkClientConfig));
        Object obj2 = null;
        boolean z11 = true;
        if (!networkClientConfig.getIsGostTlsEnabled()) {
            if (!(networkClientConfig.getConsumer() instanceof AbstractC8919b.a)) {
                AbstractC8919b consumer = networkClientConfig.getConsumer();
                AbstractC8919b.c cVar = consumer instanceof AbstractC8919b.c ? (AbstractC8919b.c) consumer : null;
                if (cVar != null && (name = cVar.getName()) != null && (a11 = name.a()) != null) {
                    AbToolBaseApi abToolBaseApi = (AbToolBaseApi) this.f4871i.getValue();
                    z11 = Intrinsics.d((abToolBaseApi == null || (string = abToolBaseApi.getString("gost_consumers_enabled", "ozon_network", AbToolNamespace.PLATFORM_MOBILE)) == null) ? null : Boolean.valueOf(kotlin.text.h.t(string, a11, true)), Boolean.TRUE);
                }
            }
            z11 = false;
        }
        Ld0.c cVar2 = this.f4864b;
        if (z11) {
            InterfaceC9871a a12 = C.D.a();
            if (a12 == null) {
                throw new IllegalStateException("Необходимо подключить ozon-network-extensions-gost. См README.md");
            }
            Intrinsics.checkNotNullExpressionValue(cVar2.c().a().getResources(), "getResources(...)");
            a12.init();
            aVar.a0(a12.b(), a12.a());
        }
        Tc.b builder = C7714v.B();
        builder.addAll((List) this.f4867e.getValue());
        builder.addAll(networkClientConfig.getInterceptors());
        C2761b c2761b = this.f4863a;
        c2761b.getClass();
        Intrinsics.checkNotNullParameter(networkClientConfig, "networkClientConfig");
        AbstractC8919b consumer2 = networkClientConfig.getConsumer();
        C2765f c2765f = consumer2 instanceof AbstractC8919b.c ? new C2765f((AbstractC8919b.c) consumer2) : null;
        if (c2765f != null) {
            builder.add(c2765f);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        Tc.b B11 = builder.B();
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = B11.listIterator(0);
        while (listIterator.hasNext()) {
            Object next = listIterator.next();
            if (((AbstractC8922e) next).getType() == EnumC8923f.PerformanceAppInterceptor) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            L.a(aVar.S(), (AbstractC8922e) it.next());
        }
        if (cVar2.c().b() == Nd0.b.DEBUG) {
            L.a(aVar.S(), c2761b.e());
        }
        ArrayList arrayList2 = new ArrayList();
        ListIterator listIterator2 = B11.listIterator(0);
        while (listIterator2.hasNext()) {
            Object next2 = listIterator2.next();
            if (((AbstractC8922e) next2).getType() == EnumC8923f.AppInterceptor) {
                arrayList2.add(next2);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            L.a(aVar.S(), (AbstractC8922e) it2.next());
        }
        ArrayList arrayList3 = new ArrayList();
        ListIterator listIterator3 = B11.listIterator(0);
        while (listIterator3.hasNext()) {
            Object next3 = listIterator3.next();
            if (((AbstractC8922e) next3).getType() == EnumC8923f.NetworkInterceptor) {
                arrayList3.add(next3);
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            L.a(aVar.T(), (AbstractC8922e) it3.next());
        }
        ListIterator listIterator4 = B11.listIterator(0);
        while (true) {
            if (!listIterator4.hasNext()) {
                obj = null;
                break;
            }
            obj = listIterator4.next();
            if (((AbstractC8922e) obj).getType() == EnumC8923f.OzonIdAppInterceptor) {
                break;
            }
        }
        AbstractC8922e abstractC8922e = (AbstractC8922e) obj;
        if (abstractC8922e != null) {
            L.a(aVar.S(), abstractC8922e);
        }
        L.a(aVar.S(), c2761b.b());
        L.a(aVar.T(), c2761b.d());
        ListIterator listIterator5 = B11.listIterator(0);
        while (true) {
            if (!listIterator5.hasNext()) {
                break;
            }
            Object next4 = listIterator5.next();
            if (((AbstractC8922e) next4).getType() == EnumC8923f.OzonIdNetworkInterceptor) {
                obj2 = next4;
                break;
            }
        }
        AbstractC8922e abstractC8922e2 = (AbstractC8922e) obj2;
        if (abstractC8922e2 != null) {
            L.a(aVar.T(), abstractC8922e2);
        }
        ArrayList arrayList4 = new ArrayList();
        ListIterator listIterator6 = B11.listIterator(0);
        while (listIterator6.hasNext()) {
            Object next5 = listIterator6.next();
            if (((AbstractC8922e) next5).getType() == EnumC8923f.PerformanceNetworkInterceptor) {
                arrayList4.add(next5);
            }
        }
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            L.a(aVar.T(), (AbstractC8922e) it4.next());
        }
        if (!networkClientConfig.getIsCronetEnabled()) {
            L.a(aVar.T(), C2761b.c(aVar, false));
        }
        We.E e12 = new We.E(aVar);
        if (!networkClientConfig.getIsCronetEnabled()) {
            f(e12, networkClientConfig);
            return e12;
        }
        int i11 = Df0.i.f6709c;
        We.E b11 = Df0.i.b(e12, c2761b.b().getInterceptor(), ((InterfaceC11014a) this.f4870h.getValue()).a(), cVar2.c().a(), (InterfaceC8979b) this.f4869g.getValue(), networkClientConfig);
        f(b11, networkClientConfig);
        return b11;
    }
}
