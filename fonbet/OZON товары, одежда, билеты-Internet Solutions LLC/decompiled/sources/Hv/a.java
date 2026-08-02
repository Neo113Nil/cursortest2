package Hv;

import Jb0.i;
import android.view.View;
import kotlin.jvm.functions.Function1;
import ld0.x;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.selectorsheet.SelectorOptionsAdapter;
import ru.ozon.app.android.cml.delivery.widgets.inputCurtain.presentation.InputCurtainViewHolder;
import ru.ozon.app.android.error.summary.presentation.ErrorSummaryFragment;
import ru.ozon.app.android.error.summary.presentation.ErrorSummaryView;
import ru.ozon.app.android.fresh.geo.widgets.orderInfo.presentation.OrderInfoViewHolder;
import ru.ozon.app.android.fresh.main.widgets.fakeSearchButton.presentation.FakeSearchVO;
import ru.ozon.app.android.fresh.main.widgets.fakeSearchButton.presentation.FakeSearchView;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bContactUs.presentation.B2bContactUsVO;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bContactUs.presentation.B2bContactUsWidgetViewHolder;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInputLayout;
import ru.ozon.uni.atoms.af.AtomAction;

/* loaded from: classes12.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11236a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11237b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11238c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f11236a = i11;
        this.f11237b = obj;
        this.f11238c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f11236a) {
            case 0:
                OrderInfoViewHolder.bind$lambda$7$lambda$6$lambda$5((OrderInfoViewHolder) this.f11237b, (AtomAction) this.f11238c, view);
                break;
            case 1:
                ErrorSummaryFragment.initButtonClickListeners$lambda$9$lambda$8((ErrorSummaryView) this.f11237b, (ErrorSummaryFragment) this.f11238c, view);
                break;
            case 2:
                InputCurtainViewHolder.lambda$1$lambda$0((OzonTextInputLayout) this.f11237b, (InputCurtainViewHolder) this.f11238c, view);
                break;
            case 3:
                FakeSearchView.bind$lambda$10$lambda$9((Function1) this.f11237b, (FakeSearchVO) this.f11238c, view);
                break;
            case 4:
                B2bContactUsWidgetViewHolder.bindBanner$lambda$2$lambda$1((B2bContactUsWidgetViewHolder) this.f11237b, (B2bContactUsVO.BannerVO) this.f11238c, view);
                break;
            case 5:
                x.w((x) this.f11237b, (i) this.f11238c);
                break;
            default:
                SelectorOptionsAdapter.onCreateViewHolder$lambda$3$lambda$2((SelectorOptionsAdapter.SelectorOptionVH) this.f11237b, (SelectorOptionsAdapter) this.f11238c, view);
                break;
        }
    }
}
