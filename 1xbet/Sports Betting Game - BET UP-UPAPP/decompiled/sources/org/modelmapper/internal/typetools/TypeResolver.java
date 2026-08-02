package org.modelmapper.internal.typetools;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public final class TypeResolver {
    private static Method GET_CONSTANT_POOL;
    private static Method GET_CONSTANT_POOL_METHOD_AT;
    private static Method GET_CONSTANT_POOL_SIZE;
    private static final Double JAVA_VERSION;
    private static final Map<Class<?>, Class<?>> PRIMITIVE_WRAPPERS;
    private static boolean RESOLVES_LAMBDAS;
    private static final Map<Class<?>, Reference<Map<TypeVariable<?>, Type>>> TYPE_VARIABLE_CACHE = Collections.synchronizedMap(new WeakHashMap());
    private static volatile boolean CACHE_ENABLED = true;
    private static final Map<String, Method> OBJECT_METHODS = new HashMap();

    static {
        Double valueOf = Double.valueOf(Double.parseDouble(System.getProperty("java.specification.version", "0")));
        JAVA_VERSION = valueOf;
        try {
            Unsafe unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: org.modelmapper.internal.typetools.TypeResolver.1
                @Override // java.security.PrivilegedExceptionAction
                public Unsafe run() throws Exception {
                    Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return (Unsafe) declaredField.get(null);
                }
            });
            GET_CONSTANT_POOL = Class.class.getDeclaredMethod("getConstantPool", new Class[0]);
            Class<?> cls = Class.forName(valueOf.doubleValue() < 9.0d ? "sun.reflect.ConstantPool" : "jdk.internal.reflect.ConstantPool");
            GET_CONSTANT_POOL_SIZE = cls.getDeclaredMethod("getSize", new Class[0]);
            GET_CONSTANT_POOL_METHOD_AT = cls.getDeclaredMethod("getMethodAt", Integer.TYPE);
            long objectFieldOffset = unsafe.objectFieldOffset(AccessibleObject.class.getDeclaredField("override"));
            unsafe.putBoolean(GET_CONSTANT_POOL, objectFieldOffset, true);
            unsafe.putBoolean(GET_CONSTANT_POOL_SIZE, objectFieldOffset, true);
            unsafe.putBoolean(GET_CONSTANT_POOL_METHOD_AT, objectFieldOffset, true);
            GET_CONSTANT_POOL_SIZE.invoke(GET_CONSTANT_POOL.invoke(Object.class, new Object[0]), new Object[0]);
            for (Method method : Object.class.getDeclaredMethods()) {
                OBJECT_METHODS.put(method.getName(), method);
            }
            RESOLVES_LAMBDAS = true;
        } catch (Exception unused) {
        }
        HashMap hashMap = new HashMap();
        hashMap.put(Boolean.TYPE, Boolean.class);
        hashMap.put(Byte.TYPE, Byte.class);
        hashMap.put(Character.TYPE, Character.class);
        hashMap.put(Double.TYPE, Double.class);
        hashMap.put(Float.TYPE, Float.class);
        hashMap.put(Integer.TYPE, Integer.class);
        hashMap.put(Long.TYPE, Long.class);
        hashMap.put(Short.TYPE, Short.class);
        hashMap.put(Void.TYPE, Void.class);
        PRIMITIVE_WRAPPERS = Collections.unmodifiableMap(hashMap);
    }

    public static final class Unknown {
        private Unknown() {
        }
    }

    private TypeResolver() {
    }

    public static void enableCache() {
        CACHE_ENABLED = true;
    }

    public static void disableCache() {
        TYPE_VARIABLE_CACHE.clear();
        CACHE_ENABLED = false;
    }

    public static <T, S extends T> Class<?> resolveRawArgument(Class<T> cls, Class<S> cls2) {
        return resolveRawArgument(resolveGenericType(cls, cls2), (Class<?>) cls2);
    }

    public static Class<?> resolveRawArgument(Type type, Class<?> cls) {
        Class<?>[] resolveRawArguments = resolveRawArguments(type, cls);
        if (resolveRawArguments == null) {
            return Unknown.class;
        }
        if (resolveRawArguments.length != 1) {
            throw new IllegalArgumentException("Expected 1 argument for generic type " + type + " but found " + resolveRawArguments.length);
        }
        return resolveRawArguments[0];
    }

    public static <T, S extends T> Class<?>[] resolveRawArguments(Class<T> cls, Class<S> cls2) {
        return resolveRawArguments(resolveGenericType(cls, cls2), (Class<?>) cls2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (r0.isInterface() != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Class<?>[] resolveRawArguments(Type type, Class<?> cls) {
        Class cls2;
        if (RESOLVES_LAMBDAS && cls.isSynthetic()) {
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                if (parameterizedType.getRawType() instanceof Class) {
                    cls2 = (Class) parameterizedType.getRawType();
                    if (cls2 != null) {
                    }
                }
            }
            cls2 = type instanceof Class ? (Class) type : null;
            if (cls2 != null) {
            }
        }
        cls2 = null;
        int i = 0;
        if (type instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
            Class<?>[] clsArr = new Class[actualTypeArguments.length];
            while (i < actualTypeArguments.length) {
                clsArr[i] = resolveRawClass(actualTypeArguments[i], cls, cls2);
                i++;
            }
            return clsArr;
        }
        if (type instanceof TypeVariable) {
            return new Class[]{resolveRawClass(type, cls, cls2)};
        }
        if (!(type instanceof Class)) {
            return null;
        }
        TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
        Class<?>[] clsArr2 = new Class[typeParameters.length];
        while (i < typeParameters.length) {
            clsArr2[i] = resolveRawClass(typeParameters[i], cls, cls2);
            i++;
        }
        return clsArr2;
    }

    public static Type resolveGenericType(Class<?> cls, Type type) {
        Class cls2;
        Type resolveGenericType;
        Type resolveGenericType2;
        if (type instanceof ParameterizedType) {
            cls2 = (Class) ((ParameterizedType) type).getRawType();
        } else {
            cls2 = (Class) type;
        }
        if (cls.equals(cls2)) {
            return type;
        }
        if (cls.isInterface()) {
            for (Type type2 : cls2.getGenericInterfaces()) {
                if (type2 != null && !type2.equals(Object.class) && (resolveGenericType2 = resolveGenericType(cls, type2)) != null) {
                    return resolveGenericType2;
                }
            }
        }
        Type genericSuperclass = cls2.getGenericSuperclass();
        if (genericSuperclass == null || genericSuperclass.equals(Object.class) || (resolveGenericType = resolveGenericType(cls, genericSuperclass)) == null) {
            return null;
        }
        return resolveGenericType;
    }

    public static Class<?> resolveRawClass(Type type, Class<?> cls) {
        return resolveRawClass(type, cls, null);
    }

    private static Class<?> resolveRawClass(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return resolveRawClass(((ParameterizedType) type).getRawType(), cls, cls2);
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(resolveRawClass(((GenericArrayType) type).getGenericComponentType(), cls, cls2), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            Type type2 = getTypeVariableMap(cls, cls2).get(typeVariable);
            if (type2 == null) {
                type = resolveBound(typeVariable);
            } else {
                type = resolveRawClass(type2, cls, cls2);
            }
        }
        return type instanceof Class ? (Class) type : Unknown.class;
    }

    private static Map<TypeVariable<?>, Type> getTypeVariableMap(Class<?> cls, Class<?> cls2) {
        Reference<Map<TypeVariable<?>, Type>> reference = TYPE_VARIABLE_CACHE.get(cls);
        Map<TypeVariable<?>, Type> map = reference != null ? reference.get() : null;
        if (map == null) {
            map = new HashMap<>();
            if (cls2 != null) {
                populateLambdaArgs(cls2, cls, map);
            }
            populateSuperTypeArgs(cls.getGenericInterfaces(), map, cls2 != null);
            Type genericSuperclass = cls.getGenericSuperclass();
            for (Class<? super Object> superclass = cls.getSuperclass(); superclass != null && !Object.class.equals(superclass); superclass = superclass.getSuperclass()) {
                if (genericSuperclass instanceof ParameterizedType) {
                    populateTypeArgs((ParameterizedType) genericSuperclass, map, false);
                }
                populateSuperTypeArgs(superclass.getGenericInterfaces(), map, false);
                genericSuperclass = superclass.getGenericSuperclass();
            }
            for (Class<?> cls3 = cls; cls3.isMemberClass(); cls3 = cls3.getEnclosingClass()) {
                Type genericSuperclass2 = cls3.getGenericSuperclass();
                if (genericSuperclass2 instanceof ParameterizedType) {
                    populateTypeArgs((ParameterizedType) genericSuperclass2, map, cls2 != null);
                }
            }
            if (CACHE_ENABLED) {
                TYPE_VARIABLE_CACHE.put(cls, new WeakReference(map));
            }
        }
        return map;
    }

    private static void populateSuperTypeArgs(Type[] typeArr, Map<TypeVariable<?>, Type> map, boolean z) {
        for (Type type : typeArr) {
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                if (!z) {
                    populateTypeArgs(parameterizedType, map, z);
                }
                Type rawType = parameterizedType.getRawType();
                if (rawType instanceof Class) {
                    populateSuperTypeArgs(((Class) rawType).getGenericInterfaces(), map, z);
                }
                if (z) {
                    populateTypeArgs(parameterizedType, map, z);
                }
            } else if (type instanceof Class) {
                populateSuperTypeArgs(((Class) type).getGenericInterfaces(), map, z);
            }
        }
    }

    private static void populateTypeArgs(ParameterizedType parameterizedType, Map<TypeVariable<?>, Type> map, boolean z) {
        Type type;
        if (parameterizedType.getRawType() instanceof Class) {
            TypeVariable<?>[] typeParameters = ((Class) parameterizedType.getRawType()).getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (parameterizedType.getOwnerType() != null) {
                Type ownerType = parameterizedType.getOwnerType();
                if (ownerType instanceof ParameterizedType) {
                    populateTypeArgs((ParameterizedType) ownerType, map, z);
                }
            }
            for (int i = 0; i < actualTypeArguments.length; i++) {
                TypeVariable<?> typeVariable = typeParameters[i];
                Type type2 = actualTypeArguments[i];
                if (type2 instanceof Class) {
                    map.put(typeVariable, type2);
                } else if (type2 instanceof GenericArrayType) {
                    map.put(typeVariable, type2);
                } else if (type2 instanceof ParameterizedType) {
                    map.put(typeVariable, type2);
                } else if (type2 instanceof TypeVariable) {
                    TypeVariable<?> typeVariable2 = (TypeVariable) type2;
                    if (z && (type = map.get(typeVariable)) != null) {
                        map.put(typeVariable2, type);
                    } else {
                        Type type3 = map.get(typeVariable2);
                        if (type3 == null) {
                            type3 = resolveBound(typeVariable2);
                        }
                        map.put(typeVariable, type3);
                    }
                }
            }
        }
    }

    public static Type resolveBound(TypeVariable<?> typeVariable) {
        Type[] bounds = typeVariable.getBounds();
        if (bounds.length == 0) {
            return Unknown.class;
        }
        Type type = bounds[0];
        if (type instanceof TypeVariable) {
            type = resolveBound((TypeVariable) type);
        }
        return type == Object.class ? Unknown.class : type;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void populateLambdaArgs(Class<?> cls, Class<?> cls2, Map<TypeVariable<?>, Type> map) {
        Method method;
        int i;
        int length;
        int i2;
        if (RESOLVES_LAMBDAS) {
            int i3 = 0;
            for (Method method2 : cls.getMethods()) {
                if (!isDefaultMethod(method2) && !Modifier.isStatic(method2.getModifiers()) && !method2.isBridge() && ((method = OBJECT_METHODS.get(method2.getName())) == null || !Arrays.equals(method2.getTypeParameters(), method.getTypeParameters()))) {
                    Type genericReturnType = method2.getGenericReturnType();
                    Type[] genericParameterTypes = method2.getGenericParameterTypes();
                    Member memberRef = getMemberRef(cls2);
                    if (memberRef == null) {
                        return;
                    }
                    if (genericReturnType instanceof TypeVariable) {
                        Class<?> wrapPrimitives = wrapPrimitives(memberRef instanceof Method ? ((Method) memberRef).getReturnType() : ((Constructor) memberRef).getDeclaringClass());
                        if (!wrapPrimitives.equals(Void.class)) {
                            map.put((TypeVariable) genericReturnType, wrapPrimitives);
                        }
                    }
                    Class<?>[] parameterTypes = memberRef instanceof Method ? ((Method) memberRef).getParameterTypes() : ((Constructor) memberRef).getParameterTypes();
                    if (genericParameterTypes.length > 0 && (genericParameterTypes[0] instanceof TypeVariable)) {
                        i = 1;
                        if (genericParameterTypes.length == parameterTypes.length + 1) {
                            map.put((TypeVariable) genericParameterTypes[0], memberRef.getDeclaringClass());
                            length = genericParameterTypes.length >= parameterTypes.length ? parameterTypes.length - genericParameterTypes.length : 0;
                            while (true) {
                                i2 = i3 + length;
                                if (i2 < parameterTypes.length) {
                                    return;
                                }
                                if (genericParameterTypes[i3] instanceof TypeVariable) {
                                    map.put((TypeVariable) genericParameterTypes[i3 + i], wrapPrimitives(parameterTypes[i2]));
                                }
                                i3++;
                            }
                        }
                    }
                    i = 0;
                    if (genericParameterTypes.length >= parameterTypes.length) {
                    }
                    while (true) {
                        i2 = i3 + length;
                        if (i2 < parameterTypes.length) {
                        }
                        i3++;
                    }
                }
            }
        }
    }

    private static boolean isDefaultMethod(Method method) {
        return JAVA_VERSION.doubleValue() >= 1.8d && method.isDefault();
    }

    private static Member getMemberRef(Class<?> cls) {
        Member member = null;
        try {
            Object invoke = GET_CONSTANT_POOL.invoke(cls, new Object[0]);
            for (int constantPoolSize = getConstantPoolSize(invoke) - 1; constantPoolSize >= 0; constantPoolSize--) {
                Member constantPoolMethodAt = getConstantPoolMethodAt(invoke, constantPoolSize);
                if (constantPoolMethodAt != null && ((!(constantPoolMethodAt instanceof Constructor) || !constantPoolMethodAt.getDeclaringClass().getName().equals("java.lang.invoke.SerializedLambda")) && !constantPoolMethodAt.getDeclaringClass().isAssignableFrom(cls))) {
                    if (!(constantPoolMethodAt instanceof Method) || !isAutoBoxingMethod((Method) constantPoolMethodAt)) {
                        return constantPoolMethodAt;
                    }
                    member = constantPoolMethodAt;
                }
            }
            return member;
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean isAutoBoxingMethod(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        return method.getName().equals("valueOf") && parameterTypes.length == 1 && parameterTypes[0].isPrimitive() && wrapPrimitives(parameterTypes[0]).equals(method.getDeclaringClass());
    }

    private static Class<?> wrapPrimitives(Class<?> cls) {
        return cls.isPrimitive() ? PRIMITIVE_WRAPPERS.get(cls) : cls;
    }

    private static int getConstantPoolSize(Object obj) {
        try {
            return ((Integer) GET_CONSTANT_POOL_SIZE.invoke(obj, new Object[0])).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    private static Member getConstantPoolMethodAt(Object obj, int i) {
        try {
            return (Member) GET_CONSTANT_POOL_METHOD_AT.invoke(obj, Integer.valueOf(i));
        } catch (Exception unused) {
            return null;
        }
    }
}
