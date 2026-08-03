package kotlinx.serialization.json.internal;

/* compiled from: StreamingJsonDecoder.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lkotlinx/serialization/json/internal/JsonDecoderForUnsignedTypes;", "Lkotlinx/serialization/encoding/AbstractDecoder;", "lexer", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lkotlinx/serialization/json/internal/AbstractJsonLexer;Lkotlinx/serialization/json/Json;)V", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "decodeElementIndex", "", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "decodeInt", "decodeLong", "", "decodeByte", "", "decodeShort", "", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonDecoderForUnsignedTypes extends kotlinx.serialization.encoding.AbstractDecoder {
    private final kotlinx.serialization.json.internal.AbstractJsonLexer lexer;
    private final kotlinx.serialization.modules.SerializersModule serializersModule;

    public JsonDecoderForUnsignedTypes(kotlinx.serialization.json.internal.AbstractJsonLexer lexer, kotlinx.serialization.json.Json json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lexer, "lexer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
        this.lexer = lexer;
        this.serializersModule = json.getSerializersModule();
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    public kotlinx.serialization.modules.SerializersModule getSerializersModule() {
        return this.serializersModule;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        throw new java.lang.IllegalStateException("unsupported".toString());
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public int decodeInt() {
        kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer = this.lexer;
        java.lang.String consumeStringLenient = abstractJsonLexer.consumeStringLenient();
        try {
            return kotlin.text.UStringsKt.toUInt(consumeStringLenient);
        } catch (java.lang.IllegalArgumentException unused) {
            kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(abstractJsonLexer, "Failed to parse type 'UInt' for input '" + consumeStringLenient + '\'', 0, null, 6, null);
            throw new kotlin.KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public long decodeLong() {
        kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer = this.lexer;
        java.lang.String consumeStringLenient = abstractJsonLexer.consumeStringLenient();
        try {
            return kotlin.text.UStringsKt.toULong(consumeStringLenient);
        } catch (java.lang.IllegalArgumentException unused) {
            kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(abstractJsonLexer, "Failed to parse type 'ULong' for input '" + consumeStringLenient + '\'', 0, null, 6, null);
            throw new kotlin.KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public byte decodeByte() {
        kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer = this.lexer;
        java.lang.String consumeStringLenient = abstractJsonLexer.consumeStringLenient();
        try {
            return kotlin.text.UStringsKt.toUByte(consumeStringLenient);
        } catch (java.lang.IllegalArgumentException unused) {
            kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(abstractJsonLexer, "Failed to parse type 'UByte' for input '" + consumeStringLenient + '\'', 0, null, 6, null);
            throw new kotlin.KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public short decodeShort() {
        kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer = this.lexer;
        java.lang.String consumeStringLenient = abstractJsonLexer.consumeStringLenient();
        try {
            return kotlin.text.UStringsKt.toUShort(consumeStringLenient);
        } catch (java.lang.IllegalArgumentException unused) {
            kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(abstractJsonLexer, "Failed to parse type 'UShort' for input '" + consumeStringLenient + '\'', 0, null, 6, null);
            throw new kotlin.KotlinNothingValueException();
        }
    }
}
