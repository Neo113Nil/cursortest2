package P00;

import L00.j;
import S00.d;
import T00.e;
import T00.m;
import com.google.protobuf.DescriptorProtos$Edition;
import f10.AbstractC6400a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final j f21459a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final h f21460b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final e f21461c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Jb.j f21462d;

    static final class a extends AbstractC7737t implements Function1<C7854a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ConcurrentHashMap<Long, RZ.c> f21463b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ConcurrentHashMap<Long, RZ.b> f21464c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ RZ.b f21465d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ T00.a f21466e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ConcurrentHashMap<Long, Map<String, String>> f21467f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ConcurrentHashMap<Long, RZ.c> concurrentHashMap, ConcurrentHashMap<Long, RZ.b> concurrentHashMap2, RZ.b bVar, T00.a aVar, ConcurrentHashMap<Long, Map<String, String>> concurrentHashMap3) {
            super(1);
            this.f21463b = concurrentHashMap;
            this.f21464c = concurrentHashMap2;
            this.f21465d = bVar;
            this.f21466e = aVar;
            this.f21467f = concurrentHashMap3;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C7854a c7854a) {
            T00.l lVar;
            C7854a it = c7854a;
            Intrinsics.checkNotNullParameter(it, "it");
            m c11 = it.c().c();
            String j11 = c11.j();
            if (j11 != null && c11.n()) {
                this.f21463b.put(Long.valueOf(it.f()), new RZ.c(j11));
            }
            this.f21464c.put(Long.valueOf(it.f()), this.f21465d);
            Map<String, T00.l> m11 = this.f21466e.m();
            Map<String, String> a11 = (m11 == null || (lVar = m11.get(c11.c())) == null) ? null : lVar.a();
            if (a11 != null) {
                this.f21467f.put(Long.valueOf(it.f()), a11);
            }
            return Unit.f71690a;
        }
    }

    /* loaded from: classes3.dex */
    static final class b extends AbstractC7737t implements Function0<String> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f21468b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Composer got an error trying to map a component";
        }
    }

    public d(@NotNull j parser, @NotNull h mapper, @NotNull e executor, @NotNull Jb.j timeSource) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(timeSource, "timeSource");
        this.f21459a = parser;
        this.f21460b = mapper;
        this.f21461c = executor;
        this.f21462d = timeSource;
    }

    public static T00.d a(d dVar, JSONObject jSONObject, JSONObject jSONObject2, T00.a aVar, AbstractC6400a abstractC6400a, S00.e eVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, RZ.b bVar, ConcurrentHashMap concurrentHashMap3) {
        T00.f f7 = dVar.f21459a.f(jSONObject, jSONObject2, aVar, eVar);
        T00.d e11 = f7 == null ? null : dVar.e(f7, aVar, abstractC6400a, eVar);
        if (e11 == null) {
            return null;
        }
        f(e11.b(), new a(concurrentHashMap, concurrentHashMap2, bVar, aVar, concurrentHashMap3));
        return e11;
    }

    private final <I extends C7854a> T00.d<I> e(T00.f<List<T00.j>> fVar, T00.a aVar, AbstractC6400a<I> abstractC6400a, S00.d dVar) {
        List<I> list;
        List<T00.j> b11 = fVar.b();
        if (b11 == null) {
            return new T00.d<>(K.f71697a, fVar.a());
        }
        ArrayList W02 = C7714v.W0(fVar.a());
        ArrayList arrayList = new ArrayList();
        for (T00.j jVar : b11) {
            try {
                list = this.f21460b.a(jVar, aVar, abstractC6400a, dVar);
            } catch (Exception e11) {
                H00.c.b(e11, b.f21468b);
                W02.add(new R00.d(jVar.e(), l.MAP, e11));
                list = K.f71697a;
            }
            C7714v.p(list, arrayList);
        }
        AbstractC6400a.InterfaceC0987a<? super I> a11 = abstractC6400a.a();
        if (a11 != null) {
            ((ru.ozon.composer.ui.widget.m) a11).b(arrayList);
        }
        return new T00.d<>(arrayList, W02);
    }

    private static void f(List list, Function1 function1) {
        Collection<List<C7854a>> values;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7854a c7854a = (C7854a) it.next();
            ((a) function1).invoke(c7854a);
            Map<String, List<C7854a>> f7 = c7854a.i().f();
            if (f7 != null && (values = f7.values()) != null) {
                Iterator<T> it2 = values.iterator();
                while (it2.hasNext()) {
                    f((List) it2.next(), function1);
                }
            }
        }
    }

    @NotNull
    public final <I extends C7854a> k<I> b(@NotNull L00.j response, @NotNull AbstractC6400a<I> abstractC6400a) {
        T00.e eVar;
        final d dVar = this;
        Intrinsics.checkNotNullParameter(response, "response");
        final AbstractC6400a<I> composerViewItemProcessor = abstractC6400a;
        Intrinsics.checkNotNullParameter(composerViewItemProcessor, "composerViewItemProcessor");
        Jb.j jVar = dVar.f21462d;
        final S00.e eVar2 = new S00.e(jVar);
        long f7 = jVar.f();
        String f11 = response.h().f();
        String a11 = response.a();
        if (a11 == null) {
            a11 = "";
        }
        try {
            final JSONObject jSONObject = new JSONObject(a11);
            JSONArray optJSONArray = jSONObject.optJSONArray("layout");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            U00.d dVar2 = new U00.d(optJSONArray);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            T00.a d11 = dVar.f21459a.d(jSONObject, a11);
            String str = response.c().get("x-page-view-id");
            if (str == null) {
                str = response.h().d().get("x-page-view-id");
            }
            T00.e h11 = d11.h();
            if (h11 != null) {
                eVar = T00.e.a(h11, response.f() == null, f11, str);
            } else {
                eVar = new T00.e((Integer) null, (Integer) null, (Integer) null, f11, (String) null, (String) null, (e.a) null, f11, str, 87);
            }
            final T00.a b11 = T00.a.b(d11, eVar, null, null, 1019);
            final RZ.b g10 = b11.g();
            final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            final ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
            final ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
            ArrayList arrayList3 = new ArrayList(C7714v.z(dVar2, 10));
            Iterator<JSONObject> it = dVar2.iterator();
            while (it.hasNext()) {
                final JSONObject next = it.next();
                ArrayList arrayList4 = arrayList3;
                arrayList4.add(new Callable() { // from class: P00.c
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ConcurrentHashMap concurrentHashMap4 = concurrentHashMap3;
                        return d.a(d.this, next, jSONObject, b11, composerViewItemProcessor, eVar2, concurrentHashMap, concurrentHashMap2, g10, concurrentHashMap4);
                    }
                });
                composerViewItemProcessor = abstractC6400a;
                dVar = dVar;
                arrayList3 = arrayList4;
                concurrentHashMap2 = concurrentHashMap2;
            }
            ConcurrentHashMap concurrentHashMap4 = concurrentHashMap2;
            Iterator it2 = dVar.f21461c.a(arrayList3).iterator();
            while (it2.hasNext()) {
                T00.d dVar3 = (T00.d) it2.next();
                if (dVar3 != null) {
                    arrayList2.addAll(dVar3.b());
                    arrayList.addAll(dVar3.a());
                }
            }
            AbstractC6400a.InterfaceC0987a<? super I> a12 = abstractC6400a.a();
            if (a12 != null) {
                ((ru.ozon.composer.ui.widget.m) a12).a(arrayList2);
            }
            return new k<>(response, b11, arrayList2, arrayList, new P00.a(concurrentHashMap, concurrentHashMap4, concurrentHashMap3), new S00.a(response.h().k(), f7, jVar.f(), eVar2.f(b11.c()), 16));
        } catch (Exception e11) {
            throw new P00.b(response.b(), e11, response.d());
        }
    }

    @NotNull
    public final <I extends C7854a> List<I> c(@NotNull T00.j rawWidget, T00.a aVar, @NotNull AbstractC6400a<I> composerViewItemProcessor) {
        Intrinsics.checkNotNullParameter(rawWidget, "rawWidget");
        Intrinsics.checkNotNullParameter(composerViewItemProcessor, "composerViewItemProcessor");
        return this.f21460b.a(rawWidget, aVar, composerViewItemProcessor, new S00.e(this.f21462d));
    }

    @NotNull
    public final <I extends C7854a> k<I> d(@NotNull List<T00.i> widgets, @NotNull AbstractC6400a<I> composerViewItemProcessor) {
        L00.g gVar;
        T00.a aVar;
        P00.a aVar2;
        S00.a aVar3;
        Intrinsics.checkNotNullParameter(widgets, "widgets");
        Intrinsics.checkNotNullParameter(composerViewItemProcessor, "composerViewItemProcessor");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T00.i iVar : widgets) {
            T00.f e11 = this.f21459a.e(iVar.a(), iVar.b(), d.a.a());
            if (e11 != null) {
                T00.d<I> e12 = e(e11, null, composerViewItemProcessor, d.a.a());
                arrayList.addAll(e12.a());
                arrayList2.addAll(e12.b());
            }
        }
        j.a aVar4 = new j.a();
        aVar4.d(DescriptorProtos$Edition.EDITION_PROTO2_VALUE);
        aVar4.f("Empty response");
        gVar = L00.g.f16089j;
        aVar4.i(gVar);
        aVar4.a(null);
        aVar4.h(new Object());
        L00.j b11 = aVar4.b();
        aVar = T00.a.f26425n;
        aVar2 = P00.a.f21443d;
        aVar3 = S00.a.f25608f;
        return new k<>(b11, aVar, arrayList2, arrayList, aVar2, aVar3);
    }
}
