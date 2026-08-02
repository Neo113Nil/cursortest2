package Oe;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Oe.v, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3702v extends S<Integer, int[], Object> {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final C3702v f20318c;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.r.f71817a, "<this>");
        f20318c = new C3702v(C3703w.f20319a);
    }

    @Override // Oe.AbstractC3682a
    public final int e(Object obj) {
        int[] iArr = (int[]) obj;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length;
    }

    @Override // Oe.S
    public final void f(Ne.b encoder, int[] iArr, int i11) {
        int[] content = iArr;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            encoder.o(i12, content[i12], b());
        }
    }
}
