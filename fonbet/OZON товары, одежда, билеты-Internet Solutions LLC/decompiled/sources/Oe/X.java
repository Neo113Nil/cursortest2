package Oe;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class X extends S<Short, short[], Object> {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final X f20276c;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.Q.f71790a, "<this>");
        f20276c = new X(Y.f20277a);
    }

    @Override // Oe.AbstractC3682a
    public final int e(Object obj) {
        short[] sArr = (short[]) obj;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length;
    }

    @Override // Oe.S
    public final void f(Ne.b encoder, short[] sArr, int i11) {
        short[] content = sArr;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            encoder.f(b(), i12, content[i12]);
        }
    }
}
