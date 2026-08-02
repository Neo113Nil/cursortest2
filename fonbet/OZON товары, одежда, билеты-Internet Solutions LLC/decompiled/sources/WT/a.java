package WT;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import d20.InterfaceC6068e;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation.buttons.PersonalInfoVerificationStickyButtonViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.loading.ToursSearchResultLoadingOverlayViewMapper;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements InterfaceC6068e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33352a;

    public /* synthetic */ a(int i11) {
        this.f33352a = i11;
    }

    @Override // d20.InterfaceC6068e
    public final View create(ViewGroup viewGroup) {
        View createHolder$lambda$1;
        View createHolder$lambda$12;
        LinearLayout linearLayout = (LinearLayout) viewGroup;
        switch (this.f33352a) {
            case 0:
                createHolder$lambda$1 = ToursSearchResultLoadingOverlayViewMapper.createHolder$lambda$1(linearLayout);
                return createHolder$lambda$1;
            default:
                createHolder$lambda$12 = PersonalInfoVerificationStickyButtonViewMapper.createHolder$lambda$1(linearLayout);
                return createHolder$lambda$12;
        }
    }
}
