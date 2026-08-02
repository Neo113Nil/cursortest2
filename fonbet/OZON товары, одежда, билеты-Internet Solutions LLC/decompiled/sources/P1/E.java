package P1;

import g.C6594f;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList f21503a;

    public E(@NotNull D... dArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (D d11 : dArr) {
            String a11 = d11.a();
            Object obj = linkedHashMap.get(a11);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(a11, obj);
            }
            ((List) obj).add(d11);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() != 1) {
                throw new IllegalArgumentException(B3.D.c(C6594f.b("'", str, "' must be unique. Actual [ ["), C7714v.V(list, null, null, null, null, 63), ']').toString());
            }
            C7714v.p(list, arrayList);
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f21503a = arrayList2;
        int size = arrayList2.size();
        for (int i11 = 0; i11 < size && !((D) arrayList2.get(i11)).b(); i11++) {
        }
    }

    @NotNull
    public final ArrayList a() {
        return this.f21503a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof E) && Intrinsics.d(this.f21503a, ((E) obj).f21503a);
    }

    public final int hashCode() {
        return this.f21503a.hashCode();
    }
}
