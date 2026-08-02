package androidx.compose.foundation.layout;

import B1.z0;
import androidx.compose.ui.platform.C5236c1;
import e1.InterfaceC6250b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u0.InterfaceC9893b;
import u0.InterfaceC9894c;

/* renamed from: androidx.compose.foundation.layout.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5192o implements InterfaceC9894c, InterfaceC9893b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final z0 f39525a;

    /* renamed from: b, reason: collision with root package name */
    private final long f39526b;

    public C5192o(z0 z0Var, long j11) {
        this.f39525a = z0Var;
        this.f39526b = j11;
    }

    @Override // u0.InterfaceC9893b
    @NotNull
    public final androidx.compose.ui.e a(@NotNull androidx.compose.ui.e eVar, @NotNull InterfaceC6250b interfaceC6250b) {
        return eVar.l0(new BoxChildDataElement(interfaceC6250b, false, C5236c1.a()));
    }

    @Override // u0.InterfaceC9893b
    @NotNull
    public final androidx.compose.ui.e b(@NotNull androidx.compose.ui.e eVar) {
        return eVar.l0(new BoxChildDataElement(InterfaceC6250b.a.e(), true, C5236c1.a()));
    }

    @Override // u0.InterfaceC9894c
    public final long c() {
        return this.f39526b;
    }

    @Override // u0.InterfaceC9894c
    public final float d() {
        long j11 = this.f39526b;
        if (!Z1.b.g(j11)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.f39525a.B(Z1.b.k(j11));
    }

    @Override // u0.InterfaceC9894c
    public final float e() {
        long j11 = this.f39526b;
        if (!Z1.b.f(j11)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.f39525a.B(Z1.b.j(j11));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5192o)) {
            return false;
        }
        C5192o c5192o = (C5192o) obj;
        return Intrinsics.d(this.f39525a, c5192o.f39525a) && Z1.b.e(this.f39526b, c5192o.f39526b);
    }

    public final int hashCode() {
        return Long.hashCode(this.f39526b) + (this.f39525a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f39525a + ", constraints=" + ((Object) Z1.b.o(this.f39526b)) + ')';
    }
}
