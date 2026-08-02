package Aw;

import android.view.View;
import androidx.media3.ui.d;
import kotlin.jvm.functions.Function0;
import ru.ozon.android.messenger.blocks.buttons.presentation.fixed.ChatButtonFixedLayout;
import ru.ozon.app.android.atoms.af.holders.ButtonBaseAtom;
import ru.ozon.app.android.cabinet.profiledatasettings.presentation.ui.ProfileGenderBottomSheet;
import ru.ozon.app.android.courieronmap.presentation.CourierOnMapBinder;
import ru.ozon.app.android.fresh.main.widgets.product.common.views.ProductFavoriteExpressMoleculeView;
import ru.ozon.app.android.fresh.main.widgets.product.scroll.presentation.ScrollProductViewHolder;
import ru.ozon.app.android.geo.addresseditcarousel.presentation.options.OptionsVH;
import ru.ozon.app.android.partpayment.formpage.view.vh.SummaryFieldVH;
import ru.ozon.app.android.search.widgets.suggestion.presentation.SuggestionViewHolder;
import ru.ozon.app.android.storefront.onboardingscreen.screen.OnboardingFlowFragment;
import ru.ozon.app.android.travel.molecules.fragment.dateSelector.TravelDateSelectorDialogFragment;
import ru.ozon.fintech.features.offline.ui.permisson.OfflinePermissionContactView;
import ru.ozon.fintech.features.operations.ui.operationinfo.OperationInfoCardView;
import ru.ozon.uni.android.atom.notification.view.NotificationBarView;
import ru.ozon.uni.atoms.v3.holders.controls.tag.TagButtonHolder;

/* renamed from: Aw.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class ViewOnClickListenerC2448a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1289a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1290b;

    public /* synthetic */ ViewOnClickListenerC2448a(Object obj, int i11) {
        this.f1289a = i11;
        this.f1290b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f1290b;
        switch (this.f1289a) {
            case 0:
                ProductFavoriteExpressMoleculeView._init_$lambda$0((ProductFavoriteExpressMoleculeView) obj, view);
                break;
            case 1:
                ScrollProductViewHolder._init_$lambda$1((ScrollProductViewHolder) obj, view);
                break;
            case 2:
                OperationInfoCardView.b((OperationInfoCardView) obj);
                break;
            case 3:
                ButtonBaseAtom._init_$lambda$1((ButtonBaseAtom) obj, view);
                break;
            case 4:
                Rc0.c.u((Rc0.c) obj);
                break;
            case 5:
                SuggestionViewHolder.setSuggestIconHelperClickListener$lambda$11((SuggestionViewHolder) obj, view);
                break;
            case 6:
                ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.presentation.ScrollProductViewHolder._init_$lambda$1((ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.presentation.ScrollProductViewHolder) obj, view);
                break;
            case 7:
                ProfileGenderBottomSheet.onViewCreated$lambda$4$lambda$1((ProfileGenderBottomSheet) obj, view);
                break;
            case 8:
                CourierOnMapBinder._init_$lambda$0((CourierOnMapBinder) obj, view);
                break;
            case 9:
                SummaryFieldVH.lambda$2$lambda$1((SummaryFieldVH) obj, view);
                break;
            case 10:
                OnboardingFlowFragment.onViewCreated$lambda$0((OnboardingFlowFragment) obj, view);
                break;
            case 11:
                TagButtonHolder.closeIconOnClickListener$lambda$1((TagButtonHolder) obj, view);
                break;
            case 12:
                TravelDateSelectorDialogFragment.initViews$lambda$6((TravelDateSelectorDialogFragment) obj, view);
                break;
            case 13:
                NotificationBarView.setupListeners$lambda$5((NotificationBarView) obj, view);
                break;
            case 14:
                int i11 = ChatButtonFixedLayout.f84436i;
                ((Function0) obj).invoke();
                break;
            case 15:
                ru.ozon.android.messenger.framework.presentation.chatdetail.coupon.a.t((ru.ozon.android.messenger.framework.presentation.chatdetail.coupon.a) obj);
                break;
            case 16:
                OfflinePermissionContactView._init_$lambda$0((OfflinePermissionContactView) obj, view);
                break;
            case 17:
                OptionsVH.lambda$1$lambda$0((OptionsVH) obj, view);
                break;
            default:
                d.c((d) obj);
                break;
        }
    }
}
