package O10;

import N10.h;
import android.view.View;
import ed.InterfaceC6346b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.composer.ui.widget.k;

@InterfaceC6346b
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f19866a;

    private /* synthetic */ d(View view) {
        this.f19866a = view;
    }

    public static final /* synthetic */ d a(View view) {
        return new d(view);
    }

    @NotNull
    public static final h b(View view) {
        Object tag = view.getTag(R.id.sticky_header_tag_config);
        Intrinsics.g(tag, "null cannot be cast to non-null type ru.ozon.composer.ui.sticky.StickyWidgetConfig");
        return (h) tag;
    }

    public static final int c(View view) {
        Object tag = view.getTag(R.id.sticky_header_tag_adapter_position);
        Intrinsics.g(tag, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) tag).intValue();
    }

    @NotNull
    public static final k<l20.c> d(View view) {
        Object tag = view.getTag(R.id.sticky_header_tag_holder);
        Intrinsics.g(tag, "null cannot be cast to non-null type ru.ozon.composer.ui.widget.WidgetViewHolder<ru.ozon.composer.widget.item.ViewItem>");
        return (k) tag;
    }

    public static final void e(View view, @NotNull h value) {
        Intrinsics.checkNotNullParameter(value, "value");
        view.setTag(R.id.sticky_header_tag_config, value);
    }

    public static final void f(int i11, View view) {
        view.setTag(R.id.sticky_header_tag_adapter_position, Integer.valueOf(i11));
    }

    public static final void g(View view, @NotNull k<l20.c> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        view.setTag(R.id.sticky_header_tag_holder, value);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return Intrinsics.d(this.f19866a, ((d) obj).f19866a);
        }
        return false;
    }

    public final /* synthetic */ View h() {
        return this.f19866a;
    }

    public final int hashCode() {
        return this.f19866a.hashCode();
    }

    public final String toString() {
        return "StickyView(view=" + this.f19866a + ")";
    }
}
