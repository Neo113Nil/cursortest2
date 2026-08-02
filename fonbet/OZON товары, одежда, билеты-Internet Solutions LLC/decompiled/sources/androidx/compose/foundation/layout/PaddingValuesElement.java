package androidx.compose.foundation.layout;

import D1.AbstractC2794c0;
import androidx.compose.ui.platform.C5242e1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u0.InterfaceC9914x;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesElement;", "LD1/c0;", "Landroidx/compose/foundation/layout/V;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class PaddingValuesElement extends AbstractC2794c0<V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC9914x f39379a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<C5242e1, Unit> f39380b;

    /* JADX WARN: Multi-variable type inference failed */
    public PaddingValuesElement(@NotNull InterfaceC9914x interfaceC9914x, @NotNull Function1<? super C5242e1, Unit> function1) {
        this.f39379a = interfaceC9914x;
        this.f39380b = function1;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final V getF41119a() {
        return new V(this.f39379a);
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return Intrinsics.d(this.f39379a, paddingValuesElement.f39379a);
    }

    public final int hashCode() {
        return this.f39379a.hashCode();
    }

    @Override // D1.AbstractC2794c0
    public final void update(V v11) {
        v11.J1(this.f39379a);
    }
}
