package TO;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import d20.InterfaceC6068e;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.presentation.overlay.MilesForBuyersModalInfoButtonsOverlayMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v1.presentation.OverlayButtonsViewMapper;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements InterfaceC6068e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26941a;

    public /* synthetic */ a(int i11) {
        this.f26941a = i11;
    }

    @Override // d20.InterfaceC6068e
    public final View create(ViewGroup viewGroup) {
        View createHolder$lambda$2;
        View createHolder$lambda$22;
        LinearLayout linearLayout = (LinearLayout) viewGroup;
        switch (this.f26941a) {
            case 0:
                createHolder$lambda$2 = MilesForBuyersModalInfoButtonsOverlayMapper.createHolder$lambda$2(linearLayout);
                return createHolder$lambda$2;
            default:
                createHolder$lambda$22 = OverlayButtonsViewMapper.createHolder$lambda$2(linearLayout);
                return createHolder$lambda$22;
        }
    }
}
