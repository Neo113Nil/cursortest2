package OT;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import d20.InterfaceC6068e;
import l10.i;
import ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.presentation.stickyBottom.ToursMealStickyBottomViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSorting.presentation.ToursSortingViewMapper;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements InterfaceC6068e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20141a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f20142b;

    public /* synthetic */ a(int i11, i iVar) {
        this.f20141a = i11;
        this.f20142b = iVar;
    }

    @Override // d20.InterfaceC6068e
    public final View create(ViewGroup viewGroup) {
        View createHolder$lambda$3;
        View createHolder$lambda$1;
        switch (this.f20141a) {
            case 0:
                createHolder$lambda$3 = ToursMealStickyBottomViewMapper.createHolder$lambda$3(this.f20142b, (LinearLayout) viewGroup);
                return createHolder$lambda$3;
            default:
                createHolder$lambda$1 = ToursSortingViewMapper.createHolder$lambda$1(this.f20142b, (LinearLayout) viewGroup);
                return createHolder$lambda$1;
        }
    }
}
