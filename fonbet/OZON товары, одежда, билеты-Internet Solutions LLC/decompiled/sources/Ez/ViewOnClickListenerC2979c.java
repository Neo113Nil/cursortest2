package Ez;

import Ui.C4069c;
import Ve.C1;
import Ve.C4092a9;
import Ve.Ge;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.abtool.presentation.abvariants.recycler.VariantsAdapter;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.multiplerangesfilter.MultipleRangesFilterViewHolder;
import ru.ozon.app.android.common.twocards.presentation.TwoCardsHolder;
import ru.ozon.app.android.datePicker.DatePickerDialogFragment;
import ru.ozon.app.android.marketing.widgets.hammersV3.oldHammers.presentation.binders.OldHammerProductImageBinder;
import ru.ozon.app.android.partnerBanks.presentation.view.PartnerBanksView;
import ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductAdultImageWithVideoCoverBinder;
import ru.ozon.app.android.session.auth.presentation.viewHolder.AuthViewHolder;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.view.PassengersDirectoryV3InputView;
import ru.ozon.app.android.ugc.core.widgets.listreviews.presentation.sorts.ListReviewsSortsViewHolder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.binders.SkuScrollBadgesBinder;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

/* renamed from: Ez.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class ViewOnClickListenerC2979c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8165a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8166b;

    public /* synthetic */ ViewOnClickListenerC2979c(Object obj, int i11) {
        this.f8165a = i11;
        this.f8166b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f8165a) {
            case 0:
                OldHammerProductImageBinder.init$lambda$1((OldHammerProductImageBinder) this.f8166b, view);
                break;
            case 1:
                PassengersDirectoryV3InputView.clearInputIcon$lambda$7$lambda$6((PassengersDirectoryV3InputView) this.f8166b, view);
                break;
            case 2:
                ((MultipleRangesFilterViewHolder) this.f8166b).titleClick();
                break;
            case 3:
                PartnerBanksView._init_$lambda$1((PartnerBanksView) this.f8166b, view);
                break;
            case 4:
                ListReviewsSortsViewHolder._init_$lambda$0((ListReviewsSortsViewHolder) this.f8166b, view);
                break;
            case 5:
                SkuScrollBadgesBinder.init$lambda$0((SkuScrollBadgesBinder) this.f8166b, view);
                break;
            case 6:
                C4069c.w((C4069c) this.f8166b);
                break;
            case 7:
                C1 this$0 = (C1) this.f8166b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((C4092a9) this$0.u()).e0(Ge.f29073a);
                break;
            case 8:
                VariantsAdapter.VariantViewHolder._init_$lambda$0((VariantsAdapter.VariantViewHolder) this.f8166b, view);
                break;
            case 9:
                TwoCardsHolder._init_$lambda$1((TwoCardsHolder) this.f8166b, view);
                break;
            case 10:
                ProductAdultImageWithVideoCoverBinder.init$lambda$2((ProductAdultImageWithVideoCoverBinder) this.f8166b, view);
                break;
            case 11:
                ((DatePickerDialogFragment) this.f8166b).dismiss();
                break;
            case 12:
                ((AuthViewHolder) this.f8166b).submit();
                break;
            default:
                ((ButtonV3View) this.f8166b).performClick();
                break;
        }
    }
}
