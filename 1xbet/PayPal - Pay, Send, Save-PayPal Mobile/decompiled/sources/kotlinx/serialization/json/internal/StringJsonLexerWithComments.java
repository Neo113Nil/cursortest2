package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0007\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lkotlinx/serialization/json/internal/StringJsonLexerWithComments;", "Lkotlinx/serialization/json/internal/StringJsonLexer;", "", "source", "<init>", "(Ljava/lang/String;)V", "", "consumeNextToken", "()B", "", "canConsumeValue", "()Z", "", "expected", "", "(C)V", "peekNextToken", "", "skipWhitespaces", "()I"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StringJsonLexerWithComments extends kotlinx.serialization.json.internal.StringJsonLexer {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringJsonLexerWithComments(java.lang.String str) {
        super(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    @Override // kotlinx.serialization.json.internal.StringJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public final byte consumeNextToken() {
        java.lang.String source = getSource();
        int skipWhitespaces = skipWhitespaces();
        if (skipWhitespaces >= source.length() || skipWhitespaces == -1) {
            return (byte) 10;
        }
        this.currentPosition = skipWhitespaces + 1;
        return kotlinx.serialization.json.internal.AbstractJsonLexerKt.charToTokenClass(source.charAt(skipWhitespaces));
    }

    @Override // kotlinx.serialization.json.internal.StringJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public final boolean canConsumeValue() {
        int skipWhitespaces = skipWhitespaces();
        if (skipWhitespaces >= getSource().length() || skipWhitespaces == -1) {
            return false;
        }
        return isValidValueStart(getSource().charAt(skipWhitespaces));
    }

    @Override // kotlinx.serialization.json.internal.StringJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public final void consumeNextToken(char expected) {
        java.lang.String source = getSource();
        int skipWhitespaces = skipWhitespaces();
        if (skipWhitespaces >= source.length() || skipWhitespaces == -1) {
            this.currentPosition = -1;
            unexpectedToken(expected);
        }
        char charAt = source.charAt(skipWhitespaces);
        this.currentPosition = skipWhitespaces + 1;
        if (charAt == expected) {
            return;
        }
        unexpectedToken(expected);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public final byte peekNextToken() {
        java.lang.String source = getSource();
        int skipWhitespaces = skipWhitespaces();
        if (skipWhitespaces >= source.length() || skipWhitespaces == -1) {
            return (byte) 10;
        }
        this.currentPosition = skipWhitespaces;
        return kotlinx.serialization.json.internal.AbstractJsonLexerKt.charToTokenClass(source.charAt(skipWhitespaces));
    }

    @Override // kotlinx.serialization.json.internal.StringJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public final int skipWhitespaces() {
        int i;
        int i2 = this.currentPosition;
        if (i2 == -1) {
            return i2;
        }
        java.lang.String source = getSource();
        while (i2 < source.length()) {
            char charAt = source.charAt(i2);
            kotlinx.serialization.json.internal.StringJsonLexerWithComments stringJsonLexerWithComments = this;
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                if (charAt != '/' || (i = i2 + 1) >= source.length()) {
                    break;
                }
                char charAt2 = source.charAt(i);
                if (charAt2 == '*') {
                    int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) source, "*/", i2 + 2, false, 4, (java.lang.Object) null);
                    if (indexOf$default == -1) {
                        this.currentPosition = source.length();
                        kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(stringJsonLexerWithComments, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    i2 = indexOf$default + 2;
                } else {
                    if (charAt2 != '/') {
                        break;
                    }
                    i2 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) source, '\n', i2 + 2, false, 4, (java.lang.Object) null);
                    if (i2 == -1) {
                        i2 = source.length();
                    }
                }
            }
            i2++;
        }
        this.currentPosition = i2;
        return i2;
    }
}
