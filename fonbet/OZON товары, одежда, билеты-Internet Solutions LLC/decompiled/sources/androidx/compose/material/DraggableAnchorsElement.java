package androidx.compose.material;

import D1.AbstractC2794c0;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/DraggableAnchorsElement;", "T", "LD1/c0;", "Landroidx/compose/material/s;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class DraggableAnchorsElement<T> extends AbstractC2794c0<C5220s<T>> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C5210h<T> f39886a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<Z1.q, Z1.b, Pair<J0.M<T>, T>> f39887b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final EnumC9142v f39888c;

    /* JADX WARN: Multi-variable type inference failed */
    public DraggableAnchorsElement(@NotNull C5210h<T> c5210h, @NotNull Function2<? super Z1.q, ? super Z1.b, ? extends Pair<? extends J0.M<T>, ? extends T>> function2, @NotNull EnumC9142v enumC9142v) {
        this.f39886a = c5210h;
        this.f39887b = function2;
        this.f39888c = enumC9142v;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final e.c getF41119a() {
        return new C5220s(this.f39886a, this.f39887b, this.f39888c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElement)) {
            return false;
        }
        DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) obj;
        return Intrinsics.d(this.f39886a, draggableAnchorsElement.f39886a) && this.f39887b == draggableAnchorsElement.f39887b && this.f39888c == draggableAnchorsElement.f39888c;
    }

    public final int hashCode() {
        return this.f39888c.hashCode() + ((this.f39887b.hashCode() + (this.f39886a.hashCode() * 31)) * 31);
    }

    @Override // D1.AbstractC2794c0
    public final void update(e.c cVar) {
        C5220s c5220s = (C5220s) cVar;
        c5220s.M1(this.f39886a);
        c5220s.K1(this.f39887b);
        c5220s.L1(this.f39888c);
    }
}
