package com.google.android.gms.internal.firebase_database;

import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.GenericTypeIndicator;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public final class zzkt {
    private static final ConcurrentMap<Class<?>, zzku<?>> zzuu = new ConcurrentHashMap();

    private static <T> zzku<T> zza(Class<T> cls) {
        zzku<T> zzkuVar = (zzku) zzuu.get(cls);
        if (zzkuVar != null) {
            return zzkuVar;
        }
        zzku<T> zzkuVar2 = new zzku<>(cls);
        zzuu.put(cls, zzkuVar2);
        return zzkuVar2;
    }

    public static <T> T zza(Object obj, GenericTypeIndicator<T> genericTypeIndicator) {
        Type genericSuperclass = genericTypeIndicator.getClass().getGenericSuperclass();
        if (!(genericSuperclass instanceof ParameterizedType)) {
            String valueOf = String.valueOf(genericSuperclass);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
            sb.append("Not a direct subclass of GenericTypeIndicator: ");
            sb.append(valueOf);
            throw new DatabaseException(sb.toString());
        }
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        if (parameterizedType.getRawType().equals(GenericTypeIndicator.class)) {
            return (T) zza(obj, parameterizedType.getActualTypeArguments()[0]);
        }
        String valueOf2 = String.valueOf(genericSuperclass);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 47);
        sb2.append("Not a direct subclass of GenericTypeIndicator: ");
        sb2.append(valueOf2);
        throw new DatabaseException(sb2.toString());
    }

    public static <T> T zza(Object obj, Class<T> cls) {
        return (T) zzb(obj, (Class) cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r0v21, types: [T, java.util.ArrayList, java.util.List] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static <T> T zza(Object obj, Type type) {
        Class cls;
        if (obj == null) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof Class) {
                return (T) zzb(obj, (Class) type);
            }
            if (type instanceof WildcardType) {
                throw new DatabaseException("Generic wildcard types are not supported");
            }
            if (type instanceof GenericArrayType) {
                throw new DatabaseException("Generic Arrays are not supported, please use Lists instead");
            }
            String valueOf = String.valueOf(type);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("Unknown type encountered: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Class cls2 = (Class) parameterizedType.getRawType();
        if (List.class.isAssignableFrom(cls2)) {
            Type type2 = parameterizedType.getActualTypeArguments()[0];
            if (!(obj instanceof List)) {
                String valueOf2 = String.valueOf(obj.getClass());
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 47);
                sb2.append("Expected a List while deserializing, but got a ");
                sb2.append(valueOf2);
                throw new DatabaseException(sb2.toString());
            }
            List list = (List) obj;
            ?? r0 = (T) new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r0.add(zza(it.next(), type2));
            }
            return r0;
        }
        if (!Map.class.isAssignableFrom(cls2)) {
            if (Collection.class.isAssignableFrom(cls2)) {
                throw new DatabaseException("Collections are not supported, please use Lists instead");
            }
            Map<String, Object> zzj = zzj(obj);
            zzku zza = zza(cls2);
            HashMap hashMap = new HashMap();
            cls = zza.zzuv;
            TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (actualTypeArguments.length != typeParameters.length) {
                throw new IllegalStateException("Mismatched lengths for type variables and actual types");
            }
            for (int i = 0; i < typeParameters.length; i++) {
                hashMap.put(typeParameters[i], actualTypeArguments[i]);
            }
            return (T) zza.zza(zzj, hashMap);
        }
        Type type3 = parameterizedType.getActualTypeArguments()[0];
        Type type4 = parameterizedType.getActualTypeArguments()[1];
        if (!type3.equals(String.class)) {
            String valueOf3 = String.valueOf(type3);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 70);
            sb3.append("Only Maps with string keys are supported, but found Map with key type ");
            sb3.append(valueOf3);
            throw new DatabaseException(sb3.toString());
        }
        Map<String, Object> zzj2 = zzj(obj);
        ?? r02 = (T) new HashMap();
        for (Map.Entry<String, Object> entry : zzj2.entrySet()) {
            r02.put(entry.getKey(), zza(entry.getValue(), type4));
        }
        return r02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> T zzb(Object obj, Class<T> cls) {
        if (obj == 0) {
            return null;
        }
        if (!cls.isPrimitive() && !Number.class.isAssignableFrom(cls) && !Boolean.class.isAssignableFrom(cls) && !Character.class.isAssignableFrom(cls)) {
            if (String.class.isAssignableFrom(cls)) {
                if (obj instanceof String) {
                    return (T) ((String) obj);
                }
                String name = obj.getClass().getName();
                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 42);
                sb.append("Failed to convert value of type ");
                sb.append(name);
                sb.append(" to String");
                throw new DatabaseException(sb.toString());
            }
            if (cls.isArray()) {
                throw new DatabaseException("Converting to Arrays is not supported, please use Listsinstead");
            }
            if (cls.getTypeParameters().length > 0) {
                String name2 = cls.getName();
                StringBuilder sb2 = new StringBuilder(String.valueOf(name2).length() + 75);
                sb2.append("Class ");
                sb2.append(name2);
                sb2.append(" has generic type parameters, please use GenericTypeIndicator instead");
                throw new DatabaseException(sb2.toString());
            }
            if (cls.equals(Object.class)) {
                return obj;
            }
            if (cls.isEnum()) {
                return (T) zzc(obj, cls);
            }
            zzku zza = zza(cls);
            if (obj instanceof Map) {
                return (T) zza.zza(zzj(obj), Collections.emptyMap());
            }
            String name3 = obj.getClass().getName();
            String name4 = cls.getName();
            StringBuilder sb3 = new StringBuilder(String.valueOf(name3).length() + 38 + String.valueOf(name4).length());
            sb3.append("Can't convert object of type ");
            sb3.append(name3);
            sb3.append(" to type ");
            sb3.append(name4);
            throw new DatabaseException(sb3.toString());
        }
        if (Integer.class.isAssignableFrom(cls) || Integer.TYPE.isAssignableFrom(cls)) {
            if (obj instanceof Integer) {
                return (T) ((Integer) obj);
            }
            if (!(obj instanceof Long) && !(obj instanceof Double)) {
                String name5 = obj.getClass().getName();
                StringBuilder sb4 = new StringBuilder(String.valueOf(name5).length() + 41);
                sb4.append("Failed to convert a value of type ");
                sb4.append(name5);
                sb4.append(" to int");
                throw new DatabaseException(sb4.toString());
            }
            Number number = (Number) obj;
            double doubleValue = number.doubleValue();
            if (doubleValue >= -2.147483648E9d && doubleValue <= 2.147483647E9d) {
                return (T) Integer.valueOf(number.intValue());
            }
            StringBuilder sb5 = new StringBuilder(124);
            sb5.append("Numeric value out of 32-bit integer range: ");
            sb5.append(doubleValue);
            sb5.append(". Did you mean to use a long or double instead of an int?");
            throw new DatabaseException(sb5.toString());
        }
        if (Boolean.class.isAssignableFrom(cls) || Boolean.TYPE.isAssignableFrom(cls)) {
            if (obj instanceof Boolean) {
                return (T) ((Boolean) obj);
            }
            String name6 = obj.getClass().getName();
            StringBuilder sb6 = new StringBuilder(String.valueOf(name6).length() + 43);
            sb6.append("Failed to convert value of type ");
            sb6.append(name6);
            sb6.append(" to boolean");
            throw new DatabaseException(sb6.toString());
        }
        if (Double.class.isAssignableFrom(cls) || Double.TYPE.isAssignableFrom(cls)) {
            return (T) zzk(obj);
        }
        if (!Long.class.isAssignableFrom(cls) && !Long.TYPE.isAssignableFrom(cls)) {
            if (Float.class.isAssignableFrom(cls) || Float.TYPE.isAssignableFrom(cls)) {
                return (T) Float.valueOf(zzk(obj).floatValue());
            }
            if (Short.class.isAssignableFrom(cls) || Short.TYPE.isAssignableFrom(cls)) {
                throw new DatabaseException("Deserializing to shorts is not supported");
            }
            if (Byte.class.isAssignableFrom(cls) || Byte.TYPE.isAssignableFrom(cls)) {
                throw new DatabaseException("Deserializing to bytes is not supported");
            }
            if (Character.class.isAssignableFrom(cls) || Character.TYPE.isAssignableFrom(cls)) {
                throw new DatabaseException("Deserializing to char is not supported");
            }
            String valueOf = String.valueOf(cls);
            StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb7.append("Unknown primitive type: ");
            sb7.append(valueOf);
            throw new IllegalArgumentException(sb7.toString());
        }
        if (obj instanceof Integer) {
            return (T) Long.valueOf(((Integer) obj).longValue());
        }
        if (obj instanceof Long) {
            return (T) ((Long) obj);
        }
        if (!(obj instanceof Double)) {
            String name7 = obj.getClass().getName();
            StringBuilder sb8 = new StringBuilder(String.valueOf(name7).length() + 42);
            sb8.append("Failed to convert a value of type ");
            sb8.append(name7);
            sb8.append(" to long");
            throw new DatabaseException(sb8.toString());
        }
        Double d = (Double) obj;
        if (d.doubleValue() >= -9.223372036854776E18d && d.doubleValue() <= 9.223372036854776E18d) {
            return (T) Long.valueOf(d.longValue());
        }
        String valueOf2 = String.valueOf(d);
        StringBuilder sb9 = new StringBuilder(String.valueOf(valueOf2).length() + 89);
        sb9.append("Numeric value out of 64-bit long range: ");
        sb9.append(valueOf2);
        sb9.append(". Did you mean to use a double instead of a long?");
        throw new DatabaseException(sb9.toString());
    }

    private static <T> T zzc(Object obj, Class<T> cls) {
        if (!(obj instanceof String)) {
            String valueOf = String.valueOf(cls);
            String valueOf2 = String.valueOf(obj.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
            sb.append("Expected a String while deserializing to enum ");
            sb.append(valueOf);
            sb.append(" but got a ");
            sb.append(valueOf2);
            throw new DatabaseException(sb.toString());
        }
        String str = (String) obj;
        try {
            return (T) Enum.valueOf(cls, str);
        } catch (IllegalArgumentException unused) {
            String name = cls.getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 42 + String.valueOf(str).length());
            sb2.append("Could not find enum value of ");
            sb2.append(name);
            sb2.append(" for value \"");
            sb2.append(str);
            sb2.append("\"");
            throw new DatabaseException(sb2.toString());
        }
    }

    public static Object zzh(Object obj) {
        return zzi(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static <T> Object zzi(T t) {
        if (t == 0) {
            return null;
        }
        if (t instanceof Number) {
            if ((t instanceof Float) || (t instanceof Double)) {
                Number number = (Number) t;
                double doubleValue = number.doubleValue();
                return (doubleValue > 9.223372036854776E18d || doubleValue < -9.223372036854776E18d || Math.floor(doubleValue) != doubleValue) ? Double.valueOf(doubleValue) : Long.valueOf(number.longValue());
            }
            if (t instanceof Short) {
                throw new DatabaseException("Shorts are not supported, please use int or long");
            }
            if (t instanceof Byte) {
                throw new DatabaseException("Bytes are not supported, please use int or long");
            }
            return t;
        }
        if ((t instanceof String) || (t instanceof Boolean)) {
            return t;
        }
        if (t instanceof Character) {
            throw new DatabaseException("Characters are not supported, please use Strings");
        }
        if (t instanceof Map) {
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : ((Map) t).entrySet()) {
                Object key = entry.getKey();
                if (!(key instanceof String)) {
                    throw new DatabaseException("Maps with non-string keys are not supported");
                }
                hashMap.put((String) key, zzi(entry.getValue()));
            }
            return hashMap;
        }
        if (!(t instanceof Collection)) {
            if (t.getClass().isArray()) {
                throw new DatabaseException("Serializing Arrays is not supported, please use Lists instead");
            }
            return t instanceof Enum ? ((Enum) t).name() : zza(t.getClass()).zzm(t);
        }
        if (!(t instanceof List)) {
            throw new DatabaseException("Serializing Collections is not supported, please use Lists instead");
        }
        List list = (List) t;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzi(it.next()));
        }
        return arrayList;
    }

    public static Map<String, Object> zzi(Map<String, Object> map) {
        Object zzi = zzi(map);
        zzkq.zzf(zzi instanceof Map);
        return (Map) zzi;
    }

    private static Map<String, Object> zzj(Object obj) {
        if (obj instanceof Map) {
            return (Map) obj;
        }
        String valueOf = String.valueOf(obj.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
        sb.append("Expected a Map while deserializing, but got a ");
        sb.append(valueOf);
        throw new DatabaseException(sb.toString());
    }

    private static Double zzk(Object obj) {
        if (obj instanceof Integer) {
            return Double.valueOf(((Integer) obj).doubleValue());
        }
        if (!(obj instanceof Long)) {
            if (obj instanceof Double) {
                return (Double) obj;
            }
            String name = obj.getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 44);
            sb.append("Failed to convert a value of type ");
            sb.append(name);
            sb.append(" to double");
            throw new DatabaseException(sb.toString());
        }
        Long l = (Long) obj;
        Double valueOf = Double.valueOf(l.doubleValue());
        if (valueOf.longValue() == l.longValue()) {
            return valueOf;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 97);
        sb2.append("Loss of precision while converting number to double: ");
        sb2.append(valueOf2);
        sb2.append(". Did you mean to use a 64-bit long instead?");
        throw new DatabaseException(sb2.toString());
    }
}
