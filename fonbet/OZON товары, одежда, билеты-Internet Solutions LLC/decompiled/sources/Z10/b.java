package Z10;

import android.view.View;
import g20.C6615a;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;

/* loaded from: classes7.dex */
public final class b extends g<C6615a, g20.b> {

    /* renamed from: a, reason: collision with root package name */
    private final int f35339a = R.layout.item_composer_bottom_loader;

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public final k<g20.b> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        return new a(view);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public final Integer getLayout() {
        return Integer.valueOf(this.f35339a);
    }

    @Override // m20.InterfaceC8046a
    public final List map(Object obj, d info) {
        C6615a state = (C6615a) obj;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(new g20.b(info.d().hashCode()));
    }
}
