package androidx.compose.foundation.layout;

import D1.AbstractC2794c0;
import e1.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/HorizontalAlignElement;", "LD1/c0;", "Landroidx/compose/foundation/layout/K;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HorizontalAlignElement extends AbstractC2794c0<K> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d.a f39346a;

    public HorizontalAlignElement(@NotNull d.a aVar) {
        this.f39346a = aVar;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final K getF41119a() {
        return new K(this.f39346a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = obj instanceof HorizontalAlignElement ? (HorizontalAlignElement) obj : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return Intrinsics.d(this.f39346a, horizontalAlignElement.f39346a);
    }

    public final int hashCode() {
        return this.f39346a.hashCode();
    }

    @Override // D1.AbstractC2794c0
    public final void update(K k11) {
        k11.I1(this.f39346a);
    }
}
