package r4;

import W5.AbstractC0486a1;
import i4.C1267d;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import w1.L;

/* renamed from: r4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1575b {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f16028a = new ConcurrentHashMap();

    public static Object a(Object obj) {
        Object obj2;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            if ((obj instanceof Float) || (obj instanceof Double)) {
                Number number = (Number) obj;
                double doubleValue = number.doubleValue();
                return (doubleValue > 9.223372036854776E18d || doubleValue < -9.223372036854776E18d || Math.floor(doubleValue) != doubleValue) ? Double.valueOf(doubleValue) : Long.valueOf(number.longValue());
            }
            if ((obj instanceof Long) || (obj instanceof Integer)) {
                return obj;
            }
            throw new C1267d(AbstractC0486a1.h("Numbers of type ", obj.getClass().getSimpleName(), " are not supported, please use an int, long, float or double"));
        }
        if (obj instanceof String) {
            return obj;
        }
        if (obj instanceof Boolean) {
            return obj;
        }
        if (obj instanceof Character) {
            throw new C1267d("Characters are not supported, please use Strings");
        }
        if (obj instanceof Map) {
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (!(key instanceof String)) {
                    throw new C1267d("Maps with non-string keys are not supported");
                }
                hashMap.put((String) key, a(entry.getValue()));
            }
            return hashMap;
        }
        if (obj instanceof Collection) {
            if (!(obj instanceof List)) {
                throw new C1267d("Serializing Collections is not supported, please use Lists instead");
            }
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(a(it.next()));
            }
            return arrayList;
        }
        if (obj.getClass().isArray()) {
            throw new C1267d("Serializing Arrays is not supported, please use Lists instead");
        }
        if (obj instanceof Enum) {
            return ((Enum) obj).name();
        }
        Class<?> cls = obj.getClass();
        ConcurrentHashMap concurrentHashMap = f16028a;
        C1574a c1574a = (C1574a) concurrentHashMap.get(cls);
        if (c1574a == null) {
            c1574a = new C1574a(cls);
            concurrentHashMap.put(cls, c1574a);
        }
        Class<?> cls2 = obj.getClass();
        Class cls3 = c1574a.f16023a;
        if (!cls3.isAssignableFrom(cls2)) {
            throw new IllegalArgumentException("Can't serialize object of class " + obj.getClass() + " with BeanMapper for class " + cls3);
        }
        HashMap hashMap2 = new HashMap();
        for (String str : c1574a.f16024b.values()) {
            HashMap hashMap3 = c1574a.f16025c;
            if (hashMap3.containsKey(str)) {
                try {
                    obj2 = ((Method) hashMap3.get(str)).invoke(obj, null);
                } catch (IllegalAccessException e7) {
                    throw new RuntimeException(e7);
                } catch (InvocationTargetException e8) {
                    throw new RuntimeException(e8);
                }
            } else {
                Field field = (Field) c1574a.f16027e.get(str);
                if (field == null) {
                    throw new IllegalStateException(L.i("Bean property without field or getter:", str));
                }
                try {
                    obj2 = field.get(obj);
                } catch (IllegalAccessException e9) {
                    throw new RuntimeException(e9);
                }
            }
            hashMap2.put(str, a(obj2));
        }
        return hashMap2;
    }
}
