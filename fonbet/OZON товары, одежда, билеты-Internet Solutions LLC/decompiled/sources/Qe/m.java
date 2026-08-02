package Qe;

import Oe.b0;
import Oe.d0;
import Oe.f0;
import Oe.h0;
import Sc.A;
import Sc.C;
import Sc.F;
import Sc.y;
import java.util.Set;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Set<Me.f> f23352a;

    static {
        Intrinsics.checkNotNullParameter(A.INSTANCE, "<this>");
        Me.f b11 = d0.f20286a.b();
        Intrinsics.checkNotNullParameter(C.INSTANCE, "<this>");
        Me.f b12 = f0.f20292a.b();
        Intrinsics.checkNotNullParameter(y.INSTANCE, "<this>");
        Me.f b13 = b0.f20282a.b();
        Intrinsics.checkNotNullParameter(F.INSTANCE, "<this>");
        Me.f[] elements = {b11, b12, b13, h0.f20298a.b()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f23352a = C7705l.j0(elements);
    }

    public static final boolean a(@NotNull Me.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return fVar.isInline() && f23352a.contains(fVar);
    }
}
