package kotlinx.serialization.json.internal;

/* compiled from: JsonIterator.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a:\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\nH\u0000\u001a\u0014\u0010\u000b\u001a\u00020\u0004*\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0002\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\fH\u0002¨\u0006\u0010"}, d2 = {"JsonIterator", "", "T", com.ironsource.X3.a.t, "Lkotlinx/serialization/json/DecodeSequenceMode;", "json", "Lkotlinx/serialization/json/Json;", "lexer", "Lkotlinx/serialization/json/internal/ReaderJsonLexer;", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "determineFormat", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "suggested", "tryConsumeStartArray", "", "kotlinx-serialization-json"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonIteratorKt {

    /* compiled from: JsonIterator.kt */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
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

    public static final <T> java.util.Iterator<T> JsonIterator(kotlinx.serialization.json.DecodeSequenceMode mode, kotlinx.serialization.json.Json json, kotlinx.serialization.json.internal.ReaderJsonLexer lexer, kotlinx.serialization.DeserializationStrategy<? extends T> deserializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "mode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lexer, "lexer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        int i = kotlinx.serialization.json.internal.JsonIteratorKt.WhenMappings.$EnumSwitchMapping$0[determineFormat(lexer, mode).ordinal()];
        if (i == 1) {
            return new kotlinx.serialization.json.internal.JsonIteratorWsSeparated(json, lexer, deserializer);
        }
        if (i == 2) {
            return new kotlinx.serialization.json.internal.JsonIteratorArrayWrapped(json, lexer, deserializer);
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        throw new java.lang.IllegalStateException("AbstractJsonLexer.determineFormat must be called beforehand.".toString());
    }

    private static final kotlinx.serialization.json.DecodeSequenceMode determineFormat(kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer, kotlinx.serialization.json.DecodeSequenceMode decodeSequenceMode) {
        int i = kotlinx.serialization.json.internal.JsonIteratorKt.WhenMappings.$EnumSwitchMapping$0[decodeSequenceMode.ordinal()];
        if (i == 1) {
            return kotlinx.serialization.json.DecodeSequenceMode.WHITESPACE_SEPARATED;
        }
        if (i != 2) {
            if (i == 3) {
                return tryConsumeStartArray(abstractJsonLexer) ? kotlinx.serialization.json.DecodeSequenceMode.ARRAY_WRAPPED : kotlinx.serialization.json.DecodeSequenceMode.WHITESPACE_SEPARATED;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (tryConsumeStartArray(abstractJsonLexer)) {
            return kotlinx.serialization.json.DecodeSequenceMode.ARRAY_WRAPPED;
        }
        java.lang.String str = kotlinx.serialization.json.internal.AbstractJsonLexerKt.tokenDescription((byte) 8);
        int i2 = abstractJsonLexer.currentPosition - 1;
        kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(abstractJsonLexer, "Expected " + str + ", but had '" + ((abstractJsonLexer.currentPosition == abstractJsonLexer.getSource().length() || i2 < 0) ? "EOF" : java.lang.String.valueOf(abstractJsonLexer.getSource().charAt(i2))) + "' instead", i2, null, 4, null);
        throw new kotlin.KotlinNothingValueException();
    }

    private static final boolean tryConsumeStartArray(kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer) {
        if (abstractJsonLexer.peekNextToken() != 8) {
            return false;
        }
        abstractJsonLexer.consumeNextToken((byte) 8);
        return true;
    }
}
