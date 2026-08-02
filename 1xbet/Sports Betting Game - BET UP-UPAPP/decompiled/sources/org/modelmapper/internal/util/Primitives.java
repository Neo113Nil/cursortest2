package org.modelmapper.internal.util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.modelmapper.internal.bytebuddy.pool.TypePool;

/* loaded from: classes4.dex */
public final class Primitives {
    private static Map<Class<?>, Object> defaultValue;
    private static Map<Class<?>, Class<?>> primitiveToWrapper;
    private static Set<String> primitiveWrapperInternalNames;
    private static Map<Class<?>, Class<?>> wrapperToPrimitive;

    static {
        HashMap hashMap = new HashMap();
        primitiveToWrapper = hashMap;
        hashMap.put(Boolean.TYPE, Boolean.class);
        primitiveToWrapper.put(Character.TYPE, Character.class);
        primitiveToWrapper.put(Byte.TYPE, Byte.class);
        primitiveToWrapper.put(Short.TYPE, Short.class);
        primitiveToWrapper.put(Integer.TYPE, Integer.class);
        primitiveToWrapper.put(Long.TYPE, Long.class);
        primitiveToWrapper.put(Float.TYPE, Float.class);
        primitiveToWrapper.put(Double.TYPE, Double.class);
        HashMap hashMap2 = new HashMap();
        wrapperToPrimitive = hashMap2;
        hashMap2.put(Boolean.class, Boolean.TYPE);
        wrapperToPrimitive.put(Character.class, Character.TYPE);
        wrapperToPrimitive.put(Byte.class, Byte.TYPE);
        wrapperToPrimitive.put(Short.class, Short.TYPE);
        wrapperToPrimitive.put(Integer.class, Integer.TYPE);
        wrapperToPrimitive.put(Long.class, Long.TYPE);
        wrapperToPrimitive.put(Float.class, Float.TYPE);
        wrapperToPrimitive.put(Double.class, Double.TYPE);
        HashMap hashMap3 = new HashMap();
        defaultValue = hashMap3;
        hashMap3.put(Boolean.TYPE, Boolean.FALSE);
        defaultValue.put(Character.TYPE, (char) 0);
        defaultValue.put(Byte.TYPE, (byte) 0);
        defaultValue.put(Short.TYPE, (short) 0);
        defaultValue.put(Integer.TYPE, 0);
        defaultValue.put(Long.TYPE, 0L);
        defaultValue.put(Float.TYPE, Float.valueOf(0.0f));
        defaultValue.put(Double.TYPE, Double.valueOf(0.0d));
        primitiveWrapperInternalNames = new HashSet();
        Iterator<Class<?>> it = wrapperToPrimitive.keySet().iterator();
        while (it.hasNext()) {
            primitiveWrapperInternalNames.add(it.next().getName().replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/'));
        }
    }

    private Primitives() {
    }

    public static <T> T defaultValue(Class<?> cls) {
        if (cls.isPrimitive()) {
            return (T) defaultValue.get(cls);
        }
        return null;
    }

    public static <T> T defaultValueForWrapper(Class<?> cls) {
        if (isPrimitiveWrapper(cls)) {
            cls = primitiveFor(cls);
        }
        if (cls == null) {
            return null;
        }
        return (T) defaultValue.get(cls);
    }

    public static boolean isPrimitive(Class<?> cls) {
        return cls.isPrimitive() || isPrimitiveWrapper(cls);
    }

    public static boolean isPrimitiveWrapper(Class<?> cls) {
        return wrapperToPrimitive.containsKey(cls);
    }

    public static boolean isPrimitiveWrapperInternalName(String str) {
        return primitiveWrapperInternalNames.contains(str);
    }

    public static Class<?> primitiveFor(Class<?> cls) {
        return wrapperToPrimitive.get(cls);
    }

    public static Class<?> wrapperFor(Class<?> cls) {
        return cls.isPrimitive() ? primitiveToWrapper.get(cls) : cls;
    }
}
