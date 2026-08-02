package DJ;

import hg.InterfaceC6948a;
import io.reactivex.C;
import io.reactivex.f;
import kotlin.jvm.functions.Function1;
import qc.g;
import qc.o;
import ru.ozon.app.android.autopicker.view.productpickersearch.data.repo.ProductPickerSearchNetworkDataSource;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchVO;
import ru.ozon.app.android.cabinet.activationtitle.presentation.DiscountCodeViewModel;
import ru.ozon.app.android.cart.common.presentation.addToCart.AddToCartViewModel;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.OrderDO;
import ru.ozon.app.android.domain.session.repository.AuthRepository;
import ru.ozon.app.android.favorites.data.service.ChangeFavoriteAnalyticsData;
import ru.ozon.app.android.favorites.data.service.FavoritesServiceProviderImpl;
import ru.ozon.app.android.network.websockets.OzonWebSocketImpl;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayRepository;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements g, o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6236a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f6237b;

    public /* synthetic */ e(Function1 function1, int i11) {
        this.f6236a = i11;
        this.f6237b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f6236a) {
            case 0:
                this.f6237b.invoke(obj);
                break;
            case 2:
                this.f6237b.invoke(obj);
                break;
            case 4:
                this.f6237b.invoke(obj);
                break;
            case 6:
                this.f6237b.invoke(obj);
                break;
            case 8:
                this.f6237b.invoke(obj);
                break;
            case 11:
                this.f6237b.invoke(obj);
                break;
            default:
                this.f6237b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        C sberAuthUrl$lambda$0;
        C _init_$lambda$0;
        InterfaceC6948a sharedSubscription$lambda$0;
        ChangeFavoriteAnalyticsData removeFromFavorites$lambda$6;
        ProductPickerSearchVO retrieveData$lambda$2;
        OrderDO createOrderOrPay$lambda$1$lambda$0;
        f addToCart$lambda$3;
        switch (this.f6236a) {
            case 1:
                sberAuthUrl$lambda$0 = AuthRepository.getSberAuthUrl$lambda$0(this.f6237b, obj);
                return sberAuthUrl$lambda$0;
            case 2:
            case 4:
            case 6:
            case 8:
            default:
                addToCart$lambda$3 = AddToCartViewModel.addToCart$lambda$3(this.f6237b, obj);
                return addToCart$lambda$3;
            case 3:
                _init_$lambda$0 = DiscountCodeViewModel._init_$lambda$0(this.f6237b, obj);
                return _init_$lambda$0;
            case 5:
                sharedSubscription$lambda$0 = OzonWebSocketImpl.sharedSubscription$lambda$0(this.f6237b, obj);
                return sharedSubscription$lambda$0;
            case 7:
                removeFromFavorites$lambda$6 = FavoritesServiceProviderImpl.removeFromFavorites$lambda$6(this.f6237b, obj);
                return removeFromFavorites$lambda$6;
            case 9:
                retrieveData$lambda$2 = ProductPickerSearchNetworkDataSource.retrieveData$lambda$2(this.f6237b, obj);
                return retrieveData$lambda$2;
            case 10:
                createOrderOrPay$lambda$1$lambda$0 = CreateAndPayRepository.createOrderOrPay$lambda$1$lambda$0(this.f6237b, obj);
                return createOrderOrPay$lambda$1$lambda$0;
        }
    }
}
