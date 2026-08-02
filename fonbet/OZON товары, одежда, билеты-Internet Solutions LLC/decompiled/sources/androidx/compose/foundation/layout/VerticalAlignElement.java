package androidx.compose.foundation.layout;

import D1.AbstractC2794c0;
import e1.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/VerticalAlignElement;", "LD1/c0;", "Landroidx/compose/foundation/layout/d0;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VerticalAlignElement extends AbstractC2794c0<d0> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d.b f39420a;

    public VerticalAlignElement(@NotNull d.b bVar) {
        this.f39420a = bVar;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final d0 getF41119a() {
        return new d0(this.f39420a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        VerticalAlignElement verticalAlignElement = obj instanceof VerticalAlignElement ? (VerticalAlignElement) obj : null;
        if (verticalAlignElement == null) {
            return false;
        }
        return Intrinsics.d(this.f39420a, verticalAlignElement.f39420a);
    }

    public final int hashCode() {
        return this.f39420a.hashCode();
    }

    @Override // D1.AbstractC2794c0
    public final void update(d0 d0Var) {
        d0Var.I1(this.f39420a);
    }
}
