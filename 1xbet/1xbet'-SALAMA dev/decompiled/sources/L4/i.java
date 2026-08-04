package L4;

import B4.C0070n;
import B4.InterfaceC0066j;
import B4.N;
import B4.X;
import B4.d0;
import B4.g0;
import com.google.firebase.Timestamp;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import p155w1.L;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f4364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f4365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f4366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f4367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f4368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f4369f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f4370g;

    public i(Class cls) {
        HashMap map;
        Class superclass;
        HashMap map2;
        Method[] methodArr;
        this.f4364a = cls;
        cls.isAnnotationPresent(g0.class);
        cls.isAnnotationPresent(N.class);
        this.f4365b = new HashMap();
        this.f4367d = new HashMap();
        this.f4366c = new HashMap();
        this.f4368e = new HashMap();
        this.f4369f = new HashSet();
        this.f4370g = new HashSet();
        try {
            cls.getDeclaredConstructor(null).setAccessible(true);
            while (true) {
                Method[] declaredMethods = superclass.getDeclaredMethods();
                int length = declaredMethods.length;
                int i7 = 0;
                while (i7 < length) {
                    Method method = declaredMethods[i7];
                    if (method.getName().startsWith("set") && !method.getDeclaringClass().equals(Object.class) && !Modifier.isStatic(method.getModifiers()) && method.getReturnType().equals(Void.TYPE) && method.getParameterTypes().length == 1 && !method.isAnnotationPresent(B4.r.class)) {
                        String strF = f(method);
                        methodArr = declaredMethods;
                        String str = (String) this.f4365b.get(strF.toLowerCase(Locale.US));
                        if (str == null) {
                            map2 = map;
                        } else {
                            if (!str.equals(strF)) {
                                throw new RuntimeException("Found setter on " + superclass.getName() + " with invalid case-sensitive name: " + method.getName());
                            }
                            if (method.isBridge()) {
                                map.put(strF, method);
                                map2 = map;
                            } else {
                                Method method2 = (Method) this.f4367d.get(strF);
                                Method method3 = (Method) map.get(strF);
                                if (method2 == null) {
                                    map2 = map;
                                    method.setAccessible(true);
                                    this.f4367d.put(strF, method);
                                    if (method.isAnnotationPresent(d0.class)) {
                                        throw new IllegalArgumentException("Method " + method.getName() + " is annotated with @ServerTimestamp but should not be. @ServerTimestamp can only be applied to fields and getters, not setters.");
                                    }
                                    if (method.isAnnotationPresent(InterfaceC0066j.class)) {
                                        d("Method", "accepts", method.getParameterTypes()[0]);
                                        this.f4370g.add(f(method));
                                    }
                                } else {
                                    map2 = map;
                                    if (!e(method, method2) && (method3 == null || !e(method, method3))) {
                                        if (superclass == cls) {
                                            throw new RuntimeException("Class " + cls.getName() + " has multiple setter overloads with name " + method.getName());
                                        }
                                        throw new RuntimeException("Found conflicting setters with name: " + method.getName() + " (conflicts with " + method2.getName() + " defined on " + method2.getDeclaringClass().getName() + ")");
                                    }
                                }
                            }
                        }
                        i7++;
                        declaredMethods = methodArr;
                        map = map2;
                    } else {
                        map2 = map;
                        methodArr = declaredMethods;
                    }
                    i7++;
                    declaredMethods = methodArr;
                    map = map2;
                }
                HashMap map3 = map;
                for (Field field : superclass.getDeclaredFields()) {
                    String strB = b(field);
                    strB = strB == null ? field.getName() : strB;
                    if (this.f4365b.containsKey(strB.toLowerCase(Locale.US)) && !this.f4368e.containsKey(strB)) {
                        field.setAccessible(true);
                        this.f4368e.put(strB, field);
                        c(field);
                    }
                }
                superclass = superclass.getSuperclass();
                if (superclass == null || superclass.equals(Object.class)) {
                    break;
                } else {
                    map = map3;
                }
            }
        } catch (NoSuchMethodException unused) {
        }
        for (Method method4 : cls.getMethods()) {
            if ((method4.getName().startsWith("get") || method4.getName().startsWith("is")) && !method4.getDeclaringClass().equals(Object.class) && Modifier.isPublic(method4.getModifiers()) && !Modifier.isStatic(method4.getModifiers()) && !method4.getReturnType().equals(Void.TYPE) && method4.getParameterTypes().length == 0 && !method4.isBridge() && !method4.isAnnotationPresent(B4.r.class)) {
                String strF2 = f(method4);
                a(strF2);
                method4.setAccessible(true);
                if (this.f4366c.containsKey(strF2)) {
                    throw new RuntimeException("Found conflicting getters for name " + method4.getName() + " on class " + cls.getName());
                }
                this.f4366c.put(strF2, method4);
                if (method4.isAnnotationPresent(d0.class)) {
                    Class<?> returnType = method4.getReturnType();
                    if (returnType != Date.class && returnType != Timestamp.class) {
                        throw new IllegalArgumentException("Method " + method4.getName() + " is annotated with @ServerTimestamp but returns " + returnType + " instead of Date or Timestamp.");
                    }
                    this.f4369f.add(f(method4));
                }
                if (method4.isAnnotationPresent(InterfaceC0066j.class)) {
                    d("Method", "returns", method4.getReturnType());
                    this.f4370g.add(f(method4));
                }
            }
        }
        for (Field field2 : cls.getFields()) {
            if (!field2.getDeclaringClass().equals(Object.class) && Modifier.isPublic(field2.getModifiers()) && !Modifier.isStatic(field2.getModifiers()) && !Modifier.isTransient(field2.getModifiers()) && !field2.isAnnotationPresent(B4.r.class)) {
                String strB2 = b(field2);
                a(strB2 == null ? field2.getName() : strB2);
                c(field2);
            }
        }
        map = new HashMap();
        superclass = cls;
        if (this.f4365b.isEmpty()) {
            throw new RuntimeException("No properties to serialize found on class ".concat(cls.getName()));
        }
        for (String str2 : this.f4370g) {
            if (!this.f4367d.containsKey(str2) && !this.f4368e.containsKey(str2)) {
                StringBuilder sbK = p031e1.k.k("@DocumentId is annotated on property ", str2, " of class ");
                sbK.append(cls.getName());
                sbK.append(" but no field or public setter was found");
                throw new RuntimeException(sbK.toString());
            }
        }
    }

    public static String b(AccessibleObject accessibleObject) {
        if (accessibleObject.isAnnotationPresent(X.class)) {
            return ((X) accessibleObject.getAnnotation(X.class)).value();
        }
        return null;
    }

    public static void d(String str, String str2, Class cls) {
        if (cls == String.class || cls == C0070n.class) {
            return;
        }
        throw new IllegalArgumentException(str + " is annotated with @DocumentId but " + str2 + " " + cls + " instead of String or DocumentReference.");
    }

    public static boolean e(Method method, Method method2) {
        k.a("Expected override from a base class", method.getDeclaringClass().isAssignableFrom(method2.getDeclaringClass()));
        Class<?> returnType = method.getReturnType();
        Class cls = Void.TYPE;
        k.a("Expected void return type", returnType.equals(cls));
        k.a("Expected void return type", method2.getReturnType().equals(cls));
        Class<?>[] parameterTypes = method.getParameterTypes();
        Class<?>[] parameterTypes2 = method2.getParameterTypes();
        k.a("Expected exactly one parameter", parameterTypes.length == 1);
        k.a("Expected exactly one parameter", parameterTypes2.length == 1);
        return method.getName().equals(method2.getName()) && parameterTypes[0].equals(parameterTypes2[0]);
    }

    public static String f(Method method) {
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
        String str2 = (String) this.f4365b.put(str.toLowerCase(locale), str);
        if (str2 == null || str.equals(str2)) {
            return;
        }
        throw new RuntimeException("Found two getters or fields with conflicting case sensitivity for property: " + str.toLowerCase(locale));
    }

    public final void c(Field field) {
        if (field.isAnnotationPresent(d0.class)) {
            Class<?> type = field.getType();
            if (type != Date.class && type != Timestamp.class) {
                throw new IllegalArgumentException("Field " + field.getName() + " is annotated with @ServerTimestamp but is " + type + " instead of Date or Timestamp.");
            }
            String strB = b(field);
            if (strB == null) {
                strB = field.getName();
            }
            this.f4369f.add(strB);
        }
        if (field.isAnnotationPresent(InterfaceC0066j.class)) {
            d("Field", "is", field.getType());
            String strB2 = b(field);
            if (strB2 == null) {
                strB2 = field.getName();
            }
            this.f4370g.add(strB2);
        }
    }
}
