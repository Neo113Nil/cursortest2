package kotlinx.serialization.internal;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.PublishedApi;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.jvm.internal.Intrinsics;

@PublishedApi
@ExperimentalUnsignedTypes
/* loaded from: classes5.dex */
public final class X0 extends I0<UByte, UByteArray, W0> {
    public static final X0 c;

    static {
        Intrinsics.checkNotNullParameter(UByte.INSTANCE, "<this>");
        c = new X0(Y0.a);
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final int e(Object obj) {
        byte[] collectionSize = ((UByteArray) obj).getStorage();
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return UByteArray.m1793getSizeimpl(collectionSize);
    }

    @Override // kotlinx.serialization.internal.AbstractC1168w, kotlinx.serialization.internal.AbstractC1125a
    public final void h(kotlinx.serialization.encoding.c decoder, int i, Object obj) {
        W0 builder = (W0) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        byte m1734constructorimpl = UByte.m1734constructorimpl(decoder.decodeInlineElement(this.b, i).decodeByte());
        builder.getClass();
        builder.b(builder.d() + 1);
        byte[] bArr = builder.a;
        int i2 = builder.b;
        builder.b = i2 + 1;
        UByteArray.m1797setVurrAj0(bArr, i2, m1734constructorimpl);
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final Object i(Object obj) {
        byte[] bufferWithData = ((UByteArray) obj).getStorage();
        Intrinsics.checkNotNullParameter(bufferWithData, "$this$toBuilder");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        W0 w0 = new W0();
        w0.a = bufferWithData;
        w0.b = UByteArray.m1793getSizeimpl(bufferWithData);
        w0.b(10);
        return w0;
    }

    @Override // kotlinx.serialization.internal.I0
    public final UByteArray l() {
        return UByteArray.m1785boximpl(UByteArray.m1786constructorimpl(0));
    }

    @Override // kotlinx.serialization.internal.I0
    public final void m(kotlinx.serialization.encoding.d encoder, UByteArray uByteArray, int i) {
        byte[] content = uByteArray.getStorage();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.encodeInlineElement(this.b, i2).encodeByte(UByteArray.m1792getw2LRezQ(content, i2));
        }
    }
}
