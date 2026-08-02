package androidx.compose.ui.draw;

import D1.AbstractC2794c0;
import i1.C6989i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawBehindElement;", "LD1/c0;", "Li1/i;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class DrawBehindElement extends AbstractC2794c0<C6989i> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<InterfaceC8412e, Unit> f40328a;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawBehindElement(@NotNull Function1<? super InterfaceC8412e, Unit> function1) {
        this.f40328a = function1;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final C6989i getF41119a() {
        return new C6989i(this.f40328a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawBehindElement) && Intrinsics.d(this.f40328a, ((DrawBehindElement) obj).f40328a);
    }

    public final int hashCode() {
        return this.f40328a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "DrawBehindElement(onDraw=" + this.f40328a + ')';
    }

    @Override // D1.AbstractC2794c0
    public final void update(C6989i c6989i) {
        c6989i.I1(this.f40328a);
    }
}
