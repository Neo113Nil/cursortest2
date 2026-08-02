package r4;

import i4.C1267d;
import i4.InterfaceC1270g;
import i4.InterfaceC1273j;
import i4.InterfaceC1275l;
import i4.InterfaceC1277n;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Locale;
import q4.k;
import w1.L;

/* renamed from: r4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1574a {

    /* renamed from: a, reason: collision with root package name */
    public final Class f16023a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f16024b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f16025c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f16026d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f16027e;

    public C1574a(Class cls) {
        this.f16023a = cls;
        cls.isAnnotationPresent(InterfaceC1277n.class);
        cls.isAnnotationPresent(InterfaceC1273j.class);
        this.f16024b = new HashMap();
        this.f16026d = new HashMap();
        this.f16025c = new HashMap();
        this.f16027e = new HashMap();
        try {
            cls.getDeclaredConstructor(null).setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        for (Method method : cls.getMethods()) {
            if ((method.getName().startsWith("get") || method.getName().startsWith("is")) && !method.getDeclaringClass().equals(Object.class) && Modifier.isPublic(method.getModifiers()) && !Modifier.isStatic(method.getModifiers()) && !method.getReturnType().equals(Void.TYPE) && method.getParameterTypes().length == 0 && !method.isBridge() && !method.isAnnotationPresent(InterfaceC1270g.class)) {
                String d7 = d(method);
                a(d7);
                method.setAccessible(true);
                if (this.f16025c.containsKey(d7)) {
                    throw new C1267d("Found conflicting getters for name: " + method.getName());
                }
                this.f16025c.put(d7, method);
            }
        }
        for (Field field : cls.getFields()) {
            if (!field.getDeclaringClass().equals(Object.class) && Modifier.isPublic(field.getModifiers()) && !Modifier.isStatic(field.getModifiers()) && !Modifier.isTransient(field.getModifiers()) && !field.isAnnotationPresent(InterfaceC1270g.class)) {
                String b7 = b(field);
                a(b7 == null ? field.getName() : b7);
            }
        }
        HashMap hashMap = new HashMap();
        Class cls2 = cls;
        do {
            for (Method method2 : cls2.getDeclaredMethods()) {
                if (method2.getName().startsWith("set") && !method2.getDeclaringClass().equals(Object.class) && !Modifier.isStatic(method2.getModifiers()) && method2.getReturnType().equals(Void.TYPE) && method2.getParameterTypes().length == 1 && !method2.isAnnotationPresent(InterfaceC1270g.class)) {
                    String d8 = d(method2);
                    String str = (String) this.f16024b.get(d8.toLowerCase(Locale.US));
                    if (str == null) {
                        continue;
                    } else {
                        if (!str.equals(d8)) {
                            throw new C1267d("Found setter with invalid case-sensitive name: " + method2.getName());
                        }
                        if (method2.isBridge()) {
                            hashMap.put(d8, method2);
                        } else {
                            Method method3 = (Method) this.f16026d.get(d8);
                            Method method4 = (Method) hashMap.get(d8);
                            if (method3 == null) {
                                method2.setAccessible(true);
                                this.f16026d.put(d8, method2);
                            } else if (!c(method2, method3) && (method4 == null || !c(method2, method4))) {
                                throw new C1267d("Found a conflicting setters with name: " + method2.getName() + " (conflicts with " + method3.getName() + " defined on " + method3.getDeclaringClass().getName() + ")");
                            }
                        }
                    }
                }
            }
            for (Field field2 : cls2.getDeclaredFields()) {
                String b8 = b(field2);
                b8 = b8 == null ? field2.getName() : b8;
                if (this.f16024b.containsKey(b8.toLowerCase(Locale.US)) && !this.f16027e.containsKey(b8)) {
                    field2.setAccessible(true);
                    this.f16027e.put(b8, field2);
                }
            }
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                break;
            }
        } while (!cls2.equals(Object.class));
        if (this.f16024b.isEmpty()) {
            throw new C1267d("No properties to serialize found on class ".concat(cls.getName()));
        }
    }

    public static String b(AccessibleObject accessibleObject) {
        if (accessibleObject.isAnnotationPresent(InterfaceC1275l.class)) {
            return ((InterfaceC1275l) accessibleObject.getAnnotation(InterfaceC1275l.class)).value();
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
        String b7 = b(method);
        if (b7 != null) {
            return b7;
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
        String str2 = (String) this.f16024b.put(str.toLowerCase(locale), str);
        if (str2 == null || str.equals(str2)) {
            return;
        }
        throw new C1267d("Found two getters or fields with conflicting case sensitivity for property: " + str.toLowerCase(locale));
    }
}
