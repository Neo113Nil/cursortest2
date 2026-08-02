package kotlinx.serialization.internal;

import com.google.common.collect.C0971t;
import kotlin.PublishedApi;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;

@PublishedApi
/* loaded from: classes5.dex */
public final class e1 implements kotlinx.serialization.b<ULong> {
    public static final e1 a = new e1();
    public static final S b;

    static {
        Intrinsics.checkNotNullParameter(LongCompanionObject.INSTANCE, "<this>");
        b = C0971t.a("kotlin.ULong", C1138g0.a);
    }

    @Override // kotlinx.serialization.a
    public final Object deserialize(kotlinx.serialization.encoding.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return ULong.m1884boximpl(ULong.m1890constructorimpl(decoder.decodeInline(b).decodeLong()));
    }

    @Override // kotlinx.serialization.k, kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.f getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.k
    public final void serialize(kotlinx.serialization.encoding.f encoder, Object obj) {
        long data = ((ULong) obj).getData();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeInline(b).encodeLong(data);
    }
}
