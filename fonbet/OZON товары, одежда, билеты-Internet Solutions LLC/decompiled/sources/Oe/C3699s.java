package Oe;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Oe.s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3699s extends N {

    /* renamed from: l, reason: collision with root package name */
    private final boolean f20316l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3699s(@NotNull String name, @NotNull C3700t generatedSerializer) {
        super(name, generatedSerializer, 1);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(generatedSerializer, "generatedSerializer");
        this.f20316l = true;
    }

    @Override // Oe.N
    public final boolean equals(Object obj) {
        int i11;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3699s) {
            Me.f fVar = (Me.f) obj;
            if (Intrinsics.d(f(), fVar.f())) {
                C3699s c3699s = (C3699s) obj;
                if (c3699s.f20316l && Arrays.equals(k(), c3699s.k()) && d() == fVar.d()) {
                    int d11 = d();
                    for (0; i11 < d11; i11 + 1) {
                        i11 = (Intrinsics.d(c(i11).f(), fVar.c(i11).f()) && Intrinsics.d(c(i11).getKind(), fVar.c(i11).getKind())) ? i11 + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // Oe.N
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // Oe.N, Me.f
    public final boolean isInline() {
        return this.f20316l;
    }
}
