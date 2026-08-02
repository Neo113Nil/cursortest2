package OD;

import Ve.C4151ca;
import Ve.C4307hm;
import Ve.C4407l7;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import ld0.x;
import ru.ozon.app.android.account.orders.view.maps.ui.MapsAdapter;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.buttons.GallerySoundButtonVH;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.MilesForBuyersWidgetViewHolder;
import ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v2.view.OverlayButtonsV2ItemView;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.CalendarDaysRoundControlView;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitle40IconCheckboxRadioView;
import ru.ozon.fintech.features.camera.presentation.camera.CameraFragment;
import ru.ozon.uni.atoms.v3.holders.cell.CellAtomHolder;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20129a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20130b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f20129a = i11;
        this.f20130b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f20129a) {
            case 0:
                GallerySoundButtonVH.bind$lambda$1$lambda$0((GallerySoundButtonVH) this.f20130b, view);
                break;
            case 1:
                MilesForBuyersWidgetViewHolder._init_$lambda$0((MilesForBuyersWidgetViewHolder) this.f20130b, view);
                break;
            case 2:
                C4407l7 this$0 = (C4407l7) this.f20130b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((C4151ca) this$0.u()).e0(C4307hm.f31207a);
                break;
            case 3:
                CellAtomHolder._init_$lambda$1((CellAtomHolder) this.f20130b, view);
                break;
            case 4:
                CalendarDaysRoundControlView.setOnClickListener$lambda$0((CalendarDaysRoundControlView) this.f20130b, view);
                break;
            case 5:
                OverlayButtonsV2ItemView._init_$lambda$6((OverlayButtonsV2ItemView) this.f20130b, view);
                break;
            case 6:
                x.v((x) this.f20130b);
                break;
            case 7:
                MapsAdapter.onCreateViewHolder$lambda$0((MapsAdapter) this.f20130b, view);
                break;
            case 8:
                CameraFragment.onViewCreated$lambda$27$lambda$19$lambda$18((CameraFragment) this.f20130b, view);
                break;
            default:
                ((CellWithSubtitle40IconCheckboxRadioView) this.f20130b).onCheckedChange();
                break;
        }
    }
}
