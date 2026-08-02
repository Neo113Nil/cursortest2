package kotlinx.serialization.encoding;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aC\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a@\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0019\b\u0004\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0002\b\rH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"", "T", "Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "Lkotlin/Function0;", "block", "decodeIfNullable", "(Lkotlinx/serialization/encoding/Decoder;Lkotlinx/serialization/DeserializationStrategy;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlin/Function1;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "Lkotlin/ExtensionFunctionType;", "decodeStructure", "(Lkotlinx/serialization/encoding/Decoder;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DecodingKt {
    public static final <T> T decodeIfNullable(kotlinx.serialization.encoding.Decoder decoder, kotlinx.serialization.DeserializationStrategy<? extends T> deserializationStrategy, kotlin.jvm.functions.Function0<? extends T> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationStrategy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return (deserializationStrategy.getDescriptor().isNullable() || decoder.decodeNotNullMark()) ? function0.invoke() : (T) decoder.decodeNull();
    }

    public static final <T> T decodeStructure(kotlinx.serialization.encoding.Decoder decoder, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlin.jvm.functions.Function1<? super kotlinx.serialization.encoding.CompositeDecoder, ? extends T> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        T invoke = function1.invoke(beginStructure);
        beginStructure.endStructure(serialDescriptor);
        return invoke;
    }
}
