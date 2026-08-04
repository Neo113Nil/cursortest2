package p127r4;

import W5.AbstractC0486a1;
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
import p063i4.d;
import p155w1.L;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f16034a = new ConcurrentHashMap();

    public static Object a(Object obj) {
        Object objInvoke;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            if ((obj instanceof Float) || (obj instanceof Double)) {
                Number number = (Number) obj;
                double dDoubleValue = number.doubleValue();
                return (dDoubleValue > 9.223372036854776E18d || dDoubleValue < -9.223372036854776E18d || Math.floor(dDoubleValue) != dDoubleValue) ? Double.valueOf(dDoubleValue) : Long.valueOf(number.longValue());
            }
            if ((obj instanceof Long) || (obj instanceof Integer)) {
                return obj;
            }
            throw new d(AbstractC0486a1.h("Numbers of type ", obj.getClass().getSimpleName(), " are not supported, please use an int, long, float or double"));
        }
        if ((obj instanceof String) || (obj instanceof Boolean)) {
            return obj;
        }
        if (obj instanceof Character) {
            throw new d("Characters are not supported, please use Strings");
        }
        if (obj instanceof Map) {
            HashMap map = new HashMap();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (!(key instanceof String)) {
                    throw new d("Maps with non-string keys are not supported");
                }
                map.put((String) key, a(entry.getValue()));
            }
            return map;
        }
        if (obj instanceof Collection) {
            if (!(obj instanceof List)) {
                throw new d("Serializing Collections is not supported, please use Lists instead");
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
            throw new d("Serializing Arrays is not supported, please use Lists instead");
        }
        if (obj instanceof Enum) {
            return ((Enum) obj).name();
        }
        Class<?> cls = obj.getClass();
        ConcurrentHashMap concurrentHashMap = f16034a;
        a aVar = (a) concurrentHashMap.get(cls);
        if (aVar == null) {
            aVar = new a(cls);
            concurrentHashMap.put(cls, aVar);
        }
        Class<?> cls2 = obj.getClass();
        Class cls3 = aVar.f16029a;
        if (!cls3.isAssignableFrom(cls2)) {
            throw new IllegalArgumentException("Can't serialize object of class " + obj.getClass() + " with BeanMapper for class " + cls3);
        }
        HashMap map2 = new HashMap();
        for (String str : aVar.f16030b.values()) {
            HashMap map3 = aVar.f16031c;
            if (map3.containsKey(str)) {
                try {
                    objInvoke = ((Method) map3.get(str)).invoke(obj, null);
                } catch (IllegalAccessException e7) {
                    throw new RuntimeException(e7);
                } catch (InvocationTargetException e8) {
                    throw new RuntimeException(e8);
                }
            } else {
                Field field = (Field) aVar.f16033e.get(str);
                if (field == null) {
                    throw new IllegalStateException(L.i("Bean property without field or getter:", str));
                }
                try {
                    objInvoke = field.get(obj);
                } catch (IllegalAccessException e9) {
                    throw new RuntimeException(e9);
                }
            }
            map2.put(str, a(objInvoke));
        }
        return map2;
    }
}
