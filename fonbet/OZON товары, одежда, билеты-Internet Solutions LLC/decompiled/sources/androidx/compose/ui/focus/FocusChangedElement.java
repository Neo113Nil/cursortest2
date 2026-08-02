package androidx.compose.ui.focus;

import D1.AbstractC2794c0;
import j1.v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusChangedElement;", "LD1/c0;", "Landroidx/compose/ui/focus/b;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class FocusChangedElement extends AbstractC2794c0<b> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<v, Unit> f40363a;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusChangedElement(@NotNull Function1<? super v, Unit> function1) {
        this.f40363a = function1;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final b getF41119a() {
        return new b(this.f40363a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && Intrinsics.d(this.f40363a, ((FocusChangedElement) obj).f40363a);
    }

    public final int hashCode() {
        return this.f40363a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "FocusChangedElement(onFocusChanged=" + this.f40363a + ')';
    }

    @Override // D1.AbstractC2794c0
    public final void update(b bVar) {
        bVar.I1(this.f40363a);
    }
}
