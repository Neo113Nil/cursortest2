package com.startapp.json.internal;

import com.startapp.json.JsonException;
import com.startapp.json.TypeClassInfo;
import com.startapp.json.TypeInfo;
import com.startapp.json.TypeParser;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<String, Class<?>> f2874a;

    static {
        HashMap hashMap = new HashMap();
        f2874a = hashMap;
        hashMap.put("int[]", Integer.class);
        hashMap.put("long[]", Long.class);
        hashMap.put("double[]", Double.class);
        hashMap.put("float[]", Float.class);
        hashMap.put("bool[]", Boolean.class);
        hashMap.put("char[]", Character.class);
        hashMap.put("byte[]", Byte.class);
        hashMap.put("void[]", Void.class);
        hashMap.put("short[]", Short.class);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:22|23|(2:25|(10:27|28|(1:30)(6:(1:41)(1:(1:43)(1:(2:67|(1:69)(2:70|(1:72)(2:73|(1:75)(8:76|77|78|(3:80|81|38)|34|35|37|38))))(3:49|(1:51)(2:53|(1:55)(2:56|(1:58)(2:59|(4:61|(2:64|62)|65|66))))|52)))|33|34|35|37|38)|31|32|33|34|35|37|38))|82|28|(0)(0)|31|32|33|34|35|37|38) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0128 A[Catch: Exception -> 0x00c9, all -> 0x0254, TryCatch #1 {all -> 0x0254, blocks: (B:20:0x00d0, B:22:0x00d6, B:25:0x00e2, B:27:0x00f4, B:28:0x011e, B:30:0x0128, B:31:0x0158, B:32:0x0179, B:35:0x0250, B:41:0x015f, B:43:0x0174, B:45:0x0182, B:47:0x018a, B:49:0x0192, B:51:0x019a, B:52:0x01a6, B:53:0x01ab, B:55:0x01b3, B:56:0x01bc, B:58:0x01c4, B:59:0x01cd, B:61:0x01d5, B:62:0x01df, B:64:0x01e5, B:66:0x01f3, B:67:0x01f8, B:69:0x0202, B:70:0x0211, B:72:0x021b, B:73:0x0229, B:75:0x0233, B:76:0x0239, B:78:0x0246, B:80:0x024c), top: B:19:0x00d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015d  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> T a(Class<T> cls, JSONObject jSONObject) {
        T newInstance;
        boolean z3;
        boolean z4;
        Class<? extends TypeParser> cls2;
        Class<?> cls3;
        Class<?> cls4;
        Class<?> cls5;
        Class<?> cls6;
        Object a3;
        Object b3;
        Class<?> type;
        try {
            TypeClassInfo typeClassInfo = (TypeClassInfo) cls.getAnnotation(TypeClassInfo.class);
            boolean z5 = true;
            ?? r7 = 0;
            if (cls.equals(HttpCookie.class)) {
                Constructor<?> constructor = cls.getDeclaredConstructors()[0];
                constructor.setAccessible(true);
                newInstance = (T) constructor.newInstance("name", "value");
            } else {
                if (cls.isPrimitive()) {
                    return cls.newInstance();
                }
                if (cls.getAnnotation(TypeClassInfo.class) != null && !typeClassInfo.extendsClass()) {
                    if (!typeClassInfo.extendsClass()) {
                        try {
                            String string = jSONObject.getString(typeClassInfo.decider());
                            return (T) a(Class.forName(typeClassInfo.packageName() + "." + string), jSONObject);
                        } catch (ClassNotFoundException e3) {
                            throw new JsonException(e3);
                        } catch (JSONException e4) {
                            throw new JsonException(e4);
                        }
                    }
                    newInstance = null;
                }
                Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                newInstance = declaredConstructor.newInstance(new Object[0]);
            }
            Field[] declaredFields = cls.getDeclaredFields();
            if (typeClassInfo != null && typeClassInfo.extendsClass()) {
                int length = declaredFields.length;
                Field[] declaredFields2 = cls.getSuperclass().getDeclaredFields();
                int length2 = declaredFields2.length;
                Field[] fieldArr = new Field[length + length2];
                System.arraycopy(declaredFields, 0, fieldArr, 0, length);
                System.arraycopy(declaredFields2, 0, fieldArr, length, length2);
                declaredFields = fieldArr;
            }
            int length3 = declaredFields.length;
            int i3 = 0;
            while (i3 < length3) {
                Field field = declaredFields[i3];
                int modifiers = field.getModifiers();
                if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers)) {
                    String a4 = a(field);
                    try {
                        try {
                        } finally {
                            JsonException jsonException = new JsonException(th);
                        }
                    } catch (Exception unused) {
                    }
                    if (jSONObject.has(a4)) {
                        field.setAccessible(z5);
                        if (field.getDeclaredAnnotations().length > 0) {
                            Annotation annotation = field.getDeclaredAnnotations()[r7];
                            if (annotation.annotationType().equals(TypeInfo.class)) {
                                TypeInfo typeInfo = (TypeInfo) annotation;
                                cls5 = typeInfo.type();
                                cls6 = typeInfo.key();
                                Class<?> value = typeInfo.value();
                                z3 = typeInfo.complex();
                                Class<?> innerValue = typeInfo.innerValue();
                                cls2 = typeInfo.parser();
                                z4 = z5;
                                cls3 = value;
                                cls4 = innerValue;
                                if (field.getType().getAnnotation(TypeClassInfo.class) == null) {
                                    TypeClassInfo typeClassInfo2 = (TypeClassInfo) field.getType().getAnnotation(TypeClassInfo.class);
                                    String string2 = jSONObject.getJSONObject(a4).getString(typeClassInfo2.decider());
                                    type = Class.forName(typeClassInfo2.packageName() + "." + string2);
                                } else {
                                    if (cls2 != TypeParser.class) {
                                        a3 = cls2.newInstance().parse(field.getType(), jSONObject.opt(a4));
                                    } else if (z3) {
                                        type = field.getType();
                                    } else if (z4 && (Map.class.isAssignableFrom(cls5) || Collection.class.isAssignableFrom(cls5))) {
                                        if (cls5.equals(HashMap.class)) {
                                            JSONObject jSONObject2 = jSONObject.getJSONObject(a4);
                                            b3 = a(cls6, cls3, cls4, jSONObject2, jSONObject2.keys());
                                        } else if (cls5.equals(ArrayList.class)) {
                                            b3 = a(cls3, jSONObject.getJSONArray(a4));
                                        } else if (cls5.equals(HashSet.class)) {
                                            b3 = b(cls3, jSONObject.getJSONArray(a4));
                                        } else if (cls5.equals(EnumSet.class)) {
                                            JSONArray jSONArray = jSONObject.getJSONArray(a4);
                                            HashSet hashSet = new HashSet();
                                            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                                                hashSet.add(Enum.valueOf(cls3, jSONArray.getString(i4)));
                                            }
                                            field.set(newInstance, hashSet);
                                        }
                                        field.set(newInstance, b3);
                                    } else if (field.getType().isEnum()) {
                                        field.set(newInstance, Enum.valueOf(cls5, (String) jSONObject.get(a4)));
                                    } else if (field.getType().isPrimitive()) {
                                        a3 = a(jSONObject, field, jSONObject.get(a4), field.getType());
                                    } else if (field.getType().isArray()) {
                                        a3 = a(jSONObject, cls5, field);
                                    } else {
                                        a3 = a(jSONObject.get(a4), field.getType());
                                        if (a3.equals(null)) {
                                            field.set(newInstance, null);
                                            i3++;
                                            z5 = true;
                                            r7 = 0;
                                        }
                                        field.set(newInstance, a3);
                                        i3++;
                                        z5 = true;
                                        r7 = 0;
                                    }
                                    field.set(newInstance, a3);
                                    i3++;
                                    z5 = true;
                                    r7 = 0;
                                }
                                a3 = a(type, jSONObject.getJSONObject(a4));
                                field.set(newInstance, a3);
                                i3++;
                                z5 = true;
                                r7 = 0;
                            }
                        }
                        z3 = r7;
                        z4 = z3;
                        cls2 = TypeParser.class;
                        cls3 = null;
                        cls4 = null;
                        cls5 = null;
                        cls6 = null;
                        if (field.getType().getAnnotation(TypeClassInfo.class) == null) {
                        }
                        a3 = a(type, jSONObject.getJSONObject(a4));
                        field.set(newInstance, a3);
                        i3++;
                        z5 = true;
                        r7 = 0;
                    }
                }
                i3++;
                z5 = true;
                r7 = 0;
            }
            return newInstance;
        } catch (Exception e5) {
            throw new JsonException(e5);
        }
    }

    public static <V> Set<V> b(Class<V> cls, JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i3);
            hashSet.add(optJSONObject == null ? jSONArray.get(i3) : a(cls, optJSONObject));
        }
        return hashSet;
    }

    public static boolean b(Field field) {
        Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
        if (declaredAnnotations == null || declaredAnnotations.length == 0) {
            return false;
        }
        Annotation annotation = field.getDeclaredAnnotations()[0];
        if (annotation.annotationType().equals(TypeInfo.class)) {
            return ((TypeInfo) annotation).complex();
        }
        return false;
    }

    public static Object a(Object obj, Class<?> cls) {
        return obj.getClass().equals(cls) ? obj : cls.equals(Integer.class) ? obj.getClass().equals(Double.class) ? Integer.valueOf(((Double) obj).intValue()) : obj.getClass().equals(Long.class) ? Integer.valueOf(((Long) obj).intValue()) : obj : (cls.equals(Long.class) && obj.getClass().equals(Integer.class)) ? Long.valueOf(((Integer) obj).longValue()) : obj;
    }

    public static Object a(JSONObject jSONObject, Field field, Object obj, Class<?> cls) {
        if (!obj.getClass().equals(cls)) {
            boolean equals = obj.getClass().equals(String.class);
            Class cls2 = Integer.TYPE;
            if (equals) {
                if (cls.equals(cls2)) {
                    return Integer.valueOf(jSONObject.getInt(a(field)));
                }
            } else {
                if (cls.equals(cls2)) {
                    return Integer.valueOf(((Number) obj).intValue());
                }
                if (cls.equals(Float.TYPE)) {
                    return Float.valueOf(((Number) obj).floatValue());
                }
                if (cls.equals(Long.TYPE)) {
                    return Long.valueOf(((Number) obj).longValue());
                }
                if (cls.equals(Double.TYPE)) {
                    return Double.valueOf(((Number) obj).doubleValue());
                }
            }
        }
        return obj;
    }

    public static String a(Field field) {
        Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
        if (declaredAnnotations != null && declaredAnnotations.length > 0) {
            Annotation annotation = field.getDeclaredAnnotations()[0];
            if (annotation.annotationType().equals(TypeInfo.class)) {
                TypeInfo typeInfo = (TypeInfo) annotation;
                if (!"".equals(typeInfo.name())) {
                    return typeInfo.name();
                }
            }
        }
        return field.getName();
    }

    public static <V> List<V> a(Class<V> cls, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i3);
            arrayList.add(optJSONObject == null ? jSONArray.get(i3) : a(cls, optJSONObject));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Class<?>>] */
    public static <T> Object a(JSONObject jSONObject, Class<T> cls, Field field) {
        if (cls != null) {
            JSONArray jSONArray = jSONObject.getJSONArray(a(field));
            int length = jSONArray.length();
            Object newInstance = Array.newInstance((Class<?>) cls, length);
            for (int i3 = 0; i3 < length; i3++) {
                Array.set(newInstance, i3, a(cls, jSONArray.getJSONObject(i3)));
            }
            return (Object[]) newInstance;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray(a(field));
        int length2 = jSONArray2.length();
        Class cls2 = (Class) f2874a.get(field.getType().getSimpleName());
        Object newInstance2 = Array.newInstance((Class<?>) cls2.getField("TYPE").get(null), length2);
        for (int i4 = 0; i4 < length2; i4++) {
            String string = jSONArray2.getString(i4);
            Constructor<T> constructor = cls2.getConstructor(cls2.equals(Character.class) ? Character.TYPE : String.class);
            Array.set(newInstance2, i4, cls2.equals(Character.class) ? constructor.newInstance(Character.valueOf(string.charAt(0))) : constructor.newInstance(string));
        }
        return newInstance2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Map a(Class cls, Class cls2, Class cls3, JSONObject jSONObject, Iterator it) {
        Object a3;
        HashMap hashMap = new HashMap();
        while (it.hasNext()) {
            Object next = it.next();
            Object cast = cls.equals(Integer.class) ? cls.cast(Integer.valueOf(Integer.parseInt((String) next))) : next;
            if (cls.isEnum()) {
                cast = Enum.valueOf(cls, cast.toString());
            }
            String str = (String) next;
            JSONObject optJSONObject = jSONObject.optJSONObject(str);
            if (optJSONObject == null) {
                JSONArray optJSONArray = jSONObject.optJSONArray(str);
                if (optJSONArray == null) {
                    a3 = cls2.isEnum() ? Enum.valueOf(cls2, (String) jSONObject.get(str)) : jSONObject.get(str);
                } else {
                    a3 = a(cls3, optJSONArray);
                }
            } else {
                a3 = a((Class<Object>) cls2, optJSONObject);
            }
            hashMap.put(cast, a3);
        }
        return hashMap;
    }
}
