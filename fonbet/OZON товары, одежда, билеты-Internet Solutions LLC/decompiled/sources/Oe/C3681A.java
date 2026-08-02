package Oe;

import kotlin.jvm.internal.C7738u;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Oe.A, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3681A extends S<Long, long[], Object> {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final C3681A f20235c;

    static {
        Intrinsics.checkNotNullParameter(C7738u.f71818a, "<this>");
        f20235c = new C3681A(B.f20236a);
    }

    @Override // Oe.AbstractC3682a
    public final int e(Object obj) {
        long[] jArr = (long[]) obj;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length;
    }

    @Override // Oe.S
    public final void f(Ne.b encoder, long[] jArr, int i11) {
        long[] content = jArr;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            encoder.d(b(), i12, content[i12]);
        }
    }
}
