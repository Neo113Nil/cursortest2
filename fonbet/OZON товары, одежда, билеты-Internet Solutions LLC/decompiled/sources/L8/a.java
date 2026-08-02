package L8;

import com.google.gson.internal.s;
import com.google.gson.j;
import g.C6594f;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC0315a f16592a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f16593b = 0;

    /* renamed from: L8.a$a, reason: collision with other inner class name */
    private static abstract class AbstractC0315a {
        abstract Method a(Class<?> cls, Field field);

        abstract <T> Constructor<T> b(Class<T> cls);

        abstract String[] c(Class<?> cls);

        abstract boolean d(Class<?> cls);
    }

    private static class b extends AbstractC0315a {
        @Override // L8.a.AbstractC0315a
        public final Method a(Class<?> cls, Field field) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // L8.a.AbstractC0315a
        final <T> Constructor<T> b(Class<T> cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // L8.a.AbstractC0315a
        final String[] c(Class<?> cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // L8.a.AbstractC0315a
        final boolean d(Class<?> cls) {
            return false;
        }
    }

    private static class c extends AbstractC0315a {

        /* renamed from: a, reason: collision with root package name */
        private final Method f16594a = Class.class.getMethod("isRecord", new Class[0]);

        /* renamed from: b, reason: collision with root package name */
        private final Method f16595b = Class.class.getMethod("getRecordComponents", new Class[0]);

        /* renamed from: c, reason: collision with root package name */
        private final Method f16596c;

        /* renamed from: d, reason: collision with root package name */
        private final Method f16597d;

        c() throws NoSuchMethodException, ClassNotFoundException {
            Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
            this.f16596c = cls.getMethod("getName", new Class[0]);
            this.f16597d = cls.getMethod("getType", new Class[0]);
        }

        @Override // L8.a.AbstractC0315a
        public final Method a(Class<?> cls, Field field) {
            try {
                return cls.getMethod(field.getName(), new Class[0]);
            } catch (ReflectiveOperationException e11) {
                throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e11);
            }
        }

        @Override // L8.a.AbstractC0315a
        public final <T> Constructor<T> b(Class<T> cls) {
            try {
                Object[] objArr = (Object[]) this.f16595b.invoke(cls, new Object[0]);
                Class<?>[] clsArr = new Class[objArr.length];
                for (int i11 = 0; i11 < objArr.length; i11++) {
                    clsArr[i11] = (Class) this.f16597d.invoke(objArr[i11], new Object[0]);
                }
                return cls.getDeclaredConstructor(clsArr);
            } catch (ReflectiveOperationException e11) {
                throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e11);
            }
        }

        @Override // L8.a.AbstractC0315a
        final String[] c(Class<?> cls) {
            try {
                Object[] objArr = (Object[]) this.f16595b.invoke(cls, new Object[0]);
                String[] strArr = new String[objArr.length];
                for (int i11 = 0; i11 < objArr.length; i11++) {
                    strArr[i11] = (String) this.f16596c.invoke(objArr[i11], new Object[0]);
                }
                return strArr;
            } catch (ReflectiveOperationException e11) {
                throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e11);
            }
        }

        @Override // L8.a.AbstractC0315a
        final boolean d(Class<?> cls) {
            try {
                return ((Boolean) this.f16594a.invoke(cls, new Object[0])).booleanValue();
            } catch (ReflectiveOperationException e11) {
                throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e11);
            }
        }
    }

    static {
        AbstractC0315a bVar;
        try {
            bVar = new c();
        } catch (ReflectiveOperationException unused) {
            bVar = new b();
        }
        f16592a = bVar;
    }

    private static void a(AccessibleObject accessibleObject, StringBuilder sb2) {
        sb2.append('(');
        Class<?>[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i11 = 0; i11 < parameterTypes.length; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(parameterTypes[i11].getSimpleName());
        }
        sb2.append(')');
    }

    public static String b(Constructor<?> constructor) {
        StringBuilder sb2 = new StringBuilder(constructor.getDeclaringClass().getName());
        a(constructor, sb2);
        return sb2.toString();
    }

    public static String c(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    public static String d(AccessibleObject accessibleObject, boolean z11) {
        String str;
        if (accessibleObject instanceof Field) {
            str = "field '" + c((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb2 = new StringBuilder(method.getName());
            a(method, sb2);
            str = "method '" + method.getDeclaringClass().getName() + "#" + sb2.toString() + "'";
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + b((Constructor) accessibleObject) + "'";
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (!z11 || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public static Method e(Class<?> cls, Field field) {
        return f16592a.a(cls, field);
    }

    public static <T> Constructor<T> f(Class<T> cls) {
        return f16592a.b(cls);
    }

    private static String g(Exception exc) {
        if (!exc.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
            return "";
        }
        String message = exc.getMessage();
        return "\nSee " + s.a((message == null || !message.contains("to module com.google.gson")) ? "reflection-inaccessible" : "reflection-inaccessible-to-module-gson");
    }

    public static String[] h(Class<?> cls) {
        return f16592a.c(cls);
    }

    public static boolean i(Class<?> cls) {
        return f16592a.d(cls);
    }

    public static void j(AccessibleObject accessibleObject) throws j {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e11) {
            StringBuilder b11 = C6594f.b("Failed making ", d(accessibleObject, false), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type.");
            b11.append(g(e11));
            throw new j(b11.toString(), e11);
        }
    }

    public static String k(Constructor<?> constructor) {
        try {
            constructor.setAccessible(true);
            return null;
        } catch (Exception e11) {
            return "Failed making constructor '" + b(constructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e11.getMessage() + g(e11);
        }
    }
}
