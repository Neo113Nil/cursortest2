package kotlinx.serialization.internal;

import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.e;

@PublishedApi
/* renamed from: kotlinx.serialization.internal.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1141i implements kotlinx.serialization.b<Boolean> {
    public static final C1141i a = new C1141i();
    public static final J0 b = new J0("kotlin.Boolean", e.a.a);

    @Override // kotlinx.serialization.a
    public final Object deserialize(kotlinx.serialization.encoding.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Boolean.valueOf(decoder.decodeBoolean());
    }

    @Override // kotlinx.serialization.k, kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.f getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.k
    public final void serialize(kotlinx.serialization.encoding.f encoder, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeBoolean(booleanValue);
    }
}
