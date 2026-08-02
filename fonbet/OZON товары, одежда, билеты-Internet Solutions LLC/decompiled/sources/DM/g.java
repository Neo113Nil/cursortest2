package DM;

import io.reactivex.C;
import kotlin.jvm.functions.Function1;
import qc.o;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.updatefavorite.UpdateFavoriteResponse;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteentity.FavoriteEntityInteractor;
import ru.ozon.app.android.marketing.coupon.data.CouponActivationRepositoryImpl;
import ru.ozon.app.android.marketing.coupon.domain.CouponResponse;
import ru.ozon.app.android.partpayment.formpage.view.vo.VerifySmsVO;
import ru.ozon.app.android.partpayment.smssign.data.SmsSignRepository;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.viewModel.AviaSearchResultViewModel;

/* loaded from: classes10.dex */
public final /* synthetic */ class g implements o, qc.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6253a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f6254b;

    public /* synthetic */ g(Function1 function1, int i11) {
        this.f6253a = i11;
        this.f6254b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f6253a) {
            case 1:
                this.f6254b.invoke(obj);
                break;
            case 2:
                this.f6254b.invoke(obj);
                break;
            case 3:
            case 4:
            default:
                this.f6254b.invoke(obj);
                break;
            case 5:
                this.f6254b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        C pollFlights$lambda$10;
        CouponResponse callApi$lambda$4;
        VerifySmsVO validateSmsCode$lambda$0;
        UpdateFavoriteResponse updateFavoriteEntity$lambda$2$lambda$0;
        switch (this.f6253a) {
            case 0:
                pollFlights$lambda$10 = AviaSearchResultViewModel.pollFlights$lambda$10(this.f6254b, obj);
                return pollFlights$lambda$10;
            case 1:
            case 2:
            default:
                updateFavoriteEntity$lambda$2$lambda$0 = FavoriteEntityInteractor.updateFavoriteEntity$lambda$2$lambda$0(this.f6254b, obj);
                return updateFavoriteEntity$lambda$2$lambda$0;
            case 3:
                callApi$lambda$4 = CouponActivationRepositoryImpl.callApi$lambda$4(this.f6254b, obj);
                return callApi$lambda$4;
            case 4:
                validateSmsCode$lambda$0 = SmsSignRepository.validateSmsCode$lambda$0(this.f6254b, obj);
                return validateSmsCode$lambda$0;
        }
    }
}
