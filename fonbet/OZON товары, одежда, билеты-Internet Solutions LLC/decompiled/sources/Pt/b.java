package Pt;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import d20.InterfaceC6068e;
import l10.i;
import ru.ozon.app.android.fresh.cart.databinding.WidgetStickyTotalBinding;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.StickyTotalOverlayViewMapper;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.plain.PlainViewV4Mapper;

/* loaded from: classes12.dex */
public final /* synthetic */ class b implements InterfaceC6068e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22713a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22714b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f22713a = i11;
        this.f22714b = obj;
    }

    @Override // d20.InterfaceC6068e
    public final View create(ViewGroup viewGroup) {
        View createHolder$lambda$2;
        View createHolder$lambda$0;
        switch (this.f22713a) {
            case 0:
                createHolder$lambda$2 = StickyTotalOverlayViewMapper.createHolder$lambda$2((WidgetStickyTotalBinding) this.f22714b, (LinearLayout) viewGroup);
                return createHolder$lambda$2;
            default:
                createHolder$lambda$0 = PlainViewV4Mapper.createHolder$lambda$0((i) this.f22714b, (LinearLayout) viewGroup);
                return createHolder$lambda$0;
        }
    }
}
