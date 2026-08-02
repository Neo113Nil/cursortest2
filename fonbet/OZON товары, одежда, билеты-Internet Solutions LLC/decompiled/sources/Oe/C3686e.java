package Oe;

import kotlin.jvm.internal.C7722d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Oe.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3686e extends S<Boolean, boolean[], Object> {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final C3686e f20288c;

    static {
        Intrinsics.checkNotNullParameter(C7722d.f71802a, "<this>");
        f20288c = new C3686e(C3687f.f20290a);
    }

    @Override // Oe.AbstractC3682a
    public final int e(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length;
    }

    @Override // Oe.S
    public final void f(Ne.b encoder, boolean[] zArr, int i11) {
        boolean[] content = zArr;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            encoder.l(b(), i12, content[i12]);
        }
    }
}
