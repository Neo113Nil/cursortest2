package androidx.compose.ui.draw;

import D1.AbstractC2794c0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n1.InterfaceC8410c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawWithContentElement;", "LD1/c0;", "Landroidx/compose/ui/draw/d;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class DrawWithContentElement extends AbstractC2794c0<d> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<InterfaceC8410c, Unit> f40330a;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawWithContentElement(@NotNull Function1<? super InterfaceC8410c, Unit> function1) {
        this.f40330a = function1;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final d getF41119a() {
        return new d(this.f40330a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithContentElement) && Intrinsics.d(this.f40330a, ((DrawWithContentElement) obj).f40330a);
    }

    public final int hashCode() {
        return this.f40330a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "DrawWithContentElement(onDraw=" + this.f40330a + ')';
    }

    @Override // D1.AbstractC2794c0
    public final void update(d dVar) {
        dVar.I1(this.f40330a);
    }
}
