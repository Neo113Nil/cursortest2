package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "", "name", "Lkotlinx/serialization/KSerializer;", "primitiveSerializer", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "InlinePrimitiveDescriptor", "(Ljava/lang/String;Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InlineClassDescriptorKt {
    @kotlinx.serialization.InternalSerializationApi
    public static final <T> kotlinx.serialization.descriptors.SerialDescriptor InlinePrimitiveDescriptor(java.lang.String str, final kotlinx.serialization.KSerializer<T> kSerializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializer, "");
        return new kotlinx.serialization.internal.InlineClassDescriptor(str, new kotlinx.serialization.internal.GeneratedSerializer<T>() { // from class: kotlinx.serialization.internal.InlineClassDescriptorKt$InlinePrimitiveDescriptor$1
            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final /* bridge */ kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                return super.typeParametersSerializers();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
                return new kotlinx.serialization.KSerializer[]{kSerializer};
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
            public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
                throw new java.lang.IllegalStateException("unsupported".toString());
            }

            @Override // kotlinx.serialization.SerializationStrategy
            public final void serialize(kotlinx.serialization.encoding.Encoder encoder, T value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
                throw new java.lang.IllegalStateException("unsupported".toString());
            }

            @Override // kotlinx.serialization.DeserializationStrategy
            public final T deserialize(kotlinx.serialization.encoding.Decoder decoder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
                throw new java.lang.IllegalStateException("unsupported".toString());
            }
        });
    }
}
