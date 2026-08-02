package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* loaded from: classes5.dex */
public interface AnnotationLoader<A> {
    A loadAnnotation(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver);

    java.util.List<A> loadCallableAnnotations(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainer, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind annotatedCallableKind);

    java.util.List<A> loadClassAnnotations(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class r1);

    java.util.List<A> loadContextParameterAnnotations(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainer, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind annotatedCallableKind, int i, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter valueParameter);

    java.util.List<A> loadEnumEntryAnnotations(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainer, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry enumEntry);

    java.util.List<A> loadExtensionReceiverParameterAnnotations(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainer, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind annotatedCallableKind);

    java.util.List<A> loadPropertyBackingFieldAnnotations(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainer, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property);

    java.util.List<A> loadPropertyDelegateFieldAnnotations(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainer, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property);

    java.util.List<A> loadTypeAnnotations(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver);

    java.util.List<A> loadTypeParameterAnnotations(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter typeParameter, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver);

    java.util.List<A> loadValueParameterAnnotations(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainer, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind annotatedCallableKind, int i, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter valueParameter);
}
