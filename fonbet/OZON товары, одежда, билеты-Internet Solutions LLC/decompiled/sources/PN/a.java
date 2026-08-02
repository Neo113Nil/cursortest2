package PN;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import d20.InterfaceC6068e;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomContainer.presentation.BottomContainerViewMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersLuggageButton.presentation.PassengersLuggageButtonNoUiViewMapper;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements InterfaceC6068e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22103a;

    public /* synthetic */ a(int i11) {
        this.f22103a = i11;
    }

    @Override // d20.InterfaceC6068e
    public final View create(ViewGroup viewGroup) {
        View createHolder$lambda$2$lambda$1;
        View createHolder$lambda$1;
        LinearLayout linearLayout = (LinearLayout) viewGroup;
        switch (this.f22103a) {
            case 0:
                createHolder$lambda$2$lambda$1 = PassengersLuggageButtonNoUiViewMapper.createHolder$lambda$2$lambda$1(linearLayout);
                return createHolder$lambda$2$lambda$1;
            default:
                createHolder$lambda$1 = BottomContainerViewMapper.createHolder$lambda$1(linearLayout);
                return createHolder$lambda$1;
        }
    }
}
