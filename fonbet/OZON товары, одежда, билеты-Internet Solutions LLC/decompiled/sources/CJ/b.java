package CJ;

import io.reactivex.C;
import kotlin.jvm.functions.Function1;
import qc.g;
import qc.o;
import ru.ozon.app.android.favorites.data.favoriteslist.FavoritesListsRepositoryImpl;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct.sharedfavoritestate.ProductFavoriteEvent;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct.v4.FavoriteProductMoleculeV4Interactor;
import ru.ozon.app.android.web.webview.cache.WebViewResourcesManagerImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements g, o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4537a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f4538b;

    public /* synthetic */ b(Function1 function1, int i11) {
        this.f4537a = i11;
        this.f4538b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f4537a) {
            case 0:
                this.f4538b.invoke(obj);
                break;
            case 1:
                this.f4538b.invoke(obj);
                break;
            case 2:
            case 6:
            case 7:
            default:
                this.f4538b.invoke(obj);
                break;
            case 3:
                this.f4538b.invoke(obj);
                break;
            case 4:
                this.f4538b.invoke(obj);
                break;
            case 5:
                this.f4538b.invoke(obj);
                break;
            case 8:
                this.f4538b.invoke(obj);
                break;
            case 9:
                this.f4538b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        C actualizeCache$lambda$2;
        C shareFavoritesList$lambda$8;
        ProductFavoriteEvent observeAllFavoritesEvents$lambda$1;
        switch (this.f4537a) {
            case 2:
                actualizeCache$lambda$2 = WebViewResourcesManagerImpl.actualizeCache$lambda$2(this.f4538b, obj);
                return actualizeCache$lambda$2;
            case 6:
                shareFavoritesList$lambda$8 = FavoritesListsRepositoryImpl.shareFavoritesList$lambda$8(this.f4538b, obj);
                return shareFavoritesList$lambda$8;
            default:
                observeAllFavoritesEvents$lambda$1 = FavoriteProductMoleculeV4Interactor.observeAllFavoritesEvents$lambda$1(this.f4538b, obj);
                return observeAllFavoritesEvents$lambda$1;
        }
    }
}
