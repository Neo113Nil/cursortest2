package AJ;

import com.google.common.util.concurrent.m;
import io.reactivex.C;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qc.g;
import qc.o;
import ru.ozon.app.android.autopicker.view.productpickersearch.data.repo.ProductPickerSearchNetworkDataSource;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchVO;
import ru.ozon.app.android.cart.common.presentation.addToCart.AddToCartViewModel;
import ru.ozon.app.android.favorites.data.api.ChangeFavoriteStateResponse;
import ru.ozon.app.android.favorites.data.service.FavoritesServiceProviderImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements g, I.a, o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f638a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f639b;

    public /* synthetic */ d(Function1 function1, int i11) {
        this.f638a = i11;
        this.f639b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f638a) {
            case 0:
                this.f639b.invoke(obj);
                break;
            case 1:
                this.f639b.invoke(obj);
                break;
            case 2:
                this.f639b.invoke(obj);
                break;
            case 3:
            case 4:
            case 6:
            case 7:
            case 11:
            default:
                this.f639b.invoke(obj);
                break;
            case 5:
                this.f639b.invoke(obj);
                break;
            case 8:
                this.f639b.invoke(obj);
                break;
            case 9:
                this.f639b.invoke(obj);
                break;
            case 10:
                this.f639b.invoke(obj);
                break;
            case 12:
                this.f639b.invoke(obj);
                break;
        }
    }

    @Override // I.a, qc.o
    public m apply(Object obj) {
        Function1 tmp0 = this.f639b;
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (m) tmp0.invoke(obj);
    }

    @Override // qc.o
    public Object apply(Object obj) {
        ChangeFavoriteStateResponse removeFromFavorites$lambda$5;
        ProductPickerSearchVO retrieveData$lambda$1;
        C addToCart$lambda$2;
        switch (this.f638a) {
            case 6:
                removeFromFavorites$lambda$5 = FavoritesServiceProviderImpl.removeFromFavorites$lambda$5(this.f639b, obj);
                return removeFromFavorites$lambda$5;
            case 7:
                retrieveData$lambda$1 = ProductPickerSearchNetworkDataSource.retrieveData$lambda$1(this.f639b, obj);
                return retrieveData$lambda$1;
            default:
                addToCart$lambda$2 = AddToCartViewModel.addToCart$lambda$2(this.f639b, obj);
                return addToCart$lambda$2;
        }
    }
}
