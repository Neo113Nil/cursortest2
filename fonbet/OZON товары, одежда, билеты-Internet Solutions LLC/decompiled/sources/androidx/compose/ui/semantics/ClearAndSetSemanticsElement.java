package androidx.compose.ui.semantics;

import D1.AbstractC2794c0;
import I1.C3225d;
import I1.D;
import I1.l;
import I1.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;", "LD1/c0;", "LI1/d;", "LI1/n;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ClearAndSetSemanticsElement extends AbstractC2794c0<C3225d> implements n {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<D, Unit> f41118a;

    /* JADX WARN: Multi-variable type inference failed */
    public ClearAndSetSemanticsElement(@NotNull Function1<? super D, Unit> function1) {
        this.f41118a = function1;
    }

    @Override // I1.n
    @NotNull
    public final l F1() {
        l lVar = new l();
        lVar.s(false);
        lVar.r(true);
        this.f41118a.invoke(lVar);
        return lVar;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final C3225d getF41119a() {
        return new C3225d(false, true, this.f41118a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClearAndSetSemanticsElement) && Intrinsics.d(this.f41118a, ((ClearAndSetSemanticsElement) obj).f41118a);
    }

    public final int hashCode() {
        return this.f41118a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "ClearAndSetSemanticsElement(properties=" + this.f41118a + ')';
    }

    @Override // D1.AbstractC2794c0
    public final void update(C3225d c3225d) {
        c3225d.J1(this.f41118a);
    }
}
