package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017"}, d2 = {"Lkotlinx/serialization/json/internal/JsonIteratorArrayWrapped;", "T", "", "Lkotlinx/serialization/json/Json;", "p0", "Lkotlinx/serialization/json/internal/ReaderJsonLexer;", "p1", "Lkotlinx/serialization/DeserializationStrategy;", "p2", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/ReaderJsonLexer;Lkotlinx/serialization/DeserializationStrategy;)V", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "", "hasNext", "()Z", "Camera2StreamConfigurationMap", "Lkotlinx/serialization/json/Json;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/serialization/json/internal/ReaderJsonLexer;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/serialization/DeserializationStrategy;", "Z", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
final class JsonIteratorArrayWrapped<T> implements java.util.Iterator<T>, kotlin.jvm.internal.markers.KMappedMarker {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.serialization.json.Json getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.serialization.DeserializationStrategy<T> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.serialization.json.internal.ReaderJsonLexer getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public JsonIteratorArrayWrapped(kotlinx.serialization.json.Json json, kotlinx.serialization.json.internal.ReaderJsonLexer readerJsonLexer, kotlinx.serialization.DeserializationStrategy<? extends T> deserializationStrategy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readerJsonLexer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationStrategy, "");
        this.getHighSpeedVideoFpsRanges = json;
        this.getHighResolutionOutputSizeshNQ4ISI = readerJsonLexer;
        this.getHighSpeedVideoFpsRangesFor = deserializationStrategy;
        this.Camera2StreamConfigurationMap = true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (this.Camera2StreamConfigurationMap) {
            this.Camera2StreamConfigurationMap = false;
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI.consumeNextToken(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
        }
        return (T) new kotlinx.serialization.json.internal.StreamingJsonDecoder(this.getHighSpeedVideoFpsRanges, kotlinx.serialization.json.internal.WriteMode.OBJ, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor.getDescriptor(), null).decodeSerializableValue(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.getHighSpeedVideoSizes) {
            return false;
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI.peekNextToken() == 9) {
            this.getHighSpeedVideoSizes = true;
            this.getHighResolutionOutputSizeshNQ4ISI.consumeNextToken((byte) 9);
            if (this.getHighResolutionOutputSizeshNQ4ISI.isNotEof()) {
                if (this.getHighResolutionOutputSizeshNQ4ISI.peekNextToken() == 8) {
                    kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(this.getHighResolutionOutputSizeshNQ4ISI, "There is a start of the new array after the one parsed to sequence. ARRAY_WRAPPED mode doesn't merge consecutive arrays.\nIf you need to parse a stream of arrays, please use WHITESPACE_SEPARATED mode instead.", 0, null, 6, null);
                    throw new kotlin.KotlinNothingValueException();
                }
                this.getHighResolutionOutputSizeshNQ4ISI.expectEof();
            }
            return false;
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI.isNotEof() || this.getHighSpeedVideoSizes) {
            return true;
        }
        kotlinx.serialization.json.internal.ReaderJsonLexer readerJsonLexer = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String str = kotlinx.serialization.json.internal.AbstractJsonLexerKt.tokenDescription((byte) 9);
        int i = readerJsonLexer.currentPosition - 1;
        java.lang.String valueOf = (readerJsonLexer.currentPosition == readerJsonLexer.getSource().length() || i < 0) ? "EOF" : java.lang.String.valueOf(readerJsonLexer.getSource().charAt(i));
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
        sb.append(str);
        sb.append(", but had '");
        sb.append(valueOf);
        sb.append("' instead");
        kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(readerJsonLexer, sb.toString(), i, null, 4, null);
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
