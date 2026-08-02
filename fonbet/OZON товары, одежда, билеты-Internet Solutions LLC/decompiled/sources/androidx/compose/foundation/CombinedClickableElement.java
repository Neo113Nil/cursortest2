package androidx.compose.foundation;

import D1.AbstractC2794c0;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/CombinedClickableElement;", "LD1/c0;", "Landroidx/compose/foundation/n;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class CombinedClickableElement extends AbstractC2794c0<n> {

    /* renamed from: a, reason: collision with root package name */
    private final t0.q f38856a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f38857b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f38858c;

    /* renamed from: d, reason: collision with root package name */
    private final Function0<Unit> f38859d;

    private CombinedClickableElement() {
        throw null;
    }

    public CombinedClickableElement(Function0 function0, Function0 function02, t0.q qVar, boolean z11) {
        this.f38856a = qVar;
        this.f38857b = z11;
        this.f38858c = function0;
        this.f38859d = function02;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final n getF41119a() {
        return new n(this.f38858c, this.f38859d, this.f38856a, this.f38857b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedClickableElement.class != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return Intrinsics.d(this.f38856a, combinedClickableElement.f38856a) && this.f38857b == combinedClickableElement.f38857b && this.f38858c == combinedClickableElement.f38858c && this.f38859d == combinedClickableElement.f38859d;
    }

    public final int hashCode() {
        t0.q qVar = this.f38856a;
        int hashCode = (this.f38858c.hashCode() + C3532b.a((qVar != null ? qVar.hashCode() : 0) * 961, 29791, this.f38857b)) * 961;
        Function0<Unit> function0 = this.f38859d;
        return (hashCode + (function0 != null ? function0.hashCode() : 0)) * 31;
    }

    @Override // D1.AbstractC2794c0
    public final void update(n nVar) {
        nVar.c2(this.f38858c, this.f38859d, this.f38856a, this.f38857b);
    }
}
