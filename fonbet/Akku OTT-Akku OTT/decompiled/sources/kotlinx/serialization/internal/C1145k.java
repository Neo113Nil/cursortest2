package kotlinx.serialization.internal;

import kotlin.PublishedApi;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

@PublishedApi
/* renamed from: kotlinx.serialization.internal.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1145k extends I0<Byte, byte[], C1143j> {
    public static final C1145k c;

    static {
        Intrinsics.checkNotNullParameter(ByteCompanionObject.INSTANCE, "<this>");
        c = new C1145k(C1147l.a);
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final int e(Object obj) {
        byte[] bArr = (byte[]) obj;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length;
    }

    @Override // kotlinx.serialization.internal.AbstractC1168w, kotlinx.serialization.internal.AbstractC1125a
    public final void h(kotlinx.serialization.encoding.c decoder, int i, Object obj) {
        C1143j builder = (C1143j) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        byte decodeByteElement = decoder.decodeByteElement(this.b, i);
        builder.getClass();
        builder.b(builder.d() + 1);
        byte[] bArr = builder.a;
        int i2 = builder.b;
        builder.b = i2 + 1;
        bArr[i2] = decodeByteElement;
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final Object i(Object obj) {
        byte[] bufferWithData = (byte[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        C1143j c1143j = new C1143j();
        c1143j.a = bufferWithData;
        c1143j.b = bufferWithData.length;
        c1143j.b(10);
        return c1143j;
    }

    @Override // kotlinx.serialization.internal.I0
    public final byte[] l() {
        return new byte[0];
    }

    @Override // kotlinx.serialization.internal.I0
    public final void m(kotlinx.serialization.encoding.d encoder, byte[] bArr, int i) {
        byte[] content = bArr;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.encodeByteElement(this.b, i2, content[i2]);
        }
    }
}
