package androidx.compose.ui.layout;

import B1.D;
import D1.AbstractC2794c0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutIdElement;", "LD1/c0;", "LB1/D;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class LayoutIdElement extends AbstractC2794c0<D> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f40480a;

    public LayoutIdElement(@NotNull Object obj) {
        this.f40480a = obj;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final D getF41119a() {
        return new D(this.f40480a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && Intrinsics.d(this.f40480a, ((LayoutIdElement) obj).f40480a);
    }

    public final int hashCode() {
        return this.f40480a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.f40480a + ')';
    }

    @Override // D1.AbstractC2794c0
    public final void update(D d11) {
        d11.I1(this.f40480a);
    }
}
