package B0;

import Bl0.C2656q;
import java.io.File;
import k1.C7459e;
import k1.C7460f;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class S1 {
    public static final long a(long j11, C7460f c7460f) {
        return P9.a.a(C7459e.g(j11) < c7460f.n() ? c7460f.n() : C7459e.g(j11) > c7460f.o() ? c7460f.o() : C7459e.g(j11), C7459e.h(j11) < c7460f.q() ? c7460f.q() : C7459e.h(j11) > c7460f.h() ? c7460f.h() : C7459e.h(j11));
    }

    public static final String b(File file, File file2, String str) {
        StringBuilder sb2 = new StringBuilder(file.toString());
        if (file2 != null) {
            sb2.append(" -> " + file2);
        }
        if (str != null) {
            sb2.append(": ".concat(str));
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public static final float c(float f7, float f11, float f12) {
        return C2656q.b(f7, f11, f12);
    }
}
