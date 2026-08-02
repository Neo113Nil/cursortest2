package kotlinx.serialization.internal;

import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.e;

@PublishedApi
/* renamed from: kotlinx.serialization.internal.g0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1138g0 implements kotlinx.serialization.b<Long> {
    public static final C1138g0 a = new C1138g0();
    public static final J0 b = new J0("kotlin.Long", e.g.a);

    @Override // kotlinx.serialization.a
    public final Object deserialize(kotlinx.serialization.encoding.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Long.valueOf(decoder.decodeLong());
    }

    @Override // kotlinx.serialization.k, kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.f getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.k
    public final void serialize(kotlinx.serialization.encoding.f encoder, Object obj) {
        long longValue = ((Number) obj).longValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeLong(longValue);
    }
}
