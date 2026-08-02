package kotlinx.serialization;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a;\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\b\u0010\u000e"}, d2 = {"", "T", "Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "", "klassName", "Lkotlinx/serialization/DeserializationStrategy;", "findPolymorphicSerializer", "(Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;Lkotlinx/serialization/encoding/CompositeDecoder;Ljava/lang/String;)Lkotlinx/serialization/DeserializationStrategy;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlinx/serialization/SerializationStrategy;", "(Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)Lkotlinx/serialization/SerializationStrategy;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PolymorphicSerializerKt {
    @kotlinx.serialization.InternalSerializationApi
    public static final <T> kotlinx.serialization.DeserializationStrategy<T> findPolymorphicSerializer(kotlinx.serialization.internal.AbstractPolymorphicSerializer<T> abstractPolymorphicSerializer, kotlinx.serialization.encoding.CompositeDecoder compositeDecoder, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(abstractPolymorphicSerializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compositeDecoder, "");
        kotlinx.serialization.DeserializationStrategy<T> findPolymorphicSerializerOrNull = abstractPolymorphicSerializer.findPolymorphicSerializerOrNull(compositeDecoder, str);
        if (findPolymorphicSerializerOrNull != null) {
            return findPolymorphicSerializerOrNull;
        }
        kotlinx.serialization.internal.AbstractPolymorphicSerializerKt.throwSubtypeNotRegistered(str, (kotlin.reflect.KClass<?>) abstractPolymorphicSerializer.getBaseClass());
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlinx.serialization.InternalSerializationApi
    public static final <T> kotlinx.serialization.SerializationStrategy<T> findPolymorphicSerializer(kotlinx.serialization.internal.AbstractPolymorphicSerializer<T> abstractPolymorphicSerializer, kotlinx.serialization.encoding.Encoder encoder, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(abstractPolymorphicSerializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        kotlinx.serialization.SerializationStrategy<T> findPolymorphicSerializerOrNull = abstractPolymorphicSerializer.findPolymorphicSerializerOrNull(encoder, (kotlinx.serialization.encoding.Encoder) t);
        if (findPolymorphicSerializerOrNull != null) {
            return findPolymorphicSerializerOrNull;
        }
        kotlinx.serialization.internal.AbstractPolymorphicSerializerKt.throwSubtypeNotRegistered((kotlin.reflect.KClass<?>) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(t.getClass()), (kotlin.reflect.KClass<?>) abstractPolymorphicSerializer.getBaseClass());
        throw new kotlin.KotlinNothingValueException();
    }
}
