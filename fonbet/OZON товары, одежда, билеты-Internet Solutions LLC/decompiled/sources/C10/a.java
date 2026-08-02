package C10;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.M;
import kotlin.collections.U;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;
import m20.InterfaceC8046a;
import n20.k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.recyclerview.widget.g f4312a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final k<? extends InterfaceC8046a<?, ? extends l20.c>> f4313b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final LinkedHashSet f4314c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f4315d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f4316e;

    public a(@NotNull androidx.recyclerview.widget.g listRv, @NotNull k<? extends InterfaceC8046a<?, ? extends l20.c>> widgetStore) {
        Intrinsics.checkNotNullParameter(listRv, "listRv");
        Intrinsics.checkNotNullParameter(widgetStore, "widgetStore");
        this.f4312a = listRv;
        this.f4313b = widgetStore;
        this.f4314c = new LinkedHashSet();
        this.f4315d = new LinkedHashMap();
        this.f4316e = new LinkedHashMap();
    }

    public final void a(@NotNull ArrayList components) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        int i11;
        int i12;
        List<RecyclerView.n> list;
        Collection collection;
        a aVar = this;
        Intrinsics.checkNotNullParameter(components, "components");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = components.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(Integer.valueOf(((C7854a) it.next()).j()));
        }
        LinkedHashSet linkedHashSet2 = aVar.f4314c;
        Set d11 = e0.d(linkedHashSet2, linkedHashSet);
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        Iterator it2 = d11.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            linkedHashMap = aVar.f4315d;
            linkedHashMap2 = aVar.f4316e;
            i11 = 1;
            if (!hasNext) {
                break;
            }
            Iterator it3 = ((Set) U.e(linkedHashMap2, Integer.valueOf(((Number) it2.next()).intValue()))).iterator();
            while (it3.hasNext()) {
                Object c11 = ((h) it3.next()).c();
                int intValue = ((Number) U.e(linkedHashMap, h.a(c11))).intValue();
                if (intValue == 1) {
                    linkedHashSet3.add(h.a(c11));
                    linkedHashMap.remove(h.a(c11));
                } else {
                    linkedHashMap.put(h.a(c11), Integer.valueOf(intValue - 1));
                }
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        androidx.recyclerview.widget.g gVar = aVar.f4312a;
        int itemDecorationCount = gVar.getItemDecorationCount();
        for (int i13 = 0; i13 < itemDecorationCount; i13++) {
            RecyclerView.n itemDecorationAt = gVar.getItemDecorationAt(i13);
            Intrinsics.checkNotNullExpressionValue(itemDecorationAt, "getItemDecorationAt(...)");
            Object b11 = h.b(itemDecorationAt);
            if (linkedHashSet3.contains(h.a(b11)) && !linkedHashSet4.contains(h.a(b11))) {
                linkedHashMap3.put(h.a(b11), itemDecorationAt);
                linkedHashSet4.add(h.a(b11));
            }
        }
        Set d12 = e0.d(linkedHashSet, linkedHashSet2);
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        Iterator it4 = d12.iterator();
        while (it4.hasNext()) {
            int intValue2 = ((Number) it4.next()).intValue();
            Set set = (Set) linkedHashMap2.get(Integer.valueOf(intValue2));
            k<? extends InterfaceC8046a<?, ? extends l20.c>> kVar = aVar.f4313b;
            if (set != null) {
                i12 = i11;
                LinkedHashSet linkedHashSet6 = new LinkedHashSet();
                Iterator it5 = set.iterator();
                while (it5.hasNext()) {
                    Object c12 = ((h) it5.next()).c();
                    if (linkedHashMap.containsKey(h.a(c12))) {
                        h a11 = h.a(c12);
                        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
                        linkedHashMap.put(h.a(c12), Integer.valueOf(((Number) U.d(linkedHashMap, a11)).intValue() + 1));
                    } else {
                        linkedHashMap.put(h.a(c12), Integer.valueOf(i12));
                        if (linkedHashMap3.containsKey(h.a(c12))) {
                            linkedHashMap3.remove(h.a(c12));
                        } else {
                            linkedHashSet6.add(h.a(c12));
                        }
                    }
                }
                if (!linkedHashSet6.isEmpty()) {
                    InterfaceC8046a<?, ? extends l20.c> viewMapper = kVar.getViewMapper(intValue2);
                    ru.ozon.composer.ui.widget.g gVar2 = (ru.ozon.composer.ui.widget.g) (!(viewMapper instanceof ru.ozon.composer.ui.widget.g) ? null : viewMapper);
                    if (gVar2 != null) {
                        Context context = gVar.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        List<RecyclerView.n> decorators = gVar2.getDecorators(context);
                        if (decorators != null) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : decorators) {
                                if (linkedHashSet6.contains(h.a(h.b((RecyclerView.n) obj)))) {
                                    arrayList.add(obj);
                                }
                            }
                            Iterator it6 = arrayList.iterator();
                            while (it6.hasNext()) {
                                linkedHashSet5.add((RecyclerView.n) it6.next());
                            }
                        }
                    }
                }
            } else {
                i12 = i11;
                InterfaceC8046a<?, ? extends l20.c> viewMapper2 = kVar.getViewMapper(intValue2);
                if (!(viewMapper2 instanceof ru.ozon.composer.ui.widget.g)) {
                    viewMapper2 = null;
                }
                ru.ozon.composer.ui.widget.g gVar3 = (ru.ozon.composer.ui.widget.g) viewMapper2;
                if (gVar3 != null) {
                    Context context2 = gVar.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    list = gVar3.getDecorators(context2);
                } else {
                    list = null;
                }
                Integer valueOf = Integer.valueOf(intValue2);
                if (list != null) {
                    collection = new LinkedHashSet();
                    Iterator<T> it7 = list.iterator();
                    while (it7.hasNext()) {
                        collection.add(h.a(h.b((RecyclerView.n) it7.next())));
                    }
                } else {
                    collection = null;
                }
                if (collection == null) {
                    collection = M.f71699a;
                }
                linkedHashMap2.put(valueOf, collection);
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        Object b12 = h.b((RecyclerView.n) obj2);
                        if (linkedHashMap.containsKey(h.a(b12))) {
                            h a12 = h.a(b12);
                            Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
                            linkedHashMap.put(h.a(b12), Integer.valueOf(((Number) U.d(linkedHashMap, a12)).intValue() + 1));
                        } else if (linkedHashMap3.containsKey(h.a(b12))) {
                            linkedHashMap3.remove(h.a(b12));
                            linkedHashMap.put(h.a(b12), Integer.valueOf(i12));
                        } else {
                            linkedHashMap.put(h.a(b12), Integer.valueOf(i12));
                            arrayList2.add(obj2);
                        }
                    }
                    Iterator it8 = arrayList2.iterator();
                    while (it8.hasNext()) {
                        linkedHashSet5.add((RecyclerView.n) it8.next());
                    }
                }
            }
            aVar = this;
            i11 = i12;
        }
        gVar.e(linkedHashSet5, linkedHashMap3.values());
        linkedHashSet2.clear();
        linkedHashSet2.addAll(linkedHashSet);
    }
}
