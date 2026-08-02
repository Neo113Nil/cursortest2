package androidx.compose.foundation.relocation;

import D1.AbstractC2794c0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z0.InterfaceC10969b;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;", "LD1/c0;", "Landroidx/compose/foundation/relocation/d;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BringIntoViewRequesterElement extends AbstractC2794c0<d> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC10969b f39733a;

    public BringIntoViewRequesterElement(@NotNull InterfaceC10969b interfaceC10969b) {
        this.f39733a = interfaceC10969b;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final d getF41119a() {
        return new d(this.f39733a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BringIntoViewRequesterElement) {
            return Intrinsics.d(this.f39733a, ((BringIntoViewRequesterElement) obj).f39733a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39733a.hashCode();
    }

    @Override // D1.AbstractC2794c0
    public final void update(d dVar) {
        dVar.I1(this.f39733a);
    }
}
