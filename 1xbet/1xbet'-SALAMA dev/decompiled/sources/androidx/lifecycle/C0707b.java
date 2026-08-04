package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0707b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f9614a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f9615b;

    public C0707b(HashMap map) {
        this.f9615b = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC0718m enumC0718m = (EnumC0718m) entry.getValue();
            List arrayList = (List) this.f9614a.get(enumC0718m);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f9614a.put(enumC0718m, arrayList);
            }
            arrayList.add((C0708c) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC0724t interfaceC0724t, EnumC0718m enumC0718m, InterfaceC0723s interfaceC0723s) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0708c c0708c = (C0708c) list.get(size);
                c0708c.getClass();
                try {
                    int i7 = c0708c.f9616a;
                    Method method = c0708c.f9617b;
                    if (i7 == 0) {
                        method.invoke(interfaceC0723s, null);
                    } else if (i7 == 1) {
                        method.invoke(interfaceC0723s, interfaceC0724t);
                    } else if (i7 == 2) {
                        method.invoke(interfaceC0723s, interfaceC0724t, enumC0718m);
                    }
                } catch (IllegalAccessException e7) {
                    throw new RuntimeException(e7);
                } catch (InvocationTargetException e8) {
                    throw new RuntimeException("Failed to call observer method", e8.getCause());
                }
            }
        }
    }
}
