package B1;

import D1.C2792b0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d0 implements V {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c0 f2106a;

    public d0(@NotNull c0 c0Var) {
        this.f2106a = c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && Intrinsics.d(this.f2106a, ((d0) obj).f2106a);
    }

    public final int hashCode() {
        return this.f2106a.hashCode();
    }

    @Override // B1.V
    public final int maxIntrinsicHeight(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
        return this.f2106a.maxIntrinsicHeight(interfaceC2553w, C2792b0.a((Y) interfaceC2553w), i11);
    }

    @Override // B1.V
    public final int maxIntrinsicWidth(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
        return this.f2106a.maxIntrinsicWidth(interfaceC2553w, C2792b0.a((Y) interfaceC2553w), i11);
    }

    @Override // B1.V
    @NotNull
    /* renamed from: measure-3p2s80s */
    public final W mo2measure3p2s80s(@NotNull Y y11, @NotNull List<? extends U> list, long j11) {
        return this.f2106a.mo3measure3p2s80s(y11, C2792b0.a(y11), j11);
    }

    @Override // B1.V
    public final int minIntrinsicHeight(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
        return this.f2106a.minIntrinsicHeight(interfaceC2553w, C2792b0.a((Y) interfaceC2553w), i11);
    }

    @Override // B1.V
    public final int minIntrinsicWidth(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
        return this.f2106a.minIntrinsicWidth(interfaceC2553w, C2792b0.a((Y) interfaceC2553w), i11);
    }

    @NotNull
    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.f2106a + ')';
    }
}
