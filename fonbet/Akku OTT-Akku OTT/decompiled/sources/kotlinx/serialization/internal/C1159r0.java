package kotlinx.serialization.internal;

import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;

@PublishedApi
/* renamed from: kotlinx.serialization.internal.r0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1159r0<T> implements kotlinx.serialization.b<T> {
    public final kotlinx.serialization.b<T> a;
    public final M0 b;

    public C1159r0(kotlinx.serialization.b<T> serializer) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.a = serializer;
        this.b = new M0(serializer.getDescriptor());
    }

    @Override // kotlinx.serialization.a
    public final T deserialize(kotlinx.serialization.encoding.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.decodeNotNullMark() ? (T) decoder.decodeSerializableValue(this.a) : (T) decoder.decodeNull();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C1159r0.class == obj.getClass() && Intrinsics.areEqual(this.a, ((C1159r0) obj).a);
    }

    @Override // kotlinx.serialization.k, kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.f getDescriptor() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // kotlinx.serialization.k
    public final void serialize(kotlinx.serialization.encoding.f encoder, T t) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        if (t == null) {
            encoder.encodeNull();
        } else {
            encoder.encodeNotNullMark();
            encoder.encodeSerializableValue(this.a, t);
        }
    }
}
