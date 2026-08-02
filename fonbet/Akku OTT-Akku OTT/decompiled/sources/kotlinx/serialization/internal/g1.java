package kotlinx.serialization.internal;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.PublishedApi;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;

@PublishedApi
@ExperimentalUnsignedTypes
/* loaded from: classes5.dex */
public final class g1 extends I0<UShort, UShortArray, f1> {
    public static final g1 c;

    static {
        Intrinsics.checkNotNullParameter(UShort.INSTANCE, "<this>");
        c = new g1(h1.a);
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final int e(Object obj) {
        short[] collectionSize = ((UShortArray) obj).getStorage();
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return UShortArray.m2056getSizeimpl(collectionSize);
    }

    @Override // kotlinx.serialization.internal.AbstractC1168w, kotlinx.serialization.internal.AbstractC1125a
    public final void h(kotlinx.serialization.encoding.c decoder, int i, Object obj) {
        f1 builder = (f1) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        short m1997constructorimpl = UShort.m1997constructorimpl(decoder.decodeInlineElement(this.b, i).decodeShort());
        builder.getClass();
        builder.b(builder.d() + 1);
        short[] sArr = builder.a;
        int i2 = builder.b;
        builder.b = i2 + 1;
        UShortArray.m2060set01HTLdE(sArr, i2, m1997constructorimpl);
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final Object i(Object obj) {
        short[] bufferWithData = ((UShortArray) obj).getStorage();
        Intrinsics.checkNotNullParameter(bufferWithData, "$this$toBuilder");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        f1 f1Var = new f1();
        f1Var.a = bufferWithData;
        f1Var.b = UShortArray.m2056getSizeimpl(bufferWithData);
        f1Var.b(10);
        return f1Var;
    }

    @Override // kotlinx.serialization.internal.I0
    public final UShortArray l() {
        return UShortArray.m2048boximpl(UShortArray.m2049constructorimpl(0));
    }

    @Override // kotlinx.serialization.internal.I0
    public final void m(kotlinx.serialization.encoding.d encoder, UShortArray uShortArray, int i) {
        short[] content = uShortArray.getStorage();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.encodeInlineElement(this.b, i2).encodeShort(UShortArray.m2055getMh2AYeg(content, i2));
        }
    }
}
