package L4;

import B4.AbstractC0080y;
import B4.C0063g;
import B4.C0070n;
import B4.M;
import B4.j0;
import W5.AbstractC0486a1;
import android.net.Uri;
import com.google.firebase.Timestamp;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import w1.L;

/* loaded from: classes2.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f4375a = new ConcurrentHashMap();

    public static void a(String str, boolean z4) {
        if (!z4) {
            throw new RuntimeException("Hard assert failed: ".concat(str));
        }
    }

    public static Object b(Object obj, j jVar) {
        Object obj2;
        int i7 = jVar.f4372a;
        if (i7 > 500) {
            throw c(jVar, "Exceeded maximum depth of 500, which likely indicates there's an object cycle");
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            if ((obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Double) || (obj instanceof Float)) {
                return obj;
            }
            throw c(jVar, "Numbers of type " + obj.getClass().getSimpleName() + " are not supported, please use an int, long, float or double");
        }
        if (obj instanceof String) {
            return obj;
        }
        if (obj instanceof Boolean) {
            return obj;
        }
        if (obj instanceof Character) {
            throw c(jVar, "Characters are not supported, please use Strings");
        }
        if (obj instanceof Map) {
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (!(key instanceof String)) {
                    throw c(jVar, "Maps with non-string keys are not supported");
                }
                String str = (String) key;
                hashMap.put(str, b(entry.getValue(), new j(jVar, str, i7 + 1)));
            }
            return hashMap;
        }
        if (obj instanceof Collection) {
            if (!(obj instanceof List)) {
                throw c(jVar, "Serializing Collections is not supported, please use Lists instead");
            }
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            for (int i8 = 0; i8 < list.size(); i8++) {
                arrayList.add(b(list.get(i8), new j(jVar, AbstractC0486a1.f(i8, "[", "]"), i7 + 1)));
            }
            return arrayList;
        }
        if (obj.getClass().isArray()) {
            throw c(jVar, "Serializing Arrays is not supported, please use Lists instead");
        }
        if (obj instanceof Enum) {
            String name = ((Enum) obj).name();
            try {
                Field field = obj.getClass().getField(name);
                String b7 = i.b(field);
                return b7 != null ? b7 : field.getName();
            } catch (NoSuchFieldException unused) {
                return name;
            }
        }
        if ((obj instanceof Date) || (obj instanceof Timestamp) || (obj instanceof M) || (obj instanceof C0063g) || (obj instanceof C0070n) || (obj instanceof AbstractC0080y) || (obj instanceof j0)) {
            return obj;
        }
        if ((obj instanceof Uri) || (obj instanceof URI) || (obj instanceof URL)) {
            return obj.toString();
        }
        Class<?> cls = obj.getClass();
        ConcurrentHashMap concurrentHashMap = f4375a;
        i iVar = (i) concurrentHashMap.get(cls);
        if (iVar == null) {
            iVar = new i(cls);
            concurrentHashMap.put(cls, iVar);
        }
        Class<?> cls2 = obj.getClass();
        Class cls3 = iVar.f4364a;
        if (!cls3.isAssignableFrom(cls2)) {
            throw new IllegalArgumentException("Can't serialize object of class " + obj.getClass() + " with BeanMapper for class " + cls3);
        }
        HashMap hashMap2 = new HashMap();
        for (String str2 : iVar.f4365b.values()) {
            if (!iVar.f4370g.contains(str2)) {
                HashMap hashMap3 = iVar.f4366c;
                if (hashMap3.containsKey(str2)) {
                    try {
                        obj2 = ((Method) hashMap3.get(str2)).invoke(obj, null);
                    } catch (IllegalAccessException e7) {
                        throw new RuntimeException(e7);
                    } catch (InvocationTargetException e8) {
                        throw new RuntimeException(e8);
                    }
                } else {
                    Field field2 = (Field) iVar.f4368e.get(str2);
                    if (field2 == null) {
                        throw new IllegalStateException(L.i("Bean property without field or getter: ", str2));
                    }
                    try {
                        obj2 = field2.get(obj);
                    } catch (IllegalAccessException e9) {
                        throw new RuntimeException(e9);
                    }
                }
                hashMap2.put(str2, (iVar.f4369f.contains(str2) && obj2 == null) ? AbstractC0080y.f1197b : b(obj2, new j(jVar, str2, i7 + 1)));
            }
        }
        return hashMap2;
    }

    public static IllegalArgumentException c(j jVar, String str) {
        String concat = "Could not serialize object. ".concat(str);
        if (jVar.f4372a > 0) {
            StringBuilder d7 = t.e.d(concat, " (found in field '");
            d7.append(jVar.toString());
            d7.append("')");
            concat = d7.toString();
        }
        return new IllegalArgumentException(concat);
    }
}
