package Oe;

import kotlin.jvm.internal.C7729k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Oe.m, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3694m extends S<Double, double[], Object> {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final C3694m f20308c;

    static {
        Intrinsics.checkNotNullParameter(C7729k.f71812a, "<this>");
        f20308c = new C3694m(C3695n.f20309a);
    }

    @Override // Oe.AbstractC3682a
    public final int e(Object obj) {
        double[] dArr = (double[]) obj;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length;
    }

    @Override // Oe.S
    public final void f(Ne.b encoder, double[] dArr, int i11) {
        double[] content = dArr;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            encoder.b(b(), i12, content[i12]);
        }
    }
}
