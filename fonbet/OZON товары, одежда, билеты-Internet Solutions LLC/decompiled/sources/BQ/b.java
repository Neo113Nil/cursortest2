package BQ;

import Ve.Bq;
import Ve.C4236f9;
import Ve.C4376k5;
import Ve.C4673ud;
import Ve.Fh;
import Ve.Kd;
import Ve.Na;
import Ve.Se;
import Ve.W6;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.orders.cancel.presentation.CancelReasonFragment;
import ru.ozon.app.android.fresh.unsorted.widgets.profileAvatar.presentation.AvatarPickerView;
import ru.ozon.app.android.marketing.widgets.couponPromo.presentation.dialog.CouponPromoBottomSheetDialog;
import ru.ozon.app.android.storefront.widgets.naviCategories.presentation.big.DoubleNaviCategoriesViewHolder;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.view.AviaCheckTariffsView;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchFormBar.view.SearchFormBarView;
import ru.ozon.composer.ui.view.issue.PageIssueStateView;
import ru.ozon.fintech.features.camera.ui.ScannerErrorResultView;
import ru.ozon.fintech.ui.input.InputView;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3276a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3277b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f3276a = i11;
        this.f3277b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3276a) {
            case 0:
                SearchFormBarView.setUpClickListener$lambda$5((SearchFormBarView) this.f3277b, view);
                break;
            case 1:
                AvatarPickerView.lambda$3$lambda$2((AvatarPickerView) this.f3277b, view);
                break;
            case 2:
                Function0<Unit> h11 = ((PageIssueStateView) this.f3277b).h();
                if (h11 != null) {
                    h11.invoke();
                    break;
                }
                break;
            case 3:
                C4236f9 this$0 = (C4236f9) this.f3277b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((Na) this$0.u()).f0(C4376k5.f31419a);
                break;
            case 4:
                Kd this$02 = (Kd) this.f3277b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                C4673ud c4673ud = (C4673ud) ((Se) this$02.u()).f29971d;
                Fh a11 = c4673ud.a();
                c4673ud.b(new Fh(new Bq(new W6()), 6));
                c4673ud.b(a11);
                break;
            case 5:
                CancelReasonFragment.setupViews$lambda$2$lambda$0((CancelReasonFragment) this.f3277b, view);
                break;
            case 6:
                AviaCheckTariffsView.setupView$lambda$13((AviaCheckTariffsView) this.f3277b, view);
                break;
            case 7:
                ((ScannerErrorResultView) this.f3277b).close();
                break;
            case 8:
                InputView.createSecondIconView$lambda$34$lambda$33((InputView) this.f3277b, view);
                break;
            case 9:
                DoubleNaviCategoriesViewHolder._init_$lambda$1((DoubleNaviCategoriesViewHolder) this.f3277b, view);
                break;
            default:
                ((CouponPromoBottomSheetDialog) this.f3277b).dismiss();
                break;
        }
    }
}
