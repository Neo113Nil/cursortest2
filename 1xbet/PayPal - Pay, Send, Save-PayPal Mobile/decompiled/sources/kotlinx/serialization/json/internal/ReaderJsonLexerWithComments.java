package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u000b\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u000b\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lkotlinx/serialization/json/internal/ReaderJsonLexerWithComments;", "Lkotlinx/serialization/json/internal/ReaderJsonLexer;", "Lkotlinx/serialization/json/internal/InternalJsonReader;", "reader", "", "buffer", "<init>", "(Lkotlinx/serialization/json/internal/InternalJsonReader;[C)V", "", "expected", "", "consumeNextToken", "(C)V", "", "canConsumeValue", "()Z", "", "()B", "peekNextToken", "", "skipWhitespaces", "()I"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ReaderJsonLexerWithComments extends kotlinx.serialization.json.internal.ReaderJsonLexer {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderJsonLexerWithComments(kotlinx.serialization.json.internal.InternalJsonReader internalJsonReader, char[] cArr) {
        super(internalJsonReader, cArr);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalJsonReader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cArr, "");
    }

    @Override // kotlinx.serialization.json.internal.ReaderJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public final void consumeNextToken(char expected) {
        ensureHaveChars();
        kotlinx.serialization.json.internal.ArrayAsSequence source = getSource();
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

    @Override // kotlinx.serialization.json.internal.ReaderJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public final boolean canConsumeValue() {
        ensureHaveChars();
        int skipWhitespaces = skipWhitespaces();
        if (skipWhitespaces >= getSource().length() || skipWhitespaces == -1) {
            return false;
        }
        return isValidValueStart(getSource().charAt(skipWhitespaces));
    }

    @Override // kotlinx.serialization.json.internal.ReaderJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public final byte consumeNextToken() {
        ensureHaveChars();
        kotlinx.serialization.json.internal.ArrayAsSequence source = getSource();
        int skipWhitespaces = skipWhitespaces();
        if (skipWhitespaces >= source.length() || skipWhitespaces == -1) {
            return (byte) 10;
        }
        this.currentPosition = skipWhitespaces + 1;
        return kotlinx.serialization.json.internal.AbstractJsonLexerKt.charToTokenClass(source.charAt(skipWhitespaces));
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public final byte peekNextToken() {
        ensureHaveChars();
        kotlinx.serialization.json.internal.ArrayAsSequence source = getSource();
        int skipWhitespaces = skipWhitespaces();
        if (skipWhitespaces >= source.length() || skipWhitespaces == -1) {
            return (byte) 10;
        }
        this.currentPosition = skipWhitespaces;
        return kotlinx.serialization.json.internal.AbstractJsonLexerKt.charToTokenClass(source.charAt(skipWhitespaces));
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x011d, code lost:
    
        r14.currentPosition = getSource().length();
        kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(r3, "Expected end of the block comment: \"*\/\", but had EOF instead", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0135, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    @Override // kotlinx.serialization.json.internal.ReaderJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int skipWhitespaces() {
        int prefetchOrEof;
        int i;
        kotlin.Pair pair;
        int i2 = this.currentPosition;
        loop0: while (true) {
            prefetchOrEof = prefetchOrEof(i2);
            if (prefetchOrEof == -1) {
                break;
            }
            char charAt = getSource().charAt(prefetchOrEof);
            kotlinx.serialization.json.internal.ReaderJsonLexerWithComments readerJsonLexerWithComments = this;
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                if (charAt != '/' || (i = prefetchOrEof + 1) >= getSource().length()) {
                    break;
                }
                int i3 = prefetchOrEof + 2;
                char charAt2 = getSource().charAt(i);
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                if (charAt2 == '*') {
                    boolean z = false;
                    int i4 = i3;
                    while (prefetchOrEof != -1) {
                        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) getSource(), "*/", i4, false, 4, (java.lang.Object) null);
                        if (indexOf$default != -1) {
                            pair = kotlin.TuplesKt.to(java.lang.Integer.valueOf(indexOf$default + 2), bool);
                        } else {
                            if (getSource().charAt(getSource().length() - 1) != '*') {
                                i4 = prefetchOrEof(getSource().length());
                            } else {
                                int length = getSource().length() - 1;
                                if (getSource().length() - length <= this.threshold) {
                                    this.currentPosition = length;
                                    ensureHaveChars();
                                    length = (this.currentPosition != 0 || getSource().length() == 0) ? -1 : 0;
                                }
                                if (z) {
                                    break loop0;
                                }
                                i4 = length;
                                z = true;
                            }
                            prefetchOrEof = i4;
                        }
                    }
                    break loop0;
                }
                if (charAt2 == '/') {
                    int i5 = i3;
                    while (true) {
                        if (prefetchOrEof != -1) {
                            int indexOf$default2 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) getSource(), '\n', i5, false, 4, (java.lang.Object) null);
                            if (indexOf$default2 == -1) {
                                i5 = prefetchOrEof(getSource().length());
                                prefetchOrEof = i5;
                            } else {
                                pair = kotlin.TuplesKt.to(java.lang.Integer.valueOf(indexOf$default2 + 1), bool);
                                break;
                            }
                        } else {
                            pair = kotlin.TuplesKt.to(-1, bool);
                            break;
                        }
                    }
                } else {
                    pair = kotlin.TuplesKt.to(java.lang.Integer.valueOf(prefetchOrEof), java.lang.Boolean.FALSE);
                }
                int intValue = ((java.lang.Number) pair.component1()).intValue();
                if (!((java.lang.Boolean) pair.component2()).booleanValue()) {
                    prefetchOrEof = intValue;
                    break;
                }
                i2 = intValue;
            } else {
                i2 = prefetchOrEof + 1;
            }
        }
        this.currentPosition = prefetchOrEof;
        return prefetchOrEof;
    }
}
