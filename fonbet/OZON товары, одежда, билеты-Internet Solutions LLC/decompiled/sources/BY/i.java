package BY;

import android.graphics.Bitmap;
import io.reactivex.u;
import kotlin.jvm.functions.Function1;
import qc.o;
import ru.ozon.app.android.domain.session.api.auth.models.Response;
import ru.ozon.app.android.domain.session.repository.mappers.AuthResponseMapper;
import ru.ozon.app.android.marketing.common.coupon.CouponViewModelImpl;
import ru.ozon.app.android.seller.presentation.SellerViewModelImpl;
import ru.ozon.app.android.storefront.stories.story.presentation.BaseStoryFragment;
import ru.ozon.app.android.tabbar.data.RemoteTabConfig;
import ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.presentation.InsurancePanelViewModel;
import ru.ozon.uni.atoms.af.AtomAction;

/* loaded from: classes2.dex */
public final /* synthetic */ class i implements qc.g, o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3317a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f3318b;

    public /* synthetic */ i(Function1 function1, int i11) {
        this.f3317a = i11;
        this.f3318b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f3317a) {
            case 0:
                this.f3318b.invoke(obj);
                break;
            default:
                this.f3318b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        Response handleToken$lambda$0;
        AtomAction performApiAction$lambda$0;
        u _init_$lambda$3;
        RemoteTabConfig tabConfig$lambda$2;
        Bitmap blurredBackground$lambda$1;
        switch (this.f3317a) {
            case 1:
                handleToken$lambda$0 = AuthResponseMapper.handleToken$lambda$0(this.f3318b, obj);
                return handleToken$lambda$0;
            case 2:
            default:
                blurredBackground$lambda$1 = BaseStoryFragment.setBlurredBackground$lambda$1(this.f3318b, obj);
                return blurredBackground$lambda$1;
            case 3:
                performApiAction$lambda$0 = InsurancePanelViewModel.performApiAction$lambda$0(this.f3318b, obj);
                return performApiAction$lambda$0;
            case 4:
                _init_$lambda$3 = CouponViewModelImpl._init_$lambda$3(this.f3318b, obj);
                return _init_$lambda$3;
            case 5:
                tabConfig$lambda$2 = SellerViewModelImpl.getTabConfig$lambda$2(this.f3318b, obj);
                return tabConfig$lambda$2;
        }
    }
}
