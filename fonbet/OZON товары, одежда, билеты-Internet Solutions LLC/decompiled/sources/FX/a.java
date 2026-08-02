package FX;

import Ve.C4194dp;
import Ve.C4585rc;
import Ve.C4592rj;
import Ve.C4676ug;
import Wc0.b;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.common.screen.j;
import ru.ozon.app.android.atoms.af.holders.TextSubtextAtom;
import ru.ozon.app.android.bank.widgets.aboutInstallment.presentation.AboutInstallmentWidgetVH;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.buttons.GalleryFullViewButtonVH;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.presentation.SelectorDataConcreteStepViewHolder;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.CalendarDateControlView;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.SubviewsDelegate;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitle40IconCheckboxRadioView;
import ru.ozon.app.android.universalwidgets.widgets.maxiTile.presentation.gallery.MaxiTileGalleryAdapter;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.TileGrid2BannerView;
import ru.ozon.fintech.features.camera.presentation.camera.CameraFragment;
import spay.sdk.view.SpasiboBonusesButtonCompositeView;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9211a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9212b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f9211a = i11;
        this.f9212b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f9212b;
        switch (this.f9211a) {
            case 0:
                MaxiTileGalleryAdapter.onCreateViewHolder$lambda$1$lambda$0((MaxiTileGalleryAdapter) obj, view);
                break;
            case 1:
                SpasiboBonusesButtonCompositeView.b((C4676ug) obj, view);
                break;
            case 2:
                GalleryFullViewButtonVH.bind$lambda$1$lambda$0((GalleryFullViewButtonVH) obj, view);
                break;
            case 3:
                TextSubtextAtom._init_$lambda$1((TextSubtextAtom) obj, view);
                break;
            case 4:
                C4592rj this$0 = (C4592rj) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((C4194dp) this$0.u()).e0(C4585rc.f31974a);
                break;
            case 5:
                b.w((b) obj);
                break;
            case 6:
                SelectorDataConcreteStepViewHolder.lambda$3$lambda$0((SelectorDataConcreteStepViewHolder) obj, view);
                break;
            case 7:
                CalendarDateControlView.setOnRemoveReturnDateClickListener$lambda$2((CalendarDateControlView) obj, view);
                break;
            case 8:
                SubviewsDelegate.createCommentFooterText$lambda$29$lambda$28((SubviewsDelegate) obj, view);
                break;
            case 9:
                TileGrid2BannerView._init_$lambda$15((TileGrid2BannerView) obj, view);
                break;
            case 10:
                AboutInstallmentWidgetVH._init_$lambda$0((AboutInstallmentWidgetVH) obj, view);
                break;
            case 11:
                int i11 = j.f91127e;
                ((j) obj).dismiss();
                break;
            case 12:
                CameraFragment.onViewCreated$lambda$27$lambda$19$lambda$17((CameraFragment) obj, view);
                break;
            case 13:
                ((CellWithSubtitle40IconCheckboxRadioView) obj).onCheckedChange();
                break;
            default:
                ((Function0) obj).invoke();
                break;
        }
    }
}
