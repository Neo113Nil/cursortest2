package BF;

import kotlin.jvm.functions.Function1;
import qc.g;
import qc.o;
import ru.ozon.app.android.cabinet.deeplink.TechLoginDeeplinkHandler;
import ru.ozon.app.android.domain.session.state.AuthState;
import ru.ozon.app.android.favorites.data.favoriteslist.FavoritesListsRepositoryImpl;
import ru.ozon.app.android.favorites.data.shoppinglists.models.RenameFavoritesListResponse;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.viewModel.AviaSearchResultViewModel;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements g, o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3244a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f3245b;

    public /* synthetic */ a(Function1 function1, int i11) {
        this.f3244a = i11;
        this.f3245b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f3244a) {
            case 0:
                this.f3245b.invoke(obj);
                break;
            case 1:
                this.f3245b.invoke(obj);
                break;
            case 2:
            case 4:
            case 6:
            default:
                this.f3245b.invoke(obj);
                break;
            case 3:
                this.f3245b.invoke(obj);
                break;
            case 5:
                this.f3245b.invoke(obj);
                break;
            case 7:
                this.f3245b.invoke(obj);
                break;
            case 8:
                this.f3245b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        Object handleAction$lambda$18;
        AuthState callAction$lambda$0;
        RenameFavoritesListResponse renameFavoritesList$lambda$3;
        switch (this.f3244a) {
            case 2:
                handleAction$lambda$18 = AviaSearchResultViewModel.handleAction$lambda$18(this.f3245b, obj);
                return handleAction$lambda$18;
            case 3:
            default:
                renameFavoritesList$lambda$3 = FavoritesListsRepositoryImpl.renameFavoritesList$lambda$3(this.f3245b, obj);
                return renameFavoritesList$lambda$3;
            case 4:
                callAction$lambda$0 = TechLoginDeeplinkHandler.callAction$lambda$0(this.f3245b, obj);
                return callAction$lambda$0;
        }
    }
}
