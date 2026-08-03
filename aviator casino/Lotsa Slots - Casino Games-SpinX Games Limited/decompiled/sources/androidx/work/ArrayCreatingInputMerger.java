package androidx.work;

/* compiled from: ArrayCreatingInputMerger.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\u001e\u0010\f\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0002J\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0016¨\u0006\u0011"}, d2 = {"Landroidx/work/ArrayCreatingInputMerger;", "Landroidx/work/InputMerger;", "()V", "concatenateArrayAndNonArray", "", "array", "obj", "valueClass", "Ljava/lang/Class;", "concatenateArrays", "array1", "array2", "createArrayFor", "merge", "Landroidx/work/Data;", "inputs", "", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ArrayCreatingInputMerger extends androidx.work.InputMerger {
    @Override // androidx.work.InputMerger
    public androidx.work.Data merge(java.util.List<androidx.work.Data> inputs) {
        java.lang.Class<?> cls;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputs, "inputs");
        androidx.work.Data.Builder builder = new androidx.work.Data.Builder();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator<androidx.work.Data> it = inputs.iterator();
        while (it.hasNext()) {
            java.util.Map<java.lang.String, java.lang.Object> keyValueMap = it.next().getKeyValueMap();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keyValueMap, "input.keyValueMap");
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : keyValueMap.entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.Object value = entry.getValue();
                if (value == null || (cls = value.getClass()) == null) {
                    cls = java.lang.String.class;
                }
                java.lang.Object obj = hashMap.get(key);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "key");
                if (obj == null) {
                    if (!cls.isArray()) {
                        value = createArrayFor(value, cls);
                    }
                } else {
                    java.lang.Class<?> cls2 = obj.getClass();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(cls2, cls)) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "value");
                        value = concatenateArrays(obj, value);
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(cls2.getComponentType(), cls)) {
                        value = concatenateArrayAndNonArray(obj, value, cls);
                    } else {
                        throw new java.lang.IllegalArgumentException();
                    }
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "if (existingValue == nul…      }\n                }");
                hashMap.put(key, value);
            }
        }
        builder.putAll(hashMap);
        androidx.work.Data build = builder.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "output.build()");
        return build;
    }

    private final java.lang.Object concatenateArrays(java.lang.Object array1, java.lang.Object array2) {
        int length = java.lang.reflect.Array.getLength(array1);
        int length2 = java.lang.reflect.Array.getLength(array2);
        java.lang.Class<?> componentType = array1.getClass().getComponentType();
        kotlin.jvm.internal.Intrinsics.checkNotNull(componentType);
        java.lang.Object newArray = java.lang.reflect.Array.newInstance(componentType, length + length2);
        java.lang.System.arraycopy(array1, 0, newArray, 0, length);
        java.lang.System.arraycopy(array2, 0, newArray, length, length2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newArray, "newArray");
        return newArray;
    }

    private final java.lang.Object concatenateArrayAndNonArray(java.lang.Object array, java.lang.Object obj, java.lang.Class<?> valueClass) {
        int length = java.lang.reflect.Array.getLength(array);
        java.lang.Object newArray = java.lang.reflect.Array.newInstance(valueClass, length + 1);
        java.lang.System.arraycopy(array, 0, newArray, 0, length);
        java.lang.reflect.Array.set(newArray, length, obj);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newArray, "newArray");
        return newArray;
    }

    private final java.lang.Object createArrayFor(java.lang.Object obj, java.lang.Class<?> valueClass) {
        java.lang.Object newArray = java.lang.reflect.Array.newInstance(valueClass, 1);
        java.lang.reflect.Array.set(newArray, 0, obj);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newArray, "newArray");
        return newArray;
    }
}
