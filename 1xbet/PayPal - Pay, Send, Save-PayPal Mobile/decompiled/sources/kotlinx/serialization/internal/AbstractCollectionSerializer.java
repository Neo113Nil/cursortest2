package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0007*\u00028\u0001H$¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n*\u00028\u0001H$¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00028\u0002H$¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u0007*\u00028\u0002H$¢\u0006\u0004\b\u000f\u0010\tJ\u0013\u0010\u0010\u001a\u00028\u0001*\u00028\u0002H$¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00028\u0002*\u00028\u0001H$¢\u0006\u0004\b\u0012\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u0014*\u00028\u00022\u0006\u0010\u0013\u001a\u00020\u0007H$¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00028\u0001H&¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001f\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00018\u0001H\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b!\u0010\"J1\u0010'\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u00022\b\b\u0002\u0010&\u001a\u00020%H$¢\u0006\u0004\b'\u0010(J/\u0010*\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020#2\u0006\u0010\r\u001a\u00028\u00022\u0006\u0010)\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H$¢\u0006\u0004\b*\u0010+\u0082\u0001\u0002,-"}, d2 = {"Lkotlinx/serialization/internal/AbstractCollectionSerializer;", "Element", "Collection", "Builder", "Lkotlinx/serialization/KSerializer;", "<init>", "()V", "", "collectionSize", "(Ljava/lang/Object;)I", "", "collectionIterator", "(Ljava/lang/Object;)Ljava/util/Iterator;", "builder", "()Ljava/lang/Object;", "builderSize", "toResult", "(Ljava/lang/Object;)Ljava/lang/Object;", "toBuilder", io.ktor.http.ContentDisposition.Parameters.Size, "", "checkCapacity", "(Ljava/lang/Object;I)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "previous", "merge", "(Lkotlinx/serialization/encoding/Decoder;Ljava/lang/Object;)Ljava/lang/Object;", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "index", "", "checkIndex", "readElement", "(Lkotlinx/serialization/encoding/CompositeDecoder;ILjava/lang/Object;Z)V", "startIndex", "readAll", "(Lkotlinx/serialization/encoding/CompositeDecoder;Ljava/lang/Object;II)V", "Lkotlinx/serialization/internal/CollectionLikeSerializer;", "Lkotlinx/serialization/internal/MapLikeSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.InternalSerializationApi
/* loaded from: classes5.dex */
public abstract class AbstractCollectionSerializer<Element, Collection, Builder> implements kotlinx.serialization.KSerializer<Collection> {
    protected abstract Builder builder();

    protected abstract int builderSize(Builder builder);

    protected abstract void checkCapacity(Builder builder, int i);

    protected abstract java.util.Iterator<Element> collectionIterator(Collection collection);

    protected abstract int collectionSize(Collection collection);

    protected abstract void readAll(kotlinx.serialization.encoding.CompositeDecoder decoder, Builder builder, int startIndex, int size);

    protected abstract void readElement(kotlinx.serialization.encoding.CompositeDecoder decoder, int index, Builder builder, boolean checkIndex);

    @Override // kotlinx.serialization.SerializationStrategy
    public abstract void serialize(kotlinx.serialization.encoding.Encoder encoder, Collection value);

    protected abstract Builder toBuilder(Collection collection);

    protected abstract Collection toResult(Builder builder);

    private AbstractCollectionSerializer() {
    }

    @kotlinx.serialization.InternalSerializationApi
    public final Collection merge(kotlinx.serialization.encoding.Decoder decoder, Collection previous) {
        Builder builder;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        if (previous == null || (builder = toBuilder(previous)) == null) {
            builder = builder();
        }
        int builderSize = builderSize(builder);
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(getDescriptor());
        if (!beginStructure.decodeSequentially()) {
            while (true) {
                int decodeElementIndex = beginStructure.decodeElementIndex(getDescriptor());
                if (decodeElementIndex == -1) {
                    break;
                }
                readElement$default(this, beginStructure, builderSize + decodeElementIndex, builder, false, 8, null);
            }
        } else {
            int decodeCollectionSize = beginStructure.decodeCollectionSize(getDescriptor());
            checkCapacity(builder, decodeCollectionSize);
            readAll(beginStructure, builder, builderSize, decodeCollectionSize);
        }
        beginStructure.endStructure(getDescriptor());
        return toResult(builder);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public Collection deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        return merge(decoder, null);
    }

    public static /* synthetic */ void readElement$default(kotlinx.serialization.internal.AbstractCollectionSerializer abstractCollectionSerializer, kotlinx.serialization.encoding.CompositeDecoder compositeDecoder, int i, java.lang.Object obj, boolean z, int i2, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i2 & 8) != 0) {
            z = true;
        }
        abstractCollectionSerializer.readElement(compositeDecoder, i, obj, z);
    }

    public /* synthetic */ AbstractCollectionSerializer(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
