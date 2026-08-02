package androidx.compose.ui.graphics;

import D1.AbstractC2794c0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.C7797O;
import l1.InterfaceC7825i0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;", "LD1/c0;", "Ll1/O;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class BlockGraphicsLayerElement extends AbstractC2794c0<C7797O> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<InterfaceC7825i0, Unit> f40417a;

    /* JADX WARN: Multi-variable type inference failed */
    public BlockGraphicsLayerElement(@NotNull Function1<? super InterfaceC7825i0, Unit> function1) {
        this.f40417a = function1;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final C7797O getF41119a() {
        return new C7797O(this.f40417a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && Intrinsics.d(this.f40417a, ((BlockGraphicsLayerElement) obj).f40417a);
    }

    public final int hashCode() {
        return this.f40417a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "BlockGraphicsLayerElement(block=" + this.f40417a + ')';
    }

    @Override // D1.AbstractC2794c0
    public final void update(C7797O c7797o) {
        C7797O c7797o2 = c7797o;
        c7797o2.K1(this.f40417a);
        c7797o2.J1();
    }
}
