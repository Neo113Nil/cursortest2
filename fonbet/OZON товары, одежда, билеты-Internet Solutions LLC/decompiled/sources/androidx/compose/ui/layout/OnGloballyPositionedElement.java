package androidx.compose.ui.layout;

import B1.B;
import D1.AbstractC2794c0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/OnGloballyPositionedElement;", "LD1/c0;", "Landroidx/compose/ui/layout/d;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class OnGloballyPositionedElement extends AbstractC2794c0<d> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<B, Unit> f40481a;

    /* JADX WARN: Multi-variable type inference failed */
    public OnGloballyPositionedElement(@NotNull Function1<? super B, Unit> function1) {
        this.f40481a = function1;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final d getF41119a() {
        return new d(this.f40481a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnGloballyPositionedElement) {
            return this.f40481a == ((OnGloballyPositionedElement) obj).f40481a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40481a.hashCode();
    }

    @Override // D1.AbstractC2794c0
    public final void update(d dVar) {
        dVar.I1(this.f40481a);
    }
}
