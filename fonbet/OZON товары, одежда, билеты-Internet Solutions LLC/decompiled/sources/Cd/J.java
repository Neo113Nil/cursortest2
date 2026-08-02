package Cd;

import ie.C7056e;
import ie.InterfaceC7060i;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class J<T> implements H<T> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f4728b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC7060i<Sd.c, T> f4729c;

    public J(@NotNull Map<Sd.c, ? extends T> states) {
        Intrinsics.checkNotNullParameter(states, "states");
        this.f4728b = states;
        InterfaceC7060i<Sd.c, T> j11 = new C7056e("Java nullability annotation states").j(new I(this));
        Intrinsics.checkNotNullExpressionValue(j11, "createMemoizedFunctionWithNullableValues(...)");
        this.f4729c = j11;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Map] */
    static Object a(J j11, Sd.c cVar) {
        T next;
        Intrinsics.f(cVar);
        ?? values = j11.f4728b;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(values, "values");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = values.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Sd.c packageName = (Sd.c) entry.getKey();
            if (!cVar.equals(packageName)) {
                Intrinsics.checkNotNullParameter(cVar, "<this>");
                Intrinsics.checkNotNullParameter(packageName, "packageName");
                Intrinsics.checkNotNullParameter(cVar, "<this>");
                if (Intrinsics.d(cVar.d() ? null : cVar.e(), packageName)) {
                }
            }
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        if (linkedHashMap != null) {
            Iterator<T> it2 = linkedHashMap.entrySet().iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    int length = Sd.e.b((Sd.c) ((Map.Entry) next).getKey(), cVar).b().length();
                    do {
                        T next2 = it2.next();
                        int length2 = Sd.e.b((Sd.c) ((Map.Entry) next2).getKey(), cVar).b().length();
                        if (length > length2) {
                            next = next2;
                            length = length2;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next = null;
            }
            Map.Entry entry2 = (Map.Entry) next;
            if (entry2 != null) {
                return entry2.getValue();
            }
        }
        return null;
    }

    public final T b(@NotNull Sd.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return this.f4729c.invoke(fqName);
    }
}
