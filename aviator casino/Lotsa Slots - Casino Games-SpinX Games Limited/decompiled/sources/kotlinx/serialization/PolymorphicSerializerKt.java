package kotlinx.serialization;

/* compiled from: PolymorphicSerializer.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a4\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007\u001a7\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\t\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u0002H\u0002H\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"findPolymorphicSerializer", "Lkotlinx/serialization/DeserializationStrategy;", "T", "", "Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;", "decoder", "Lkotlinx/serialization/encoding/CompositeDecoder;", "klassName", "", "Lkotlinx/serialization/SerializationStrategy;", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "(Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)Lkotlinx/serialization/SerializationStrategy;", "kotlinx-serialization-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PolymorphicSerializerKt {
    @kotlinx.serialization.InternalSerializationApi
    public static final <T> kotlinx.serialization.DeserializationStrategy<T> findPolymorphicSerializer(kotlinx.serialization.internal.AbstractPolymorphicSerializer<T> abstractPolymorphicSerializer, kotlinx.serialization.encoding.CompositeDecoder decoder, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(abstractPolymorphicSerializer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
        kotlinx.serialization.DeserializationStrategy<T> findPolymorphicSerializerOrNull = abstractPolymorphicSerializer.findPolymorphicSerializerOrNull(decoder, str);
        if (findPolymorphicSerializerOrNull != null) {
            return findPolymorphicSerializerOrNull;
        }
        kotlinx.serialization.internal.AbstractPolymorphicSerializerKt.throwSubtypeNotRegistered(str, (kotlin.reflect.KClass<?>) abstractPolymorphicSerializer.getBaseClass());
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlinx.serialization.InternalSerializationApi
    public static final <T> kotlinx.serialization.SerializationStrategy<T> findPolymorphicSerializer(kotlinx.serialization.internal.AbstractPolymorphicSerializer<T> abstractPolymorphicSerializer, kotlinx.serialization.encoding.Encoder encoder, T value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(abstractPolymorphicSerializer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlinx.serialization.SerializationStrategy<T> findPolymorphicSerializerOrNull = abstractPolymorphicSerializer.findPolymorphicSerializerOrNull(encoder, (kotlinx.serialization.encoding.Encoder) value);
        if (findPolymorphicSerializerOrNull != null) {
            return findPolymorphicSerializerOrNull;
        }
        kotlinx.serialization.internal.AbstractPolymorphicSerializerKt.throwSubtypeNotRegistered((kotlin.reflect.KClass<?>) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(value.getClass()), (kotlin.reflect.KClass<?>) abstractPolymorphicSerializer.getBaseClass());
        throw new kotlin.KotlinNothingValueException();
    }
}
