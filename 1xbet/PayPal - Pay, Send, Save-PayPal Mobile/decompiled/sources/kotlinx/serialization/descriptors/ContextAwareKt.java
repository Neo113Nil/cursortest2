package kotlinx.serialization.descriptors;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\n\u001a\u00020\u0001*\u00020\u00012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\"$\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b*\u00020\u00018GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r"}, d2 = {"Lkotlinx/serialization/modules/SerializersModule;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "getContextualDescriptor", "(Lkotlinx/serialization/modules/SerializersModule;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "getPolymorphicDescriptors", "(Lkotlinx/serialization/modules/SerializersModule;Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/util/List;", "Lkotlin/reflect/KClass;", "context", "withContext", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/reflect/KClass;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "getCapturedKClass", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlin/reflect/KClass;", "getCapturedKClass$annotations", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "capturedKClass"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ContextAwareKt {
    @kotlinx.serialization.ExperimentalSerializationApi
    public static /* synthetic */ void getCapturedKClass$annotations(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
    }

    public static final kotlin.reflect.KClass<?> getCapturedKClass(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        while (true) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
            if (serialDescriptor instanceof kotlinx.serialization.descriptors.ContextDescriptor) {
                return ((kotlinx.serialization.descriptors.ContextDescriptor) serialDescriptor).Camera2StreamConfigurationMap;
            }
            if (!(serialDescriptor instanceof kotlinx.serialization.internal.SerialDescriptorForNullable)) {
                return null;
            }
            serialDescriptor = ((kotlinx.serialization.internal.SerialDescriptorForNullable) serialDescriptor).getOriginal();
        }
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final kotlinx.serialization.descriptors.SerialDescriptor getContextualDescriptor(kotlinx.serialization.modules.SerializersModule serializersModule, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        kotlinx.serialization.KSerializer contextual$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializersModule, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        kotlin.reflect.KClass<?> capturedKClass = getCapturedKClass(serialDescriptor);
        if (capturedKClass == null || (contextual$default = kotlinx.serialization.modules.SerializersModule.getContextual$default(serializersModule, capturedKClass, null, 2, null)) == null) {
            return null;
        }
        return contextual$default.getDescriptor();
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final java.util.List<kotlinx.serialization.descriptors.SerialDescriptor> getPolymorphicDescriptors(kotlinx.serialization.modules.SerializersModule serializersModule, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializersModule, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        kotlin.reflect.KClass<?> capturedKClass = getCapturedKClass(serialDescriptor);
        if (capturedKClass == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.Map<kotlin.reflect.KClass<?>, kotlinx.serialization.KSerializer<?>> map = ((kotlinx.serialization.modules.SerialModuleImpl) serializersModule).polyBase2Serializers.get(capturedKClass);
        java.util.List values = map != null ? map.values() : null;
        if (values == null) {
            values = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.Collection<kotlinx.serialization.KSerializer<?>> collection = values;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collection, 10));
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((kotlinx.serialization.KSerializer) it.next()).getDescriptor());
        }
        return arrayList;
    }

    public static final kotlinx.serialization.descriptors.SerialDescriptor withContext(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlin.reflect.KClass<?> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        return new kotlinx.serialization.descriptors.ContextDescriptor(serialDescriptor, kClass);
    }
}
