package androidx.compose.foundation.lazy;

import D1.AbstractC2794c0;
import S0.C3987u0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/ParentSizeElement;", "LD1/c0;", "Landroidx/compose/foundation/lazy/b;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class ParentSizeElement extends AbstractC2794c0<b> {

    /* renamed from: a, reason: collision with root package name */
    private final float f39571a;

    /* renamed from: b, reason: collision with root package name */
    private final C3987u0 f39572b;

    public ParentSizeElement() {
        throw null;
    }

    public ParentSizeElement(C3987u0 c3987u0) {
        this.f39571a = 0.89f;
        this.f39572b = c3987u0;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final b getF41119a() {
        return new b(this.f39571a, this.f39572b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParentSizeElement)) {
            return false;
        }
        ParentSizeElement parentSizeElement = (ParentSizeElement) obj;
        return this.f39571a == parentSizeElement.f39571a && Intrinsics.d(this.f39572b, parentSizeElement.f39572b);
    }

    public final int hashCode() {
        C3987u0 c3987u0 = this.f39572b;
        return Float.hashCode(this.f39571a) + ((c3987u0 != null ? c3987u0.hashCode() : 0) * 961);
    }

    @Override // D1.AbstractC2794c0
    public final void update(b bVar) {
        b bVar2 = bVar;
        bVar2.I1(this.f39571a);
        bVar2.J1(this.f39572b);
    }
}
