package kotlinx.serialization.internal;

import kotlin.PublishedApi;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;

@PublishedApi
/* loaded from: classes5.dex */
public final class K extends I0<Float, float[], J> {
    public static final K c;

    static {
        Intrinsics.checkNotNullParameter(FloatCompanionObject.INSTANCE, "<this>");
        c = new K(L.a);
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final int e(Object obj) {
        float[] fArr = (float[]) obj;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length;
    }

    @Override // kotlinx.serialization.internal.AbstractC1168w, kotlinx.serialization.internal.AbstractC1125a
    public final void h(kotlinx.serialization.encoding.c decoder, int i, Object obj) {
        J builder = (J) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        float decodeFloatElement = decoder.decodeFloatElement(this.b, i);
        builder.getClass();
        builder.b(builder.d() + 1);
        float[] fArr = builder.a;
        int i2 = builder.b;
        builder.b = i2 + 1;
        fArr[i2] = decodeFloatElement;
    }

    @Override // kotlinx.serialization.internal.AbstractC1125a
    public final Object i(Object obj) {
        float[] bufferWithData = (float[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        J j = new J();
        j.a = bufferWithData;
        j.b = bufferWithData.length;
        j.b(10);
        return j;
    }

    @Override // kotlinx.serialization.internal.I0
    public final float[] l() {
        return new float[0];
    }

    @Override // kotlinx.serialization.internal.I0
    public final void m(kotlinx.serialization.encoding.d encoder, float[] fArr, int i) {
        float[] content = fArr;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.encodeFloatElement(this.b, i2, content[i2]);
        }
    }
}
