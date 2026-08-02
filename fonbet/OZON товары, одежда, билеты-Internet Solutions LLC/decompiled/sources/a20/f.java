package a20;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;

/* loaded from: classes7.dex */
public final class f extends g<C4922a, C4923b> {
    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public final k<C4923b> createHolder2(@NotNull i container, @NotNull View itemView) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(itemView, "view");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        return new C4926e(itemView);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public final View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Space space = new Space(parent.getContext());
        space.setLayoutParams(new ViewGroup.LayoutParams(-1, 0));
        return space;
    }

    @Override // m20.InterfaceC8046a
    public final List map(Object obj, l20.d info) {
        C4922a state = (C4922a) obj;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(new C4923b(info.d().hashCode()));
    }
}
