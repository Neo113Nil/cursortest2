package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u000b\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u000b\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J:\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\r2!\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00140\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\u0004\u0018\u00010\u00022\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0015X\u0095\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017"}, d2 = {"Lkotlinx/serialization/json/internal/StringJsonLexer;", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "", "source", "<init>", "(Ljava/lang/String;)V", "", com.daon.sdk.face.license.License.FEATURE_POSITION, "prefetchOrEof", "(I)I", "", "consumeNextToken", "()B", "", "canConsumeValue", "()Z", "skipWhitespaces", "()I", "", "expected", "", "(C)V", "consumeKeyString", "()Ljava/lang/String;", "isLenient", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "stringChunk", "consumeChunk", "consumeStringChunked", "(ZLkotlin/jvm/functions/Function1;)V", "keyToMatch", "peekLeadingMatchingValue", "(Ljava/lang/String;Z)Ljava/lang/String;", "Ljava/lang/String;", "getSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public class StringJsonLexer extends kotlinx.serialization.json.internal.AbstractJsonLexer {
    private final java.lang.String source;

    public StringJsonLexer(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.source = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public java.lang.String getSource() {
        return this.source;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public int prefetchOrEof(int position) {
        if (position < getSource().length()) {
            return position;
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public byte consumeNextToken() {
        java.lang.String source = getSource();
        int i = this.currentPosition;
        while (i != -1 && i < source.length()) {
            int i2 = i + 1;
            char charAt = source.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.currentPosition = i2;
                return kotlinx.serialization.json.internal.AbstractJsonLexerKt.charToTokenClass(charAt);
            }
            i = i2;
        }
        this.currentPosition = source.length();
        return (byte) 10;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public boolean canConsumeValue() {
        int i = this.currentPosition;
        if (i == -1) {
            return false;
        }
        java.lang.String source = getSource();
        while (i < source.length()) {
            char charAt = source.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.currentPosition = i;
                return isValidValueStart(charAt);
            }
            i++;
        }
        this.currentPosition = i;
        return false;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public int skipWhitespaces() {
        char charAt;
        int i = this.currentPosition;
        if (i == -1) {
            return i;
        }
        java.lang.String source = getSource();
        while (i < source.length() && ((charAt = source.charAt(i)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
            i++;
        }
        this.currentPosition = i;
        return i;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public void consumeNextToken(char expected) {
        if (this.currentPosition == -1) {
            unexpectedToken(expected);
        }
        java.lang.String source = getSource();
        int i = this.currentPosition;
        while (i < source.length()) {
            int i2 = i + 1;
            char charAt = source.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.currentPosition = i2;
                if (charAt == expected) {
                    return;
                } else {
                    unexpectedToken(expected);
                }
            }
            i = i2;
        }
        this.currentPosition = -1;
        unexpectedToken(expected);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public java.lang.String consumeKeyString() {
        consumeNextToken('\"');
        int i = this.currentPosition;
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) getSource(), '\"', i, false, 4, (java.lang.Object) null);
        if (indexOf$default == -1) {
            consumeStringLenient();
            kotlinx.serialization.json.internal.StringJsonLexer stringJsonLexer = this;
            java.lang.String str = kotlinx.serialization.json.internal.AbstractJsonLexerKt.tokenDescription((byte) 1);
            int i2 = stringJsonLexer.currentPosition;
            java.lang.String valueOf = (stringJsonLexer.currentPosition == stringJsonLexer.getSource().length() || i2 < 0) ? "EOF" : java.lang.String.valueOf(stringJsonLexer.getSource().charAt(i2));
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
            sb.append(str);
            sb.append(", but had '");
            sb.append(valueOf);
            sb.append("' instead");
            kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(stringJsonLexer, sb.toString(), i2, null, 4, null);
            throw new kotlin.KotlinNothingValueException();
        }
        for (int i3 = i; i3 < indexOf$default; i3++) {
            if (getSource().charAt(i3) == '\\') {
                return consumeString(getSource(), this.currentPosition, i3);
            }
        }
        this.currentPosition = indexOf$default + 1;
        java.lang.String substring = getSource().substring(i, indexOf$default);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        return substring;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public void consumeStringChunked(boolean isLenient, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> consumeChunk) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumeChunk, "");
        java.util.Iterator<T> it = kotlin.text.StringsKt.chunked(isLenient ? consumeStringLenient() : consumeString(), 16384).iterator();
        while (it.hasNext()) {
            consumeChunk.invoke(it.next());
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public java.lang.String peekLeadingMatchingValue(java.lang.String keyToMatch, boolean isLenient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyToMatch, "");
        int i = this.currentPosition;
        try {
            if (consumeNextToken() == 6 && kotlin.jvm.internal.Intrinsics.areEqual(peekString(isLenient), keyToMatch)) {
                discardPeeked();
                if (consumeNextToken() == 5) {
                    return peekString(isLenient);
                }
            }
            this.currentPosition = i;
            discardPeeked();
            return null;
        } finally {
            this.currentPosition = i;
            discardPeeked();
        }
    }
}
