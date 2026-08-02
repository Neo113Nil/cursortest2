package Wg;

import ed.InterfaceC6346b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* loaded from: classes10.dex */
public final class f implements Function1<C7854a, Boolean> {

    /* renamed from: a, reason: collision with root package name */
    private final int f33857a;

    private /* synthetic */ f(int i11) {
        this.f33857a = i11;
    }

    public static final /* synthetic */ f a(int i11) {
        return new f(i11);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f33857a == ((f) obj).f33857a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f33857a);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C7854a c7854a) {
        C7854a item = c7854a;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(item, "item");
        Integer scrollWidgetKey = item.d().getScrollWidgetKey();
        return Boolean.valueOf(scrollWidgetKey != null && scrollWidgetKey.intValue() == this.f33857a);
    }

    @NotNull
    public final String toString() {
        return K00.b.e(this.f33857a, ")", new StringBuilder("ScrollPredicateByWidgetKey(targetWidgetKey="));
    }
}
