package androidx.compose.foundation.gestures;

import D1.AbstractC2794c0;
import Kk.C3532b;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableElement;", "T", "LD1/c0;", "Landroidx/compose/foundation/gestures/h;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class AnchoredDraggableElement<T> extends AbstractC2794c0<C5165h<T>> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C5167j<T> f38946a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final EnumC9142v f38947b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f38948c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f38949d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f38950e;

    public AnchoredDraggableElement(@NotNull C5167j c5167j, @NotNull EnumC9142v enumC9142v, boolean z11, Boolean bool, boolean z12) {
        this.f38946a = c5167j;
        this.f38947b = enumC9142v;
        this.f38948c = z11;
        this.f38949d = bool;
        this.f38950e = z12;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final e.c getF41119a() {
        return new C5165h(this.f38946a, this.f38947b, this.f38948c, this.f38949d, this.f38950e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchoredDraggableElement)) {
            return false;
        }
        AnchoredDraggableElement anchoredDraggableElement = (AnchoredDraggableElement) obj;
        return Intrinsics.d(this.f38946a, anchoredDraggableElement.f38946a) && this.f38947b == anchoredDraggableElement.f38947b && this.f38948c == anchoredDraggableElement.f38948c && Intrinsics.d(this.f38949d, anchoredDraggableElement.f38949d) && this.f38950e == anchoredDraggableElement.f38950e;
    }

    public final int hashCode() {
        int a11 = C3532b.a((this.f38947b.hashCode() + (this.f38946a.hashCode() * 31)) * 31, 31, this.f38948c);
        Boolean bool = this.f38949d;
        return C3532b.a((a11 + (bool != null ? bool.hashCode() : 0)) * 961, 31, this.f38950e);
    }

    @Override // D1.AbstractC2794c0
    public final void update(e.c cVar) {
        ((C5165h) cVar).l2(this.f38946a, this.f38947b, this.f38948c, this.f38949d, this.f38950e);
    }
}
