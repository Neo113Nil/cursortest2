package Cd;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Cd.q, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C2756q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final LinkedHashMap f4767a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Map<Sd.c, Sd.c> f4768b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f4769c = 0;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f4767a = linkedHashMap;
        c(Sd.i.i(), a("java.util.ArrayList", "java.util.LinkedList"));
        c(Sd.i.k(), a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        c(Sd.i.j(), a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        Sd.c topLevelFqName = new Sd.c("java.util.function.Function");
        Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
        Sd.c e11 = topLevelFqName.e();
        c(new Sd.b(e11, U7.d.a(e11, "parent(...)", topLevelFqName, "shortName(...)")), a("java.util.function.UnaryOperator"));
        Sd.c topLevelFqName2 = new Sd.c("java.util.function.BiFunction");
        Intrinsics.checkNotNullParameter(topLevelFqName2, "topLevelFqName");
        Sd.c e12 = topLevelFqName2.e();
        c(new Sd.b(e12, U7.d.a(e12, "parent(...)", topLevelFqName2, "shortName(...)")), a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new Pair(((Sd.b) entry.getKey()).a(), ((Sd.b) entry.getValue()).a()));
        }
        f4768b = U.s(arrayList);
    }

    private static ArrayList a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            Sd.c topLevelFqName = new Sd.c(str);
            Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
            Sd.c e11 = topLevelFqName.e();
            arrayList.add(new Sd.b(e11, U7.d.a(e11, "parent(...)", topLevelFqName, "shortName(...)")));
        }
        return arrayList;
    }

    public static Sd.c b(@NotNull Sd.c classFqName) {
        Intrinsics.checkNotNullParameter(classFqName, "classFqName");
        return f4768b.get(classFqName);
    }

    private static void c(Sd.b bVar, ArrayList arrayList) {
        for (Object obj : arrayList) {
            f4767a.put(obj, bVar);
        }
    }
}
