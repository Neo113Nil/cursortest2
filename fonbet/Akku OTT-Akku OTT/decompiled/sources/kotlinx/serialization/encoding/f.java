package kotlinx.serialization.encoding;

import kotlinx.serialization.k;

/* loaded from: classes5.dex */
public interface f {
    d beginCollection(kotlinx.serialization.descriptors.f fVar, int i);

    d beginStructure(kotlinx.serialization.descriptors.f fVar);

    void encodeBoolean(boolean z);

    void encodeByte(byte b);

    void encodeChar(char c);

    void encodeDouble(double d);

    void encodeEnum(kotlinx.serialization.descriptors.f fVar, int i);

    void encodeFloat(float f);

    f encodeInline(kotlinx.serialization.descriptors.f fVar);

    void encodeInt(int i);

    void encodeLong(long j);

    void encodeNotNullMark();

    void encodeNull();

    <T> void encodeSerializableValue(k<? super T> kVar, T t);

    void encodeShort(short s);

    void encodeString(String str);

    kotlinx.serialization.modules.d getSerializersModule();
}
