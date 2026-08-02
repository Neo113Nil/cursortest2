package kotlinx.serialization.encoding;

@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020!H&¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020!H&¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020(2\u0006\u0010%\u001a\u00020!H&¢\u0006\u0004\b)\u0010*J)\u0010.\u001a\u00028\u0000\"\n\b\u0000\u0010+*\u0004\u0018\u00010\u00012\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0016¢\u0006\u0004\b.\u0010/J+\u00100\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010+*\u00020\u00012\u000e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000,H\u0017¢\u0006\u0004\b0\u0010/R\u0014\u00104\u001a\u0002018'X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103À\u0006\u0003"}, d2 = {"Lkotlinx/serialization/encoding/Decoder;", "", "", "decodeNotNullMark", "()Z", "", "decodeNull", "()Ljava/lang/Void;", "decodeBoolean", "", "decodeByte", "()B", "", "decodeShort", "()S", "", "decodeChar", "()C", "", "decodeInt", "()I", "", "decodeLong", "()J", "", "decodeFloat", "()F", "", "decodeDouble", "()D", "", "decodeString", "()Ljava/lang/String;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "enumDescriptor", "decodeEnum", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "descriptor", "decodeInline", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "beginStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder;", "T", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "decodeSerializableValue", "(Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "decodeNullableSerializableValue", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "serializersModule"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface Decoder {
    kotlinx.serialization.encoding.CompositeDecoder beginStructure(kotlinx.serialization.descriptors.SerialDescriptor descriptor);

    boolean decodeBoolean();

    byte decodeByte();

    char decodeChar();

    double decodeDouble();

    int decodeEnum(kotlinx.serialization.descriptors.SerialDescriptor enumDescriptor);

    float decodeFloat();

    kotlinx.serialization.encoding.Decoder decodeInline(kotlinx.serialization.descriptors.SerialDescriptor descriptor);

    int decodeInt();

    long decodeLong();

    @kotlinx.serialization.ExperimentalSerializationApi
    boolean decodeNotNullMark();

    @kotlinx.serialization.ExperimentalSerializationApi
    java.lang.Void decodeNull();

    short decodeShort();

    java.lang.String decodeString();

    kotlinx.serialization.modules.SerializersModule getSerializersModule();

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static <T> T decodeSerializableValue(kotlinx.serialization.encoding.Decoder decoder, kotlinx.serialization.DeserializationStrategy<? extends T> deserializationStrategy) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationStrategy, "");
            return (T) kotlinx.serialization.encoding.Decoder.super.decodeSerializableValue(deserializationStrategy);
        }

        @kotlinx.serialization.ExperimentalSerializationApi
        @java.lang.Deprecated
        public static <T> T decodeNullableSerializableValue(kotlinx.serialization.encoding.Decoder decoder, kotlinx.serialization.DeserializationStrategy<? extends T> deserializationStrategy) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationStrategy, "");
            return (T) kotlinx.serialization.encoding.Decoder.super.decodeNullableSerializableValue(deserializationStrategy);
        }
    }

    default <T> T decodeSerializableValue(kotlinx.serialization.DeserializationStrategy<? extends T> deserializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializer, "");
        return deserializer.deserialize(this);
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    default <T> T decodeNullableSerializableValue(kotlinx.serialization.DeserializationStrategy<? extends T> deserializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializer, "");
        return (deserializer.getDescriptor().isNullable() || decodeNotNullMark()) ? (T) decodeSerializableValue(deserializer) : (T) decodeNull();
    }
}
