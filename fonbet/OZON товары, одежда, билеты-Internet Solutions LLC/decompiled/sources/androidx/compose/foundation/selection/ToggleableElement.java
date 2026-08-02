package androidx.compose.foundation.selection;

import D1.AbstractC2794c0;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t0.q;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/selection/ToggleableElement;", "LD1/c0;", "Landroidx/compose/foundation/selection/h;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class ToggleableElement extends AbstractC2794c0<h> {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f39755a;

    /* renamed from: b, reason: collision with root package name */
    private final q f39756b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f39757c;

    /* renamed from: d, reason: collision with root package name */
    private final I1.i f39758d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function1<Boolean, Unit> f39759e;

    private ToggleableElement() {
        throw null;
    }

    public ToggleableElement(boolean z11, q qVar, boolean z12, I1.i iVar, Function1 function1) {
        this.f39755a = z11;
        this.f39756b = qVar;
        this.f39757c = z12;
        this.f39758d = iVar;
        this.f39759e = function1;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final h getF41119a() {
        return new h(this.f39755a, this.f39756b, this.f39757c, this.f39758d, this.f39759e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ToggleableElement.class != obj.getClass()) {
            return false;
        }
        ToggleableElement toggleableElement = (ToggleableElement) obj;
        return this.f39755a == toggleableElement.f39755a && Intrinsics.d(this.f39756b, toggleableElement.f39756b) && this.f39757c == toggleableElement.f39757c && Intrinsics.d(this.f39758d, toggleableElement.f39758d) && this.f39759e == toggleableElement.f39759e;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f39755a) * 31;
        q qVar = this.f39756b;
        int a11 = C3532b.a((hashCode + (qVar != null ? qVar.hashCode() : 0)) * 961, 31, this.f39757c);
        I1.i iVar = this.f39758d;
        return this.f39759e.hashCode() + ((a11 + (iVar != null ? Integer.hashCode(iVar.b()) : 0)) * 31);
    }

    @Override // D1.AbstractC2794c0
    public final void update(h hVar) {
        hVar.e2(this.f39755a, this.f39756b, this.f39757c, this.f39758d, this.f39759e);
    }
}
