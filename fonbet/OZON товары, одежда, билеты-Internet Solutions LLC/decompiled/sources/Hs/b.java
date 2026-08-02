package Hs;

import io.reactivex.C;
import io.reactivex.f;
import kotlin.jvm.functions.Function1;
import qc.g;
import qc.o;
import ru.ozon.app.android.autopicker.view.productpickersearch.data.repo.ProductPickerSearchRepository;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchVO;
import ru.ozon.app.android.domain.session.interactors.AuthInteractorImpl;
import ru.ozon.app.android.favorites.data.api.ChangeFavoriteStateResponse;
import ru.ozon.app.android.favorites.data.service.FavoritesServiceProviderImpl;
import ru.ozon.app.android.payment.ui.createOrderV2.CreateOrderV2Response;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayRepository;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetViewModelImpl;

/* loaded from: classes11.dex */
public final /* synthetic */ class b implements o, g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11228a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f11229b;

    public /* synthetic */ b(Function1 function1, int i11) {
        this.f11228a = i11;
        this.f11229b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f11228a) {
            case 1:
                this.f11229b.invoke(obj);
                break;
            case 2:
                this.f11229b.invoke(obj);
                break;
            case 3:
                this.f11229b.invoke(obj);
                break;
            case 4:
            case 6:
            case 8:
            case 10:
            default:
                this.f11229b.invoke(obj);
                break;
            case 5:
                this.f11229b.invoke(obj);
                break;
            case 7:
                this.f11229b.invoke(obj);
                break;
            case 9:
                this.f11229b.invoke(obj);
                break;
            case 11:
                this.f11229b.invoke(obj);
                break;
            case 12:
                this.f11229b.invoke(obj);
                break;
            case 13:
                this.f11229b.invoke(obj);
                break;
            case 14:
                this.f11229b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        C callActionWithTracking$lambda$1;
        f bindInitial$lambda$4$lambda$0;
        ChangeFavoriteStateResponse addFavorite$lambda$2;
        ProductPickerSearchVO retrieveData$lambda$1$lambda$0;
        CreateOrderV2Response createOrderV2$lambda$3$lambda$2;
        switch (this.f11228a) {
            case 0:
                callActionWithTracking$lambda$1 = AuthInteractorImpl.callActionWithTracking$lambda$1(this.f11229b, obj);
                return callActionWithTracking$lambda$1;
            case 4:
                bindInitial$lambda$4$lambda$0 = YandexSearchSheetViewModelImpl.bindInitial$lambda$4$lambda$0(this.f11229b, obj);
                return bindInitial$lambda$4$lambda$0;
            case 6:
                addFavorite$lambda$2 = FavoritesServiceProviderImpl.addFavorite$lambda$2(this.f11229b, obj);
                return addFavorite$lambda$2;
            case 8:
                retrieveData$lambda$1$lambda$0 = ProductPickerSearchRepository.retrieveData$lambda$1$lambda$0(this.f11229b, obj);
                return retrieveData$lambda$1$lambda$0;
            default:
                createOrderV2$lambda$3$lambda$2 = CreateAndPayRepository.createOrderV2$lambda$3$lambda$2(this.f11229b, obj);
                return createOrderV2$lambda$3$lambda$2;
        }
    }
}
