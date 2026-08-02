package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\r\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0084\b¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\u0003J\r\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H&¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u000bJ\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0016\u0010\u0007J\r\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0003J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0019J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0004H&¢\u0006\u0004\b\u0012\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u001b\u0010\u001aJ_\u0010%\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020\u00112\b\b\u0002\u0010\u001d\u001a\u00020\u000528\b\u0002\u0010#\u001a2\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u001f0\u001eH\u0080\bø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0011H\u0016¢\u0006\u0004\b'\u0010\u0013J\u0017\u0010)\u001a\u00020\u00052\b\b\u0002\u0010(\u001a\u00020\u0005¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\fH&¢\u0006\u0004\b+\u0010,J!\u0010/\u001a\u0004\u0018\u00010\u001f2\u0006\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\u0005H&¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u0004\u0018\u00010\u001f2\u0006\u0010.\u001a\u00020\u0005¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\b¢\u0006\u0004\b3\u0010\u0003J\u001f\u00106\u001a\u00020\f2\u0006\u00104\u001a\u00020\u00042\u0006\u00105\u001a\u00020\fH\u0016¢\u0006\u0004\b6\u00107J\u001f\u00109\u001a\u00020\u001f2\u0006\u00105\u001a\u00020\f2\u0006\u00108\u001a\u00020\fH\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u001fH&¢\u0006\u0004\b;\u0010<J:\u0010@\u001a\u00020\b2\u0006\u0010.\u001a\u00020\u00052!\u0010?\u001a\u001d\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(>\u0012\u0004\u0012\u00020\b0=H\u0016¢\u0006\u0004\b@\u0010AJJ\u0010F\u001a\u00020\b2\u0006\u0010B\u001a\u00020\f2\u0006\u0010C\u001a\u00020\f2\u0006\u0010D\u001a\u00020\u00052!\u0010E\u001a\u001d\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(>\u0012\u0004\u0012\u00020\b0=H\u0002¢\u0006\u0004\bF\u0010GJ\r\u0010H\u001a\u00020\u001f¢\u0006\u0004\bH\u0010<J'\u0010H\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020I2\u0006\u0010J\u001a\u00020\f2\u0006\u0010K\u001a\u00020\fH\u0004¢\u0006\u0004\bH\u0010LJ\u001f\u0010M\u001a\u00020\f2\u0006\u0010B\u001a\u00020\f2\u0006\u0010C\u001a\u00020\fH\u0002¢\u0006\u0004\bM\u0010NJ\r\u0010O\u001a\u00020\u001f¢\u0006\u0004\bO\u0010<J\r\u0010P\u001a\u00020\u001f¢\u0006\u0004\bP\u0010<J\u001f\u0010S\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\f2\u0006\u0010R\u001a\u00020\fH\u0014¢\u0006\u0004\bS\u0010TJ3\u0010W\u001a\u00020\b2\u0006\u0010U\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0VH\u0080\bø\u0001\u0000¢\u0006\u0004\bW\u0010XJ\u001f\u0010F\u001a\u00020\f2\u0006\u0010B\u001a\u00020I2\u0006\u0010C\u001a\u00020\fH\u0002¢\u0006\u0004\bF\u0010YJ\u0015\u0010[\u001a\u00020\b2\u0006\u0010Z\u001a\u00020\u0005¢\u0006\u0004\b[\u0010\\J\u000f\u0010]\u001a\u00020\u001fH\u0016¢\u0006\u0004\b]\u0010<J\u0015\u0010_\u001a\u00020\b2\u0006\u0010^\u001a\u00020\u001f¢\u0006\u0004\b_\u0010`J)\u0010b\u001a\u00020$2\u0006\u0010#\u001a\u00020\u001f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010a\u001a\u00020\u001f¢\u0006\u0004\bb\u0010cJ\r\u0010e\u001a\u00020d¢\u0006\u0004\be\u0010fJ\r\u0010g\u001a\u00020d¢\u0006\u0004\bg\u0010fJ\r\u0010h\u001a\u00020\u0005¢\u0006\u0004\bh\u0010\u000bJ\r\u0010i\u001a\u00020\u0005¢\u0006\u0004\bi\u0010\u000bJ\u0017\u0010F\u001a\u00020\u00052\u0006\u0010B\u001a\u00020\fH\u0002¢\u0006\u0004\bF\u0010jJ\u001f\u0010k\u001a\u00020\b2\u0006\u0010B\u001a\u00020\u001f2\u0006\u0010C\u001a\u00020\fH\u0002¢\u0006\u0004\bk\u0010lR\u0014\u0010\"\u001a\u00020I8%X¤\u0004¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0016\u0010o\u001a\u00020\f8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010r\u001a\u00020q8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0018\u0010M\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bF\u0010tR&\u0010w\u001a\u00060uj\u0002`v8\u0005@\u0005X\u0085\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "", "<init>", "()V", "", "", "isWs", "(C)Z", "", "ensureHaveChars", "isNotEof", "()Z", "", com.daon.sdk.face.license.License.FEATURE_POSITION, "prefetchOrEof", "(I)I", "canConsumeValue", "", "consumeNextToken", "()B", "tryConsumeComma", "c", "isValidValueStart", "expectEof", "expected", "(B)B", "(C)V", "unexpectedToken", "expectedToken", "wasConsumed", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "source", "message", "", "fail$kotlinx_serialization_json", "(BZLkotlin/jvm/functions/Function2;)Ljava/lang/Void;", "peekNextToken", "doConsume", "tryConsumeNull", "(Z)Z", "skipWhitespaces", "()I", "keyToMatch", "isLenient", "peekLeadingMatchingValue", "(Ljava/lang/String;Z)Ljava/lang/String;", "peekString", "(Z)Ljava/lang/String;", "discardPeeked", "char", "startPos", "indexOf", "(CI)I", "endPos", "substring", "(II)Ljava/lang/String;", "consumeKeyString", "()Ljava/lang/String;", "Lkotlin/Function1;", "stringChunk", "consumeChunk", "consumeStringChunked", "(ZLkotlin/jvm/functions/Function1;)V", "p0", "p1", "p2", "p3", "getHighSpeedVideoFpsRangesFor", "(IIZLkotlin/jvm/functions/Function1;)V", "consumeString", "", "startPosition", "current", "(Ljava/lang/CharSequence;II)Ljava/lang/String;", "getHighSpeedVideoSizes", "(II)I", "consumeStringLenientNotNull", "consumeStringLenient", "fromIndex", "toIndex", "appendRange", "(II)V", "condition", "Lkotlin/Function0;", "require$kotlinx_serialization_json", "(ZILkotlin/jvm/functions/Function0;)V", "(Ljava/lang/CharSequence;I)I", "allowLenientStrings", "skipElement", "(Z)V", "toString", "key", "failOnUnknownKey", "(Ljava/lang/String;)V", "hint", "fail", "(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/Void;", "", "consumeNumericLiteral", "()J", "consumeNumericLiteralFully", "consumeBoolean", "consumeBooleanLenient", "(I)Z", "Camera2StreamConfigurationMap", "(Ljava/lang/String;I)V", "getSource", "()Ljava/lang/CharSequence;", "currentPosition", com.visa.cbp.getEncExpo.warmup, "Lkotlinx/serialization/json/internal/JsonPath;", "path", "Lkotlinx/serialization/json/internal/JsonPath;", "Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/getHighSpeedVideoSizes;", "escapedString", "Ljava/lang/StringBuilder;", "getEscapedString", "()Ljava/lang/StringBuilder;", "setEscapedString", "(Ljava/lang/StringBuilder;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class AbstractJsonLexer {
    public int currentPosition;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private java.lang.String getHighSpeedVideoSizes;
    public final kotlinx.serialization.json.internal.JsonPath path = new kotlinx.serialization.json.internal.JsonPath();
    private java.lang.StringBuilder escapedString = new java.lang.StringBuilder();

    public abstract boolean canConsumeValue();

    public abstract java.lang.String consumeKeyString();

    public abstract byte consumeNextToken();

    public abstract void consumeNextToken(char expected);

    public void ensureHaveChars() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract java.lang.CharSequence getSource();

    protected final boolean isValidValueStart(char c) {
        return (c == ',' || c == ':' || c == ']' || c == '}') ? false : true;
    }

    protected final boolean isWs(char c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t';
    }

    public abstract java.lang.String peekLeadingMatchingValue(java.lang.String keyToMatch, boolean isLenient);

    public abstract int prefetchOrEof(int position);

    public abstract int skipWhitespaces();

    public final boolean isNotEof() {
        return peekNextToken() != 10;
    }

    public final boolean tryConsumeComma() {
        int skipWhitespaces = skipWhitespaces();
        java.lang.CharSequence source = getSource();
        if (skipWhitespaces >= source.length() || skipWhitespaces == -1 || source.charAt(skipWhitespaces) != ',') {
            return false;
        }
        this.currentPosition++;
        return true;
    }

    public final void expectEof() {
        if (consumeNextToken() == 10) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected EOF after parsing, but had ");
        sb.append(getSource().charAt(this.currentPosition - 1));
        sb.append(" instead");
        fail$default(this, sb.toString(), 0, null, 6, null);
        throw new kotlin.KotlinNothingValueException();
    }

    protected final java.lang.StringBuilder getEscapedString() {
        return this.escapedString;
    }

    protected final void setEscapedString(java.lang.StringBuilder sb) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "");
        this.escapedString = sb;
    }

    @kotlin.IgnorableReturnValue
    public final byte consumeNextToken(byte expected) {
        byte consumeNextToken = consumeNextToken();
        if (consumeNextToken == expected) {
            return consumeNextToken;
        }
        java.lang.String str = kotlinx.serialization.json.internal.AbstractJsonLexerKt.tokenDescription(expected);
        int i = this.currentPosition;
        int i2 = i - 1;
        java.lang.String valueOf = (i == getSource().length() || i2 < 0) ? "EOF" : java.lang.String.valueOf(getSource().charAt(i2));
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
        sb.append(str);
        sb.append(", but had '");
        sb.append(valueOf);
        sb.append("' instead");
        fail$default(this, sb.toString(), i2, null, 4, null);
        throw new kotlin.KotlinNothingValueException();
    }

    protected final void unexpectedToken(char expected) {
        int i = this.currentPosition;
        if (i > 0 && expected == '\"') {
            try {
                this.currentPosition = i - 1;
                java.lang.String consumeStringLenient = consumeStringLenient();
                this.currentPosition = i;
                if (kotlin.jvm.internal.Intrinsics.areEqual(consumeStringLenient, "null")) {
                    fail("Expected string literal but 'null' literal was found", this.currentPosition - 1, kotlinx.serialization.json.internal.AbstractJsonLexerKt.coerceInputValuesHint);
                    throw new kotlin.KotlinNothingValueException();
                }
            } catch (java.lang.Throwable th) {
                this.currentPosition = i;
                throw th;
            }
        }
        java.lang.String str = kotlinx.serialization.json.internal.AbstractJsonLexerKt.tokenDescription(kotlinx.serialization.json.internal.AbstractJsonLexerKt.charToTokenClass(expected));
        int i2 = this.currentPosition;
        int i3 = i2 - 1;
        java.lang.String valueOf = (i2 == getSource().length() || i3 < 0) ? "EOF" : java.lang.String.valueOf(getSource().charAt(i3));
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
        sb.append(str);
        sb.append(", but had '");
        sb.append(valueOf);
        sb.append("' instead");
        fail$default(this, sb.toString(), i3, null, 4, null);
        throw new kotlin.KotlinNothingValueException();
    }

    public static /* synthetic */ java.lang.Void fail$kotlinx_serialization_json$default(kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer, byte b, boolean z, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                function2 = new kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, java.lang.String>() { // from class: kotlinx.serialization.json.internal.AbstractJsonLexer$fail$1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.String invoke(java.lang.String str, java.lang.String str2) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
                        sb.append(str);
                        sb.append(", but had '");
                        sb.append(str2);
                        sb.append("' instead");
                        return sb.toString();
                    }
                };
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
            java.lang.String str = kotlinx.serialization.json.internal.AbstractJsonLexerKt.tokenDescription(b);
            int i2 = z ? abstractJsonLexer.currentPosition - 1 : abstractJsonLexer.currentPosition;
            fail$default(abstractJsonLexer, (java.lang.String) function2.invoke(str, (abstractJsonLexer.currentPosition == abstractJsonLexer.getSource().length() || i2 < 0) ? "EOF" : java.lang.String.valueOf(abstractJsonLexer.getSource().charAt(i2))), i2, null, 4, null);
            throw new kotlin.KotlinNothingValueException();
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
    }

    public final java.lang.Void fail$kotlinx_serialization_json(byte expectedToken, boolean wasConsumed, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, java.lang.String> message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        java.lang.String str = kotlinx.serialization.json.internal.AbstractJsonLexerKt.tokenDescription(expectedToken);
        int i = wasConsumed ? this.currentPosition - 1 : this.currentPosition;
        fail$default(this, message.invoke(str, (this.currentPosition == getSource().length() || i < 0) ? "EOF" : java.lang.String.valueOf(getSource().charAt(i))), i, null, 4, null);
        throw new kotlin.KotlinNothingValueException();
    }

    public byte peekNextToken() {
        java.lang.CharSequence source = getSource();
        int i = this.currentPosition;
        while (true) {
            int prefetchOrEof = prefetchOrEof(i);
            if (prefetchOrEof != -1) {
                char charAt = source.charAt(prefetchOrEof);
                if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                    this.currentPosition = prefetchOrEof;
                    return kotlinx.serialization.json.internal.AbstractJsonLexerKt.charToTokenClass(charAt);
                }
                i = prefetchOrEof + 1;
            } else {
                this.currentPosition = prefetchOrEof;
                return (byte) 10;
            }
        }
    }

    public static /* synthetic */ boolean tryConsumeNull$default(kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        return abstractJsonLexer.tryConsumeNull(z);
    }

    public final boolean tryConsumeNull(boolean doConsume) {
        int prefetchOrEof = prefetchOrEof(skipWhitespaces());
        int length = getSource().length() - prefetchOrEof;
        if (length < 4 || prefetchOrEof == -1) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if ("null".charAt(i) != getSource().charAt(prefetchOrEof + i)) {
                return false;
            }
        }
        if (length > 4 && kotlinx.serialization.json.internal.AbstractJsonLexerKt.charToTokenClass(getSource().charAt(prefetchOrEof + 4)) == 0) {
            return false;
        }
        if (!doConsume) {
            return true;
        }
        this.currentPosition = prefetchOrEof + 4;
        return true;
    }

    public final java.lang.String peekString(boolean isLenient) {
        java.lang.String consumeString;
        byte peekNextToken = peekNextToken();
        if (isLenient) {
            if (peekNextToken != 1 && peekNextToken != 0) {
                return null;
            }
            consumeString = consumeStringLenient();
        } else {
            if (peekNextToken != 1) {
                return null;
            }
            consumeString = consumeString();
        }
        this.getHighSpeedVideoSizes = consumeString;
        return consumeString;
    }

    public final void discardPeeked() {
        this.getHighSpeedVideoSizes = null;
    }

    public int indexOf(char r7, int startPos) {
        return kotlin.text.StringsKt.indexOf$default(getSource(), r7, startPos, false, 4, (java.lang.Object) null);
    }

    public java.lang.String substring(int startPos, int endPos) {
        return getSource().subSequence(startPos, endPos).toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        getHighSpeedVideoFpsRangesFor(r1, r2, r5, r15);
        r13.currentPosition = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
    
        if (r14 != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007d, code lost:
    
        consumeNextToken('\"');
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void consumeStringChunked(boolean isLenient, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> consumeChunk) {
        int i;
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumeChunk, "");
        byte peekNextToken = peekNextToken();
        if (isLenient && peekNextToken != 0) {
            return;
        }
        if (!isLenient) {
            consumeNextToken('\"');
        }
        int i3 = this.currentPosition;
        char charAt = getSource().charAt(i3);
        boolean z = false;
        int i4 = i3;
        while (true) {
            if (!isLenient) {
                if (charAt == '\"') {
                    break;
                }
                if (isLenient) {
                }
                int i5 = i4 + 1;
                i = i3;
                i2 = i5;
                if (i2 < getSource().length()) {
                }
                charAt = getSource().charAt(i4);
            } else {
                if (kotlinx.serialization.json.internal.AbstractJsonLexerKt.charToTokenClass(charAt) != 0) {
                    break;
                }
                if (isLenient && charAt == '\\') {
                    i2 = prefetchOrEof(getHighSpeedVideoSizes(i3, i4));
                    z = true;
                    i = i2;
                } else {
                    int i52 = i4 + 1;
                    i = i3;
                    i2 = i52;
                }
                if (i2 < getSource().length()) {
                    getHighSpeedVideoFpsRangesFor(i, i2, z, consumeChunk);
                    int prefetchOrEof = prefetchOrEof(i2);
                    if (prefetchOrEof == -1) {
                        fail$default(this, "EOF", prefetchOrEof, null, 4, null);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    z = false;
                    i3 = prefetchOrEof;
                    i4 = i3;
                } else {
                    int i6 = i;
                    i4 = i2;
                    i3 = i6;
                }
                charAt = getSource().charAt(i4);
            }
        }
    }

    public final java.lang.String consumeString() {
        java.lang.String str = this.getHighSpeedVideoSizes;
        if (str == null) {
            return consumeKeyString();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(str);
        this.getHighSpeedVideoSizes = null;
        return str;
    }

    protected final java.lang.String consumeString(java.lang.CharSequence source, int startPosition, int current) {
        java.lang.String obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        int i = startPosition;
        char charAt = source.charAt(current);
        boolean z = false;
        int i2 = current;
        while (charAt != '\"') {
            if (charAt == '\\') {
                i = prefetchOrEof(getHighSpeedVideoSizes(i, i2));
                if (i == -1) {
                    fail$default(this, "Unexpected EOF", i, null, 4, null);
                    throw new kotlin.KotlinNothingValueException();
                }
            } else {
                i2++;
                if (i2 >= source.length()) {
                    appendRange(i, i2);
                    i = prefetchOrEof(i2);
                    if (i == -1) {
                        fail$default(this, "Unexpected EOF", i, null, 4, null);
                        throw new kotlin.KotlinNothingValueException();
                    }
                } else {
                    continue;
                    charAt = source.charAt(i2);
                }
            }
            i2 = i;
            z = true;
            charAt = source.charAt(i2);
        }
        if (!z) {
            obj = substring(i, i2);
        } else {
            appendRange(i, i2);
            obj = this.escapedString.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            this.escapedString.setLength(0);
        }
        this.currentPosition = i2 + 1;
        return obj;
    }

    private final int getHighSpeedVideoSizes(int p0, int p1) {
        appendRange(p0, p1);
        int prefetchOrEof = prefetchOrEof(p1 + 1);
        if (prefetchOrEof == -1) {
            fail$default(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
            throw new kotlin.KotlinNothingValueException();
        }
        int i = prefetchOrEof + 1;
        char charAt = getSource().charAt(prefetchOrEof);
        if (charAt == 'u') {
            java.lang.CharSequence source = getSource();
            while (true) {
                int i2 = i + 4;
                if (i2 >= source.length()) {
                    this.currentPosition = i;
                    ensureHaveChars();
                    if (this.currentPosition + 4 >= source.length()) {
                        fail$default(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    i = this.currentPosition;
                } else {
                    this.escapedString.append((char) ((getHighSpeedVideoFpsRangesFor(source, i) << 12) + (getHighSpeedVideoFpsRangesFor(source, i + 1) << 8) + (getHighSpeedVideoFpsRangesFor(source, i + 2) << 4) + getHighSpeedVideoFpsRangesFor(source, i + 3)));
                    return i2;
                }
            }
        } else {
            char escapeToChar = kotlinx.serialization.json.internal.AbstractJsonLexerKt.escapeToChar(charAt);
            if (escapeToChar == 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid escaped char '");
                sb.append(charAt);
                sb.append('\'');
                fail$default(this, sb.toString(), 0, null, 6, null);
                throw new kotlin.KotlinNothingValueException();
            }
            this.escapedString.append(escapeToChar);
            return i;
        }
    }

    public final java.lang.String consumeStringLenientNotNull() {
        java.lang.String consumeStringLenient = consumeStringLenient();
        if (!kotlin.jvm.internal.Intrinsics.areEqual(consumeStringLenient, "null") || getSource().charAt(this.currentPosition - 1) == '\"') {
            return consumeStringLenient;
        }
        fail$default(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
        throw new kotlin.KotlinNothingValueException();
    }

    public final java.lang.String consumeStringLenient() {
        java.lang.String obj;
        java.lang.String str = this.getHighSpeedVideoSizes;
        if (str == null) {
            int skipWhitespaces = skipWhitespaces();
            if (skipWhitespaces >= getSource().length() || skipWhitespaces == -1) {
                fail$default(this, "EOF", skipWhitespaces, null, 4, null);
                throw new kotlin.KotlinNothingValueException();
            }
            byte charToTokenClass = kotlinx.serialization.json.internal.AbstractJsonLexerKt.charToTokenClass(getSource().charAt(skipWhitespaces));
            if (charToTokenClass == 1) {
                return consumeString();
            }
            if (charToTokenClass != 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected beginning of the string, but got ");
                sb.append(getSource().charAt(skipWhitespaces));
                fail$default(this, sb.toString(), 0, null, 6, null);
                throw new kotlin.KotlinNothingValueException();
            }
            boolean z = false;
            while (kotlinx.serialization.json.internal.AbstractJsonLexerKt.charToTokenClass(getSource().charAt(skipWhitespaces)) == 0) {
                skipWhitespaces++;
                if (skipWhitespaces >= getSource().length()) {
                    appendRange(this.currentPosition, skipWhitespaces);
                    int prefetchOrEof = prefetchOrEof(skipWhitespaces);
                    if (prefetchOrEof == -1) {
                        this.currentPosition = skipWhitespaces;
                        appendRange(0, 0);
                        java.lang.String obj2 = this.escapedString.toString();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
                        this.escapedString.setLength(0);
                        return obj2;
                    }
                    skipWhitespaces = prefetchOrEof;
                    z = true;
                }
            }
            if (!z) {
                obj = substring(this.currentPosition, skipWhitespaces);
            } else {
                appendRange(this.currentPosition, skipWhitespaces);
                obj = this.escapedString.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                this.escapedString.setLength(0);
            }
            this.currentPosition = skipWhitespaces;
            return obj;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(str);
        this.getHighSpeedVideoSizes = null;
        return str;
    }

    protected void appendRange(int fromIndex, int toIndex) {
        this.escapedString.append(getSource(), fromIndex, toIndex);
    }

    public static /* synthetic */ void require$kotlinx_serialization_json$default(kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer, boolean z, int i, kotlin.jvm.functions.Function0 function0, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: require");
        }
        if ((i2 & 2) != 0) {
            i = abstractJsonLexer.currentPosition;
        }
        int i3 = i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        if (z) {
            return;
        }
        fail$default(abstractJsonLexer, (java.lang.String) function0.invoke(), i3, null, 4, null);
        throw new kotlin.KotlinNothingValueException();
    }

    public final void require$kotlinx_serialization_json(boolean condition, int position, kotlin.jvm.functions.Function0<java.lang.String> message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        if (condition) {
            return;
        }
        fail$default(this, message.invoke(), position, null, 4, null);
        throw new kotlin.KotlinNothingValueException();
    }

    private final int getHighSpeedVideoFpsRangesFor(java.lang.CharSequence p0, int p1) {
        char charAt = p0.charAt(p1);
        if ('0' <= charAt && charAt < ':') {
            return charAt - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid toHexChar char '");
        sb.append(charAt);
        sb.append("' in unicode escape");
        fail$default(this, sb.toString(), 0, null, 6, null);
        throw new kotlin.KotlinNothingValueException();
    }

    public final void skipElement(boolean allowLenientStrings) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        byte peekNextToken = peekNextToken();
        if (peekNextToken != 8 && peekNextToken != 6) {
            consumeStringLenient();
            return;
        }
        while (true) {
            byte peekNextToken2 = peekNextToken();
            if (peekNextToken2 != 1) {
                if (peekNextToken2 == 8 || peekNextToken2 == 6) {
                    arrayList.add(java.lang.Byte.valueOf(peekNextToken2));
                } else if (peekNextToken2 == 9) {
                    if (((java.lang.Number) kotlin.collections.CollectionsKt.last((java.util.List) arrayList)).byteValue() != 8) {
                        int i = this.currentPosition;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("found ] instead of } at path: ");
                        sb.append(this.path);
                        throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(i, sb.toString(), getSource());
                    }
                    kotlin.collections.CollectionsKt.removeLast(arrayList);
                } else if (peekNextToken2 == 7) {
                    if (((java.lang.Number) kotlin.collections.CollectionsKt.last((java.util.List) arrayList)).byteValue() != 6) {
                        int i2 = this.currentPosition;
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("found } instead of ] at path: ");
                        sb2.append(this.path);
                        throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(i2, sb2.toString(), getSource());
                    }
                    kotlin.collections.CollectionsKt.removeLast(arrayList);
                } else if (peekNextToken2 == 10) {
                    fail$default(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new kotlin.KotlinNothingValueException();
                }
                consumeNextToken();
                if (arrayList.size() == 0) {
                    return;
                }
            } else if (allowLenientStrings) {
                consumeStringLenient();
            } else {
                consumeKeyString();
            }
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("JsonReader(source='");
        sb.append((java.lang.Object) getSource());
        sb.append("', currentPosition=");
        sb.append(this.currentPosition);
        sb.append(')');
        return sb.toString();
    }

    public final void failOnUnknownKey(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        int lastIndexOf$default = kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) substring(0, this.currentPosition), key, 0, false, 6, (java.lang.Object) null);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Encountered an unknown key '");
        sb.append(key);
        sb.append("' at offset ");
        sb.append(lastIndexOf$default);
        sb.append(" at path: ");
        sb.append(this.path.getPath());
        sb.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
        sb.append((java.lang.Object) kotlinx.serialization.json.internal.JsonExceptionsKt.minify(getSource(), lastIndexOf$default));
        throw new kotlinx.serialization.json.internal.JsonDecodingException(sb.toString());
    }

    public static /* synthetic */ java.lang.Void fail$default(kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer, java.lang.String str, int i, java.lang.String str2, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i2 & 2) != 0) {
            i = abstractJsonLexer.currentPosition;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        return abstractJsonLexer.fail(str, i, str2);
    }

    public final java.lang.Void fail(java.lang.String message, int position, java.lang.String hint) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hint, "");
        java.lang.String concat = hint.length() != 0 ? com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE.concat(java.lang.String.valueOf(hint)) : "";
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(message);
        sb.append(" at path: ");
        sb.append(this.path.getPath());
        sb.append(concat);
        throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(position, sb.toString(), getSource());
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0202, code lost:
    
        fail$default(r17, "Expected numeric literal", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0212, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0140, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013c, code lost:
    
        if (r5 == r0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013e, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0141, code lost:
    
        if (r0 == r5) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0143, code lost:
    
        if (r9 == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0147, code lost:
    
        if (r0 == (r5 - 1)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0149, code lost:
    
        if (r1 == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014b, code lost:
    
        if (r3 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0157, code lost:
    
        if (getSource().charAt(r5) != '\"') goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0159, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015c, code lost:
    
        fail$default(r17, "Expected closing quotation mark", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016c, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x016d, code lost:
    
        fail$default(r17, "EOF", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x017d, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x017e, code lost:
    
        r17.currentPosition = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0180, code lost:
    
        if (r10 == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0182, code lost:
    
        r0 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0185, code lost:
    
        if (r15 != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0187, code lost:
    
        r2 = java.lang.Math.pow(10.0d, -r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0196, code lost:
    
        r0 = r0 * r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019b, code lost:
    
        if (r0 > 9.223372036854776E18d) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a1, code lost:
    
        if (r0 < (-9.223372036854776E18d)) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a9, code lost:
    
        if (java.lang.Math.floor(r0) != r0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01ab, code lost:
    
        r11 = (long) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ad, code lost:
    
        r2 = new java.lang.StringBuilder("Can't convert ");
        r2.append(r0);
        r2.append(" to Long");
        fail$default(r17, r2.toString(), 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ce, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01cf, code lost:
    
        fail$default(r17, "Numeric value overflow", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01df, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x018f, code lost:
    
        if (r15 != true) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0191, code lost:
    
        r2 = java.lang.Math.pow(10.0d, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e5, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e6, code lost:
    
        if (r9 == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01e8, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01ed, code lost:
    
        if (r11 == Long.MIN_VALUE) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01f0, code lost:
    
        return -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01f1, code lost:
    
        fail$default(r17, "Numeric value overflow", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0201, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long consumeNumericLiteral() {
        boolean z;
        char charAt;
        int prefetchOrEof = prefetchOrEof(skipWhitespaces());
        if (prefetchOrEof >= getSource().length() || prefetchOrEof == -1) {
            fail$default(this, "EOF", 0, null, 6, null);
            throw new kotlin.KotlinNothingValueException();
        }
        if (getSource().charAt(prefetchOrEof) == '\"') {
            prefetchOrEof++;
            if (prefetchOrEof == getSource().length()) {
                fail$default(this, "EOF", 0, null, 6, null);
                throw new kotlin.KotlinNothingValueException();
            }
            z = true;
        } else {
            z = false;
        }
        int i = prefetchOrEof;
        long j = 0;
        long j2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        loop0: while (true) {
            boolean z4 = false;
            while (i != getSource().length()) {
                charAt = getSource().charAt(i);
                if ((charAt == 'e' || charAt == 'E') && !z3) {
                    if (i == prefetchOrEof) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected symbol ");
                        sb.append(charAt);
                        sb.append(" in numeric literal");
                        fail$default(this, sb.toString(), 0, null, 6, null);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    i++;
                    z3 = true;
                } else if (charAt == '-' && z3) {
                    if (i == prefetchOrEof) {
                        fail$default(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    i++;
                } else if (charAt != '+' || !z3) {
                    if (charAt != '-') {
                        if (kotlinx.serialization.json.internal.AbstractJsonLexerKt.charToTokenClass(charAt) != 0) {
                            break loop0;
                        }
                        i++;
                        int i2 = charAt - '0';
                        if (i2 < 0 || i2 >= 10) {
                            break loop0;
                        }
                        if (z3) {
                            j2 = (j2 * 10) + i2;
                        } else {
                            j = (j * 10) - i2;
                            if (j > 0) {
                                fail$default(this, "Numeric value overflow", 0, null, 6, null);
                                throw new kotlin.KotlinNothingValueException();
                            }
                        }
                    } else {
                        if (i != prefetchOrEof) {
                            fail$default(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                            throw new kotlin.KotlinNothingValueException();
                        }
                        i++;
                        z2 = true;
                    }
                } else {
                    if (i == prefetchOrEof) {
                        fail$default(this, "Unexpected symbol '+' in numeric literal", 0, null, 6, null);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    i++;
                }
                z4 = true;
            }
            break loop0;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unexpected symbol '");
        sb2.append(charAt);
        sb2.append("' in numeric literal");
        fail$default(this, sb2.toString(), 0, null, 6, null);
        throw new kotlin.KotlinNothingValueException();
    }

    public final long consumeNumericLiteralFully() {
        long consumeNumericLiteral = consumeNumericLiteral();
        if (consumeNextToken() == 10) {
            return consumeNumericLiteral;
        }
        kotlinx.serialization.json.internal.AbstractJsonLexerKt.tokenDescription((byte) 10);
        int i = this.currentPosition;
        int i2 = i - 1;
        java.lang.String valueOf = (i == getSource().length() || i2 < 0) ? "EOF" : java.lang.String.valueOf(getSource().charAt(i2));
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected input to contain a single valid number, but got '");
        sb.append(valueOf);
        sb.append("' after it");
        fail$default(this, sb.toString(), i2, null, 4, null);
        throw new kotlin.KotlinNothingValueException();
    }

    public final boolean consumeBoolean() {
        return getHighSpeedVideoFpsRangesFor(skipWhitespaces());
    }

    public final boolean consumeBooleanLenient() {
        boolean z;
        int skipWhitespaces = skipWhitespaces();
        if (skipWhitespaces == getSource().length()) {
            fail$default(this, "EOF", 0, null, 6, null);
            throw new kotlin.KotlinNothingValueException();
        }
        if (getSource().charAt(skipWhitespaces) == '\"') {
            skipWhitespaces++;
            z = true;
        } else {
            z = false;
        }
        boolean highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(skipWhitespaces);
        if (!z) {
            return highSpeedVideoFpsRangesFor;
        }
        if (this.currentPosition == getSource().length()) {
            fail$default(this, "EOF", 0, null, 6, null);
            throw new kotlin.KotlinNothingValueException();
        }
        if (getSource().charAt(this.currentPosition) != '\"') {
            fail$default(this, "Expected closing quotation mark", 0, null, 6, null);
            throw new kotlin.KotlinNothingValueException();
        }
        this.currentPosition++;
        return highSpeedVideoFpsRangesFor;
    }

    private final boolean getHighSpeedVideoFpsRangesFor(int p0) {
        int prefetchOrEof = prefetchOrEof(p0);
        if (prefetchOrEof >= getSource().length() || prefetchOrEof == -1) {
            fail$default(this, "EOF", 0, null, 6, null);
            throw new kotlin.KotlinNothingValueException();
        }
        int i = prefetchOrEof + 1;
        int charAt = getSource().charAt(prefetchOrEof) | ' ';
        if (charAt == 102) {
            Camera2StreamConfigurationMap("alse", i);
            return false;
        }
        if (charAt == 116) {
            Camera2StreamConfigurationMap("rue", i);
            return true;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected valid boolean literal prefix, but had '");
        sb.append(consumeStringLenient());
        sb.append('\'');
        fail$default(this, sb.toString(), 0, null, 6, null);
        throw new kotlin.KotlinNothingValueException();
    }

    private final void Camera2StreamConfigurationMap(java.lang.String p0, int p1) {
        if (getSource().length() - p1 < p0.length()) {
            fail$default(this, "Unexpected end of boolean literal", 0, null, 6, null);
            throw new kotlin.KotlinNothingValueException();
        }
        int length = p0.length();
        for (int i = 0; i < length; i++) {
            if (p0.charAt(i) != (getSource().charAt(p1 + i) | ' ')) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected valid boolean literal prefix, but had '");
                sb.append(consumeStringLenient());
                sb.append('\'');
                fail$default(this, sb.toString(), 0, null, 6, null);
                throw new kotlin.KotlinNothingValueException();
            }
        }
        this.currentPosition = p1 + p0.length();
    }

    private final void getHighSpeedVideoFpsRangesFor(int p0, int p1, boolean p2, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> p3) {
        if (!p2) {
            p3.invoke(substring(p0, p1));
            return;
        }
        appendRange(p0, p1);
        java.lang.String obj = this.escapedString.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        this.escapedString.setLength(0);
        p3.invoke(obj);
    }
}
