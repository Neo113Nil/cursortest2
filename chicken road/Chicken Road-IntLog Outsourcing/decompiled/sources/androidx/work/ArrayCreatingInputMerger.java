package androidx.work;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.i;
import s0.g;
import s0.j;
import x2.C1545h;

/* loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends j {
    @Override // s0.j
    public final g a(ArrayList arrayList) {
        Object newArray;
        C1545h c1545h = new C1545h(2);
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map unmodifiableMap = Collections.unmodifiableMap(((g) it.next()).f11778a);
            i.d(unmodifiableMap, "input.keyValueMap");
            for (Map.Entry entry : unmodifiableMap.entrySet()) {
                String key = (String) entry.getKey();
                Object value = entry.getValue();
                Class cls = value != null ? value.getClass() : String.class;
                Object obj = hashMap.get(key);
                i.d(key, "key");
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (cls2.equals(cls)) {
                        i.d(value, "value");
                        int length = Array.getLength(obj);
                        int length2 = Array.getLength(value);
                        Class<?> componentType = obj.getClass().getComponentType();
                        i.b(componentType);
                        Object newArray2 = Array.newInstance(componentType, length + length2);
                        System.arraycopy(obj, 0, newArray2, 0, length);
                        System.arraycopy(value, 0, newArray2, length, length2);
                        i.d(newArray2, "newArray");
                        value = newArray2;
                        i.d(value, "if (existingValue == nul…      }\n                }");
                        hashMap.put(key, value);
                    } else {
                        if (!i.a(cls2.getComponentType(), cls)) {
                            throw new IllegalArgumentException();
                        }
                        int length3 = Array.getLength(obj);
                        newArray = Array.newInstance(cls, length3 + 1);
                        System.arraycopy(obj, 0, newArray, 0, length3);
                        Array.set(newArray, length3, value);
                        i.d(newArray, "newArray");
                        value = newArray;
                        i.d(value, "if (existingValue == nul…      }\n                }");
                        hashMap.put(key, value);
                    }
                } else if (cls.isArray()) {
                    i.d(value, "if (existingValue == nul…      }\n                }");
                    hashMap.put(key, value);
                } else {
                    newArray = Array.newInstance(cls, 1);
                    Array.set(newArray, 0, value);
                    i.d(newArray, "newArray");
                    value = newArray;
                    i.d(value, "if (existingValue == nul…      }\n                }");
                    hashMap.put(key, value);
                }
            }
        }
        c1545h.a(hashMap);
        g gVar = new g(c1545h.f12299a);
        g.c(gVar);
        return gVar;
    }
}
