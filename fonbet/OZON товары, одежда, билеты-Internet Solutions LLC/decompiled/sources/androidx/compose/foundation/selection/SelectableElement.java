package androidx.compose.foundation.selection;

import D1.AbstractC2794c0;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import n0.InterfaceC8369J;
import org.jetbrains.annotations.NotNull;
import t0.q;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/selection/SelectableElement;", "LD1/c0;", "Landroidx/compose/foundation/selection/d;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class SelectableElement extends AbstractC2794c0<d> {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f39749a;

    /* renamed from: b, reason: collision with root package name */
    private final q f39750b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC8369J f39751c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f39752d;

    /* renamed from: e, reason: collision with root package name */
    private final I1.i f39753e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f39754f;

    private SelectableElement() {
        throw null;
    }

    public SelectableElement(boolean z11, q qVar, InterfaceC8369J interfaceC8369J, boolean z12, I1.i iVar, Function0 function0) {
        this.f39749a = z11;
        this.f39750b = qVar;
        this.f39751c = interfaceC8369J;
        this.f39752d = z12;
        this.f39753e = iVar;
        this.f39754f = function0;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final d getF41119a() {
        return new d(this.f39749a, this.f39750b, this.f39751c, this.f39752d, this.f39753e, this.f39754f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectableElement.class != obj.getClass()) {
            return false;
        }
        SelectableElement selectableElement = (SelectableElement) obj;
        return this.f39749a == selectableElement.f39749a && Intrinsics.d(this.f39750b, selectableElement.f39750b) && Intrinsics.d(this.f39751c, selectableElement.f39751c) && this.f39752d == selectableElement.f39752d && Intrinsics.d(this.f39753e, selectableElement.f39753e) && this.f39754f == selectableElement.f39754f;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f39749a) * 31;
        q qVar = this.f39750b;
        int hashCode2 = (hashCode + (qVar != null ? qVar.hashCode() : 0)) * 31;
        InterfaceC8369J interfaceC8369J = this.f39751c;
        int a11 = C3532b.a((hashCode2 + (interfaceC8369J != null ? interfaceC8369J.hashCode() : 0)) * 31, 31, this.f39752d);
        I1.i iVar = this.f39753e;
        return this.f39754f.hashCode() + ((a11 + (iVar != null ? Integer.hashCode(iVar.b()) : 0)) * 31);
    }

    @Override // D1.AbstractC2794c0
    public final void update(d dVar) {
        dVar.c2(this.f39749a, this.f39750b, this.f39751c, this.f39752d, this.f39753e, this.f39754f);
    }
}
