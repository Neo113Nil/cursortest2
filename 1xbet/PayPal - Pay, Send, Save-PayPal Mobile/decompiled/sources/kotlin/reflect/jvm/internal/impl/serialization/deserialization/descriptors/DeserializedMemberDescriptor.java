package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

/* loaded from: classes5.dex */
public interface DeserializedMemberDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.DeserializedDescriptor, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DescriptorWithContainerSource {
    kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource getContainerSource();

    kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver getNameResolver();

    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite getProto();

    kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable getTypeTable();
}
