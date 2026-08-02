package org.modelmapper.internal.util;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Calendar;
import java.util.Date;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public final class Types {
    private static Method JAVASSIST_IS_PROXY_CLASS_METHOD;
    private static Class<?> JAVASSIST_PROXY_FACTORY_CLASS;

    static {
        try {
            Class<?> loadClass = Types.class.getClassLoader().loadClass("javassist.util.proxy.ProxyFactory");
            JAVASSIST_PROXY_FACTORY_CLASS = loadClass;
            JAVASSIST_IS_PROXY_CLASS_METHOD = loadClass.getMethod("isProxyClass", Class.class);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Class<T> deProxy(Class<?> cls) {
        if (cls.isInterface() || !isProxied(cls)) {
            return cls;
        }
        Class<T> superclass = cls.getSuperclass();
        if (!superclass.equals(Object.class) && !superclass.equals(Proxy.class)) {
            return superclass;
        }
        Object[] interfaces = cls.getInterfaces();
        return interfaces.length > 0 ? (Class<T>) interfaces[0] : cls;
    }

    public static boolean isProxied(Class<?> cls) {
        if (cls.getName().contains("$ByteBuddy$") || cls.getName().contains("$$EnhancerBy") || Proxy.isProxyClass(cls)) {
            return true;
        }
        return isProxiedByJavassist(cls);
    }

    private static boolean isProxiedByJavassist(Class<?> cls) {
        try {
            Method method = JAVASSIST_IS_PROXY_CLASS_METHOD;
            if (method != null) {
                return ((Boolean) method.invoke(null, cls)).booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isGroovyType(Class<?> cls) {
        return cls.getName().startsWith("org.codehaus.groovy");
    }

    public static boolean isInstantiable(Class<?> cls) {
        return (cls.isEnum() || cls.isAssignableFrom(String.class) || Primitives.isPrimitiveWrapper(cls)) ? false : true;
    }

    public static Class<?> rawTypeFor(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(rawTypeFor(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return rawTypeFor(((TypeVariable) type).getBounds()[0]);
        }
        if (type instanceof WildcardType) {
            return rawTypeFor(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Could not determine raw type for " + (type == null ? AbstractJsonLexerKt.NULL : type.getClass().getName()));
    }

    public static Class<?> classFor(org.modelmapper.internal.asm.Type type, ClassLoader classLoader) throws ClassNotFoundException {
        switch (type.getSort()) {
            case 1:
                return Boolean.TYPE;
            case 2:
                return Character.TYPE;
            case 3:
                return Byte.TYPE;
            case 4:
                return Short.TYPE;
            case 5:
                return Integer.TYPE;
            case 6:
                return Float.TYPE;
            case 7:
                return Long.TYPE;
            case 8:
                return Double.TYPE;
            case 9:
                return Array.newInstance(classFor(type.getElementType(), classLoader), new int[type.getDimensions()]).getClass();
            default:
                return Class.forName(type.getClassName(), true, classLoader);
        }
    }

    public static String toString(Member member) {
        if (member instanceof Method) {
            return member.getDeclaringClass().getName() + "." + member.getName() + "()";
        }
        if (member instanceof Field) {
            return member.getDeclaringClass().getName() + "." + member.getName();
        }
        if (member instanceof Constructor) {
            return member.getDeclaringClass().getName() + ".<init>()";
        }
        return null;
    }

    public static String toString(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static boolean mightContainsProperties(Class<?> cls) {
        return (cls == Object.class || cls == String.class || cls == Date.class || cls == Calendar.class || Primitives.isPrimitive(cls) || Iterables.isIterable(cls) || isGroovyType(cls)) ? false : true;
    }
}
