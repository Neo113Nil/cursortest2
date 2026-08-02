package kotlinx.serialization.json;

import com.bbflight.background_downloader.u1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.d;

@PublishedApi
/* loaded from: classes5.dex */
public final class n implements kotlinx.serialization.b<h> {
    public static final n a = new n();
    public static final kotlinx.serialization.descriptors.i b = kotlinx.serialization.descriptors.l.c("kotlinx.serialization.json.JsonElement", d.b.a, new kotlinx.serialization.descriptors.f[0], new u1(1));

    @Override // kotlinx.serialization.a
    public final Object deserialize(kotlinx.serialization.encoding.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return p.b(decoder).a();
    }

    @Override // kotlinx.serialization.k, kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.f getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.k
    public final void serialize(kotlinx.serialization.encoding.f encoder, Object obj) {
        h value = (h) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        p.a(encoder);
        if (value instanceof z) {
            encoder.encodeSerializableValue(A.a, value);
        } else if (value instanceof x) {
            encoder.encodeSerializableValue(y.a, value);
        } else {
            if (!(value instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            encoder.encodeSerializableValue(d.a, value);
        }
    }
}
