package kotlinx.serialization.internal;

import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.e;

@PublishedApi
/* renamed from: kotlinx.serialization.internal.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1147l implements kotlinx.serialization.b<Byte> {
    public static final C1147l a = new C1147l();
    public static final J0 b = new J0("kotlin.Byte", e.b.a);

    @Override // kotlinx.serialization.a
    public final Object deserialize(kotlinx.serialization.encoding.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Byte.valueOf(decoder.decodeByte());
    }

    @Override // kotlinx.serialization.k, kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.f getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.k
    public final void serialize(kotlinx.serialization.encoding.f encoder, Object obj) {
        byte byteValue = ((Number) obj).byteValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeByte(byteValue);
    }
}
