package kotlinx.serialization.internal;

import kotlin.PublishedApi;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.Intrinsics;

@PublishedApi
/* renamed from: kotlinx.serialization.internal.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1139h extends I0<Boolean, boolean[], C1137g> {
    public static final C1139h c;

    static {
        Intrinsics.checkNotNullParameter(BooleanCompanionObject.INSTANCE, "<this>");
        c = new C1139h(C1141i.a);
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final int e(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length;
    }

    @Override // kotlinx.serialization.internal.AbstractC1168w, kotlinx.serialization.internal.AbstractC1125a
    public final void h(kotlinx.serialization.encoding.c decoder, int i, Object obj) {
        C1137g builder = (C1137g) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        boolean decodeBooleanElement = decoder.decodeBooleanElement(this.b, i);
        builder.getClass();
        builder.b(builder.d() + 1);
        boolean[] zArr = builder.a;
        int i2 = builder.b;
        builder.b = i2 + 1;
        zArr[i2] = decodeBooleanElement;
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final Object i(Object obj) {
        boolean[] bufferWithData = (boolean[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        C1137g c1137g = new C1137g();
        c1137g.a = bufferWithData;
        c1137g.b = bufferWithData.length;
        c1137g.b(10);
        return c1137g;
    }

    @Override // kotlinx.serialization.internal.I0
    public final boolean[] l() {
        return new boolean[0];
    }

    @Override // kotlinx.serialization.internal.I0
    public final void m(kotlinx.serialization.encoding.d encoder, boolean[] zArr, int i) {
        boolean[] content = zArr;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.encodeBooleanElement(this.b, i2, content[i2]);
        }
    }
}
