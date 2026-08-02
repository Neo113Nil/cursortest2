package kotlinx.serialization.internal;

import com.google.common.collect.C0971t;
import kotlin.PublishedApi;
import kotlin.UInt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

@PublishedApi
/* loaded from: classes5.dex */
public final class b1 implements kotlinx.serialization.b<UInt> {
    public static final b1 a = new b1();
    public static final S b;

    static {
        Intrinsics.checkNotNullParameter(IntCompanionObject.INSTANCE, "<this>");
        b = C0971t.a("kotlin.UInt", W.a);
    }

    @Override // kotlinx.serialization.a
    public final Object deserialize(kotlinx.serialization.encoding.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return UInt.m1805boximpl(UInt.m1811constructorimpl(decoder.decodeInline(b).decodeInt()));
    }

    @Override // kotlinx.serialization.k, kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.f getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.k
    public final void serialize(kotlinx.serialization.encoding.f encoder, Object obj) {
        int data = ((UInt) obj).getData();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeInline(b).encodeInt(data);
    }
}
