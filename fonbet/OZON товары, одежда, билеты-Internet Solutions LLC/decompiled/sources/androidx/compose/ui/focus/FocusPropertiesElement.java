package androidx.compose.ui.focus;

import D1.AbstractC2794c0;
import j1.p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusPropertiesElement;", "LD1/c0;", "Landroidx/compose/ui/focus/h;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class FocusPropertiesElement extends AbstractC2794c0<h> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final p f40382a;

    public FocusPropertiesElement(@NotNull p pVar) {
        this.f40382a = pVar;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final h getF41119a() {
        return new h(this.f40382a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusPropertiesElement) && Intrinsics.d(this.f40382a, ((FocusPropertiesElement) obj).f40382a);
    }

    public final int hashCode() {
        return this.f40382a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "FocusPropertiesElement(scope=" + this.f40382a + ')';
    }

    @Override // D1.AbstractC2794c0
    public final void update(h hVar) {
        hVar.I1(this.f40382a);
    }
}
