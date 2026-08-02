package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00132\u0006\u0010\r\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0014\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00188'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;", "", "T", "Lkotlinx/serialization/KSerializer;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "", "klassName", "Lkotlinx/serialization/DeserializationStrategy;", "findPolymorphicSerializerOrNull", "(Lkotlinx/serialization/encoding/CompositeDecoder;Ljava/lang/String;)Lkotlinx/serialization/DeserializationStrategy;", "Lkotlinx/serialization/SerializationStrategy;", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)Lkotlinx/serialization/SerializationStrategy;", "Lkotlin/reflect/KClass;", "getBaseClass", "()Lkotlin/reflect/KClass;", "baseClass"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.InternalSerializationApi
/* loaded from: classes5.dex */
public abstract class AbstractPolymorphicSerializer<T> implements kotlinx.serialization.KSerializer<T> {
    public abstract kotlin.reflect.KClass<T> getBaseClass();

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, T value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.SerializationStrategy<? super T> findPolymorphicSerializer = kotlinx.serialization.PolymorphicSerializerKt.findPolymorphicSerializer(this, encoder, value);
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        beginStructure.encodeStringElement(getDescriptor(), 0, findPolymorphicSerializer.getDescriptor().getSerialName());
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlin.jvm.internal.Intrinsics.checkNotNull(findPolymorphicSerializer, "");
        beginStructure.encodeSerializableElement(descriptor2, 1, findPolymorphicSerializer, value);
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final T deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        T t;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        if (beginStructure.decodeSequentially()) {
            t = (T) access$decodeSequentially(this, beginStructure);
        } else {
            java.lang.Object obj = null;
            while (true) {
                int decodeElementIndex = beginStructure.decodeElementIndex(getDescriptor());
                if (decodeElementIndex != -1) {
                    if (decodeElementIndex == 0) {
                        objectRef.element = (T) beginStructure.decodeStringElement(getDescriptor(), decodeElementIndex);
                    } else if (decodeElementIndex == 1) {
                        T t2 = objectRef.element;
                        if (t2 == null) {
                            throw new java.lang.IllegalArgumentException("Cannot read polymorphic value before its type token".toString());
                        }
                        objectRef.element = t2;
                        obj = kotlinx.serialization.encoding.CompositeDecoder.decodeSerializableElement$default(beginStructure, getDescriptor(), decodeElementIndex, kotlinx.serialization.PolymorphicSerializerKt.findPolymorphicSerializer(this, beginStructure, (java.lang.String) objectRef.element), null, 8, null);
                    } else {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid index in polymorphic deserialization of ");
                        java.lang.String str = (java.lang.String) objectRef.element;
                        if (str == null) {
                            str = "unknown class";
                        }
                        sb.append(str);
                        sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                        sb.append(decodeElementIndex);
                        throw new kotlinx.serialization.SerializationException(sb.toString());
                    }
                } else if (obj != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                    t = (T) obj;
                } else {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Polymorphic value has not been read for class ");
                    sb2.append((java.lang.String) objectRef.element);
                    throw new java.lang.IllegalArgumentException(sb2.toString().toString());
                }
            }
        }
        beginStructure.endStructure(descriptor);
        return t;
    }

    @kotlinx.serialization.InternalSerializationApi
    public kotlinx.serialization.DeserializationStrategy<T> findPolymorphicSerializerOrNull(kotlinx.serialization.encoding.CompositeDecoder decoder, java.lang.String klassName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        return decoder.getSerializersModule().getPolymorphic((kotlin.reflect.KClass) getBaseClass(), klassName);
    }

    @kotlinx.serialization.InternalSerializationApi
    public kotlinx.serialization.SerializationStrategy<T> findPolymorphicSerializerOrNull(kotlinx.serialization.encoding.Encoder encoder, T value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return encoder.getSerializersModule().getPolymorphic((kotlin.reflect.KClass<? super kotlin.reflect.KClass<T>>) getBaseClass(), (kotlin.reflect.KClass<T>) value);
    }

    public static final /* synthetic */ java.lang.Object access$decodeSequentially(kotlinx.serialization.internal.AbstractPolymorphicSerializer abstractPolymorphicSerializer, kotlinx.serialization.encoding.CompositeDecoder compositeDecoder) {
        return kotlinx.serialization.encoding.CompositeDecoder.decodeSerializableElement$default(compositeDecoder, abstractPolymorphicSerializer.getDescriptor(), 1, kotlinx.serialization.PolymorphicSerializerKt.findPolymorphicSerializer(abstractPolymorphicSerializer, compositeDecoder, compositeDecoder.decodeStringElement(abstractPolymorphicSerializer.getDescriptor(), 0)), null, 8, null);
    }
}
