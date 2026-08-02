package androidx.work;

import d1.AbstractC0956i;
import d1.C0953f;
import d1.C0954g;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends AbstractC0956i {
    @Override // d1.AbstractC0956i
    public final C0954g a(ArrayList arrayList) {
        Object newInstance;
        Object newInstance2;
        C0953f c0953f = new C0953f();
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : Collections.unmodifiableMap(((C0954g) it.next()).f12357a).entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                Class<?> cls = value.getClass();
                Object obj = hashMap.get(str);
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (!cls2.equals(cls)) {
                        if (cls2.isArray() && cls2.getComponentType().equals(cls)) {
                            int length = Array.getLength(obj);
                            newInstance = Array.newInstance(value.getClass(), length + 1);
                            System.arraycopy(obj, 0, newInstance, 0, length);
                            Array.set(newInstance, length, value);
                        } else {
                            if (!cls.isArray() || !cls.getComponentType().equals(cls2)) {
                                throw new IllegalArgumentException();
                            }
                            int length2 = Array.getLength(value);
                            newInstance = Array.newInstance(obj.getClass(), length2 + 1);
                            System.arraycopy(value, 0, newInstance, 0, length2);
                            Array.set(newInstance, length2, obj);
                        }
                        value = newInstance;
                    } else if (cls2.isArray()) {
                        int length3 = Array.getLength(obj);
                        int length4 = Array.getLength(value);
                        Object newInstance3 = Array.newInstance(obj.getClass().getComponentType(), length3 + length4);
                        System.arraycopy(obj, 0, newInstance3, 0, length3);
                        System.arraycopy(value, 0, newInstance3, length3, length4);
                        value = newInstance3;
                    } else {
                        newInstance2 = Array.newInstance(obj.getClass(), 2);
                        Array.set(newInstance2, 0, obj);
                        Array.set(newInstance2, 1, value);
                        value = newInstance2;
                    }
                    hashMap.put(str, value);
                } else if (cls.isArray()) {
                    hashMap.put(str, value);
                } else {
                    newInstance2 = Array.newInstance(value.getClass(), 1);
                    Array.set(newInstance2, 0, value);
                    value = newInstance2;
                    hashMap.put(str, value);
                }
            }
        }
        c0953f.b(hashMap);
        C0954g c0954g = new C0954g(c0953f.f12354a);
        C0954g.c(c0954g);
        return c0954g;
    }
}
