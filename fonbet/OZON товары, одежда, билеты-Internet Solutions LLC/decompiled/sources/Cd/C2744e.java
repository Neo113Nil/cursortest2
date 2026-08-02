package Cd;

import Cd.Q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.c0;

/* renamed from: Cd.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C2744e extends Q {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f4754m = 0;

    public static boolean i(@NotNull c0 c0Var) {
        Q.a.C0116a c0116a;
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        if (!Intrinsics.d(c0Var.getName().b(), "removeAt")) {
            return false;
        }
        String b11 = Ld.D.b(c0Var);
        c0116a = Q.f4739g;
        return Intrinsics.d(b11, c0116a.c());
    }
}
