package kotlinx.serialization.encoding;

/* loaded from: classes5.dex */
public interface e {
    c beginStructure(kotlinx.serialization.descriptors.f fVar);

    boolean decodeBoolean();

    byte decodeByte();

    char decodeChar();

    double decodeDouble();

    int decodeEnum(kotlinx.serialization.descriptors.f fVar);

    float decodeFloat();

    e decodeInline(kotlinx.serialization.descriptors.f fVar);

    int decodeInt();

    long decodeLong();

    boolean decodeNotNullMark();

    Void decodeNull();

    <T> T decodeSerializableValue(kotlinx.serialization.a<? extends T> aVar);

    short decodeShort();

    String decodeString();
}
