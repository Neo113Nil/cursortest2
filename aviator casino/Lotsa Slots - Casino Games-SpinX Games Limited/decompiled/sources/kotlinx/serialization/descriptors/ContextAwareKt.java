package kotlinx.serialization.descriptors;

/* compiled from: ContextAware.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u001a\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0002*\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0007\u001a\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b*\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0007\u001a\u0018\u0010\f\u001a\u00020\u0002*\u00020\u00022\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0000\"$\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"capturedKClass", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getCapturedKClass$annotations", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "getCapturedKClass", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlin/reflect/KClass;", "getContextualDescriptor", "Lkotlinx/serialization/modules/SerializersModule;", "descriptor", "getPolymorphicDescriptors", "", "withContext", "context", "kotlinx-serialization-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ContextAwareKt {
    @kotlinx.serialization.ExperimentalSerializationApi
    public static /* synthetic */ void getCapturedKClass$annotations(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
    }

    public static final kotlin.reflect.KClass<?> getCapturedKClass(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        if (serialDescriptor instanceof kotlinx.serialization.descriptors.ContextDescriptor) {
            return ((kotlinx.serialization.descriptors.ContextDescriptor) serialDescriptor).kClass;
        }
        if (serialDescriptor instanceof kotlinx.serialization.internal.SerialDescriptorForNullable) {
            return getCapturedKClass(((kotlinx.serialization.internal.SerialDescriptorForNullable) serialDescriptor).getOriginal());
        }
        return null;
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final kotlinx.serialization.descriptors.SerialDescriptor getContextualDescriptor(kotlinx.serialization.modules.SerializersModule serializersModule, kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlinx.serialization.KSerializer contextual$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializersModule, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        kotlin.reflect.KClass<?> capturedKClass = getCapturedKClass(descriptor);
        if (capturedKClass == null || (contextual$default = kotlinx.serialization.modules.SerializersModule.getContextual$default(serializersModule, capturedKClass, null, 2, null)) == null) {
            return null;
        }
        return contextual$default.getDescriptor();
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final java.util.List<kotlinx.serialization.descriptors.SerialDescriptor> getPolymorphicDescriptors(kotlinx.serialization.modules.SerializersModule serializersModule, kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializersModule, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        kotlin.reflect.KClass<?> capturedKClass = getCapturedKClass(descriptor);
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

    public static final kotlinx.serialization.descriptors.SerialDescriptor withContext(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlin.reflect.KClass<?> context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return new kotlinx.serialization.descriptors.ContextDescriptor(serialDescriptor, context);
    }
}
