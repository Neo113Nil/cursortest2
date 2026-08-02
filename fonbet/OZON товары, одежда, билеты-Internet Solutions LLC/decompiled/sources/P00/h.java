package P00;

import T00.m;
import f10.AbstractC6400a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;
import m20.InterfaceC8046a;
import m20.InterfaceC8047b;
import n20.C8426f;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final n20.k<? extends InterfaceC8046a<?, ? extends l20.c>> f21483a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final e f21484b;

    public h(@NotNull n20.k<? extends InterfaceC8046a<?, ? extends l20.c>> widgetStore, @NotNull e executor) {
        Intrinsics.checkNotNullParameter(widgetStore, "widgetStore");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f21483a = widgetStore;
        this.f21484b = executor;
    }

    private final List b(final Object obj, m mVar, final l20.d dVar, final HashMap hashMap, final Map map, final AbstractC6400a abstractC6400a) {
        Collection<C8426f<? extends InterfaceC8046a<?, ? extends l20.c>>> viewMappers = this.f21483a.getViewMappers(mVar.h(), mVar.f());
        if (viewMappers == null || viewMappers.isEmpty()) {
            return K.f71697a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : viewMappers) {
            if (((C8426f) obj2).b().canMap(obj)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final C8426f c8426f = (C8426f) it.next();
            final InterfaceC8046a b11 = c8426f.b();
            arrayList2.add(new Callable() { // from class: P00.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC8046a interfaceC8046a = InterfaceC8046a.this;
                    Intrinsics.g(interfaceC8046a, "null cannot be cast to non-null type ru.ozon.composer.widget.mapper.ViewItemMapper<kotlin.Any, out ru.ozon.composer.widget.item.ViewItem>");
                    int a11 = c8426f.a();
                    this.getClass();
                    l20.d dVar2 = dVar;
                    Object obj3 = obj;
                    List<l20.c> map2 = interfaceC8046a.map(obj3, dVar2);
                    ArrayList arrayList3 = new ArrayList(C7714v.z(map2, 10));
                    for (l20.c cVar : map2) {
                        long id2 = cVar.getId();
                        InterfaceC8047b widgetType = interfaceC8046a.getWidgetType();
                        arrayList3.add(abstractC6400a.d(obj3, new l20.b(id2, cVar, cVar.getViewItemKey(), a11, dVar2, map, hashMap, widgetType)));
                    }
                    return arrayList3;
                }
            });
        }
        return C7714v.N(this.f21484b.a(arrayList2));
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List<I extends l20.a>] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @NotNull
    public final <I extends C7854a> List<I> a(@NotNull T00.j widget, T00.a aVar, @NotNull AbstractC6400a<I> abstractC6400a, @NotNull S00.d dVar) {
        AbstractC6400a<I> abstractC6400a2;
        m mVar;
        l20.d dVar2;
        S00.d dVar3;
        ?? r82;
        AbstractC6400a<I> composerViewItemProcessor = abstractC6400a;
        final S00.d widgetMetricsCollector = dVar;
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(composerViewItemProcessor, "composerViewItemProcessor");
        Intrinsics.checkNotNullParameter(widgetMetricsCollector, "widgetMetricsCollector");
        m a11 = widget.a();
        Object b11 = widget.b();
        Map<String, List<T00.j>> c11 = widget.c();
        Map<String, String> d11 = widget.d();
        if (U4.a.b()) {
            a11.getClass();
        }
        widgetMetricsCollector.b(a11);
        final T00.a aVar2 = aVar;
        l20.d dVar4 = new l20.d(a11, aVar2);
        composerViewItemProcessor.c(dVar4);
        HashMap hashMap = new HashMap();
        if (!c11.isEmpty()) {
            for (Map.Entry<String, List<T00.j>> entry : c11.entrySet()) {
                String key = entry.getKey();
                List<T00.j> value = entry.getValue();
                ArrayList arrayList = new ArrayList(C7714v.z(value, 10));
                for (final T00.j jVar : value) {
                    final AbstractC6400a<I> abstractC6400a3 = composerViewItemProcessor;
                    arrayList.add(new Callable() { // from class: P00.g
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return h.this.a(jVar, aVar2, abstractC6400a3, widgetMetricsCollector);
                        }
                    });
                    aVar2 = aVar;
                    composerViewItemProcessor = abstractC6400a;
                    widgetMetricsCollector = dVar;
                }
                hashMap.put(key, C7714v.N(this.f21484b.a(arrayList)));
                aVar2 = aVar;
                composerViewItemProcessor = abstractC6400a;
                widgetMetricsCollector = dVar;
            }
        }
        h hVar = this;
        if (b11 instanceof List) {
            ArrayList I11 = C7714v.I((Iterable) b11);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = I11.iterator();
            while (it.hasNext()) {
                m mVar2 = a11;
                Map<String, String> map = d11;
                l20.d dVar5 = dVar4;
                HashMap hashMap2 = hashMap;
                C7714v.p(hVar.b(it.next(), mVar2, dVar5, hashMap2, map, abstractC6400a), arrayList2);
                hVar = this;
                a11 = mVar2;
                dVar4 = dVar5;
                hashMap = hashMap2;
                d11 = map;
            }
            mVar = a11;
            dVar3 = dVar;
            abstractC6400a2 = abstractC6400a;
            dVar2 = dVar4;
            r82 = arrayList2;
        } else {
            abstractC6400a2 = abstractC6400a;
            mVar = a11;
            dVar2 = dVar4;
            dVar3 = dVar;
            r82 = (List<I>) hVar.b(b11, mVar, dVar2, hashMap, d11, abstractC6400a2);
        }
        abstractC6400a2.b(dVar2);
        dVar3.d(mVar);
        return (List<I>) r82;
    }
}
