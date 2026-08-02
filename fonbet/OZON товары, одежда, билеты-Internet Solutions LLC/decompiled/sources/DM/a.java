package DM;

import io.reactivex.C;
import kotlin.jvm.functions.Function1;
import qc.o;
import qc.q;
import ru.ozon.app.android.domain.session.interactors.SberIdInteractorImpl;
import ru.ozon.app.android.favorites.data.favoriteslist.FavoritesListsRepositoryImpl;
import ru.ozon.app.android.favorites.data.shoppinglists.models.FavoriteShareListResponse;
import ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.presentation.ConfirmDeleteOtpViewModel;
import ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.presentation.ConfirmDeleteOtpViewModelImpl;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.AviaSearchResultVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.viewModel.AviaSearchResultViewModel;
import ru.ozon.app.android.web.webview.cache.WebViewResourcesManagerImpl;

/* loaded from: classes10.dex */
public final /* synthetic */ class a implements o, qc.g, q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6241a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f6242b;

    public /* synthetic */ a(Function1 function1, int i11) {
        this.f6241a = i11;
        this.f6242b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f6241a) {
            case 1:
                this.f6242b.invoke(obj);
                break;
            case 2:
            case 3:
            default:
                this.f6242b.invoke(obj);
                break;
            case 4:
                this.f6242b.invoke(obj);
                break;
            case 5:
                this.f6242b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        AviaSearchResultVO.AviaSearchResultItemVO.FlightItemV3 selectLuggage$lambda$1;
        C auth$lambda$3;
        FavoriteShareListResponse shareFavoritesList$lambda$6;
        ConfirmDeleteOtpViewModel.Action processOtpResponse$lambda$4;
        switch (this.f6241a) {
            case 0:
                selectLuggage$lambda$1 = AviaSearchResultViewModel.selectLuggage$lambda$1(this.f6242b, obj);
                return selectLuggage$lambda$1;
            case 2:
                auth$lambda$3 = SberIdInteractorImpl.auth$lambda$3(this.f6242b, obj);
                return auth$lambda$3;
            case 6:
                shareFavoritesList$lambda$6 = FavoritesListsRepositoryImpl.shareFavoritesList$lambda$6(this.f6242b, obj);
                return shareFavoritesList$lambda$6;
            default:
                processOtpResponse$lambda$4 = ConfirmDeleteOtpViewModelImpl.processOtpResponse$lambda$4(this.f6242b, obj);
                return processOtpResponse$lambda$4;
        }
    }

    @Override // qc.q
    public boolean test(Object obj) {
        boolean actualizeCache$lambda$0;
        actualizeCache$lambda$0 = WebViewResourcesManagerImpl.actualizeCache$lambda$0(this.f6242b, obj);
        return actualizeCache$lambda$0;
    }
}
