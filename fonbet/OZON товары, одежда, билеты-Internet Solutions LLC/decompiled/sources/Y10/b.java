package Y10;

import android.view.View;
import f20.C6406a;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;
import z00.f;

/* loaded from: classes7.dex */
public final class b extends g<f, C6406a> {

    /* renamed from: a, reason: collision with root package name */
    private final int f34534a = R.layout.item_composer_bottom_error;

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public final k<C6406a> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        return new a(view, container.M());
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public final Integer getLayout() {
        return Integer.valueOf(this.f34534a);
    }

    @Override // m20.InterfaceC8046a
    public final List map(Object obj, d info) {
        f state = (f) obj;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(new C6406a(info.d().hashCode(), state));
    }
}
