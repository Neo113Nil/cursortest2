package kotlinx.serialization.json;

import androidx.activity.N;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.descriptors.e;

@PublishedApi
/* loaded from: classes5.dex */
public final class A implements kotlinx.serialization.b<z> {
    public static final A a = new A();
    public static final kotlinx.serialization.descriptors.i b = kotlinx.serialization.descriptors.l.c("kotlinx.serialization.json.JsonPrimitive", e.i.a, new kotlinx.serialization.descriptors.f[0], new N(1));

    @Override // kotlinx.serialization.a
    public final Object deserialize(kotlinx.serialization.encoding.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        h a2 = p.b(decoder).a();
        if (a2 instanceof z) {
            return (z) a2;
        }
        throw kotlinx.serialization.json.internal.o.e("Unexpected JSON element, expected JsonPrimitive, had " + Reflection.getOrCreateKotlinClass(a2.getClass()), a2.toString(), -1);
    }

    @Override // kotlinx.serialization.k, kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.f getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.k
    public final void serialize(kotlinx.serialization.encoding.f encoder, Object obj) {
        z value = (z) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        p.a(encoder);
        if (value instanceof u) {
            encoder.encodeSerializableValue(v.a, u.INSTANCE);
        } else {
            encoder.encodeSerializableValue(s.a, (r) value);
        }
    }
}
