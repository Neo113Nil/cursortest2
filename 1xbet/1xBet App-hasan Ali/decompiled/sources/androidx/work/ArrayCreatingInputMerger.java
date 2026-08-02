package androidx.work;

import A0.J0;
import f2.AbstractC1950h;
import f2.C1948f;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends AbstractC1950h {
    @Override // f2.AbstractC1950h
    public final C1948f a(ArrayList arrayList) {
        Object newInstance;
        Object newInstance2;
        J0 j02 = new J0(27);
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            for (Map.Entry entry : Collections.unmodifiableMap(((C1948f) obj).f16994a).entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                Class<?> cls = value.getClass();
                Object obj2 = hashMap.get(str);
                if (obj2 != null) {
                    Class<?> cls2 = obj2.getClass();
                    if (!cls2.equals(cls)) {
                        if (cls2.isArray() && cls2.getComponentType().equals(cls)) {
                            int length = Array.getLength(obj2);
                            newInstance = Array.newInstance(value.getClass(), length + 1);
                            System.arraycopy(obj2, 0, newInstance, 0, length);
                            Array.set(newInstance, length, value);
                        } else {
                            if (!cls.isArray() || !cls.getComponentType().equals(cls2)) {
                                throw new IllegalArgumentException();
                            }
                            int length2 = Array.getLength(value);
                            newInstance = Array.newInstance(obj2.getClass(), length2 + 1);
                            System.arraycopy(value, 0, newInstance, 0, length2);
                            Array.set(newInstance, length2, obj2);
                        }
                        value = newInstance;
                    } else if (cls2.isArray()) {
                        int length3 = Array.getLength(obj2);
                        int length4 = Array.getLength(value);
                        Object newInstance3 = Array.newInstance(obj2.getClass().getComponentType(), length3 + length4);
                        System.arraycopy(obj2, 0, newInstance3, 0, length3);
                        System.arraycopy(value, 0, newInstance3, length3, length4);
                        value = newInstance3;
                    } else {
                        newInstance2 = Array.newInstance(obj2.getClass(), 2);
                        Array.set(newInstance2, 0, obj2);
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
        j02.w(hashMap);
        C1948f c1948f = new C1948f((HashMap) j02.f304k);
        C1948f.c(c1948f);
        return c1948f;
    }
}
