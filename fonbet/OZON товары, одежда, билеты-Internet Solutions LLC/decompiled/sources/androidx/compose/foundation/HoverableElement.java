package androidx.compose.foundation;

import D1.AbstractC2794c0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/HoverableElement;", "LD1/c0;", "Landroidx/compose/foundation/s;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class HoverableElement extends AbstractC2794c0<s> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final t0.q f38861a;

    public HoverableElement(@NotNull t0.q qVar) {
        this.f38861a = qVar;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final s getF41119a() {
        return new s(this.f38861a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && Intrinsics.d(((HoverableElement) obj).f38861a, this.f38861a);
    }

    public final int hashCode() {
        return this.f38861a.hashCode() * 31;
    }

    @Override // D1.AbstractC2794c0
    public final void update(s sVar) {
        sVar.L1(this.f38861a);
    }
}
