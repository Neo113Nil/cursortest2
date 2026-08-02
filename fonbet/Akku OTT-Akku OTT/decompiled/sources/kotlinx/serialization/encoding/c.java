package kotlinx.serialization.encoding;

/* loaded from: classes5.dex */
public interface c {
    public static final a Companion = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();
    }

    boolean decodeBooleanElement(kotlinx.serialization.descriptors.f fVar, int i);

    byte decodeByteElement(kotlinx.serialization.descriptors.f fVar, int i);

    char decodeCharElement(kotlinx.serialization.descriptors.f fVar, int i);

    int decodeCollectionSize(kotlinx.serialization.descriptors.f fVar);

    double decodeDoubleElement(kotlinx.serialization.descriptors.f fVar, int i);

    int decodeElementIndex(kotlinx.serialization.descriptors.f fVar);

    float decodeFloatElement(kotlinx.serialization.descriptors.f fVar, int i);

    e decodeInlineElement(kotlinx.serialization.descriptors.f fVar, int i);

    int decodeIntElement(kotlinx.serialization.descriptors.f fVar, int i);

    long decodeLongElement(kotlinx.serialization.descriptors.f fVar, int i);

    <T> T decodeNullableSerializableElement(kotlinx.serialization.descriptors.f fVar, int i, kotlinx.serialization.a<? extends T> aVar, T t);

    boolean decodeSequentially();

    <T> T decodeSerializableElement(kotlinx.serialization.descriptors.f fVar, int i, kotlinx.serialization.a<? extends T> aVar, T t);

    short decodeShortElement(kotlinx.serialization.descriptors.f fVar, int i);

    String decodeStringElement(kotlinx.serialization.descriptors.f fVar, int i);

    void endStructure(kotlinx.serialization.descriptors.f fVar);

    kotlinx.serialization.modules.d getSerializersModule();
}
