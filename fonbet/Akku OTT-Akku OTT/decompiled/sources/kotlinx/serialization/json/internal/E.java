package kotlinx.serialization.json.internal;

import java.util.Set;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.Y0;
import kotlinx.serialization.internal.b1;
import kotlinx.serialization.internal.e1;
import kotlinx.serialization.internal.h1;

/* loaded from: classes5.dex */
public final class E {
    public static final Set<kotlinx.serialization.descriptors.f> a;

    static {
        Intrinsics.checkNotNullParameter(UInt.INSTANCE, "<this>");
        Intrinsics.checkNotNullParameter(ULong.INSTANCE, "<this>");
        Intrinsics.checkNotNullParameter(UByte.INSTANCE, "<this>");
        Intrinsics.checkNotNullParameter(UShort.INSTANCE, "<this>");
        a = SetsKt.setOf((Object[]) new kotlinx.serialization.descriptors.f[]{b1.b, e1.b, Y0.b, h1.b});
    }

    public static final boolean a(kotlinx.serialization.descriptors.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return fVar.isInline() && a.contains(fVar);
    }
}
