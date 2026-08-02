package kotlinx.serialization.internal;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlinx.serialization.internal.o0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1154o0 extends kotlinx.serialization.encoding.b {
    public static final C1154o0 a = new C1154o0();
    public static final kotlinx.serialization.modules.b b = kotlinx.serialization.modules.h.a;

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.f
    public final void encodeBoolean(boolean z) {
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.f
    public final void encodeByte(byte b2) {
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.f
    public final void encodeChar(char c) {
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.f
    public final void encodeDouble(double d) {
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.f
    public final void encodeEnum(kotlinx.serialization.descriptors.f enumDescriptor, int i) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.f
    public final void encodeFloat(float f) {
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.f
    public final void encodeInt(int i) {
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.f
    public final void encodeLong(long j) {
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.f
    public final void encodeNull() {
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.f
    public final void encodeShort(short s) {
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.f
    public final void encodeString(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // kotlinx.serialization.encoding.b
    public final void encodeValue(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // kotlinx.serialization.encoding.f
    public final kotlinx.serialization.modules.d getSerializersModule() {
        return b;
    }
}
