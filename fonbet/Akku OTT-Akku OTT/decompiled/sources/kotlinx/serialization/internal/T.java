package kotlinx.serialization.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class T implements M<Object> {
    public final /* synthetic */ kotlinx.serialization.b<Object> a;

    public T(kotlinx.serialization.b<Object> bVar) {
        this.a = bVar;
    }

    @Override // kotlinx.serialization.internal.M
    public final kotlinx.serialization.b<?>[] childSerializers() {
        return new kotlinx.serialization.b[]{this.a};
    }

    @Override // kotlinx.serialization.a
    public final Object deserialize(kotlinx.serialization.encoding.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        throw new IllegalStateException("unsupported");
    }

    @Override // kotlinx.serialization.k, kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.f getDescriptor() {
        throw new IllegalStateException("unsupported");
    }

    @Override // kotlinx.serialization.k
    public final void serialize(kotlinx.serialization.encoding.f encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        throw new IllegalStateException("unsupported");
    }

    @Override // kotlinx.serialization.internal.M
    public final kotlinx.serialization.b<?>[] typeParametersSerializers() {
        return F0.a;
    }
}
