package kotlinx.serialization.internal;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.PublishedApi;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.jvm.internal.Intrinsics;

@PublishedApi
@ExperimentalUnsignedTypes
/* loaded from: classes5.dex */
public final class d1 extends I0<ULong, ULongArray, c1> {
    public static final d1 c;

    static {
        Intrinsics.checkNotNullParameter(ULong.INSTANCE, "<this>");
        c = new d1(e1.a);
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final int e(Object obj) {
        long[] collectionSize = ((ULongArray) obj).getStorage();
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return ULongArray.m1951getSizeimpl(collectionSize);
    }

    @Override // kotlinx.serialization.internal.AbstractC1168w, kotlinx.serialization.internal.AbstractC1125a
    public final void h(kotlinx.serialization.encoding.c decoder, int i, Object obj) {
        c1 builder = (c1) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        long m1890constructorimpl = ULong.m1890constructorimpl(decoder.decodeInlineElement(this.b, i).decodeLong());
        builder.getClass();
        builder.b(builder.d() + 1);
        long[] jArr = builder.a;
        int i2 = builder.b;
        builder.b = i2 + 1;
        ULongArray.m1955setk8EXiF4(jArr, i2, m1890constructorimpl);
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final Object i(Object obj) {
        long[] bufferWithData = ((ULongArray) obj).getStorage();
        Intrinsics.checkNotNullParameter(bufferWithData, "$this$toBuilder");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        c1 c1Var = new c1();
        c1Var.a = bufferWithData;
        c1Var.b = ULongArray.m1951getSizeimpl(bufferWithData);
        c1Var.b(10);
        return c1Var;
    }

    @Override // kotlinx.serialization.internal.I0
    public final ULongArray l() {
        return ULongArray.m1943boximpl(ULongArray.m1944constructorimpl(0));
    }

    @Override // kotlinx.serialization.internal.I0
    public final void m(kotlinx.serialization.encoding.d encoder, ULongArray uLongArray, int i) {
        long[] content = uLongArray.getStorage();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.encodeInlineElement(this.b, i2).encodeLong(ULongArray.m1950getsVKNKU(content, i2));
        }
    }
}
