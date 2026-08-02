package kotlinx.serialization.internal;

import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.serialization.descriptors.e;

@PublishedApi
/* loaded from: classes5.dex */
public final class D implements kotlinx.serialization.b<Duration> {
    public static final D a = new D();
    public static final J0 b = new J0("kotlin.time.Duration", e.i.a);

    @Override // kotlinx.serialization.a
    public final Object deserialize(kotlinx.serialization.encoding.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Duration.m3059boximpl(Duration.INSTANCE.m3158parseIsoStringUwyO8pc(decoder.decodeString()));
    }

    @Override // kotlinx.serialization.k, kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.f getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.k
    public final void serialize(kotlinx.serialization.encoding.f encoder, Object obj) {
        long rawValue = ((Duration) obj).getRawValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeString(Duration.m3099toIsoStringimpl(rawValue));
    }
}
