package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lkotlinx/serialization/json/internal/JsonIteratorWsSeparated;", "T", "", "Lkotlinx/serialization/json/Json;", "p0", "Lkotlinx/serialization/json/internal/ReaderJsonLexer;", "p1", "Lkotlinx/serialization/DeserializationStrategy;", "p2", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/ReaderJsonLexer;Lkotlinx/serialization/DeserializationStrategy;)V", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "", "hasNext", "()Z", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/serialization/json/Json;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/serialization/json/internal/ReaderJsonLexer;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Lkotlinx/serialization/DeserializationStrategy;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
final class JsonIteratorWsSeparated<T> implements java.util.Iterator<T>, kotlin.jvm.internal.markers.KMappedMarker {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.serialization.DeserializationStrategy<T> getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.serialization.json.internal.ReaderJsonLexer getHighSpeedVideoFpsRanges;
    private final kotlinx.serialization.json.Json getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public JsonIteratorWsSeparated(kotlinx.serialization.json.Json json, kotlinx.serialization.json.internal.ReaderJsonLexer readerJsonLexer, kotlinx.serialization.DeserializationStrategy<? extends T> deserializationStrategy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readerJsonLexer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationStrategy, "");
        this.getHighSpeedVideoFpsRangesFor = json;
        this.getHighSpeedVideoFpsRanges = readerJsonLexer;
        this.getHighSpeedVideoSizes = deserializationStrategy;
    }

    @Override // java.util.Iterator
    public final T next() {
        return (T) new kotlinx.serialization.json.internal.StreamingJsonDecoder(this.getHighSpeedVideoFpsRangesFor, kotlinx.serialization.json.internal.WriteMode.OBJ, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes.getDescriptor(), null).decodeSerializableValue(this.getHighSpeedVideoSizes);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.getHighSpeedVideoFpsRanges.isNotEof();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
