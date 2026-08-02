package androidx.compose.ui.layout;

import B1.K;
import B1.U;
import B1.W;
import B1.Y;
import D1.AbstractC2794c0;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutElement;", "LD1/c0;", "LB1/K;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class LayoutElement extends AbstractC2794c0<K> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<Y, U, Z1.b, W> f40479a;

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutElement(@NotNull InterfaceC6511n<? super Y, ? super U, ? super Z1.b, ? extends W> interfaceC6511n) {
        this.f40479a = interfaceC6511n;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final K getF41119a() {
        return new K(this.f40479a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && Intrinsics.d(this.f40479a, ((LayoutElement) obj).f40479a);
    }

    public final int hashCode() {
        return this.f40479a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "LayoutElement(measure=" + this.f40479a + ')';
    }

    @Override // D1.AbstractC2794c0
    public final void update(K k11) {
        k11.I1(this.f40479a);
    }
}
