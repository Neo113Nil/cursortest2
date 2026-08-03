package kotlinx.serialization.internal;

/* compiled from: Platform.common.kt */
@kotlin.Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0000\u001a\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bH\u0000¢\u0006\u0002\u0010\t\u001a\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\f0\u000b\"\u0004\b\u0000\u0010\f*\u0006\u0012\u0002\b\u00030\u000bH\u0081\b\u001a\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\f0\r\"\u0004\b\u0000\u0010\f*\u0006\u0012\u0002\b\u00030\rH\u0081\b\u001a\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e\"\u0004\b\u0000\u0010\f*\u0006\u0012\u0002\b\u00030\u000eH\u0081\b\u001a\u0010\u0010\u000f\u001a\u00020\u0010*\u0006\u0012\u0002\b\u00030\u0011H\u0000\u001a\u0010\u0010\u0012\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u0011H\u0000\u001a\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0000\u001a\u0012\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0011*\u00020\u0016H\u0000\u001a\f\u0010\u0017\u001a\u00020\u0016*\u00020\u0018H\u0000\u001a6\u0010\u0019\u001a\u00020\u001a\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\u001b*\b\u0012\u0004\u0012\u0002H\f0\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u001b0\u001eH\u0080\bø\u0001\u0000\"\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f"}, d2 = {"cachedSerialNames", "", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "EMPTY_DESCRIPTOR_ARRAY", "", "[Lkotlinx/serialization/descriptors/SerialDescriptor;", "compactArray", "", "(Ljava/util/List;)[Lkotlinx/serialization/descriptors/SerialDescriptor;", "cast", "Lkotlinx/serialization/KSerializer;", "T", "Lkotlinx/serialization/SerializationStrategy;", "Lkotlinx/serialization/DeserializationStrategy;", "serializerNotRegistered", "", "Lkotlin/reflect/KClass;", "notRegisteredMessage", "className", "kclass", "", "Lkotlin/reflect/KType;", "typeOrThrow", "Lkotlin/reflect/KTypeProjection;", "elementsHashCodeBy", "", "K", "", "selector", "Lkotlin/Function1;", "kotlinx-serialization-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Platform_commonKt {
    private static final kotlinx.serialization.descriptors.SerialDescriptor[] EMPTY_DESCRIPTOR_ARRAY = new kotlinx.serialization.descriptors.SerialDescriptor[0];

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> kotlinx.serialization.DeserializationStrategy<T> cast(kotlinx.serialization.DeserializationStrategy<?> deserializationStrategy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationStrategy, "<this>");
        return deserializationStrategy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> kotlinx.serialization.KSerializer<T> cast(kotlinx.serialization.KSerializer<?> kSerializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializer, "<this>");
        return kSerializer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> kotlinx.serialization.SerializationStrategy<T> cast(kotlinx.serialization.SerializationStrategy<?> serializationStrategy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializationStrategy, "<this>");
        return serializationStrategy;
    }

    public static final java.util.Set<java.lang.String> cachedSerialNames(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        if (serialDescriptor instanceof kotlinx.serialization.internal.CachedNames) {
            return ((kotlinx.serialization.internal.CachedNames) serialDescriptor).getSerialNames();
        }
        java.util.HashSet hashSet = new java.util.HashSet(serialDescriptor.getElementsCount());
        int elementsCount = serialDescriptor.getElementsCount();
        for (int i = 0; i < elementsCount; i++) {
            hashSet.add(serialDescriptor.getElementName(i));
        }
        return hashSet;
    }

    public static final kotlinx.serialization.descriptors.SerialDescriptor[] compactArray(java.util.List<? extends kotlinx.serialization.descriptors.SerialDescriptor> list) {
        kotlinx.serialization.descriptors.SerialDescriptor[] serialDescriptorArr;
        java.util.List<? extends kotlinx.serialization.descriptors.SerialDescriptor> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (serialDescriptorArr = (kotlinx.serialization.descriptors.SerialDescriptor[]) list.toArray(new kotlinx.serialization.descriptors.SerialDescriptor[0])) == null) ? EMPTY_DESCRIPTOR_ARRAY : serialDescriptorArr;
    }

    public static final java.lang.Void serializerNotRegistered(kotlin.reflect.KClass<?> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "<this>");
        throw new kotlinx.serialization.SerializationException(notRegisteredMessage(kClass));
    }

    public static final java.lang.String notRegisteredMessage(kotlin.reflect.KClass<?> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "<this>");
        java.lang.String simpleName = kClass.getSimpleName();
        if (simpleName == null) {
            simpleName = "<local class name not available>";
        }
        return notRegisteredMessage(simpleName);
    }

    public static final java.lang.String notRegisteredMessage(java.lang.String className) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(className, "className");
        return "Serializer for class '" + className + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    public static final kotlin.reflect.KClass<java.lang.Object> kclass(kotlin.reflect.KType kType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kType, "<this>");
        kotlin.reflect.KClassifier classifier = kType.getClassifier();
        if (classifier instanceof kotlin.reflect.KClass) {
            return (kotlin.reflect.KClass) classifier;
        }
        if (classifier instanceof kotlin.reflect.KTypeParameter) {
            throw new java.lang.IllegalArgumentException("Captured type parameter " + classifier + " from generic non-reified function. Such functionality cannot be supported because " + classifier + " is erased, either specify serializer explicitly or make calling function inline with reified " + classifier + '.');
        }
        throw new java.lang.IllegalArgumentException("Only KClass supported as classifier, got " + classifier);
    }

    public static final kotlin.reflect.KType typeOrThrow(kotlin.reflect.KTypeProjection kTypeProjection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kTypeProjection, "<this>");
        kotlin.reflect.KType type = kTypeProjection.getType();
        if (type != null) {
            return type;
        }
        throw new java.lang.IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + kTypeProjection.getType()).toString());
    }

    public static final <T, K> int elementsHashCodeBy(java.lang.Iterable<? extends T> iterable, kotlin.jvm.functions.Function1<? super T, ? extends K> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        java.util.Iterator<? extends T> it = iterable.iterator();
        int i = 1;
        while (it.hasNext()) {
            int i2 = i * 31;
            K invoke = selector.invoke(it.next());
            i = i2 + (invoke != null ? invoke.hashCode() : 0);
        }
        return i;
    }
}
