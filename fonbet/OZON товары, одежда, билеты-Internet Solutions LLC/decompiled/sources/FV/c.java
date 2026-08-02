package FV;

import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProductTile.ReviewProductTileDTO;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4VO;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.info.GalleryV4InfoVH;
import ru.ozon.app.android.travel.calendar.view.CalendarDayView;
import ru.ozon.app.android.travel.calendar.view.CalendarWeekLayout;
import ru.ozon.app.android.travel.molecules.view.linkButton.LinkButtonVO;
import ru.ozon.app.android.travel.molecules.view.linkButton.LinkButtonView;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.views.ReviewProductTileBinder;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitle24IconView;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9208a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9209b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9210c;

    public /* synthetic */ c(int i11, Object obj, Object obj2) {
        this.f9208a = i11;
        this.f9209b = obj;
        this.f9210c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9208a) {
            case 0:
                ReviewProductTileBinder.bind$lambda$1$lambda$0((ReviewProductTileDTO) this.f9209b, (Function1) this.f9210c, view);
                break;
            case 1:
                GalleryV4InfoVH.bind$lambda$1((GalleryV4VO.Item.Info) this.f9209b, (GalleryV4InfoVH) this.f9210c, view);
                break;
            case 2:
                CalendarWeekLayout.setUpClickListener$lambda$7((CalendarDayView) this.f9209b, (CalendarWeekLayout) this.f9210c, view);
                break;
            case 3:
                LinkButtonView.bind$lambda$5$lambda$4((Function1) this.f9210c, (LinkButtonVO) this.f9209b, view);
                break;
            default:
                CellWithSubtitle24IconView.onClickListener$lambda$2((CellWithSubtitle24IconView) this.f9209b, (Function0) this.f9210c, view);
                break;
        }
    }

    public /* synthetic */ c(LinkButtonVO linkButtonVO, Function1 function1) {
        this.f9208a = 3;
        this.f9210c = function1;
        this.f9209b = linkButtonVO;
    }
}
