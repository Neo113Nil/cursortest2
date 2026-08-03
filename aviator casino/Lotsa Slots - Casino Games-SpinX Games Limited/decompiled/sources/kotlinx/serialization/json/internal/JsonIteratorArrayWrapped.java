package kotlinx.serialization.json.internal;

/* compiled from: JsonIterator.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u000e\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000fJ\t\u0010\u0010\u001a\u00020\fH\u0096\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lkotlinx/serialization/json/internal/JsonIteratorArrayWrapped;", "T", "", "json", "Lkotlinx/serialization/json/Json;", "lexer", "Lkotlinx/serialization/json/internal/ReaderJsonLexer;", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/ReaderJsonLexer;Lkotlinx/serialization/DeserializationStrategy;)V", "first", "", "finished", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "hasNext", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class JsonIteratorArrayWrapped<T> implements java.util.Iterator<T>, kotlin.jvm.internal.markers.KMappedMarker {
    private final kotlinx.serialization.DeserializationStrategy<T> deserializer;
    private boolean finished;
    private boolean first;
    private final kotlinx.serialization.json.Json json;
    private final kotlinx.serialization.json.internal.ReaderJsonLexer lexer;

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JsonIteratorArrayWrapped(kotlinx.serialization.json.Json json, kotlinx.serialization.json.internal.ReaderJsonLexer lexer, kotlinx.serialization.DeserializationStrategy<? extends T> deserializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lexer, "lexer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.json = json;
        this.lexer = lexer;
        this.deserializer = deserializer;
        this.first = true;
    }

    @Override // java.util.Iterator
    public T next() {
        if (this.first) {
            this.first = false;
        } else {
            this.lexer.consumeNextToken(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
        }
        return (T) new kotlinx.serialization.json.internal.StreamingJsonDecoder(this.json, kotlinx.serialization.json.internal.WriteMode.OBJ, this.lexer, this.deserializer.getDescriptor(), null).decodeSerializableValue(this.deserializer);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.finished) {
            return false;
        }
        if (this.lexer.peekNextToken() == 9) {
            this.finished = true;
            this.lexer.consumeNextToken((byte) 9);
            if (this.lexer.isNotEof()) {
                if (this.lexer.peekNextToken() == 8) {
                    kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(this.lexer, "There is a start of the new array after the one parsed to sequence. ARRAY_WRAPPED mode doesn't merge consecutive arrays.\nIf you need to parse a stream of arrays, please use WHITESPACE_SEPARATED mode instead.", 0, null, 6, null);
                    throw new kotlin.KotlinNothingValueException();
                }
                this.lexer.expectEof();
            }
            return false;
        }
        if (this.lexer.isNotEof() || this.finished) {
            return true;
        }
        kotlinx.serialization.json.internal.ReaderJsonLexer readerJsonLexer = this.lexer;
        java.lang.String str = kotlinx.serialization.json.internal.AbstractJsonLexerKt.tokenDescription((byte) 9);
        int i = readerJsonLexer.currentPosition - 1;
        kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(readerJsonLexer, "Expected " + str + ", but had '" + ((readerJsonLexer.currentPosition == readerJsonLexer.getSource().length() || i < 0) ? "EOF" : java.lang.String.valueOf(readerJsonLexer.getSource().charAt(i))) + "' instead", i, null, 4, null);
        throw new kotlin.KotlinNothingValueException();
    }
}
