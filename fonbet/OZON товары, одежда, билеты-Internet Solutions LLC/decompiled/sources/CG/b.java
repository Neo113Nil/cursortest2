package CG;

import Dc0.q;
import Ve.C4082a;
import Ve.C4532pg;
import Ve.S7;
import android.view.View;
import androidx.appcompat.app.g;
import kc0.C7645c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cabinet.profileAvatar.presentation.ProfileAvatarViewHolder;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.adapter.SuggestionsAdapter;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.colorfilter.colors.SquareColorViewHolder;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.rv.vh.FilterValuesHeaderViewHolder;
import ru.ozon.app.android.common.progressivemolecula.presentation.overlay.ProgressiveTextOverlayViewHolder;
import ru.ozon.app.android.fresh.navigation.onboarding.FreshTabOnboardingDialog;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.posting.PostingOrderShipmentWidgetViewHolder;
import ru.ozon.app.android.pdp.view.crosssale.CrossSaleListFragment;
import ru.ozon.app.android.pdp.widgets.aspectsV4.presentation.rv.AspectsV4BaseImageVH;
import ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.monoposting.CancelPostingsV2MonopostingViewHolder;
import ru.ozon.app.android.storefront.widgets.cms.richtext.widget.RichTextWidgetDialog;
import ru.ozon.app.android.storefront.widgets.financeWidget.presentation.couple.CardItemView;
import ru.ozon.app.android.storefront.widgets.megaRaffle.presentation.ActionProgressViewHolder;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.view.FlightSeatsSchemeV2FooterBlockView;
import ru.ozon.app.android.ugc.widgets.profileHeader.presentation.ProfileHeaderViewHolder;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.view.ReviewsItemViewHolder;
import ru.ozon.app.android.widgets.debug.coloredlifecyclewidget.ColoredLifecycleViewHolder;
import ru.ozon.fintech.features.camera.presentation.camera.CameraFragment;
import tj.e;

/* loaded from: classes13.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4530a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4531b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f4530a = i11;
        this.f4531b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4530a) {
            case 0:
                ((CancelPostingsV2MonopostingViewHolder) this.f4531b).clickToPriceUpView();
                break;
            case 1:
                ((RichTextWidgetDialog) this.f4531b).dismiss();
                break;
            case 2:
                q.z((q) this.f4531b);
                break;
            case 3:
                CrossSaleListFragment.initToolbar$lambda$4$lambda$3((g) this.f4531b, view);
                break;
            case 4:
                SquareColorViewHolder._init_$lambda$1((SquareColorViewHolder) this.f4531b, view);
                break;
            case 5:
                FreshTabOnboardingDialog.onViewCreated$lambda$0((FreshTabOnboardingDialog) this.f4531b, view);
                break;
            case 6:
                ColoredLifecycleViewHolder._init_$lambda$1((ColoredLifecycleViewHolder) this.f4531b, view);
                break;
            case 7:
                ProfileAvatarViewHolder.avatarOnClickListener$lambda$0((ProfileAvatarViewHolder) this.f4531b, view);
                break;
            case 8:
                CardItemView._init_$lambda$7((CardItemView) this.f4531b, view);
                break;
            case 9:
                FlightSeatsSchemeV2FooterBlockView._init_$lambda$15((FlightSeatsSchemeV2FooterBlockView) this.f4531b, view);
                break;
            case 10:
                ActionProgressViewHolder.clickListener$lambda$0((ActionProgressViewHolder) this.f4531b, view);
                break;
            case 11:
                S7 this$0 = (S7) this.f4531b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((C4532pg) this$0.u()).e0(C4082a.f30620b);
                break;
            case 12:
                FilterValuesHeaderViewHolder._init_$lambda$1((FilterValuesHeaderViewHolder) this.f4531b, view);
                break;
            case 13:
                AspectsV4BaseImageVH._init_$lambda$3((AspectsV4BaseImageVH) this.f4531b, view);
                break;
            case 14:
                ProgressiveTextOverlayViewHolder._init_$lambda$0((ProgressiveTextOverlayViewHolder) this.f4531b, view);
                break;
            case 15:
                ProfileHeaderViewHolder.setCountClickListeners$lambda$11$lambda$9((ProfileHeaderViewHolder) this.f4531b, view);
                break;
            case 16:
                SuggestionsAdapter.SuggestionViewHolder._init_$lambda$0((SuggestionsAdapter.SuggestionViewHolder) this.f4531b, view);
                break;
            case 17:
                ((Function0) this.f4531b).invoke();
                break;
            case 18:
                C7645c.v((C7645c) this.f4531b);
                break;
            case 19:
                ReviewsItemViewHolder.lambda$2$lambda$1((ReviewsItemViewHolder) this.f4531b, view);
                break;
            case 20:
                CameraFragment.onViewCreated$lambda$27$lambda$19$lambda$16((CameraFragment) this.f4531b, view);
                break;
            case 21:
                e.u((e) this.f4531b);
                break;
            default:
                PostingOrderShipmentWidgetViewHolder.lambda$1$lambda$0((PostingOrderShipmentWidgetViewHolder) this.f4531b, view);
                break;
        }
    }
}
