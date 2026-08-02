package Ld;

import Qd.C3856a;
import fe.InterfaceC6544x;
import je.N;
import je.Q;
import je.Y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class s implements InterfaceC6544x {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final s f16809a = new s();

    @Override // fe.InterfaceC6544x
    @NotNull
    public final N a(@NotNull Nd.p proto, @NotNull String flexibleId, @NotNull Y lowerBound, @NotNull Y upperBound) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(flexibleId, "flexibleId");
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        return !Intrinsics.d(flexibleId, "kotlin.jvm.PlatformType") ? le.l.c(le.k.ERROR_FLEXIBLE_TYPE, flexibleId, lowerBound.toString(), upperBound.toString()) : proto.l(C3856a.f23238g) ? new Hd.k(lowerBound, upperBound) : Q.c(lowerBound, upperBound);
    }
}
