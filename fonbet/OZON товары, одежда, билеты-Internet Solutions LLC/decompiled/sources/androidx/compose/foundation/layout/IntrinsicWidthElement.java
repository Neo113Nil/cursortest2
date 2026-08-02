package androidx.compose.foundation.layout;

import D1.AbstractC2794c0;
import androidx.compose.ui.platform.C5242e1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import u0.EnumC9909s;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicWidthElement;", "LD1/c0;", "Landroidx/compose/foundation/layout/O;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class IntrinsicWidthElement extends AbstractC2794c0<O> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final EnumC9909s f39351a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f39352b = true;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<C5242e1, Unit> f39353c;

    public IntrinsicWidthElement(@NotNull EnumC9909s enumC9909s, @NotNull Function1 function1) {
        this.f39351a = enumC9909s;
        this.f39353c = function1;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final O getF41119a() {
        return new O(this.f39351a, this.f39352b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicWidthElement intrinsicWidthElement = obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null;
        return intrinsicWidthElement != null && this.f39351a == intrinsicWidthElement.f39351a && this.f39352b == intrinsicWidthElement.f39352b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f39352b) + (this.f39351a.hashCode() * 31);
    }

    @Override // D1.AbstractC2794c0
    public final void update(O o11) {
        O o12 = o11;
        o12.L1(this.f39351a);
        o12.K1(this.f39352b);
    }
}
