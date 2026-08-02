package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u001aA\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"T", "Lkotlinx/serialization/json/DecodeSequenceMode;", "mode", "Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/json/internal/ReaderJsonLexer;", "lexer", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "", "JsonIterator", "(Lkotlinx/serialization/json/DecodeSequenceMode;Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/ReaderJsonLexer;Lkotlinx/serialization/DeserializationStrategy;)Ljava/util/Iterator;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class JsonIteratorKt {
    public static final <T> java.util.Iterator<T> JsonIterator(kotlinx.serialization.json.DecodeSequenceMode decodeSequenceMode, kotlinx.serialization.json.Json json, kotlinx.serialization.json.internal.ReaderJsonLexer readerJsonLexer, kotlinx.serialization.DeserializationStrategy<? extends T> deserializationStrategy) {
        kotlinx.serialization.json.DecodeSequenceMode decodeSequenceMode2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decodeSequenceMode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readerJsonLexer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationStrategy, "");
        kotlinx.serialization.json.internal.ReaderJsonLexer readerJsonLexer2 = readerJsonLexer;
        int i = kotlinx.serialization.json.internal.JsonIteratorKt.WhenMappings.$EnumSwitchMapping$0[decodeSequenceMode.ordinal()];
        if (i == 1) {
            decodeSequenceMode2 = kotlinx.serialization.json.DecodeSequenceMode.WHITESPACE_SEPARATED;
        } else if (i != 2) {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (readerJsonLexer2.peekNextToken() != 8) {
                decodeSequenceMode2 = kotlinx.serialization.json.DecodeSequenceMode.WHITESPACE_SEPARATED;
            } else {
                readerJsonLexer2.consumeNextToken((byte) 8);
                decodeSequenceMode2 = kotlinx.serialization.json.DecodeSequenceMode.ARRAY_WRAPPED;
            }
        } else {
            if (readerJsonLexer2.peekNextToken() != 8) {
                java.lang.String str = kotlinx.serialization.json.internal.AbstractJsonLexerKt.tokenDescription((byte) 8);
                int i2 = readerJsonLexer2.currentPosition - 1;
                java.lang.String valueOf = (readerJsonLexer2.currentPosition == readerJsonLexer2.getSource().length() || i2 < 0) ? "EOF" : java.lang.String.valueOf(readerJsonLexer2.getSource().charAt(i2));
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
                sb.append(str);
                sb.append(", but had '");
                sb.append(valueOf);
                sb.append("' instead");
                kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(readerJsonLexer2, sb.toString(), i2, null, 4, null);
                throw new kotlin.KotlinNothingValueException();
            }
            readerJsonLexer2.consumeNextToken((byte) 8);
            decodeSequenceMode2 = kotlinx.serialization.json.DecodeSequenceMode.ARRAY_WRAPPED;
        }
        int i3 = kotlinx.serialization.json.internal.JsonIteratorKt.WhenMappings.$EnumSwitchMapping$0[decodeSequenceMode2.ordinal()];
        if (i3 == 1) {
            return new kotlinx.serialization.json.internal.JsonIteratorWsSeparated(json, readerJsonLexer, deserializationStrategy);
        }
        if (i3 == 2) {
            return new kotlinx.serialization.json.internal.JsonIteratorArrayWrapped(json, readerJsonLexer, deserializationStrategy);
        }
        if (i3 != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        throw new java.lang.IllegalStateException("AbstractJsonLexer.determineFormat must be called beforehand.".toString());
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlinx.serialization.json.DecodeSequenceMode.values().length];
            try {
                iArr[kotlinx.serialization.json.DecodeSequenceMode.WHITESPACE_SEPARATED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlinx.serialization.json.DecodeSequenceMode.ARRAY_WRAPPED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlinx.serialization.json.DecodeSequenceMode.AUTO_DETECT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
