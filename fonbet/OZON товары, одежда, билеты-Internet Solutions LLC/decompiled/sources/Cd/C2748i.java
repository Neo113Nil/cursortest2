package Cd;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qd.s;
import sd.C9661c;

/* renamed from: Cd.i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C2748i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Object f4758a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final LinkedHashMap f4759b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Set<Sd.c> f4760c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final Set<Sd.f> f4761d;

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.util.Map] */
    static {
        Sd.d dVar = s.a.f81910j;
        Sd.c l11 = dVar.c(Sd.f.f(AppMeasurementSdk.ConditionalUserProperty.NAME)).l();
        Intrinsics.checkNotNullExpressionValue(l11, "toSafe(...)");
        Pair pair = new Pair(l11, qd.s.f81857d);
        Sd.c l12 = dVar.c(Sd.f.f("ordinal")).l();
        Intrinsics.checkNotNullExpressionValue(l12, "toSafe(...)");
        Pair pair2 = new Pair(l12, Sd.f.f("ordinal"));
        Pair pair3 = new Pair(C2749j.c(s.a.f81873C, "size"), Sd.f.f("size"));
        Sd.c cVar = s.a.f81877G;
        Pair pair4 = new Pair(C2749j.c(cVar, "size"), Sd.f.f("size"));
        Sd.c l13 = s.a.f81905e.c(Sd.f.f("length")).l();
        Intrinsics.checkNotNullExpressionValue(l13, "toSafe(...)");
        Map j11 = U.j(pair, pair2, pair3, pair4, new Pair(l13, Sd.f.f("length")), new Pair(C2749j.c(cVar, "keys"), Sd.f.f("keySet")), new Pair(C2749j.c(cVar, "values"), Sd.f.f("values")), new Pair(C2749j.c(cVar, "entries"), Sd.f.f("entrySet")));
        f4758a = j11;
        Set<Map.Entry> entrySet = j11.entrySet();
        ArrayList arrayList = new ArrayList(C7714v.z(entrySet, 10));
        for (Map.Entry entry : entrySet) {
            arrayList.add(new Pair(((Sd.c) entry.getKey()).g(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair5 = (Pair) it.next();
            Sd.f fVar = (Sd.f) pair5.f();
            Object obj = linkedHashMap.get(fVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(fVar, obj);
            }
            ((List) obj).add((Sd.f) pair5.e());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(U.h(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), C7714v.C((Iterable) entry2.getValue()));
        }
        f4759b = linkedHashMap2;
        ?? r02 = f4758a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : r02.entrySet()) {
            int i11 = C9661c.f98575o;
            Sd.d j12 = ((Sd.c) entry3.getKey()).e().j();
            Intrinsics.checkNotNullExpressionValue(j12, "toUnsafe(...)");
            Sd.b k11 = C9661c.k(j12);
            Intrinsics.f(k11);
            linkedHashSet.add(k11.a().c((Sd.f) entry3.getValue()));
        }
        Set<Sd.c> keySet = f4758a.keySet();
        f4760c = keySet;
        Set<Sd.c> set = keySet;
        ArrayList arrayList2 = new ArrayList(C7714v.z(set, 10));
        Iterator<T> it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Sd.c) it2.next()).g());
        }
        f4761d = C7714v.Y0(arrayList2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @NotNull
    public static Map a() {
        return f4758a;
    }

    @NotNull
    public static List b(@NotNull Sd.f name1) {
        Intrinsics.checkNotNullParameter(name1, "name1");
        List list = (List) f4759b.get(name1);
        return list == null ? kotlin.collections.K.f71697a : list;
    }

    @NotNull
    public static Set c() {
        return f4760c;
    }

    @NotNull
    public static Set d() {
        return f4761d;
    }
}
