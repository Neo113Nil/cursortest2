package androidx.compose.foundation.selection;

import D1.AbstractC2794c0;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t0.q;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/selection/TriStateToggleableElement;", "LD1/c0;", "Landroidx/compose/foundation/selection/i;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class TriStateToggleableElement extends AbstractC2794c0<i> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final J1.a f39760a;

    /* renamed from: b, reason: collision with root package name */
    private final q f39761b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f39762c;

    /* renamed from: d, reason: collision with root package name */
    private final I1.i f39763d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f39764e;

    private TriStateToggleableElement() {
        throw null;
    }

    public TriStateToggleableElement(J1.a aVar, q qVar, boolean z11, I1.i iVar, Function0 function0) {
        this.f39760a = aVar;
        this.f39761b = qVar;
        this.f39762c = z11;
        this.f39763d = iVar;
        this.f39764e = function0;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final i getF41119a() {
        return new i(this.f39760a, this.f39761b, this.f39762c, this.f39763d, this.f39764e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TriStateToggleableElement.class != obj.getClass()) {
            return false;
        }
        TriStateToggleableElement triStateToggleableElement = (TriStateToggleableElement) obj;
        return this.f39760a == triStateToggleableElement.f39760a && Intrinsics.d(this.f39761b, triStateToggleableElement.f39761b) && this.f39762c == triStateToggleableElement.f39762c && Intrinsics.d(this.f39763d, triStateToggleableElement.f39763d) && this.f39764e == triStateToggleableElement.f39764e;
    }

    public final int hashCode() {
        int hashCode = this.f39760a.hashCode() * 31;
        q qVar = this.f39761b;
        int a11 = C3532b.a((hashCode + (qVar != null ? qVar.hashCode() : 0)) * 961, 31, this.f39762c);
        I1.i iVar = this.f39763d;
        return this.f39764e.hashCode() + ((a11 + (iVar != null ? Integer.hashCode(iVar.b()) : 0)) * 31);
    }

    @Override // D1.AbstractC2794c0
    public final void update(i iVar) {
        iVar.c2(this.f39760a, this.f39761b, this.f39762c, this.f39763d, this.f39764e);
    }
}
