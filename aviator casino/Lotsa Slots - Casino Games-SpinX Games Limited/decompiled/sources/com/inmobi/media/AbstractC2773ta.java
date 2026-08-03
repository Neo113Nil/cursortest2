package com.inmobi.media;

/* renamed from: com.inmobi.media.ta, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2773ta {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5462a = 0;

    public static org.json.JSONObject a(java.lang.Object obj, java.lang.Class cls) {
        org.json.JSONObject jSONObject;
        try {
            cls.getSimpleName();
            java.lang.Class superclass = cls.getSuperclass();
            if (superclass == null || kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Object.class, superclass)) {
                jSONObject = null;
            } else {
                java.lang.Class superclass2 = cls.getSuperclass();
                superclass2.getSimpleName();
                kotlin.jvm.internal.Intrinsics.checkNotNull(superclass2);
                jSONObject = a(obj, superclass2);
            }
            if (jSONObject == null) {
                jSONObject = new org.json.JSONObject();
            }
            java.util.Iterator it = kotlin.jvm.internal.ArrayIteratorKt.iterator(cls.getDeclaredFields());
            while (it.hasNext()) {
                java.lang.reflect.Field field = (java.lang.reflect.Field) it.next();
                field.setAccessible(true);
                if (field.get(obj) == null) {
                    field.getName();
                } else {
                    java.lang.Class<?> type = field.getType();
                    if (!java.lang.reflect.Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(com.inmobi.media.E8.class)) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(type);
                        if (java.lang.reflect.Modifier.isStatic(cls.getModifiers()) || !kotlin.jvm.internal.Intrinsics.areEqual(cls.getEnclosingClass(), type)) {
                            java.lang.String name = field.getName();
                            java.lang.Class cls2 = java.lang.Integer.TYPE;
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(cls2, type) && !kotlin.jvm.internal.Intrinsics.areEqual(cls2, type) && !kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Integer.class, type)) {
                                java.lang.Class cls3 = java.lang.Boolean.TYPE;
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(cls3, type) && !kotlin.jvm.internal.Intrinsics.areEqual(cls3, type) && !kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Boolean.class, type)) {
                                    java.lang.Class cls4 = java.lang.Double.TYPE;
                                    if (!kotlin.jvm.internal.Intrinsics.areEqual(cls4, type) && !kotlin.jvm.internal.Intrinsics.areEqual(cls4, type) && !kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Double.class, type)) {
                                        java.lang.Class cls5 = java.lang.Float.TYPE;
                                        if (!kotlin.jvm.internal.Intrinsics.areEqual(cls5, type) && !kotlin.jvm.internal.Intrinsics.areEqual(cls5, type) && !kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Float.class, type)) {
                                            java.lang.Class cls6 = java.lang.Long.TYPE;
                                            if (!kotlin.jvm.internal.Intrinsics.areEqual(cls6, type) && !kotlin.jvm.internal.Intrinsics.areEqual(cls6, type) && !kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Long.class, type)) {
                                                java.lang.Class cls7 = java.lang.Byte.TYPE;
                                                if (!kotlin.jvm.internal.Intrinsics.areEqual(cls7, type) && !kotlin.jvm.internal.Intrinsics.areEqual(cls7, type) && !kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Byte.class, type)) {
                                                    if (!kotlin.jvm.internal.Intrinsics.areEqual(java.lang.String.class, type) && !kotlin.jvm.internal.Intrinsics.areEqual(org.json.JSONObject.class, type) && !kotlin.jvm.internal.Intrinsics.areEqual(org.json.JSONArray.class, type)) {
                                                        java.lang.Class cls8 = java.lang.Short.TYPE;
                                                        if (!kotlin.jvm.internal.Intrinsics.areEqual(cls8, type) && !kotlin.jvm.internal.Intrinsics.areEqual(cls8, type) && !kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Short.class, type)) {
                                                            if (java.util.Map.class.isAssignableFrom(type)) {
                                                                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                                                                java.lang.Object obj2 = field.get(obj);
                                                                if (obj2 != null) {
                                                                    java.util.Map map = (java.util.Map) obj2;
                                                                    for (java.lang.Object obj3 : map.keySet()) {
                                                                        java.lang.Object obj4 = map.get(obj3);
                                                                        if (obj4 != null) {
                                                                            if (!a(obj4.getClass())) {
                                                                                obj4 = a(obj4, obj4.getClass());
                                                                            }
                                                                            jSONObject2.put(java.lang.String.valueOf(obj3), obj4);
                                                                        }
                                                                    }
                                                                }
                                                                jSONObject.put(name, jSONObject2);
                                                            } else if (java.util.List.class.isAssignableFrom(type)) {
                                                                org.json.JSONArray jSONArray = new org.json.JSONArray();
                                                                java.lang.Object obj5 = field.get(obj);
                                                                if (obj5 != null) {
                                                                    for (java.lang.Object obj6 : (java.util.List) obj5) {
                                                                        if (obj6 != null) {
                                                                            java.lang.Object a2 = a(obj6.getClass()) ? obj6 : a(obj6, obj6.getClass());
                                                                            if (a2 == null) {
                                                                                java.util.Objects.toString(obj6.getClass());
                                                                            } else {
                                                                                jSONArray.put(a2);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                jSONObject.put(name, jSONArray);
                                                            } else if (type.isArray()) {
                                                                org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                                                                java.lang.Object obj7 = field.get(obj);
                                                                if (obj7 != null) {
                                                                    int length = java.lang.reflect.Array.getLength(obj7);
                                                                    for (int i = 0; i < length; i++) {
                                                                        java.lang.Object obj8 = java.lang.reflect.Array.get(obj7, i);
                                                                        if (obj8 != null) {
                                                                            java.lang.Object a3 = a(obj8.getClass()) ? obj8 : a(obj8, obj8.getClass());
                                                                            if (a3 == null) {
                                                                                java.util.Objects.toString(obj8.getClass());
                                                                            } else {
                                                                                jSONArray2.put(a3);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                jSONObject.put(name, jSONArray2);
                                                            } else {
                                                                java.lang.Object obj9 = field.get(obj);
                                                                if (obj9 != null) {
                                                                    jSONObject.put(name, a(obj9, obj9.getClass()));
                                                                } else {
                                                                    type.getSimpleName();
                                                                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                                                }
                                                            }
                                                        }
                                                        java.lang.Object obj10 = field.get(obj);
                                                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Short");
                                                        jSONObject.put(name, (java.lang.Short) obj10);
                                                    }
                                                    jSONObject.put(name, field.get(obj));
                                                }
                                                java.lang.Object obj11 = field.get(obj);
                                                kotlin.jvm.internal.Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type kotlin.Byte");
                                                jSONObject.put(name, (java.lang.Byte) obj11);
                                            }
                                            java.lang.Object obj12 = field.get(obj);
                                            kotlin.jvm.internal.Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.Long");
                                            jSONObject.put(name, ((java.lang.Long) obj12).longValue());
                                        }
                                        java.lang.Object obj13 = field.get(obj);
                                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type kotlin.Float");
                                        jSONObject.put(name, (java.lang.Float) obj13);
                                    }
                                    java.lang.Object obj14 = field.get(obj);
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type kotlin.Double");
                                    jSONObject.put(name, ((java.lang.Double) obj14).doubleValue());
                                }
                                java.lang.Object obj15 = field.get(obj);
                                kotlin.jvm.internal.Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                                jSONObject.put(name, ((java.lang.Boolean) obj15).booleanValue());
                            }
                            java.lang.Object obj16 = field.get(obj);
                            kotlin.jvm.internal.Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.Int");
                            jSONObject.put(name, ((java.lang.Integer) obj16).intValue());
                        }
                    }
                }
            }
            return jSONObject;
        } catch (java.lang.Exception e) {
            e.getMessage();
            return null;
        }
    }

    public static void b(java.lang.reflect.Field field, java.lang.Object obj, org.json.JSONObject jSONObject) {
        double d = jSONObject.getDouble(field.getName());
        try {
            if (field.getType() == java.lang.Double.TYPE) {
                field.getName();
                field.setDouble(obj, d);
            } else {
                field.getName();
                field.set(obj, java.lang.Double.valueOf(d));
            }
        } catch (java.lang.Exception e) {
            field.getName();
            e.getMessage();
        }
    }

    public static void c(java.lang.reflect.Field field, java.lang.Object obj, org.json.JSONObject jSONObject) {
        float f = (float) jSONObject.getDouble(field.getName());
        try {
            if (field.getType() == java.lang.Float.TYPE) {
                field.getName();
                field.setFloat(obj, f);
            } else {
                field.getName();
                field.set(obj, java.lang.Float.valueOf(f));
            }
        } catch (java.lang.Exception e) {
            field.getName();
            e.getMessage();
        }
    }

    public static void d(java.lang.reflect.Field field, java.lang.Object obj, org.json.JSONObject jSONObject) {
        int i = jSONObject.getInt(field.getName());
        try {
            if (field.getType() == java.lang.Integer.TYPE) {
                field.getName();
                field.setInt(obj, i);
            } else {
                field.getName();
                field.set(obj, java.lang.Integer.valueOf(i));
            }
        } catch (java.lang.Exception e) {
            field.getName();
            e.getMessage();
        }
    }

    public static void e(java.lang.reflect.Field field, java.lang.Object obj, org.json.JSONObject jSONObject) {
        long j = jSONObject.getLong(field.getName());
        try {
            if (field.getType() == java.lang.Long.TYPE) {
                field.getName();
                field.setLong(obj, j);
            } else {
                field.getName();
                field.set(obj, java.lang.Long.valueOf(j));
            }
        } catch (java.lang.Exception e) {
            field.getName();
            e.getMessage();
        }
    }

    public static void f(java.lang.reflect.Field field, java.lang.Object obj, org.json.JSONObject jSONObject) {
        short s = (short) jSONObject.getInt(field.getName());
        try {
            if (field.getType() == java.lang.Short.TYPE) {
                field.getName();
                field.setShort(obj, s);
            } else {
                field.getName();
                field.set(obj, java.lang.Short.valueOf(s));
            }
        } catch (java.lang.Exception e) {
            field.getName();
            e.getMessage();
        }
    }

    public static java.lang.Object a(org.json.JSONObject jSONObject, java.lang.Class cls, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.reflect.Constructor<?> constructor;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.util.List linkedList;
        cls.getSimpleName();
        java.util.Objects.toString(cls);
        java.util.Objects.toString(obj);
        if (obj2 == null) {
            try {
                java.lang.reflect.Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
                kotlin.jvm.internal.Intrinsics.checkNotNull(declaredConstructors);
                if (declaredConstructors.length == 0) {
                    obj2 = cls.newInstance();
                } else {
                    int length = declaredConstructors.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            constructor = null;
                            break;
                        }
                        constructor = declaredConstructors[i];
                        java.lang.Class<?>[] parameterTypes = constructor.getParameterTypes();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length == 0) {
                            break;
                        }
                        i++;
                    }
                    if (constructor == null) {
                        constructor = declaredConstructors[0];
                    }
                    constructor.setAccessible(true);
                    int length2 = constructor.getParameterTypes().length;
                    if (length2 == 0) {
                        obj2 = constructor.newInstance(new java.lang.Object[0]);
                    } else {
                        java.lang.Object[] objArr = new java.lang.Object[length2];
                        java.util.Iterator it = kotlin.jvm.internal.ArrayIteratorKt.iterator(constructor.getParameterTypes());
                        int i2 = 0;
                        while (it.hasNext()) {
                            java.lang.Class cls2 = (java.lang.Class) it.next();
                            int i3 = i2 + 1;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(cls2);
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Integer.TYPE, cls2) && !kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Long.TYPE, cls2)) {
                                if (kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Boolean.TYPE, cls2)) {
                                    obj3 = java.lang.Boolean.FALSE;
                                } else {
                                    if (!kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Double.TYPE, cls2) && !kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Float.TYPE, cls2)) {
                                        obj3 = null;
                                    }
                                    obj3 = java.lang.Double.valueOf(0.0d);
                                }
                                objArr[i2] = obj3;
                                i2 = i3;
                            }
                            obj3 = 0;
                            objArr[i2] = obj3;
                            i2 = i3;
                        }
                        obj2 = constructor.newInstance(java.util.Arrays.copyOf(objArr, length2));
                    }
                }
            } catch (java.lang.Exception e) {
                e.getMessage();
                java.util.Objects.toString(cls);
                return null;
            }
        }
        if (cls.getSuperclass() != null) {
            java.lang.Class superclass = cls.getSuperclass();
            superclass.getSimpleName();
            kotlin.jvm.internal.Intrinsics.checkNotNull(superclass);
            obj2 = a(jSONObject, superclass, obj, obj2);
        }
        java.util.Iterator it2 = kotlin.jvm.internal.ArrayIteratorKt.iterator(cls.getDeclaredFields());
        while (it2.hasNext()) {
            java.lang.reflect.Field field = (java.lang.reflect.Field) it2.next();
            field.setAccessible(true);
            java.lang.String name = field.getName();
            if (!kotlin.jvm.internal.Intrinsics.areEqual(name, "shadow$_klass_") && !java.lang.reflect.Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(com.inmobi.media.E8.class)) {
                if (jSONObject.has(name) && !jSONObject.isNull(name)) {
                    java.lang.Class<?> type = field.getType();
                    java.lang.Class cls3 = java.lang.Integer.TYPE;
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(cls3, type) && !kotlin.jvm.internal.Intrinsics.areEqual(cls3, type) && !kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Integer.class, type)) {
                        java.lang.Class cls4 = java.lang.Boolean.TYPE;
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(cls4, type) && !kotlin.jvm.internal.Intrinsics.areEqual(cls4, type) && !kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Boolean.class, type)) {
                            java.lang.Class cls5 = java.lang.Double.TYPE;
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(cls5, type) && !kotlin.jvm.internal.Intrinsics.areEqual(cls5, type) && !kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Double.class, type)) {
                                java.lang.Class cls6 = java.lang.Float.TYPE;
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(cls6, type) && !kotlin.jvm.internal.Intrinsics.areEqual(cls6, type) && !kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Float.class, type)) {
                                    java.lang.Class cls7 = java.lang.Long.TYPE;
                                    if (!kotlin.jvm.internal.Intrinsics.areEqual(cls7, type) && !kotlin.jvm.internal.Intrinsics.areEqual(cls7, type) && !kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Long.class, type)) {
                                        java.lang.Class cls8 = java.lang.Byte.TYPE;
                                        if (!kotlin.jvm.internal.Intrinsics.areEqual(cls8, type) && !kotlin.jvm.internal.Intrinsics.areEqual(cls8, type) && !kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Byte.class, type)) {
                                            if (kotlin.jvm.internal.Intrinsics.areEqual(java.lang.String.class, type)) {
                                                field.set(obj2, jSONObject.getString(name));
                                            } else {
                                                java.lang.Class cls9 = java.lang.Short.TYPE;
                                                if (!kotlin.jvm.internal.Intrinsics.areEqual(cls9, type) && !kotlin.jvm.internal.Intrinsics.areEqual(cls9, type) && !kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Short.class, type)) {
                                                    if (kotlin.jvm.internal.Intrinsics.areEqual(org.json.JSONObject.class, type)) {
                                                        kotlin.jvm.internal.Intrinsics.checkNotNull(field);
                                                        org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(field.getName());
                                                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "<this>");
                                                        if (jSONObject2 == null) {
                                                            jSONObject2 = jSONObject3;
                                                        }
                                                        field.set(obj2, jSONObject2);
                                                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(org.json.JSONArray.class, type)) {
                                                        field.set(obj2, jSONObject.getJSONArray(name));
                                                    } else if (java.util.Map.class.isAssignableFrom(type)) {
                                                        org.json.JSONObject jSONObject4 = jSONObject.getJSONObject(name);
                                                        java.util.Objects.toString(jSONObject4);
                                                        java.util.HashMap hashMap = new java.util.HashMap();
                                                        java.util.Iterator<java.lang.String> keys = jSONObject4.keys();
                                                        while (keys.hasNext()) {
                                                            java.lang.String next = keys.next();
                                                            kotlin.jvm.internal.Intrinsics.checkNotNull(jSONObject4);
                                                            kotlin.jvm.internal.Intrinsics.checkNotNull(next);
                                                            java.lang.reflect.Type genericType = field.getGenericType();
                                                            kotlin.jvm.internal.Intrinsics.checkNotNull(genericType, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                                                            java.lang.reflect.Type type2 = ((java.lang.reflect.ParameterizedType) genericType).getActualTypeArguments()[1];
                                                            kotlin.jvm.internal.Intrinsics.checkNotNull(type2, "null cannot be cast to non-null type java.lang.Class<*>");
                                                            java.lang.Class cls10 = (java.lang.Class) type2;
                                                            if (kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Integer.TYPE, cls10)) {
                                                                obj4 = java.lang.Integer.valueOf(jSONObject4.getInt(next));
                                                            } else if (kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Double.TYPE, cls10)) {
                                                                obj4 = java.lang.Double.valueOf(jSONObject4.getDouble(next));
                                                            } else if (kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Float.TYPE, cls10)) {
                                                                obj4 = java.lang.Float.valueOf((float) jSONObject4.getDouble(next));
                                                            } else if (kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Long.TYPE, cls10)) {
                                                                obj4 = java.lang.Long.valueOf(jSONObject4.getLong(next));
                                                            } else if (kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Byte.TYPE, cls10)) {
                                                                obj4 = java.lang.Byte.valueOf((byte) jSONObject4.getInt(next));
                                                            } else if (kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Short.TYPE, cls10)) {
                                                                obj4 = java.lang.Short.valueOf((short) jSONObject4.getInt(next));
                                                            } else {
                                                                obj4 = jSONObject4.get(next);
                                                            }
                                                            kotlin.jvm.internal.Intrinsics.checkNotNull(obj4);
                                                            if (obj4 == null || !a(obj4.getClass())) {
                                                                org.json.JSONObject jSONObject5 = jSONObject4.getJSONObject(next);
                                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject5, "getJSONObject(...)");
                                                                java.lang.reflect.Type genericType2 = field.getGenericType();
                                                                kotlin.jvm.internal.Intrinsics.checkNotNull(genericType2, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                                                                java.lang.reflect.Type type3 = ((java.lang.reflect.ParameterizedType) genericType2).getActualTypeArguments()[1];
                                                                kotlin.jvm.internal.Intrinsics.checkNotNull(type3, "null cannot be cast to non-null type java.lang.Class<*>");
                                                                obj4 = a(jSONObject5, (java.lang.Class) type3, null, null);
                                                            }
                                                            if (obj4 != null) {
                                                                hashMap.put(next, obj4);
                                                            }
                                                        }
                                                        field.set(obj2, hashMap);
                                                    } else if (java.util.List.class.isAssignableFrom(type)) {
                                                        org.json.JSONArray jSONArray = jSONObject.getJSONArray(name);
                                                        kotlin.jvm.internal.Intrinsics.checkNotNull(field);
                                                        if (!kotlin.jvm.internal.Intrinsics.areEqual(field.getType(), java.util.LinkedList.class) && !kotlin.jvm.internal.Intrinsics.areEqual(field.getType(), java.util.LinkedList.class)) {
                                                            linkedList = new java.util.ArrayList();
                                                        } else {
                                                            linkedList = new java.util.LinkedList();
                                                        }
                                                        int length3 = jSONArray.length();
                                                        for (int i4 = 0; i4 < length3; i4++) {
                                                            kotlin.jvm.internal.Intrinsics.checkNotNull(jSONArray);
                                                            java.lang.reflect.Type genericType3 = field.getGenericType();
                                                            kotlin.jvm.internal.Intrinsics.checkNotNull(genericType3, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                                                            java.lang.reflect.Type type4 = ((java.lang.reflect.ParameterizedType) genericType3).getActualTypeArguments()[0];
                                                            kotlin.jvm.internal.Intrinsics.checkNotNull(type4, "null cannot be cast to non-null type java.lang.Class<*>");
                                                            java.lang.Object a2 = a(jSONArray, i4, (java.lang.Class) type4);
                                                            if (a2 == null || !a(a2.getClass())) {
                                                                org.json.JSONObject jSONObject6 = jSONArray.getJSONObject(i4);
                                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject6, "getJSONObject(...)");
                                                                java.lang.reflect.Type genericType4 = field.getGenericType();
                                                                kotlin.jvm.internal.Intrinsics.checkNotNull(genericType4, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                                                                java.lang.reflect.Type type5 = ((java.lang.reflect.ParameterizedType) genericType4).getActualTypeArguments()[0];
                                                                kotlin.jvm.internal.Intrinsics.checkNotNull(type5, "null cannot be cast to non-null type java.lang.Class<*>");
                                                                a2 = a(jSONObject6, (java.lang.Class) type5, null, null);
                                                            }
                                                            if (a2 != null) {
                                                                linkedList.add(a2);
                                                            }
                                                        }
                                                        field.set(obj2, linkedList);
                                                    } else if (type.isArray()) {
                                                        org.json.JSONArray jSONArray2 = jSONObject.getJSONArray(name);
                                                        java.lang.Class<?> componentType = type.getComponentType();
                                                        int length4 = jSONArray2.length();
                                                        java.lang.Object newInstance = java.lang.reflect.Array.newInstance(componentType, length4);
                                                        for (int i5 = 0; i5 < length4; i5++) {
                                                            kotlin.jvm.internal.Intrinsics.checkNotNull(jSONArray2);
                                                            kotlin.jvm.internal.Intrinsics.checkNotNull(componentType);
                                                            java.lang.Object a3 = a(jSONArray2, i5, componentType);
                                                            if (a3 == null || !a(a3.getClass())) {
                                                                org.json.JSONObject jSONObject7 = jSONArray2.getJSONObject(i5);
                                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject7, "getJSONObject(...)");
                                                                a3 = a(jSONObject7, componentType, null, null);
                                                            }
                                                            if (a3 != null) {
                                                                java.lang.reflect.Array.set(newInstance, i5, a3);
                                                            }
                                                        }
                                                        field.set(obj2, newInstance);
                                                    } else {
                                                        org.json.JSONObject jSONObject8 = jSONObject.getJSONObject(name);
                                                        java.util.Objects.toString(obj2);
                                                        kotlin.jvm.internal.Intrinsics.checkNotNull(jSONObject8);
                                                        kotlin.jvm.internal.Intrinsics.checkNotNull(type);
                                                        field.set(obj2, a(jSONObject8, type, obj2, null));
                                                    }
                                                } else {
                                                    kotlin.jvm.internal.Intrinsics.checkNotNull(field);
                                                    f(field, obj2, jSONObject);
                                                }
                                            }
                                        } else {
                                            kotlin.jvm.internal.Intrinsics.checkNotNull(field);
                                            a(field, obj2, jSONObject);
                                        }
                                    } else {
                                        kotlin.jvm.internal.Intrinsics.checkNotNull(field);
                                        e(field, obj2, jSONObject);
                                    }
                                } else {
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(field);
                                    c(field, obj2, jSONObject);
                                }
                            } else {
                                kotlin.jvm.internal.Intrinsics.checkNotNull(field);
                                b(field, obj2, jSONObject);
                            }
                        } else {
                            kotlin.jvm.internal.Intrinsics.checkNotNull(field);
                            a(field, obj2, a(jSONObject, field));
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(field);
                        d(field, obj2, jSONObject);
                    }
                } else if (field.isAnnotationPresent(com.inmobi.media.InterfaceC2330cf.class)) {
                    throw new org.json.JSONException("NonNullable field " + name + " is not present or null in the JSONObject");
                }
            }
        }
        return obj2;
    }

    public static java.lang.Boolean a(org.json.JSONObject jSONObject, java.lang.reflect.Field field) {
        boolean z;
        java.lang.String name = field.getName();
        try {
            z = jSONObject.getBoolean(name);
        } catch (org.json.JSONException unused) {
            z = jSONObject.getInt(name) != 0 && jSONObject.getInt(name) == 1;
        }
        return java.lang.Boolean.valueOf(z);
    }

    public static void a(java.lang.reflect.Field field, java.lang.Object obj, java.lang.Boolean bool) {
        try {
            if (field.getType() == java.lang.Boolean.TYPE) {
                field.setBoolean(obj, bool.booleanValue());
            } else {
                field.set(obj, bool);
            }
        } catch (java.lang.Exception unused) {
            field.getName();
        }
    }

    public static void a(java.lang.reflect.Field field, java.lang.Object obj, org.json.JSONObject jSONObject) {
        byte b = (byte) jSONObject.getInt(field.getName());
        try {
            if (field.getType() == java.lang.Byte.TYPE) {
                field.getName();
                field.setByte(obj, b);
            } else {
                field.getName();
                field.set(obj, java.lang.Byte.valueOf(b));
            }
        } catch (java.lang.Exception e) {
            field.getName();
            e.getMessage();
        }
    }

    public static boolean a(java.lang.Class cls) {
        java.lang.Class cls2 = java.lang.Integer.TYPE;
        if (kotlin.jvm.internal.Intrinsics.areEqual(cls2, cls) || kotlin.jvm.internal.Intrinsics.areEqual(cls2, cls) || kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Integer.class, cls)) {
            return true;
        }
        java.lang.Class cls3 = java.lang.Boolean.TYPE;
        if (kotlin.jvm.internal.Intrinsics.areEqual(cls3, cls) || kotlin.jvm.internal.Intrinsics.areEqual(cls3, cls) || kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Boolean.class, cls)) {
            return true;
        }
        java.lang.Class cls4 = java.lang.Double.TYPE;
        if (kotlin.jvm.internal.Intrinsics.areEqual(cls4, cls) || kotlin.jvm.internal.Intrinsics.areEqual(cls4, cls) || kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Double.class, cls)) {
            return true;
        }
        java.lang.Class cls5 = java.lang.Float.TYPE;
        if (kotlin.jvm.internal.Intrinsics.areEqual(cls5, cls) || kotlin.jvm.internal.Intrinsics.areEqual(cls5, cls) || kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Float.class, cls)) {
            return true;
        }
        java.lang.Class cls6 = java.lang.Long.TYPE;
        if (kotlin.jvm.internal.Intrinsics.areEqual(cls6, cls) || kotlin.jvm.internal.Intrinsics.areEqual(cls6, cls) || kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Long.class, cls) || kotlin.jvm.internal.Intrinsics.areEqual(java.lang.String.class, cls)) {
            return true;
        }
        java.lang.Class cls7 = java.lang.Byte.TYPE;
        if (kotlin.jvm.internal.Intrinsics.areEqual(cls7, cls) || kotlin.jvm.internal.Intrinsics.areEqual(cls7, cls) || kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Byte.class, cls)) {
            return true;
        }
        java.lang.Class cls8 = java.lang.Short.TYPE;
        return kotlin.jvm.internal.Intrinsics.areEqual(cls8, cls) || kotlin.jvm.internal.Intrinsics.areEqual(cls8, cls) || kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Short.class, cls);
    }

    public static java.lang.Object a(org.json.JSONArray jSONArray, int i, java.lang.Class cls) {
        java.lang.Object obj;
        if (kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Integer.TYPE, cls)) {
            obj = java.lang.Integer.valueOf(jSONArray.getInt(i));
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Double.TYPE, cls)) {
            obj = java.lang.Double.valueOf(jSONArray.getDouble(i));
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Float.TYPE, cls)) {
            obj = java.lang.Float.valueOf((float) jSONArray.getDouble(i));
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Long.TYPE, cls)) {
            obj = java.lang.Long.valueOf(jSONArray.getLong(i));
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Byte.TYPE, cls)) {
            obj = java.lang.Byte.valueOf((byte) jSONArray.getInt(i));
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Short.TYPE, cls)) {
            obj = java.lang.Short.valueOf((short) jSONArray.getInt(i));
        } else {
            obj = jSONArray.get(i);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
        return obj;
    }
}
