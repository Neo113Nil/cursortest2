package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B%\b\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00028\u00022\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0001H$¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00028\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0005X\u0084\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0005X\u0085\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0018\u0010\t\u001a\u00028\u0000*\u00028\u00028%X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\n\u001a\u00028\u0001*\u00028\u00028%X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001d\u0082\u0001\u0002\u001f "}, d2 = {"Lkotlinx/serialization/internal/KeyValueSerializer;", "K", "V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/serialization/KSerializer;", "p0", "p1", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "toResult", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "keySerializer", "Lkotlinx/serialization/KSerializer;", "getKeySerializer", "()Lkotlinx/serialization/KSerializer;", "valueSerializer", "getValueSerializer", "getKey", "(Ljava/lang/Object;)Ljava/lang/Object;", "getValue", "Lkotlinx/serialization/internal/MapEntrySerializer;", "Lkotlinx/serialization/internal/PairSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class KeyValueSerializer<K, V, R> implements kotlinx.serialization.KSerializer<R> {
    private final kotlinx.serialization.KSerializer<K> keySerializer;
    private final kotlinx.serialization.KSerializer<V> valueSerializer;

    protected abstract K getKey(R r);

    protected abstract V getValue(R r);

    protected abstract R toResult(K key, V value);

    private KeyValueSerializer(kotlinx.serialization.KSerializer<K> kSerializer, kotlinx.serialization.KSerializer<V> kSerializer2) {
        this.keySerializer = kSerializer;
        this.valueSerializer = kSerializer2;
    }

    protected final kotlinx.serialization.KSerializer<K> getKeySerializer() {
        return this.keySerializer;
    }

    protected final kotlinx.serialization.KSerializer<V> getValueSerializer() {
        return this.valueSerializer;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(kotlinx.serialization.encoding.Encoder encoder, R value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(getDescriptor());
        beginStructure.encodeSerializableElement(getDescriptor(), 0, this.keySerializer, getKey(value));
        beginStructure.encodeSerializableElement(getDescriptor(), 1, this.valueSerializer, getValue(value));
        beginStructure.endStructure(getDescriptor());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.DeserializationStrategy
    public R deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        R r;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        if (!beginStructure.decodeSequentially()) {
            obj = kotlinx.serialization.internal.TuplesKt.Camera2StreamConfigurationMap;
            obj2 = kotlinx.serialization.internal.TuplesKt.Camera2StreamConfigurationMap;
            java.lang.Object obj5 = obj;
            java.lang.Object obj6 = obj2;
            while (true) {
                int decodeElementIndex = beginStructure.decodeElementIndex(getDescriptor());
                if (decodeElementIndex == -1) {
                    obj3 = kotlinx.serialization.internal.TuplesKt.Camera2StreamConfigurationMap;
                    if (obj5 != obj3) {
                        obj4 = kotlinx.serialization.internal.TuplesKt.Camera2StreamConfigurationMap;
                        if (obj6 == obj4) {
                            throw new kotlinx.serialization.SerializationException("Element 'value' is missing");
                        }
                        r = (R) toResult(obj5, obj6);
                    } else {
                        throw new kotlinx.serialization.SerializationException("Element 'key' is missing");
                    }
                } else if (decodeElementIndex == 0) {
                    obj5 = kotlinx.serialization.encoding.CompositeDecoder.decodeSerializableElement$default(beginStructure, getDescriptor(), 0, getKeySerializer(), null, 8, null);
                } else if (decodeElementIndex == 1) {
                    obj6 = kotlinx.serialization.encoding.CompositeDecoder.decodeSerializableElement$default(beginStructure, getDescriptor(), 1, getValueSerializer(), null, 8, null);
                } else {
                    throw new kotlinx.serialization.SerializationException("Invalid index: ".concat(java.lang.String.valueOf(decodeElementIndex)));
                }
            }
        } else {
            r = (R) toResult(kotlinx.serialization.encoding.CompositeDecoder.decodeSerializableElement$default(beginStructure, getDescriptor(), 0, getKeySerializer(), null, 8, null), kotlinx.serialization.encoding.CompositeDecoder.decodeSerializableElement$default(beginStructure, getDescriptor(), 1, getValueSerializer(), null, 8, null));
        }
        beginStructure.endStructure(descriptor);
        return r;
    }

    public /* synthetic */ KeyValueSerializer(kotlinx.serialization.KSerializer kSerializer, kotlinx.serialization.KSerializer kSerializer2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(kSerializer, kSerializer2);
    }
}
