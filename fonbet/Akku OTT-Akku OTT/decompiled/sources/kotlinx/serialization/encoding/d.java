package kotlinx.serialization.encoding;

import kotlinx.serialization.k;

/* loaded from: classes5.dex */
public interface d {
    void encodeBooleanElement(kotlinx.serialization.descriptors.f fVar, int i, boolean z);

    void encodeByteElement(kotlinx.serialization.descriptors.f fVar, int i, byte b);

    void encodeCharElement(kotlinx.serialization.descriptors.f fVar, int i, char c);

    void encodeDoubleElement(kotlinx.serialization.descriptors.f fVar, int i, double d);

    void encodeFloatElement(kotlinx.serialization.descriptors.f fVar, int i, float f);

    f encodeInlineElement(kotlinx.serialization.descriptors.f fVar, int i);

    void encodeIntElement(kotlinx.serialization.descriptors.f fVar, int i, int i2);

    void encodeLongElement(kotlinx.serialization.descriptors.f fVar, int i, long j);

    <T> void encodeNullableSerializableElement(kotlinx.serialization.descriptors.f fVar, int i, k<? super T> kVar, T t);

    <T> void encodeSerializableElement(kotlinx.serialization.descriptors.f fVar, int i, k<? super T> kVar, T t);

    void encodeShortElement(kotlinx.serialization.descriptors.f fVar, int i, short s);

    void encodeStringElement(kotlinx.serialization.descriptors.f fVar, int i, String str);

    void endStructure(kotlinx.serialization.descriptors.f fVar);

    boolean shouldEncodeElementDefault(kotlinx.serialization.descriptors.f fVar, int i);
}
