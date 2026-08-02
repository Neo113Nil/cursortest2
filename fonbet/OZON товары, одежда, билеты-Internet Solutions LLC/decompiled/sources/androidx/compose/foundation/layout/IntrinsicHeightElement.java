package androidx.compose.foundation.layout;

import D1.AbstractC2794c0;
import androidx.compose.ui.platform.C5242e1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import u0.EnumC9909s;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicHeightElement;", "LD1/c0;", "Landroidx/compose/foundation/layout/L;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class IntrinsicHeightElement extends AbstractC2794c0<L> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final EnumC9909s f39348a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f39349b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<C5242e1, Unit> f39350c;

    /* JADX WARN: Multi-variable type inference failed */
    public IntrinsicHeightElement(@NotNull EnumC9909s enumC9909s, boolean z11, @NotNull Function1<? super C5242e1, Unit> function1) {
        this.f39348a = enumC9909s;
        this.f39349b = z11;
        this.f39350c = function1;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final L getF41119a() {
        return new L(this.f39348a, this.f39349b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicHeightElement intrinsicHeightElement = obj instanceof IntrinsicHeightElement ? (IntrinsicHeightElement) obj : null;
        return intrinsicHeightElement != null && this.f39348a == intrinsicHeightElement.f39348a && this.f39349b == intrinsicHeightElement.f39349b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f39349b) + (this.f39348a.hashCode() * 31);
    }

    @Override // D1.AbstractC2794c0
    public final void update(L l11) {
        L l12 = l11;
        l12.L1(this.f39348a);
        l12.K1(this.f39349b);
    }
}
