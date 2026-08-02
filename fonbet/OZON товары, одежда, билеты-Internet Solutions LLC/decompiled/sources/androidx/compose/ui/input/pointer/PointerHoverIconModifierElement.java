package androidx.compose.ui.input.pointer;

import D1.AbstractC2794c0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x1.C10627b;
import x1.r;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerHoverIconModifierElement;", "LD1/c0;", "Lx1/r;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PointerHoverIconModifierElement extends AbstractC2794c0<r> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C10627b f40472a;

    public PointerHoverIconModifierElement(@NotNull C10627b c10627b) {
        this.f40472a = c10627b;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final r getF41119a() {
        return new r(this.f40472a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PointerHoverIconModifierElement) {
            return Intrinsics.d(this.f40472a, ((PointerHoverIconModifierElement) obj).f40472a);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f40472a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.f40472a + ", overrideDescendants=false)";
    }

    @Override // D1.AbstractC2794c0
    public final void update(r rVar) {
        rVar.M1(this.f40472a);
    }
}
