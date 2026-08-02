package kotlinx.serialization.internal;

import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@PublishedApi
/* loaded from: classes5.dex */
public final class i1 implements kotlinx.serialization.b<Unit> {
    public static final i1 b = new i1();
    public final /* synthetic */ C1163t0<Unit> a = new C1163t0<>(Unit.INSTANCE);

    @Override // kotlinx.serialization.a
    public final Object deserialize(kotlinx.serialization.encoding.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        this.a.deserialize(decoder);
        return Unit.INSTANCE;
    }

    @Override // kotlinx.serialization.k, kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.f getDescriptor() {
        return this.a.getDescriptor();
    }

    @Override // kotlinx.serialization.k
    public final void serialize(kotlinx.serialization.encoding.f encoder, Object obj) {
        Unit value = (Unit) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        this.a.serialize(encoder, value);
    }
}
