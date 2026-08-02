package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Lkotlinx/serialization/json/internal/JsonDecoderForUnsignedTypes;", "Lkotlinx/serialization/encoding/AbstractDecoder;", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "lexer", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lkotlinx/serialization/json/internal/AbstractJsonLexer;Lkotlinx/serialization/json/Json;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "decodeElementIndex", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "decodeInt", "()I", "", "decodeLong", "()J", "", "decodeByte", "()B", "", "decodeShort", "()S", "Camera2StreamConfigurationMap", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "Lkotlinx/serialization/modules/SerializersModule;", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class JsonDecoderForUnsignedTypes extends kotlinx.serialization.encoding.AbstractDecoder {
    private final kotlinx.serialization.json.internal.AbstractJsonLexer Camera2StreamConfigurationMap;
    private final kotlinx.serialization.modules.SerializersModule serializersModule;

    public JsonDecoderForUnsignedTypes(kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer, kotlinx.serialization.json.Json json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(abstractJsonLexer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        this.Camera2StreamConfigurationMap = abstractJsonLexer;
        this.serializersModule = json.getSerializersModule();
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    public final kotlinx.serialization.modules.SerializersModule getSerializersModule() {
        return this.serializersModule;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final int decodeElementIndex(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        throw new java.lang.IllegalStateException("unsupported".toString());
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final int decodeInt() {
        kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer = this.Camera2StreamConfigurationMap;
        java.lang.String consumeStringLenient = abstractJsonLexer.consumeStringLenient();
        try {
            return kotlin.text.UStringsKt.toUInt(consumeStringLenient);
        } catch (java.lang.IllegalArgumentException unused) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to parse type 'UInt' for input '");
            sb.append(consumeStringLenient);
            sb.append('\'');
            kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(abstractJsonLexer, sb.toString(), 0, null, 6, null);
            throw new kotlin.KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final long decodeLong() {
        kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer = this.Camera2StreamConfigurationMap;
        java.lang.String consumeStringLenient = abstractJsonLexer.consumeStringLenient();
        try {
            return kotlin.text.UStringsKt.toULong(consumeStringLenient);
        } catch (java.lang.IllegalArgumentException unused) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to parse type 'ULong' for input '");
            sb.append(consumeStringLenient);
            sb.append('\'');
            kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(abstractJsonLexer, sb.toString(), 0, null, 6, null);
            throw new kotlin.KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final byte decodeByte() {
        kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer = this.Camera2StreamConfigurationMap;
        java.lang.String consumeStringLenient = abstractJsonLexer.consumeStringLenient();
        try {
            return kotlin.text.UStringsKt.toUByte(consumeStringLenient);
        } catch (java.lang.IllegalArgumentException unused) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to parse type 'UByte' for input '");
            sb.append(consumeStringLenient);
            sb.append('\'');
            kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(abstractJsonLexer, sb.toString(), 0, null, 6, null);
            throw new kotlin.KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final short decodeShort() {
        kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer = this.Camera2StreamConfigurationMap;
        java.lang.String consumeStringLenient = abstractJsonLexer.consumeStringLenient();
        try {
            return kotlin.text.UStringsKt.toUShort(consumeStringLenient);
        } catch (java.lang.IllegalArgumentException unused) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to parse type 'UShort' for input '");
            sb.append(consumeStringLenient);
            sb.append('\'');
            kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(abstractJsonLexer, sb.toString(), 0, null, 6, null);
            throw new kotlin.KotlinNothingValueException();
        }
    }
}
