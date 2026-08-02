package kotlinx.serialization.internal;

import com.google.common.collect.C0971t;
import kotlin.PublishedApi;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.ShortCompanionObject;

@PublishedApi
/* loaded from: classes5.dex */
public final class h1 implements kotlinx.serialization.b<UShort> {
    public static final h1 a = new h1();
    public static final S b;

    static {
        Intrinsics.checkNotNullParameter(ShortCompanionObject.INSTANCE, "<this>");
        b = C0971t.a("kotlin.UShort", R0.a);
    }

    @Override // kotlinx.serialization.a
    public final Object deserialize(kotlinx.serialization.encoding.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return UShort.m1991boximpl(UShort.m1997constructorimpl(decoder.decodeInline(b).decodeShort()));
    }

    @Override // kotlinx.serialization.k, kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.f getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.k
    public final void serialize(kotlinx.serialization.encoding.f encoder, Object obj) {
        short data = ((UShort) obj).getData();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeInline(b).encodeShort(data);
    }
}
