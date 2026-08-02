package b20;

import androidx.lifecycle.AbstractC5434v;
import ed.InterfaceC6346b;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;

@InterfaceC6346b
/* renamed from: b20.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C5521a<I extends c> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final k<I> f55482a;

    private /* synthetic */ C5521a(k kVar) {
        this.f55482a = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(k kVar, l widgetViewItem, f viewedPond) {
        Intrinsics.checkNotNullParameter(widgetViewItem, "widgetViewItem");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        c d11 = widgetViewItem.d();
        Intrinsics.g(d11, "null cannot be cast to non-null type I of ru.ozon.composer.ui.widget.nested.PlaceholderWidgetViewHolder");
        kVar.bind$composer_recycler_ui_release(widgetViewItem, d11, viewedPond, null, null);
    }

    public static final /* synthetic */ C5521a b(k kVar) {
        return new C5521a(kVar);
    }

    public static final void c(k<I> kVar, @NotNull AbstractC5434v.b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        kVar.setLifecycleState(state);
    }

    public final /* synthetic */ k d() {
        return this.f55482a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5521a) {
            return Intrinsics.d(this.f55482a, ((C5521a) obj).f55482a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f55482a.hashCode();
    }

    public final String toString() {
        return "PlaceholderWidgetViewHolder(source=" + this.f55482a + ")";
    }
}
