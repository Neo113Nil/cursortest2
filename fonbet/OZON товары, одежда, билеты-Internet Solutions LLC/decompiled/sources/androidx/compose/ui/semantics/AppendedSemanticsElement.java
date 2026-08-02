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

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/semantics/AppendedSemanticsElement;", "LD1/c0;", "LI1/d;", "LI1/n;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AppendedSemanticsElement extends AbstractC2794c0<C3225d> implements n {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f41116a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<D, Unit> f41117b;

    /* JADX WARN: Multi-variable type inference failed */
    public AppendedSemanticsElement(boolean z11, @NotNull Function1<? super D, Unit> function1) {
        this.f41116a = z11;
        this.f41117b = function1;
    }

    @Override // I1.n
    @NotNull
    public final l F1() {
        l lVar = new l();
        lVar.s(this.f41116a);
        this.f41117b.invoke(lVar);
        return lVar;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final C3225d getF41119a() {
        return new C3225d(this.f41116a, false, this.f41117b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.f41116a == appendedSemanticsElement.f41116a && Intrinsics.d(this.f41117b, appendedSemanticsElement.f41117b);
    }

    public final int hashCode() {
        return this.f41117b.hashCode() + (Boolean.hashCode(this.f41116a) * 31);
    }

    @NotNull
    public final String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.f41116a + ", properties=" + this.f41117b + ')';
    }

    @Override // D1.AbstractC2794c0
    public final void update(C3225d c3225d) {
        C3225d c3225d2 = c3225d;
        c3225d2.I1(this.f41116a);
        c3225d2.J1(this.f41117b);
    }
}
