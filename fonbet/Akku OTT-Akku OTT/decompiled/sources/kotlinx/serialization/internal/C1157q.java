package kotlinx.serialization.internal;

import kotlin.PublishedApi;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.Intrinsics;

@PublishedApi
/* renamed from: kotlinx.serialization.internal.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1157q extends I0<Character, char[], C1155p> {
    public static final C1157q c;

    static {
        Intrinsics.checkNotNullParameter(CharCompanionObject.INSTANCE, "<this>");
        c = new C1157q(r.a);
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final int e(Object obj) {
        char[] cArr = (char[]) obj;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length;
    }

    @Override // kotlinx.serialization.internal.AbstractC1168w, kotlinx.serialization.internal.AbstractC1125a
    public final void h(kotlinx.serialization.encoding.c decoder, int i, Object obj) {
        C1155p builder = (C1155p) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        char decodeCharElement = decoder.decodeCharElement(this.b, i);
        builder.getClass();
        builder.b(builder.d() + 1);
        char[] cArr = builder.a;
        int i2 = builder.b;
        builder.b = i2 + 1;
        cArr[i2] = decodeCharElement;
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final Object i(Object obj) {
        char[] bufferWithData = (char[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        C1155p c1155p = new C1155p();
        c1155p.a = bufferWithData;
        c1155p.b = bufferWithData.length;
        c1155p.b(10);
        return c1155p;
    }

    @Override // kotlinx.serialization.internal.I0
    public final char[] l() {
        return new char[0];
    }

    @Override // kotlinx.serialization.internal.I0
    public final void m(kotlinx.serialization.encoding.d encoder, char[] cArr, int i) {
        char[] content = cArr;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.encodeCharElement(this.b, i2, content[i2]);
        }
    }
}
