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
import java.util.Iterator;
import java.util.Locale;
import w1.L;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Class f4364a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4365b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4366c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f4367d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f4368e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f4369f;

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f4370g;

    /* JADX WARN: Code restructure failed: missing block: B:122:0x028f, code lost:
    
        if (r4 != r19) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02b4, code lost:
    
        throw new java.lang.RuntimeException("Class " + r19.getName() + " has multiple setter overloads with name " + r15.getName());
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02ed, code lost:
    
        throw new java.lang.RuntimeException("Found conflicting setters with name: " + r15.getName() + " (conflicts with " + r5.getName() + " defined on " + r5.getDeclaringClass().getName() + ")");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i(Class cls) {
        HashMap hashMap;
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
        } catch (NoSuchMethodException unused) {
        }
        for (Method method : cls.getMethods()) {
            if ((method.getName().startsWith("get") || method.getName().startsWith("is")) && !method.getDeclaringClass().equals(Object.class) && Modifier.isPublic(method.getModifiers()) && !Modifier.isStatic(method.getModifiers()) && !method.getReturnType().equals(Void.TYPE) && method.getParameterTypes().length == 0 && !method.isBridge() && !method.isAnnotationPresent(B4.r.class)) {
                String f7 = f(method);
                a(f7);
                method.setAccessible(true);
                if (this.f4366c.containsKey(f7)) {
                    throw new RuntimeException("Found conflicting getters for name " + method.getName() + " on class " + cls.getName());
                }
                this.f4366c.put(f7, method);
                if (method.isAnnotationPresent(d0.class)) {
                    Class<?> returnType = method.getReturnType();
                    if (returnType != Date.class && returnType != Timestamp.class) {
                        throw new IllegalArgumentException("Method " + method.getName() + " is annotated with @ServerTimestamp but returns " + returnType + " instead of Date or Timestamp.");
                    }
                    this.f4369f.add(f(method));
                }
                if (method.isAnnotationPresent(InterfaceC0066j.class)) {
                    d("Method", "returns", method.getReturnType());
                    this.f4370g.add(f(method));
                }
            }
        }
        for (Field field : cls.getFields()) {
            if (!field.getDeclaringClass().equals(Object.class) && Modifier.isPublic(field.getModifiers()) && !Modifier.isStatic(field.getModifiers()) && !Modifier.isTransient(field.getModifiers()) && !field.isAnnotationPresent(B4.r.class)) {
                String b7 = b(field);
                a(b7 == null ? field.getName() : b7);
                c(field);
            }
        }
        HashMap hashMap2 = new HashMap();
        Class cls2 = cls;
        loop2: while (true) {
            Method[] declaredMethods = cls2.getDeclaredMethods();
            int length = declaredMethods.length;
            int i7 = 0;
            while (i7 < length) {
                Method method2 = declaredMethods[i7];
                if (method2.getName().startsWith("set") && !method2.getDeclaringClass().equals(Object.class) && !Modifier.isStatic(method2.getModifiers()) && method2.getReturnType().equals(Void.TYPE) && method2.getParameterTypes().length == 1 && !method2.isAnnotationPresent(B4.r.class)) {
                    String f8 = f(method2);
                    methodArr = declaredMethods;
                    String str = (String) this.f4365b.get(f8.toLowerCase(Locale.US));
                    if (str != null) {
                        if (!str.equals(f8)) {
                            throw new RuntimeException("Found setter on " + cls2.getName() + " with invalid case-sensitive name: " + method2.getName());
                        }
                        if (method2.isBridge()) {
                            hashMap2.put(f8, method2);
                        } else {
                            Method method3 = (Method) this.f4367d.get(f8);
                            Method method4 = (Method) hashMap2.get(f8);
                            if (method3 != null) {
                                hashMap = hashMap2;
                                if (!e(method2, method3) && (method4 == null || !e(method2, method4))) {
                                    break loop2;
                                }
                            } else {
                                hashMap = hashMap2;
                                method2.setAccessible(true);
                                this.f4367d.put(f8, method2);
                                if (method2.isAnnotationPresent(d0.class)) {
                                    throw new IllegalArgumentException("Method " + method2.getName() + " is annotated with @ServerTimestamp but should not be. @ServerTimestamp can only be applied to fields and getters, not setters.");
                                }
                                if (method2.isAnnotationPresent(InterfaceC0066j.class)) {
                                    d("Method", "accepts", method2.getParameterTypes()[0]);
                                    this.f4370g.add(f(method2));
                                }
                            }
                            i7++;
                            declaredMethods = methodArr;
                            hashMap2 = hashMap;
                        }
                    }
                    hashMap = hashMap2;
                } else {
                    hashMap = hashMap2;
                    methodArr = declaredMethods;
                }
                i7++;
                declaredMethods = methodArr;
                hashMap2 = hashMap;
            }
            HashMap hashMap3 = hashMap2;
            for (Field field2 : cls2.getDeclaredFields()) {
                String b8 = b(field2);
                b8 = b8 == null ? field2.getName() : b8;
                if (this.f4365b.containsKey(b8.toLowerCase(Locale.US)) && !this.f4368e.containsKey(b8)) {
                    field2.setAccessible(true);
                    this.f4368e.put(b8, field2);
                    c(field2);
                }
            }
            cls2 = cls2.getSuperclass();
            if (cls2 == null || cls2.equals(Object.class)) {
                break;
            } else {
                hashMap2 = hashMap3;
            }
        }
        if (this.f4365b.isEmpty()) {
            throw new RuntimeException("No properties to serialize found on class ".concat(cls.getName()));
        }
        Iterator it = this.f4370g.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!this.f4367d.containsKey(str2) && !this.f4368e.containsKey(str2)) {
                StringBuilder k7 = e1.k.k("@DocumentId is annotated on property ", str2, " of class ");
                k7.append(cls.getName());
                k7.append(" but no field or public setter was found");
                throw new RuntimeException(k7.toString());
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
            String b7 = b(field);
            if (b7 == null) {
                b7 = field.getName();
            }
            this.f4369f.add(b7);
        }
        if (field.isAnnotationPresent(InterfaceC0066j.class)) {
            d("Field", "is", field.getType());
            String b8 = b(field);
            if (b8 == null) {
                b8 = field.getName();
            }
            this.f4370g.add(b8);
        }
    }
}
