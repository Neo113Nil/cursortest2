package Wd;

import je.B0;
import je.L0;
import je.N;
import je.y0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9842h;
import td.i0;
import ud.InterfaceC10030h;

/* loaded from: classes10.dex */
public final class e extends B0 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final B0 f33513b;

    e(B0 substitution) {
        Intrinsics.checkNotNullParameter(substitution, "substitution");
        this.f33513b = substitution;
    }

    @Override // je.B0
    public final boolean a() {
        return this.f33513b.a();
    }

    @Override // je.B0
    public final boolean b() {
        return true;
    }

    @Override // je.B0
    @NotNull
    public final InterfaceC10030h d(@NotNull InterfaceC10030h annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        return this.f33513b.d(annotations);
    }

    @Override // je.B0
    public final y0 e(N key) {
        y0 b11;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(key, "key");
        y0 e11 = this.f33513b.e(key);
        if (e11 == null) {
            return null;
        }
        InterfaceC9842h p11 = key.H0().p();
        b11 = f.b(e11, p11 instanceof i0 ? (i0) p11 : null);
        return b11;
    }

    @Override // je.B0
    public final boolean f() {
        return this.f33513b.f();
    }

    @Override // je.B0
    @NotNull
    public final N g(@NotNull N topLevelType, @NotNull L0 position) {
        Intrinsics.checkNotNullParameter(topLevelType, "topLevelType");
        Intrinsics.checkNotNullParameter(position, "position");
        return this.f33513b.g(topLevelType, position);
    }
}
