package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0014\b\u0003\u0010\u0005*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006B%\b\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u0011*\u00028\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001H$¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00028\u00032\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00028\u00032\u0006\u0010\u001c\u001a\u00020\u001bH\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00028\u0002H\u0016¢\u0006\u0004\b!\u0010\"R\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0007¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0014\u0010,\u001a\u00020)8'X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+\u0082\u0001\u0002-."}, d2 = {"Lkotlinx/serialization/internal/MapLikeSerializer;", "Key", "Value", "Collection", "", "Builder", "Lkotlinx/serialization/internal/AbstractCollectionSerializer;", "", "Lkotlinx/serialization/KSerializer;", "p0", "p1", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "", "index", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "insertKeyValuePair", "(Ljava/util/Map;ILjava/lang/Object;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "builder", "startIndex", io.ktor.http.ContentDisposition.Parameters.Size, "readAll", "(Lkotlinx/serialization/encoding/CompositeDecoder;Ljava/util/Map;II)V", "", "checkIndex", "readElement", "(Lkotlinx/serialization/encoding/CompositeDecoder;ILjava/util/Map;Z)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "keySerializer", "Lkotlinx/serialization/KSerializer;", "getKeySerializer", "()Lkotlinx/serialization/KSerializer;", "valueSerializer", "getValueSerializer", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/internal/HashMapSerializer;", "Lkotlinx/serialization/internal/LinkedHashMapSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.InternalSerializationApi
/* loaded from: classes5.dex */
public abstract class MapLikeSerializer<Key, Value, Collection, Builder extends java.util.Map<Key, Value>> extends kotlinx.serialization.internal.AbstractCollectionSerializer<java.util.Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {
    private final kotlinx.serialization.KSerializer<Key> keySerializer;
    private final kotlinx.serialization.KSerializer<Value> valueSerializer;

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public abstract kotlinx.serialization.descriptors.SerialDescriptor getDescriptor();

    protected abstract void insertKeyValuePair(Builder builder, int i, Key key, Value value);

    private MapLikeSerializer(kotlinx.serialization.KSerializer<Key> kSerializer, kotlinx.serialization.KSerializer<Value> kSerializer2) {
        super(null);
        this.keySerializer = kSerializer;
        this.valueSerializer = kSerializer2;
    }

    public final kotlinx.serialization.KSerializer<Key> getKeySerializer() {
        return this.keySerializer;
    }

    public final kotlinx.serialization.KSerializer<Value> getValueSerializer() {
        return this.valueSerializer;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void readAll(kotlinx.serialization.encoding.CompositeDecoder decoder, Builder builder, int startIndex, int size) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        if (size < 0) {
            throw new java.lang.IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        }
        kotlin.ranges.IntProgression step = kotlin.ranges.RangesKt.step(kotlin.ranges.RangesKt.until(0, size * 2), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 <= 0 || first > last) && (step2 >= 0 || last > first)) {
            return;
        }
        while (true) {
            readElement(decoder, startIndex + first, (int) builder, false);
            if (first == last) {
                return;
            } else {
                first += step2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void readElement(kotlinx.serialization.encoding.CompositeDecoder decoder, int index, Builder builder, boolean checkIndex) {
        int i;
        java.lang.Object decodeSerializableElement$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        java.lang.Object decodeSerializableElement$default2 = kotlinx.serialization.encoding.CompositeDecoder.decodeSerializableElement$default(decoder, getDescriptor(), index, this.keySerializer, null, 8, null);
        if (checkIndex) {
            i = decoder.decodeElementIndex(getDescriptor());
            if (i != index + 1) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Value must follow key in a map, index for key: ");
                sb.append(index);
                sb.append(", returned index for value: ");
                sb.append(i);
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
        } else {
            i = index + 1;
        }
        int i2 = i;
        if (builder.containsKey(decodeSerializableElement$default2) && !(this.valueSerializer.getDescriptor().getKind() instanceof kotlinx.serialization.descriptors.PrimitiveKind)) {
            decodeSerializableElement$default = decoder.decodeSerializableElement(getDescriptor(), i2, this.valueSerializer, kotlin.collections.MapsKt.getValue(builder, decodeSerializableElement$default2));
        } else {
            decodeSerializableElement$default = kotlinx.serialization.encoding.CompositeDecoder.decodeSerializableElement$default(decoder, getDescriptor(), i2, this.valueSerializer, null, 8, null);
        }
        builder.put(decodeSerializableElement$default2, decodeSerializableElement$default);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer, kotlinx.serialization.SerializationStrategy
    public void serialize(kotlinx.serialization.encoding.Encoder encoder, Collection value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        int collectionSize = collectionSize(value);
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginCollection = encoder.beginCollection(descriptor, collectionSize);
        java.util.Iterator<java.util.Map.Entry<? extends Key, ? extends Value>> collectionIterator = collectionIterator(value);
        int i = 0;
        while (collectionIterator.hasNext()) {
            java.util.Map.Entry<? extends Key, ? extends Value> next = collectionIterator.next();
            Key key = next.getKey();
            Value value2 = next.getValue();
            beginCollection.encodeSerializableElement(getDescriptor(), i, getKeySerializer(), key);
            beginCollection.encodeSerializableElement(getDescriptor(), i + 1, getValueSerializer(), value2);
            i += 2;
        }
        beginCollection.endStructure(descriptor);
    }

    public /* synthetic */ MapLikeSerializer(kotlinx.serialization.KSerializer kSerializer, kotlinx.serialization.KSerializer kSerializer2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(kSerializer, kSerializer2);
    }
}
