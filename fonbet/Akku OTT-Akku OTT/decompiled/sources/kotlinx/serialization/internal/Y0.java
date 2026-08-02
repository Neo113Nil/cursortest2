package kotlinx.serialization.internal;

import com.google.common.collect.C0971t;
import kotlin.PublishedApi;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

@PublishedApi
/* loaded from: classes5.dex */
public final class Y0 implements kotlinx.serialization.b<UByte> {
    public static final Y0 a = new Y0();
    public static final S b;

    static {
        Intrinsics.checkNotNullParameter(ByteCompanionObject.INSTANCE, "<this>");
        b = C0971t.a("kotlin.UByte", C1147l.a);
    }

    @Override // kotlinx.serialization.a
    public final Object deserialize(kotlinx.serialization.encoding.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return UByte.m1728boximpl(UByte.m1734constructorimpl(decoder.decodeInline(b).decodeByte()));
    }

    @Override // kotlinx.serialization.k, kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.f getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.k
    public final void serialize(kotlinx.serialization.encoding.f encoder, Object obj) {
        byte data = ((UByte) obj).getData();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeInline(b).encodeByte(data);
    }
}
