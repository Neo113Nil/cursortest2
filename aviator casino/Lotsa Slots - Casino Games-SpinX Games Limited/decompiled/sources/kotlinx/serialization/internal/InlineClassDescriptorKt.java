package kotlinx.serialization.internal;

/* compiled from: InlineClassDescriptor.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"InlinePrimitiveDescriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "T", "name", "", "primitiveSerializer", "Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InlineClassDescriptorKt {
    @kotlinx.serialization.InternalSerializationApi
    public static final <T> kotlinx.serialization.descriptors.SerialDescriptor InlinePrimitiveDescriptor(java.lang.String name, final kotlinx.serialization.KSerializer<T> primitiveSerializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        return new kotlinx.serialization.internal.InlineClassDescriptor(name, new kotlinx.serialization.internal.GeneratedSerializer<T>() { // from class: kotlinx.serialization.internal.InlineClassDescriptorKt$InlinePrimitiveDescriptor$1
            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public /* synthetic */ kotlinx.serialization.KSerializer[] typeParametersSerializers() {
                return kotlinx.serialization.internal.GeneratedSerializer.CC.$default$typeParametersSerializers(this);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public kotlinx.serialization.KSerializer<?>[] childSerializers() {
                return new kotlinx.serialization.KSerializer[]{primitiveSerializer};
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
            public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
                throw new java.lang.IllegalStateException("unsupported".toString());
            }

            @Override // kotlinx.serialization.SerializationStrategy
            public void serialize(kotlinx.serialization.encoding.Encoder encoder, T value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
                throw new java.lang.IllegalStateException("unsupported".toString());
            }

            @Override // kotlinx.serialization.DeserializationStrategy
            public T deserialize(kotlinx.serialization.encoding.Decoder decoder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
                throw new java.lang.IllegalStateException("unsupported".toString());
            }
        });
    }
}
