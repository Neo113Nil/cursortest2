package kotlinx.serialization.internal;

import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;

@PublishedApi
/* renamed from: kotlinx.serialization.internal.q0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1158q0 implements kotlinx.serialization.b {
    public static final C1158q0 a = new C1158q0();
    public static final C1156p0 b = C1156p0.a;

    @Override // kotlinx.serialization.a
    public final Object deserialize(kotlinx.serialization.encoding.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        throw new kotlinx.serialization.j("'kotlin.Nothing' does not have instances");
    }

    @Override // kotlinx.serialization.k, kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.f getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.k
    public final void serialize(kotlinx.serialization.encoding.f encoder, Object obj) {
        Void value = (Void) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        throw new kotlinx.serialization.j("'kotlin.Nothing' cannot be serialized");
    }
}
