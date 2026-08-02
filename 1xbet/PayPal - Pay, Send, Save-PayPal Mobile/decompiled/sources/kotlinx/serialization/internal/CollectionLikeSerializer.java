package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004B\u0017\b\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f*\u00028\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0000H$¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00028\u00022\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8'X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0001\u0003&'("}, d2 = {"Lkotlinx/serialization/internal/CollectionLikeSerializer;", "Element", "Collection", "Builder", "Lkotlinx/serialization/internal/AbstractCollectionSerializer;", "Lkotlinx/serialization/KSerializer;", "p0", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "", "index", "element", "", "insert", "(Ljava/lang/Object;ILjava/lang/Object;)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "builder", "startIndex", io.ktor.http.ContentDisposition.Parameters.Size, "readAll", "(Lkotlinx/serialization/encoding/CompositeDecoder;Ljava/lang/Object;II)V", "", "checkIndex", "readElement", "(Lkotlinx/serialization/encoding/CompositeDecoder;ILjava/lang/Object;Z)V", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/serialization/KSerializer;", "Camera2StreamConfigurationMap", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/internal/CollectionSerializer;", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "Lkotlinx/serialization/internal/ReferenceArraySerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class CollectionLikeSerializer<Element, Collection, Builder> extends kotlinx.serialization.internal.AbstractCollectionSerializer<Element, Collection, Builder> {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.serialization.KSerializer<Element> Camera2StreamConfigurationMap;

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public abstract kotlinx.serialization.descriptors.SerialDescriptor getDescriptor();

    protected abstract void insert(Builder builder, int i, Element element);

    private CollectionLikeSerializer(kotlinx.serialization.KSerializer<Element> kSerializer) {
        super(null);
        this.Camera2StreamConfigurationMap = kSerializer;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer, kotlinx.serialization.SerializationStrategy
    public void serialize(kotlinx.serialization.encoding.Encoder encoder, Collection value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        int collectionSize = collectionSize(value);
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginCollection = encoder.beginCollection(descriptor, collectionSize);
        java.util.Iterator<Element> collectionIterator = collectionIterator(value);
        for (int i = 0; i < collectionSize; i++) {
            beginCollection.encodeSerializableElement(getDescriptor(), i, this.Camera2StreamConfigurationMap, collectionIterator.next());
        }
        beginCollection.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    protected final void readAll(kotlinx.serialization.encoding.CompositeDecoder decoder, Builder builder, int startIndex, int size) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        if (size < 0) {
            throw new java.lang.IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        }
        for (int i = 0; i < size; i++) {
            readElement(decoder, startIndex + i, builder, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    protected void readElement(kotlinx.serialization.encoding.CompositeDecoder decoder, int index, Builder builder, boolean checkIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        insert(builder, index, kotlinx.serialization.encoding.CompositeDecoder.decodeSerializableElement$default(decoder, getDescriptor(), index, this.Camera2StreamConfigurationMap, null, 8, null));
    }

    public /* synthetic */ CollectionLikeSerializer(kotlinx.serialization.KSerializer kSerializer, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(kSerializer);
    }
}
