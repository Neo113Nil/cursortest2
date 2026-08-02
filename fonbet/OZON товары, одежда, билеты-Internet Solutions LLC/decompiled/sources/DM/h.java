package DM;

import io.reactivex.C;
import io.reactivex.u;
import kotlin.jvm.functions.Function1;
import qc.o;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.restriction.RestrictionModel;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteentity.FavoriteEntityInteractor;
import ru.ozon.app.android.favorites.domain.favoriteslist.FavoritesListsInteractorImpl;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormViewModelImpl;
import ru.ozon.app.android.geo.addresseditformprompt.data.RecommendPvzRepository;
import ru.ozon.app.android.geo.addresseditformprompt.data.RecommendPvzRepositoryImpl;
import ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModelImpl;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.AviaSearchResultVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.viewModel.AviaSearchResultViewModel;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.TravelRailwaySeatSelectWidgetViewModel;

/* loaded from: classes10.dex */
public final /* synthetic */ class h implements o, qc.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6255a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f6256b;

    public /* synthetic */ h(Function1 function1, int i11) {
        this.f6255a = i11;
        this.f6256b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f6255a) {
            case 3:
                this.f6256b.invoke(obj);
                break;
            case 4:
                this.f6256b.invoke(obj);
                break;
            case 5:
            case 6:
            case 7:
            default:
                this.f6256b.invoke(obj);
                break;
            case 8:
                this.f6256b.invoke(obj);
                break;
            case 9:
                this.f6256b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        AviaSearchResultVO pollFlights$lambda$11;
        u _init_$lambda$1;
        C onDeliverySubmitted$lambda$5$lambda$0;
        RestrictionModel updateFavoriteEntity$lambda$2$lambda$1;
        Object commonActionPerformer$lambda$0;
        C addProductsToFavoritesList$lambda$0;
        RecommendPvzRepository.Result recommendedPvz$lambda$0;
        switch (this.f6255a) {
            case 0:
                pollFlights$lambda$11 = AviaSearchResultViewModel.pollFlights$lambda$11(this.f6256b, obj);
                return pollFlights$lambda$11;
            case 1:
                _init_$lambda$1 = AddressEditMapViewModelImpl._init_$lambda$1(this.f6256b, obj);
                return _init_$lambda$1;
            case 2:
                onDeliverySubmitted$lambda$5$lambda$0 = DocsDeliveryFormViewModelImpl.onDeliverySubmitted$lambda$5$lambda$0(this.f6256b, obj);
                return onDeliverySubmitted$lambda$5$lambda$0;
            case 3:
            case 4:
            default:
                recommendedPvz$lambda$0 = RecommendPvzRepositoryImpl.getRecommendedPvz$lambda$0(this.f6256b, obj);
                return recommendedPvz$lambda$0;
            case 5:
                updateFavoriteEntity$lambda$2$lambda$1 = FavoriteEntityInteractor.updateFavoriteEntity$lambda$2$lambda$1(this.f6256b, obj);
                return updateFavoriteEntity$lambda$2$lambda$1;
            case 6:
                commonActionPerformer$lambda$0 = TravelRailwaySeatSelectWidgetViewModel.commonActionPerformer$lambda$0(this.f6256b, obj);
                return commonActionPerformer$lambda$0;
            case 7:
                addProductsToFavoritesList$lambda$0 = FavoritesListsInteractorImpl.addProductsToFavoritesList$lambda$0(this.f6256b, obj);
                return addProductsToFavoritesList$lambda$0;
        }
    }
}
