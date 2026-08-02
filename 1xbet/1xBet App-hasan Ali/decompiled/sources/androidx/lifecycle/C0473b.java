package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0473b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f7044a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f7045b;

    public C0473b(HashMap hashMap) {
        this.f7045b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC0486o enumC0486o = (EnumC0486o) entry.getValue();
            List list = (List) this.f7044a.get(enumC0486o);
            if (list == null) {
                list = new ArrayList();
                this.f7044a.put(enumC0486o, list);
            }
            list.add((C0474c) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC0491u interfaceC0491u, EnumC0486o enumC0486o, InterfaceC0490t interfaceC0490t) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0474c c0474c = (C0474c) list.get(size);
                c0474c.getClass();
                try {
                    int i = c0474c.f7046a;
                    Method method = c0474c.f7047b;
                    if (i == 0) {
                        method.invoke(interfaceC0490t, null);
                    } else if (i == 1) {
                        method.invoke(interfaceC0490t, interfaceC0491u);
                    } else if (i == 2) {
                        method.invoke(interfaceC0490t, interfaceC0491u, enumC0486o);
                    }
                } catch (IllegalAccessException e3) {
                    throw new RuntimeException(e3);
                } catch (InvocationTargetException e5) {
                    throw new RuntimeException("Failed to call observer method", e5.getCause());
                }
            }
        }
    }
}
