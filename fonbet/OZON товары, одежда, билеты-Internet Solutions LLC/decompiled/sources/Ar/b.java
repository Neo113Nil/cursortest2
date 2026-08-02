package Ar;

import android.view.View;
import kotlin.jvm.functions.Function0;
import ld0.C7931F;
import ru.ozon.android.messenger.blocks.onboarding.e;
import ru.ozon.app.android.commonwidgets.widgets.themeSelector.ThemeSelectorWidgetViewHolder;
import ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.presentation.multipleCarriageTrain.adapter.HeadCarriageViewHolder;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation.DeliveryWidgetV3View;
import ru.ozon.app.android.partpayment.landing.limit.view.FormPageLandingLimitVH;
import ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.presentation.ConfirmDeleteOtpWidgetView;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.rv.BaseUwGridOneViewHolder;
import ru.ozon.app.android.yandexsearchsheet.adapter.YandexSuggestionsAdapter;
import ru.ozon.fintech.features.demo.ui.account.DemoAccountItemView;
import ru.ozon.fintech.features.pinpad.presentation.pinpad.PinPadFragment;

/* loaded from: classes11.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1261a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1262b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f1261a = i11;
        this.f1262b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1261a) {
            case 0:
                ThemeSelectorWidgetViewHolder.lambda$1$lambda$0((ThemeSelectorWidgetViewHolder) this.f1262b, view);
                break;
            case 1:
                DemoAccountItemView._init_$lambda$1((DemoAccountItemView) this.f1262b, view);
                break;
            case 2:
                BaseUwGridOneViewHolder._init_$lambda$3((BaseUwGridOneViewHolder) this.f1262b, view);
                break;
            case 3:
                PinPadFragment.I((PinPadFragment) this.f1262b);
                break;
            case 4:
                YandexSuggestionsAdapter.SuggestionInfoViewHolder._init_$lambda$1((YandexSuggestionsAdapter.SuggestionInfoViewHolder) this.f1262b, view);
                break;
            case 5:
                FormPageLandingLimitVH._init_$lambda$2((FormPageLandingLimitVH) this.f1262b, view);
                break;
            case 6:
                DeliveryWidgetV3View.bind$lambda$27((Function0) this.f1262b, view);
                break;
            case 7:
                C7931F.u((C7931F) this.f1262b);
                break;
            case 8:
                HeadCarriageViewHolder._init_$lambda$1((HeadCarriageViewHolder) this.f1262b, view);
                break;
            case 9:
                e.b((e) this.f1262b);
                break;
            default:
                ConfirmDeleteOtpWidgetView.lambda$3$lambda$2((ConfirmDeleteOtpWidgetView) this.f1262b, view);
                break;
        }
    }
}
