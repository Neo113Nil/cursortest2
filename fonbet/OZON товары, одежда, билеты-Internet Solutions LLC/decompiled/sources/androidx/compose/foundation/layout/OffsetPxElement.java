package androidx.compose.foundation.layout;

import D1.AbstractC2794c0;
import androidx.compose.ui.platform.C5242e1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/OffsetPxElement;", "LD1/c0;", "Landroidx/compose/foundation/layout/S;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class OffsetPxElement extends AbstractC2794c0<S> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<Z1.d, Z1.m> f39368a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f39369b = true;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<C5242e1, Unit> f39370c;

    public OffsetPxElement(@NotNull Function1 function1, @NotNull Function1 function12) {
        this.f39368a = function1;
        this.f39370c = function12;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final S getF41119a() {
        return new S(this.f39368a, this.f39369b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetPxElement offsetPxElement = obj instanceof OffsetPxElement ? (OffsetPxElement) obj : null;
        return offsetPxElement != null && this.f39368a == offsetPxElement.f39368a && this.f39369b == offsetPxElement.f39369b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f39369b) + (this.f39368a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OffsetPxModifier(offset=");
        sb2.append(this.f39368a);
        sb2.append(", rtlAware=");
        return B4.V.d(sb2, this.f39369b, ')');
    }

    @Override // D1.AbstractC2794c0
    public final void update(S s11) {
        S s12 = s11;
        s12.K1(this.f39368a);
        s12.L1(this.f39369b);
    }
}
