package androidx.compose.ui.layout;

import B1.B;
import D1.AbstractC2794c0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/OnPlacedElement;", "LD1/c0;", "Landroidx/compose/ui/layout/f;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* data */ class OnPlacedElement extends AbstractC2794c0<f> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<B, Unit> f40482a;

    /* JADX WARN: Multi-variable type inference failed */
    public OnPlacedElement(@NotNull Function1<? super B, Unit> function1) {
        this.f40482a = function1;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final f getF41119a() {
        return new f(this.f40482a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnPlacedElement) && Intrinsics.d(this.f40482a, ((OnPlacedElement) obj).f40482a);
    }

    public final int hashCode() {
        return this.f40482a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "OnPlacedElement(onPlaced=" + this.f40482a + ')';
    }

    @Override // D1.AbstractC2794c0
    public final void update(f fVar) {
        fVar.I1(this.f40482a);
    }
}
