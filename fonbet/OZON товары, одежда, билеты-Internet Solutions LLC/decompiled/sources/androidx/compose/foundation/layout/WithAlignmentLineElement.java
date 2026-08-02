package androidx.compose.foundation.layout;

import B1.C2551u;
import D1.AbstractC2794c0;
import androidx.compose.foundation.layout.Z;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/WithAlignmentLineElement;", "LD1/c0;", "Landroidx/compose/foundation/layout/Z$a;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WithAlignmentLineElement extends AbstractC2794c0<Z.a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2551u f39421a;

    public WithAlignmentLineElement(@NotNull C2551u c2551u) {
        this.f39421a = c2551u;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final Z.a getF41119a() {
        return new Z.a(this.f39421a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        WithAlignmentLineElement withAlignmentLineElement = obj instanceof WithAlignmentLineElement ? (WithAlignmentLineElement) obj : null;
        if (withAlignmentLineElement == null) {
            return false;
        }
        return Intrinsics.d(this.f39421a, withAlignmentLineElement.f39421a);
    }

    public final int hashCode() {
        return this.f39421a.hashCode();
    }

    @Override // D1.AbstractC2794c0
    public final void update(Z.a aVar) {
        aVar.I1(this.f39421a);
    }
}
