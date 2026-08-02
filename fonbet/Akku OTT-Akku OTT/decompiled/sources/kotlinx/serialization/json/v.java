package kotlinx.serialization.json;

import androidx.activity.N;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.m;

@PublishedApi
/* loaded from: classes5.dex */
public final class v implements kotlinx.serialization.b<u> {
    public static final v a = new v();
    public static final kotlinx.serialization.descriptors.i b = kotlinx.serialization.descriptors.l.c("kotlinx.serialization.json.JsonNull", m.b.a, new kotlinx.serialization.descriptors.f[0], new N(1));

    @Override // kotlinx.serialization.a
    public final Object deserialize(kotlinx.serialization.encoding.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        p.b(decoder);
        if (!decoder.decodeNotNullMark()) {
            decoder.decodeNull();
            return u.INSTANCE;
        }
        Intrinsics.checkNotNullParameter("Expected 'null' literal", Constants.MESSAGE);
        Intrinsics.checkNotNullParameter("Expected 'null' literal", Constants.MESSAGE);
        throw new kotlinx.serialization.json.internal.k("Expected 'null' literal");
    }

    @Override // kotlinx.serialization.k, kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.f getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.k
    public final void serialize(kotlinx.serialization.encoding.f encoder, Object obj) {
        u value = (u) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        p.a(encoder);
        encoder.encodeNull();
    }
}
