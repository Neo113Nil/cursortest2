package androidx.compose.foundation;

import B4.V;
import D1.AbstractC2794c0;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n0.d0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ScrollSemanticsElement;", "LD1/c0;", "Landroidx/compose/foundation/A;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* data */ class ScrollSemanticsElement extends AbstractC2794c0<A> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d0 f38873a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f38874b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f38875c = true;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f38876d;

    public ScrollSemanticsElement(@NotNull d0 d0Var, boolean z11, boolean z12) {
        this.f38873a = d0Var;
        this.f38874b = z11;
        this.f38876d = z12;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final A getF41119a() {
        return new A(this.f38873a, this.f38874b, this.f38876d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollSemanticsElement)) {
            return false;
        }
        ScrollSemanticsElement scrollSemanticsElement = (ScrollSemanticsElement) obj;
        return Intrinsics.d(this.f38873a, scrollSemanticsElement.f38873a) && this.f38874b == scrollSemanticsElement.f38874b && this.f38875c == scrollSemanticsElement.f38875c && this.f38876d == scrollSemanticsElement.f38876d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f38876d) + C3532b.a(C3532b.a(this.f38873a.hashCode() * 31, 961, this.f38874b), 31, this.f38875c);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScrollSemanticsElement(state=");
        sb2.append(this.f38873a);
        sb2.append(", reverseScrolling=");
        sb2.append(this.f38874b);
        sb2.append(", flingBehavior=null, isScrollable=");
        sb2.append(this.f38875c);
        sb2.append(", isVertical=");
        return V.d(sb2, this.f38876d, ')');
    }

    @Override // D1.AbstractC2794c0
    public final void update(A a11) {
        A a12 = a11;
        a12.K1(this.f38873a);
        a12.J1(this.f38874b);
        a12.L1(this.f38876d);
    }
}
