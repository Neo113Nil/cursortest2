package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* loaded from: classes5.dex */
public final class AnnotationAndConstantLoaderImpl extends kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractAnnotationLoader<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> {
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationDeserializer Camera2StreamConfigurationMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotationAndConstantLoaderImpl(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses notFoundClasses, kotlin.reflect.jvm.internal.impl.serialization.SerializerExtensionProtocol serializerExtensionProtocol) {
        super(serializerExtensionProtocol);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notFoundClasses, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializerExtensionProtocol, "");
        this.Camera2StreamConfigurationMap = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationDeserializer(moduleDescriptor, notFoundClasses);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor loadAnnotation(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameResolver, "");
        return this.Camera2StreamConfigurationMap.deserializeAnnotation(annotation, nameResolver);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public final kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> loadPropertyConstant(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainer, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protoContainer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value value = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value) kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt.getExtensionOrNull(property, getProtocol().getCompileTimeValue());
        if (value == null) {
            return null;
        }
        return this.Camera2StreamConfigurationMap.resolveValue(kotlinType, value, protoContainer.getNameResolver());
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public final kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> loadAnnotationDefaultValue(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainer, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protoContainer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        return null;
    }
}
