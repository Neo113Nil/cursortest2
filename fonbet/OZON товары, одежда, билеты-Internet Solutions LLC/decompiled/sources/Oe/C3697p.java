package Oe;

import kotlin.jvm.internal.C7730l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Oe.p, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3697p extends S<Float, float[], Object> {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final C3697p f20313c;

    static {
        Intrinsics.checkNotNullParameter(C7730l.f71813a, "<this>");
        f20313c = new C3697p(C3698q.f20314a);
    }

    @Override // Oe.AbstractC3682a
    public final int e(Object obj) {
        float[] fArr = (float[]) obj;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length;
    }

    @Override // Oe.S
    public final void f(Ne.b encoder, float[] fArr, int i11) {
        float[] content = fArr;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            encoder.n(b(), i12, content[i12]);
        }
    }
}
