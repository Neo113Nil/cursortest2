package p127r4;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Locale;
import p063i4.d;
import p063i4.g;
import p063i4.j;
import p063i4.l;
import p063i4.n;
import p120q4.k;
import p155w1.L;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f16029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f16030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f16031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f16032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f16033e;

    public a(Class cls) {
        this.f16029a = cls;
        cls.isAnnotationPresent(n.class);
        cls.isAnnotationPresent(j.class);
        this.f16030b = new HashMap();
        this.f16032d = new HashMap();
        this.f16031c = new HashMap();
        this.f16033e = new HashMap();
        try {
            cls.getDeclaredConstructor(null).setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        for (Method method : cls.getMethods()) {
            if ((method.getName().startsWith("get") || method.getName().startsWith("is")) && !method.getDeclaringClass().equals(Object.class) && Modifier.isPublic(method.getModifiers()) && !Modifier.isStatic(method.getModifiers()) && !method.getReturnType().equals(Void.TYPE) && method.getParameterTypes().length == 0 && !method.isBridge() && !method.isAnnotationPresent(g.class)) {
                String strD = d(method);
                a(strD);
                method.setAccessible(true);
                if (this.f16031c.containsKey(strD)) {
                    throw new d("Found conflicting getters for name: " + method.getName());
                }
                this.f16031c.put(strD, method);
            }
        }
        for (Field field : cls.getFields()) {
            if (!field.getDeclaringClass().equals(Object.class) && Modifier.isPublic(field.getModifiers()) && !Modifier.isStatic(field.getModifiers()) && !Modifier.isTransient(field.getModifiers()) && !field.isAnnotationPresent(g.class)) {
                String strB = b(field);
                a(strB == null ? field.getName() : strB);
            }
        }
        HashMap map = new HashMap();
        Class superclass = cls;
        do {
            for (Method method2 : superclass.getDeclaredMethods()) {
                if (method2.getName().startsWith("set") && !method2.getDeclaringClass().equals(Object.class) && !Modifier.isStatic(method2.getModifiers()) && method2.getReturnType().equals(Void.TYPE) && method2.getParameterTypes().length == 1 && !method2.isAnnotationPresent(g.class)) {
                    String strD2 = d(method2);
                    String str = (String) this.f16030b.get(strD2.toLowerCase(Locale.US));
                    if (str == null) {
                        continue;
                    } else {
                        if (!str.equals(strD2)) {
                            throw new d("Found setter with invalid case-sensitive name: " + method2.getName());
                        }
                        if (method2.isBridge()) {
                            map.put(strD2, method2);
                        } else {
                            Method method3 = (Method) this.f16032d.get(strD2);
                            Method method4 = (Method) map.get(strD2);
                            if (method3 == null) {
                                method2.setAccessible(true);
                                this.f16032d.put(strD2, method2);
                            } else if (!c(method2, method3) && (method4 == null || !c(method2, method4))) {
                                throw new d("Found a conflicting setters with name: " + method2.getName() + " (conflicts with " + method3.getName() + " defined on " + method3.getDeclaringClass().getName() + ")");
                            }
                        }
                    }
                }
            }
            for (Field field2 : superclass.getDeclaredFields()) {
                String strB2 = b(field2);
                strB2 = strB2 == null ? field2.getName() : strB2;
                if (this.f16030b.containsKey(strB2.toLowerCase(Locale.US)) && !this.f16033e.containsKey(strB2)) {
                    field2.setAccessible(true);
                    this.f16033e.put(strB2, field2);
                }
            }
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                break;
            }
        } while (!superclass.equals(Object.class));
        if (this.f16030b.isEmpty()) {
            throw new d("No properties to serialize found on class ".concat(cls.getName()));
        }
    }

    public static String b(AccessibleObject accessibleObject) {
        if (accessibleObject.isAnnotationPresent(l.class)) {
            return ((l) accessibleObject.getAnnotation(l.class)).value();
        }
        return null;
    }

    public static boolean c(Method method, Method method2) {
        k.b("Expected override from a base class", method.getDeclaringClass().isAssignableFrom(method2.getDeclaringClass()));
        Class<?> returnType = method.getReturnType();
        Class cls = Void.TYPE;
        k.b("Expected void return type", returnType.equals(cls));
        k.b("Expected void return type", method2.getReturnType().equals(cls));
        Class<?>[] parameterTypes = method.getParameterTypes();
        Class<?>[] parameterTypes2 = method2.getParameterTypes();
        k.b("Expected exactly one parameter", parameterTypes.length == 1);
        k.b("Expected exactly one parameter", parameterTypes2.length == 1);
        return method.getName().equals(method2.getName()) && parameterTypes[0].equals(parameterTypes2[0]);
    }

    public static String d(Method method) {
        String strB = b(method);
        if (strB != null) {
            return strB;
        }
        String name = method.getName();
        String[] strArr = {"get", "set", "is"};
        String str = null;
        for (int i7 = 0; i7 < 3; i7++) {
            String str2 = strArr[i7];
            if (name.startsWith(str2)) {
                str = str2;
            }
        }
        if (str == null) {
            throw new IllegalArgumentException(L.i("Unknown Bean prefix for method: ", name));
        }
        char[] charArray = name.substring(str.length()).toCharArray();
        for (int i8 = 0; i8 < charArray.length && Character.isUpperCase(charArray[i8]); i8++) {
            charArray[i8] = Character.toLowerCase(charArray[i8]);
        }
        return new String(charArray);
    }

    public final void a(String str) {
        Locale locale = Locale.US;
        String str2 = (String) this.f16030b.put(str.toLowerCase(locale), str);
        if (str2 == null || str.equals(str2)) {
            return;
        }
        throw new d("Found two getters or fields with conflicting case sensitivity for property: " + str.toLowerCase(locale));
    }
}
