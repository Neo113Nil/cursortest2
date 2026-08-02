package Lb;

import Pb.C3820a;
import Sc.A;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Lb.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C3573a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3820a[] f16672a;

    public C3573a() {
        C3820a[] points = new C3820a[64];
        for (int i11 = 0; i11 < 64; i11++) {
            points[i11] = new C3820a();
        }
        Intrinsics.checkNotNullParameter(points, "points");
        this.f16672a = points;
    }

    public static C3820a b(C3573a c3573a, byte b11) {
        C3820a out = new C3820a();
        c3573a.getClass();
        Intrinsics.checkNotNullParameter(out, "output");
        int i11 = b11 >>> 7;
        byte b12 = (byte) ((b11 + i11) ^ i11);
        Intrinsics.checkNotNullParameter(out, "out");
        out.f();
        for (int i12 = 1; i12 < 9; i12++) {
            A.Companion companion = A.INSTANCE;
            out.a(c3573a.f16672a[i12 - 1], ((((byte) i12) ^ b12) - 1) >>> 31);
        }
        out.b((byte) (i11 & 1));
        return out;
    }

    @NotNull
    public final C3820a a(int i11) {
        return this.f16672a[i11];
    }
}
