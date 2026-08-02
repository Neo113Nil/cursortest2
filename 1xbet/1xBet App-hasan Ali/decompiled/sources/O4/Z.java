package O4;

import A0.J0;
import game.betting133.sports1xbet.aqua_network.AquaSportsApiService;
import java.lang.annotation.Annotation;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import n.AbstractC2107A;
import p4.C2268h;
import r0.AbstractC2346c;

/* loaded from: classes.dex */
public abstract class Z {

    /* renamed from: a, reason: collision with root package name */
    public static final Type[] f4199a = new Type[0];

    /* renamed from: b, reason: collision with root package name */
    public static boolean f4200b = true;

    /* renamed from: c, reason: collision with root package name */
    public static Constructor f4201c;

    public static final Object b(InterfaceC0259e interfaceC0259e, a4.c cVar) {
        C2268h c2268h = new C2268h(1, AbstractC2346c.v(cVar));
        c2268h.r();
        c2268h.t(new C0274u(interfaceC0259e, 0));
        interfaceC0259e.d(new C0275v(c2268h, 0));
        return c2268h.q();
    }

    public static final Object c(InterfaceC0259e interfaceC0259e, a4.c cVar) {
        C2268h c2268h = new C2268h(1, AbstractC2346c.v(cVar));
        c2268h.r();
        c2268h.t(new C0274u(interfaceC0259e, 1));
        interfaceC0259e.d(new J0(c2268h));
        return c2268h.q();
    }

    public static void d(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean e(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return e(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static Type f(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return f(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return f(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type g(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i >= 0 && i < actualTypeArguments.length) {
            Type type = actualTypeArguments[i];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder v4 = AbstractC2107A.v(i, "Index ", " not in range [0,");
        v4.append(actualTypeArguments.length);
        v4.append(") for ");
        v4.append(parameterizedType);
        throw new IllegalArgumentException(v4.toString());
    }

    public static Class h(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) h(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return h(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    public static Type i(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return q(type, cls, f(type, cls, Map.class));
        }
        throw new IllegalArgumentException();
    }

    public static boolean j(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (j(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return j(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    public static Object k(Object obj, Method method, Object[] objArr) {
        MethodHandle unreflectSpecial;
        MethodHandle bindTo;
        Object invokeWithArguments;
        Constructor constructor = f4201c;
        if (constructor == null) {
            constructor = A0.X.f().getDeclaredConstructor(Class.class, Integer.TYPE);
            constructor.setAccessible(true);
            f4201c = constructor;
        }
        unreflectSpecial = A0.X.k(constructor.newInstance(AquaSportsApiService.class, -1)).unreflectSpecial(method, AquaSportsApiService.class);
        bindTo = unreflectSpecial.bindTo(obj);
        invokeWithArguments = bindTo.invokeWithArguments(objArr);
        return invokeWithArguments;
    }

    public static boolean l(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static boolean m(Type type) {
        return f4200b && type == W3.o.class;
    }

    public static IllegalArgumentException n(Method method, Exception exc, String str, Object... objArr) {
        return new IllegalArgumentException(String.format(str, objArr) + "\n    for method " + method.getDeclaringClass().getSimpleName() + "." + method.getName(), exc);
    }

    public static IllegalArgumentException o(Method method, int i, String str, Object... objArr) {
        return n(method, null, str + " (" + L.f4139b.c(method, i) + ")", objArr);
    }

    public static IllegalArgumentException p(Method method, Exception exc, int i, String str, Object... objArr) {
        return n(method, exc, str + " (" + L.f4139b.c(method, i) + ")", objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044 A[LOOP:0: B:2:0x0002->B:19:0x0044, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Type q(Type type, Class cls, Type type2) {
        Type type3;
        Type type4 = type2;
        while (type4 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type4;
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls2 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls2 != null) {
                Type f = f(type, cls, cls2);
                if (f instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls2.getTypeParameters();
                    for (int i = 0; i < typeParameters.length; i++) {
                        if (typeVariable.equals(typeParameters[i])) {
                            type3 = ((ParameterizedType) f).getActualTypeArguments()[i];
                            if (type3 != typeVariable) {
                                return type3;
                            }
                            type4 = type3;
                        }
                    }
                    throw new NoSuchElementException();
                }
            }
            type3 = typeVariable;
            if (type3 != typeVariable) {
            }
        }
        if (type4 instanceof Class) {
            Class cls3 = (Class) type4;
            if (cls3.isArray()) {
                Class<?> componentType = cls3.getComponentType();
                Type q5 = q(type, cls, componentType);
                return componentType == q5 ? cls3 : new W(q5);
            }
        }
        if (type4 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type4;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type q6 = q(type, cls, genericComponentType);
            return genericComponentType == q6 ? genericArrayType : new W(q6);
        }
        if (type4 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type4;
            Type ownerType = parameterizedType.getOwnerType();
            Type q7 = q(type, cls, ownerType);
            boolean z3 = q7 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i5 = 0; i5 < length; i5++) {
                Type q8 = q(type, cls, actualTypeArguments[i5]);
                if (q8 != actualTypeArguments[i5]) {
                    if (!z3) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z3 = true;
                    }
                    actualTypeArguments[i5] = q8;
                }
            }
            return z3 ? new X(q7, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        boolean z5 = type4 instanceof WildcardType;
        Type type5 = type4;
        if (z5) {
            WildcardType wildcardType = (WildcardType) type4;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type q9 = q(type, cls, lowerBounds[0]);
                type5 = wildcardType;
                if (q9 != lowerBounds[0]) {
                    return new Y(new Type[]{Object.class}, new Type[]{q9});
                }
            } else {
                type5 = wildcardType;
                if (upperBounds.length == 1) {
                    Type q10 = q(type, cls, upperBounds[0]);
                    type5 = wildcardType;
                    if (q10 != upperBounds[0]) {
                        return new Y(new Type[]{q10}, f4199a);
                    }
                }
            }
        }
        return type5;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void r(Throwable th, a4.c cVar) {
        C0276w c0276w;
        int i;
        if (cVar instanceof C0276w) {
            c0276w = (C0276w) cVar;
            int i5 = c0276w.f4237l;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0276w.f4237l = i5 - Integer.MIN_VALUE;
                Object obj = c0276w.f4236k;
                i = c0276w.f4237l;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    G4.l.N(obj);
                    throw new D2.e();
                }
                G4.l.N(obj);
                c0276w.f4237l = 1;
                p4.D.f18743a.E(c0276w.getContext(), new D3.h(8, c0276w, th, false));
                return;
            }
        }
        c0276w = new C0276w(cVar);
        Object obj2 = c0276w.f4236k;
        i = c0276w.f4237l;
        if (i == 0) {
        }
    }

    public static void s(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static String t(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public abstract void a(O o5, Object obj);
}
