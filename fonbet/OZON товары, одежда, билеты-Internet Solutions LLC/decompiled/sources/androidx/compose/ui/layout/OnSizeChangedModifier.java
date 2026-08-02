package androidx.compose.ui.layout;

import D1.AbstractC2794c0;
import Z1.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/OnSizeChangedModifier;", "LD1/c0;", "Landroidx/compose/ui/layout/h;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class OnSizeChangedModifier extends AbstractC2794c0<h> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<q, Unit> f40483a;

    /* JADX WARN: Multi-variable type inference failed */
    public OnSizeChangedModifier(@NotNull Function1<? super q, Unit> function1) {
        this.f40483a = function1;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final h getF41119a() {
        return new h(this.f40483a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnSizeChangedModifier) {
            return this.f40483a == ((OnSizeChangedModifier) obj).f40483a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40483a.hashCode();
    }

    @Override // D1.AbstractC2794c0
    public final void update(h hVar) {
        hVar.I1(this.f40483a);
    }
}
