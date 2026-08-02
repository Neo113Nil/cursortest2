package com.google.android.gms.internal.firebase_database;

import android.util.Log;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;
import com.google.firebase.database.PropertyName;
import com.google.firebase.database.ThrowOnExtraProperties;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class zzku<T> {
    private final Class<T> zzuv;
    private final Constructor<T> zzuw;
    private final boolean zzux;
    private final boolean zzuy;
    private final Map<String, String> zzuz = new HashMap();
    private final Map<String, Method> zzvb = new HashMap();
    private final Map<String, Method> zzva = new HashMap();
    private final Map<String, Field> zzvc = new HashMap();

    public zzku(Class<T> cls) {
        Constructor<T> constructor;
        this.zzuv = cls;
        this.zzux = cls.isAnnotationPresent(ThrowOnExtraProperties.class);
        this.zzuy = !cls.isAnnotationPresent(IgnoreExtraProperties.class);
        try {
            constructor = cls.getDeclaredConstructor(new Class[0]);
            constructor.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            constructor = null;
        }
        this.zzuw = constructor;
        for (Method method : cls.getMethods()) {
            if (((!method.getName().startsWith("get") && !method.getName().startsWith("is")) || method.getDeclaringClass().equals(Object.class) || !Modifier.isPublic(method.getModifiers()) || Modifier.isStatic(method.getModifiers()) || method.getReturnType().equals(Void.TYPE) || method.getParameterTypes().length != 0 || method.isAnnotationPresent(Exclude.class)) ? false : true) {
                String zza = zza(method);
                zzae(zza);
                method.setAccessible(true);
                if (this.zzva.containsKey(zza)) {
                    String valueOf = String.valueOf(method.getName());
                    throw new DatabaseException(valueOf.length() != 0 ? "Found conflicting getters for name: ".concat(valueOf) : new String("Found conflicting getters for name: "));
                }
                this.zzva.put(zza, method);
            }
        }
        for (Field field : cls.getFields()) {
            if ((field.getDeclaringClass().equals(Object.class) || !Modifier.isPublic(field.getModifiers()) || Modifier.isStatic(field.getModifiers()) || Modifier.isTransient(field.getModifiers()) || field.isAnnotationPresent(Exclude.class)) ? false : true) {
                zzae(zza(field));
            }
        }
        Class<T> cls2 = cls;
        do {
            for (Method method2 : cls2.getDeclaredMethods()) {
                if (method2.getName().startsWith("set") && !method2.getDeclaringClass().equals(Object.class) && !Modifier.isStatic(method2.getModifiers()) && method2.getReturnType().equals(Void.TYPE) && method2.getParameterTypes().length == 1 && !method2.isAnnotationPresent(Exclude.class)) {
                    String zza2 = zza(method2);
                    String str = this.zzuz.get(zza2.toLowerCase());
                    if (str == null) {
                        continue;
                    } else {
                        if (!str.equals(zza2)) {
                            String valueOf2 = String.valueOf(method2.getName());
                            throw new DatabaseException(valueOf2.length() != 0 ? "Found setter with invalid case-sensitive name: ".concat(valueOf2) : new String("Found setter with invalid case-sensitive name: "));
                        }
                        Method method3 = this.zzvb.get(zza2);
                        if (method3 == null) {
                            method2.setAccessible(true);
                            this.zzvb.put(zza2, method2);
                        } else {
                            zzkq.zza(method2.getDeclaringClass().isAssignableFrom(method3.getDeclaringClass()), "Expected override from a base class");
                            zzkq.zza(method2.getReturnType().equals(Void.TYPE), "Expected void return type");
                            zzkq.zza(method3.getReturnType().equals(Void.TYPE), "Expected void return type");
                            Class<?>[] parameterTypes = method2.getParameterTypes();
                            Class<?>[] parameterTypes2 = method3.getParameterTypes();
                            zzkq.zza(parameterTypes.length == 1, "Expected exactly one parameter");
                            zzkq.zza(parameterTypes2.length == 1, "Expected exactly one parameter");
                            if (!(method2.getName().equals(method3.getName()) && parameterTypes[0].equals(parameterTypes2[0]))) {
                                String name = method2.getName();
                                String name2 = method3.getName();
                                String name3 = method3.getDeclaringClass().getName();
                                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 69 + String.valueOf(name2).length() + String.valueOf(name3).length());
                                sb.append("Found a conflicting setters with name: ");
                                sb.append(name);
                                sb.append(" (conflicts with ");
                                sb.append(name2);
                                sb.append(" defined on ");
                                sb.append(name3);
                                sb.append(")");
                                throw new DatabaseException(sb.toString());
                            }
                        }
                    }
                }
            }
            for (Field field2 : cls2.getDeclaredFields()) {
                String zza3 = zza(field2);
                if (this.zzuz.containsKey(zza3.toLowerCase()) && !this.zzvc.containsKey(zza3)) {
                    field2.setAccessible(true);
                    this.zzvc.put(zza3, field2);
                }
            }
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                break;
            }
        } while (!cls2.equals(Object.class));
        if (this.zzuz.isEmpty()) {
            String valueOf3 = String.valueOf(cls.getName());
            throw new DatabaseException(valueOf3.length() != 0 ? "No properties to serialize found on class ".concat(valueOf3) : new String("No properties to serialize found on class "));
        }
    }

    private static String zza(AccessibleObject accessibleObject) {
        if (accessibleObject.isAnnotationPresent(PropertyName.class)) {
            return ((PropertyName) accessibleObject.getAnnotation(PropertyName.class)).value();
        }
        return null;
    }

    private static String zza(Field field) {
        String zza = zza((AccessibleObject) field);
        return zza != null ? zza : field.getName();
    }

    private static String zza(Method method) {
        String zza = zza((AccessibleObject) method);
        if (zza != null) {
            return zza;
        }
        String name = method.getName();
        String[] strArr = {"get", "set", "is"};
        String str = null;
        for (int i = 0; i < 3; i++) {
            String str2 = strArr[i];
            if (name.startsWith(str2)) {
                str = str2;
            }
        }
        if (str == null) {
            String valueOf = String.valueOf(name);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unknown Bean prefix for method: ".concat(valueOf) : new String("Unknown Bean prefix for method: "));
        }
        char[] charArray = name.substring(str.length()).toCharArray();
        for (int i2 = 0; i2 < charArray.length && Character.isUpperCase(charArray[i2]); i2++) {
            charArray[i2] = Character.toLowerCase(charArray[i2]);
        }
        return new String(charArray);
    }

    private static Type zza(Type type, Map<TypeVariable<Class<T>>, Type> map) {
        if (!(type instanceof TypeVariable)) {
            return type;
        }
        Type type2 = map.get(type);
        if (type2 != null) {
            return type2;
        }
        String valueOf = String.valueOf(type);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("Could not resolve type ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    private final void zzae(String str) {
        String put = this.zzuz.put(str.toLowerCase(), str);
        if (put == null || str.equals(put)) {
            return;
        }
        String valueOf = String.valueOf(str.toLowerCase());
        throw new DatabaseException(valueOf.length() != 0 ? "Found two getters or fields with conflicting case sensitivity for property: ".concat(valueOf) : new String("Found two getters or fields with conflicting case sensitivity for property: "));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final T zza(Map<String, Object> map, Map<TypeVariable<Class<T>>, Type> map2) {
        Constructor<T> constructor = this.zzuw;
        if (constructor == null) {
            String name = this.zzuv.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 123);
            sb.append("Class ");
            sb.append(name);
            sb.append(" does not define a no-argument constructor. If you are using ProGuard, make sure these constructors are not stripped.");
            throw new DatabaseException(sb.toString());
        }
        try {
            T newInstance = constructor.newInstance(new Object[0]);
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                if (this.zzvb.containsKey(key)) {
                    Method method = this.zzvb.get(key);
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    if (genericParameterTypes.length != 1) {
                        throw new IllegalStateException("Setter does not have exactly one parameter");
                    }
                    try {
                        method.invoke(newInstance, zzkt.zza(entry.getValue(), zza(genericParameterTypes[0], map2)));
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException(e2);
                    }
                } else if (this.zzvc.containsKey(key)) {
                    Field field = this.zzvc.get(key);
                    try {
                        field.set(newInstance, zzkt.zza(entry.getValue(), zza(field.getGenericType(), map2)));
                    } catch (IllegalAccessException e3) {
                        throw new RuntimeException(e3);
                    }
                } else {
                    String name2 = this.zzuv.getName();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(key).length() + 36 + String.valueOf(name2).length());
                    sb2.append("No setter/field for ");
                    sb2.append(key);
                    sb2.append(" found on class ");
                    sb2.append(name2);
                    String sb3 = sb2.toString();
                    if (this.zzuz.containsKey(key.toLowerCase())) {
                        sb3 = String.valueOf(sb3).concat(" (fields/setters are case sensitive!)");
                    }
                    if (this.zzux) {
                        throw new DatabaseException(sb3);
                    }
                    if (this.zzuy) {
                        Log.w("ClassMapper", sb3);
                    }
                }
            }
            return newInstance;
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException(e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final Map<String, Object> zzm(T t) {
        Object obj;
        if (!this.zzuv.isAssignableFrom(t.getClass())) {
            String valueOf = String.valueOf(t.getClass());
            String valueOf2 = String.valueOf(this.zzuv);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 59 + String.valueOf(valueOf2).length());
            sb.append("Can't serialize object of class ");
            sb.append(valueOf);
            sb.append(" with BeanMapper for class ");
            sb.append(valueOf2);
            throw new IllegalArgumentException(sb.toString());
        }
        HashMap hashMap = new HashMap();
        for (String str : this.zzuz.values()) {
            if (this.zzva.containsKey(str)) {
                try {
                    obj = this.zzva.get(str).invoke(t, new Object[0]);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException(e2);
                }
            } else {
                Field field = this.zzvc.get(str);
                if (field == null) {
                    String valueOf3 = String.valueOf(str);
                    throw new IllegalStateException(valueOf3.length() != 0 ? "Bean property without field or getter:".concat(valueOf3) : new String("Bean property without field or getter:"));
                }
                try {
                    obj = field.get(t);
                } catch (IllegalAccessException e3) {
                    throw new RuntimeException(e3);
                }
            }
            hashMap.put(str, zzkt.zzi(obj));
        }
        return hashMap;
    }
}
