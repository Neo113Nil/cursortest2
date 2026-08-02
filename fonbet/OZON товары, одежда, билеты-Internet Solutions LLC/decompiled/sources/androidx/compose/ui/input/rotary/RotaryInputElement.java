package androidx.compose.ui.input.rotary;

import D1.AbstractC2794c0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z1.C10972b;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/rotary/RotaryInputElement;", "LD1/c0;", "Landroidx/compose/ui/input/rotary/b;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class RotaryInputElement extends AbstractC2794c0<b> {

    /* renamed from: a, reason: collision with root package name */
    private final Function1<C10972b, Boolean> f40477a;

    public RotaryInputElement(Function1 function1) {
        this.f40477a = function1;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final b getF41119a() {
        return new b(this.f40477a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RotaryInputElement) {
            return Intrinsics.d(this.f40477a, ((RotaryInputElement) obj).f40477a);
        }
        return false;
    }

    public final int hashCode() {
        Function1<C10972b, Boolean> function1 = this.f40477a;
        return (function1 == null ? 0 : function1.hashCode()) * 31;
    }

    @NotNull
    public final String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + this.f40477a + ", onPreRotaryScrollEvent=null)";
    }

    @Override // D1.AbstractC2794c0
    public final void update(b bVar) {
        bVar.I1(this.f40477a);
    }
}
