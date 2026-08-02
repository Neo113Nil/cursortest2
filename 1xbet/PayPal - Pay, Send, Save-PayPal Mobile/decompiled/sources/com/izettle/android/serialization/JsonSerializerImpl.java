package com.izettle.android.serialization;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/izettle/android/serialization/JsonSerializerImpl;", "Lcom/izettle/android/serialization/JsonSerializer;", "<init>", "()V", "", "obj", "Lcom/izettle/android/serialization/JsonElement;", "serializeToJson", "(Ljava/lang/Object;)Lcom/izettle/android/serialization/JsonElement;", "", "serializeToString", "(Ljava/lang/Object;)Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class JsonSerializerImpl implements com.izettle.android.serialization.JsonSerializer {
    @Override // com.izettle.android.serialization.JsonSerializer
    public final com.izettle.android.serialization.JsonElement serializeToJson(java.lang.Object obj) {
        java.lang.Class<?> cls;
        if (obj == null || (cls = obj.getClass()) == null) {
            return new com.izettle.android.serialization.JsonNull();
        }
        if (obj instanceof java.lang.Class) {
            java.lang.String name2 = ((java.lang.Class) obj).getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
            return new com.izettle.android.serialization.JsonPrimitive(name2);
        }
        if (obj instanceof kotlin.reflect.KClass) {
            java.lang.String name3 = kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) obj).getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name3, "");
            return new com.izettle.android.serialization.JsonPrimitive(name3);
        }
        if (com.izettle.android.serialization.ExtensionsKt.isBigDecimal(cls)) {
            return new com.izettle.android.serialization.JsonPrimitive((java.math.BigDecimal) obj);
        }
        if (cls.isEnum()) {
            return new com.izettle.android.serialization.JsonPrimitive(((java.lang.Enum) obj).name());
        }
        if (com.izettle.android.serialization.ExtensionsKt.isBoolean(cls)) {
            return new com.izettle.android.serialization.JsonPrimitive(((java.lang.Boolean) obj).booleanValue());
        }
        if (com.izettle.android.serialization.ExtensionsKt.isInt(cls)) {
            return new com.izettle.android.serialization.JsonPrimitive(((java.lang.Integer) obj).intValue());
        }
        if (com.izettle.android.serialization.ExtensionsKt.isLong(cls)) {
            return new com.izettle.android.serialization.JsonPrimitive(((java.lang.Long) obj).longValue());
        }
        if (com.izettle.android.serialization.ExtensionsKt.isShort(cls)) {
            return new com.izettle.android.serialization.JsonPrimitive(((java.lang.Short) obj).shortValue());
        }
        if (com.izettle.android.serialization.ExtensionsKt.isFloat(cls)) {
            return new com.izettle.android.serialization.JsonPrimitive(((java.lang.Float) obj).floatValue());
        }
        if (com.izettle.android.serialization.ExtensionsKt.isDouble(cls)) {
            return new com.izettle.android.serialization.JsonPrimitive(((java.lang.Double) obj).doubleValue());
        }
        if (com.izettle.android.serialization.ExtensionsKt.isString(cls)) {
            return new com.izettle.android.serialization.JsonPrimitive((java.lang.String) obj);
        }
        if (com.izettle.android.serialization.ExtensionsKt.isIterable(cls)) {
            com.izettle.android.serialization.JsonArray jsonArray = new com.izettle.android.serialization.JsonArray();
            java.util.Iterator it = ((java.lang.Iterable) obj).iterator();
            while (it.hasNext()) {
                jsonArray.push(serializeToJson(it.next()));
            }
            return jsonArray;
        }
        if (cls.isArray()) {
            com.izettle.android.serialization.JsonArray jsonArray2 = new com.izettle.android.serialization.JsonArray();
            for (java.lang.Object obj2 : (java.lang.Object[]) obj) {
                jsonArray2.push(serializeToJson(obj2));
            }
            return jsonArray2;
        }
        if (com.izettle.android.serialization.ExtensionsKt.isMap(cls)) {
            com.izettle.android.serialization.JsonObject jsonObject = new com.izettle.android.serialization.JsonObject();
            for (java.util.Map.Entry entry : ((java.util.Map) obj).entrySet()) {
                jsonObject.put(java.lang.String.valueOf(entry.getKey()), serializeToJson(entry.getValue()));
            }
            return jsonObject;
        }
        com.izettle.android.serialization.JsonObject jsonObject2 = new com.izettle.android.serialization.JsonObject();
        java.lang.reflect.Field[] allFields = com.izettle.android.serialization.ExtensionsKt.getAllFields(cls);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.reflect.Field field : allFields) {
            if (field.isAnnotationPresent(com.izettle.android.serialization.annotations.JsonSerialize.class)) {
                arrayList.add(field);
            }
        }
        java.util.ArrayList<java.lang.reflect.Field> arrayList2 = arrayList;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
        for (java.lang.reflect.Field field2 : arrayList2) {
            kotlin.Pair pair = kotlin.TuplesKt.to(field2, field2.getAnnotation(com.izettle.android.serialization.annotations.JsonSerialize.class));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        java.lang.reflect.Method[] allMethods = com.izettle.android.serialization.ExtensionsKt.getAllMethods(cls);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.reflect.Method method : allMethods) {
            if (method.isAnnotationPresent(com.izettle.android.serialization.annotations.JsonSerialize.class)) {
                arrayList3.add(method);
            }
        }
        java.util.ArrayList<java.lang.reflect.Method> arrayList4 = arrayList3;
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList4, 10)), 16));
        for (java.lang.reflect.Method method2 : arrayList4) {
            java.lang.String name4 = method2.getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name4, "");
            kotlin.Pair pair2 = kotlin.TuplesKt.to(com.izettle.android.serialization.ExtensionsKt.findField(cls, (java.lang.String) kotlin.text.StringsKt.split$default((java.lang.CharSequence) name4, new java.lang.String[]{"$annotations"}, false, 0, 6, (java.lang.Object) null).get(0)), method2.getAnnotation(com.izettle.android.serialization.annotations.JsonSerialize.class));
            linkedHashMap2.put(pair2.getFirst(), pair2.getSecond());
        }
        for (java.util.Map.Entry entry2 : kotlin.collections.MapsKt.plus(linkedHashMap, linkedHashMap2).entrySet()) {
            java.lang.reflect.Field field3 = (java.lang.reflect.Field) entry2.getKey();
            com.izettle.android.serialization.annotations.JsonSerialize jsonSerialize = (com.izettle.android.serialization.annotations.JsonSerialize) entry2.getValue();
            if (field3 != null) {
                boolean isAccessible = field3.isAccessible();
                field3.setAccessible(true);
                jsonObject2.put(jsonSerialize.value(), serializeToJson(field3.get(obj)));
                field3.setAccessible(isAccessible);
            }
        }
        return jsonObject2;
    }

    @Override // com.izettle.android.serialization.JsonSerializer
    public final java.lang.String serializeToString(java.lang.Object obj) {
        return serializeToJson(obj).toString();
    }
}
