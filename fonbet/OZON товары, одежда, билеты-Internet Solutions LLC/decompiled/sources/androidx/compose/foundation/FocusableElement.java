package androidx.compose.foundation;

import D1.AbstractC2794c0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n0.C8402w;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/FocusableElement;", "LD1/c0;", "Ln0/w;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class FocusableElement extends AbstractC2794c0<C8402w> {

    /* renamed from: a, reason: collision with root package name */
    private final t0.q f38860a;

    public FocusableElement(t0.q qVar) {
        this.f38860a = qVar;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final C8402w getF41119a() {
        return new C8402w(this.f38860a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusableElement) {
            return Intrinsics.d(this.f38860a, ((FocusableElement) obj).f38860a);
        }
        return false;
    }

    public final int hashCode() {
        t0.q qVar = this.f38860a;
        if (qVar != null) {
            return qVar.hashCode();
        }
        return 0;
    }

    @Override // D1.AbstractC2794c0
    public final void update(C8402w c8402w) {
        c8402w.N1(this.f38860a);
    }
}
