package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0728b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f9614a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f9615b;

    public C0728b(HashMap hashMap) {
        this.f9615b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC0739m enumC0739m = (EnumC0739m) entry.getValue();
            List list = (List) this.f9614a.get(enumC0739m);
            if (list == null) {
                list = new ArrayList();
                this.f9614a.put(enumC0739m, list);
            }
            list.add((C0729c) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC0745t interfaceC0745t, EnumC0739m enumC0739m, InterfaceC0744s interfaceC0744s) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0729c c0729c = (C0729c) list.get(size);
                c0729c.getClass();
                try {
                    int i7 = c0729c.f9616a;
                    Method method = c0729c.f9617b;
                    if (i7 == 0) {
                        method.invoke(interfaceC0744s, null);
                    } else if (i7 == 1) {
                        method.invoke(interfaceC0744s, interfaceC0745t);
                    } else if (i7 == 2) {
                        method.invoke(interfaceC0744s, interfaceC0745t, enumC0739m);
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
