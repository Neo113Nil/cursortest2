package androidx.work;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/work/ArrayCreatingInputMerger;", "Landroidx/work/InputMerger;", "<init>", "()V", "", "Landroidx/work/Data;", "inputs", "merge", "(Ljava/util/List;)Landroidx/work/Data;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ArrayCreatingInputMerger extends androidx.work.InputMerger {
    @Override // androidx.work.InputMerger
    public final androidx.work.Data merge(java.util.List<androidx.work.Data> inputs) {
        java.lang.Class<?> cls;
        java.lang.Object newInstance;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputs, "");
        androidx.work.Data.Builder builder = new androidx.work.Data.Builder();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator<androidx.work.Data> it = inputs.iterator();
        while (it.hasNext()) {
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : it.next().getKeyValueMap().entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.Object value = entry.getValue();
                if (value == null || (cls = value.getClass()) == null) {
                    cls = java.lang.String.class;
                }
                java.lang.Object obj = hashMap.get(key);
                if (obj == null) {
                    if (cls.isArray()) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(value, "");
                    } else {
                        newInstance = java.lang.reflect.Array.newInstance(cls, 1);
                        java.lang.reflect.Array.set(newInstance, 0, value);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(newInstance);
                        value = newInstance;
                    }
                } else {
                    java.lang.Class<?> cls2 = obj.getClass();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(cls2, cls)) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(value, "");
                        int length = java.lang.reflect.Array.getLength(obj);
                        int length2 = java.lang.reflect.Array.getLength(value);
                        java.lang.Class<?> componentType = obj.getClass().getComponentType();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(componentType);
                        java.lang.Object newInstance2 = java.lang.reflect.Array.newInstance(componentType, length + length2);
                        java.lang.System.arraycopy(obj, 0, newInstance2, 0, length);
                        java.lang.System.arraycopy(value, 0, newInstance2, length, length2);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(newInstance2);
                        value = newInstance2;
                    } else {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(cls2.getComponentType(), cls)) {
                            throw new java.lang.IllegalArgumentException();
                        }
                        int length3 = java.lang.reflect.Array.getLength(obj);
                        newInstance = java.lang.reflect.Array.newInstance(cls, length3 + 1);
                        java.lang.System.arraycopy(obj, 0, newInstance, 0, length3);
                        java.lang.reflect.Array.set(newInstance, length3, value);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(newInstance);
                        value = newInstance;
                    }
                }
                hashMap.put(key, value);
            }
        }
        builder.putAll(hashMap);
        return builder.build();
    }
}
