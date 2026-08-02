package kotlinx.serialization.json;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes5.dex */
public final class p {
    public static final void a(kotlinx.serialization.encoding.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if ((fVar instanceof q ? (q) fVar : null) != null) {
            return;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + Reflection.getOrCreateKotlinClass(fVar.getClass()));
    }

    public static final g b(kotlinx.serialization.encoding.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        g gVar = eVar instanceof g ? (g) eVar : null;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + Reflection.getOrCreateKotlinClass(eVar.getClass()));
    }
}
