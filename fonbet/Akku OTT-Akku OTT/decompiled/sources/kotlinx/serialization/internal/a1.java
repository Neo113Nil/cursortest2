package kotlinx.serialization.internal;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.PublishedApi;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.jvm.internal.Intrinsics;

@PublishedApi
@ExperimentalUnsignedTypes
/* loaded from: classes5.dex */
public final class a1 extends I0<UInt, UIntArray, Z0> {
    public static final a1 c;

    static {
        Intrinsics.checkNotNullParameter(UInt.INSTANCE, "<this>");
        c = new a1(b1.a);
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final int e(Object obj) {
        int[] collectionSize = ((UIntArray) obj).getStorage();
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return UIntArray.m1872getSizeimpl(collectionSize);
    }

    @Override // kotlinx.serialization.internal.AbstractC1168w, kotlinx.serialization.internal.AbstractC1125a
    public final void h(kotlinx.serialization.encoding.c decoder, int i, Object obj) {
        Z0 builder = (Z0) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        int m1811constructorimpl = UInt.m1811constructorimpl(decoder.decodeInlineElement(this.b, i).decodeInt());
        builder.getClass();
        builder.b(builder.d() + 1);
        int[] iArr = builder.a;
        int i2 = builder.b;
        builder.b = i2 + 1;
        UIntArray.m1876setVXSXFK8(iArr, i2, m1811constructorimpl);
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final Object i(Object obj) {
        int[] bufferWithData = ((UIntArray) obj).getStorage();
        Intrinsics.checkNotNullParameter(bufferWithData, "$this$toBuilder");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        Z0 z0 = new Z0();
        z0.a = bufferWithData;
        z0.b = UIntArray.m1872getSizeimpl(bufferWithData);
        z0.b(10);
        return z0;
    }

    @Override // kotlinx.serialization.internal.I0
    public final UIntArray l() {
        return UIntArray.m1864boximpl(UIntArray.m1865constructorimpl(0));
    }

    @Override // kotlinx.serialization.internal.I0
    public final void m(kotlinx.serialization.encoding.d encoder, UIntArray uIntArray, int i) {
        int[] content = uIntArray.getStorage();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.encodeInlineElement(this.b, i2).encodeInt(UIntArray.m1871getpVg5ArA(content, i2));
        }
    }
}
