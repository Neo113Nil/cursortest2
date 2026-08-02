package Jm0;

import Ve.C4676ug;
import Wc0.b;
import android.view.View;
import ru.ozon.app.android.abtool.presentation.features.FeaturesFragment;
import ru.ozon.app.android.atoms.af.holders.TextAtomHolder;
import ru.ozon.app.android.fresh.geo.ui.molecules.ProductFavoriteExpressMoleculeView;
import ru.ozon.app.android.pdp.view.pdp.PdpGalleryFullViewConfigurator;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.CalendarDateControlView;
import ru.ozon.app.android.travel.feature.general.order.widgets.horizontalIconButtons.view.IconButtonView;
import ru.ozon.app.android.travel.molecules.view.banner.BannerView;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.SubviewsDelegate;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitle32IconView;
import ru.ozon.app.android.uikit.view.atoms.color.ColorView;
import ru.ozon.fintech.features.offline.ui.my.OfflineMyContactView;
import spay.sdk.view.SpasiboBonusesButtonCompositeView;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14832a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14833b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f14832a = i11;
        this.f14833b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f14832a) {
            case 0:
                SpasiboBonusesButtonCompositeView.a((C4676ug) this.f14833b, view);
                break;
            case 1:
                PdpGalleryFullViewConfigurator.createCloseButton$lambda$7$lambda$6((PdpGalleryFullViewConfigurator) this.f14833b, view);
                break;
            case 2:
                TextAtomHolder.onBind$lambda$3$lambda$2((TextAtomHolder) this.f14833b, view);
                break;
            case 3:
                b.u((b) this.f14833b);
                break;
            case 4:
                IconButtonView._init_$lambda$4((IconButtonView) this.f14833b, view);
                break;
            case 5:
                FeaturesFragment.onViewCreated$lambda$3((FeaturesFragment) this.f14833b, view);
                break;
            case 6:
                CalendarDateControlView.setOnAddDateClickListener$lambda$3((CalendarDateControlView) this.f14833b, view);
                break;
            case 7:
                SubviewsDelegate.createCommentFooterContainer$lambda$33$lambda$32((SubviewsDelegate) this.f14833b, view);
                break;
            case 8:
                BannerView.setUp$lambda$15((BannerView) this.f14833b, view);
                break;
            case 9:
                OfflineMyContactView._init_$lambda$0((OfflineMyContactView) this.f14833b, view);
                break;
            case 10:
                CellWithSubtitle32IconView._init_$lambda$0((CellWithSubtitle32IconView) this.f14833b, view);
                break;
            case 11:
                ((ColorView) this.f14833b).onChangeSelected();
                break;
            default:
                ProductFavoriteExpressMoleculeView._init_$lambda$0((ProductFavoriteExpressMoleculeView) this.f14833b, view);
                break;
        }
    }
}
