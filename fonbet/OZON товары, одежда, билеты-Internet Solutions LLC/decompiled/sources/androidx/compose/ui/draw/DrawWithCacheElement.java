package androidx.compose.ui.draw;

import D1.AbstractC2794c0;
import i1.C6987g;
import i1.C6992l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawWithCacheElement;", "LD1/c0;", "Landroidx/compose/ui/draw/a;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class DrawWithCacheElement extends AbstractC2794c0<a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<C6987g, C6992l> f40329a;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawWithCacheElement(@NotNull Function1<? super C6987g, C6992l> function1) {
        this.f40329a = function1;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final a getF41119a() {
        return new a(new C6987g(), this.f40329a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithCacheElement) && Intrinsics.d(this.f40329a, ((DrawWithCacheElement) obj).f40329a);
    }

    public final int hashCode() {
        return this.f40329a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "DrawWithCacheElement(onBuildDrawCache=" + this.f40329a + ')';
    }

    @Override // D1.AbstractC2794c0
    public final void update(a aVar) {
        aVar.K1(this.f40329a);
    }
}
