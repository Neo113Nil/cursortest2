package Ty;

import kotlin.jvm.functions.Function1;
import qc.o;
import ru.ozon.app.android.composer.network.cache.ClearCacheReason;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct.FavoriteProductMoleculeInteractor;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct.sharedfavoritestate.ProductFavoriteEvent;
import ru.ozon.app.android.initializers.cache.ComposerCacheInvalidatorInitializer;

/* loaded from: classes6.dex */
public final /* synthetic */ class g implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27231a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f27232b;

    public /* synthetic */ g(Function1 function1, int i11) {
        this.f27231a = i11;
        this.f27232b = function1;
    }

    @Override // qc.o
    public final Object apply(Object obj) {
        ClearCacheReason addressState$lambda$7;
        ProductFavoriteEvent observeOutFavoritesEvents$lambda$1;
        switch (this.f27231a) {
            case 0:
                addressState$lambda$7 = ComposerCacheInvalidatorInitializer.getAddressState$lambda$7(this.f27232b, obj);
                return addressState$lambda$7;
            default:
                observeOutFavoritesEvents$lambda$1 = FavoriteProductMoleculeInteractor.observeOutFavoritesEvents$lambda$1(this.f27232b, obj);
                return observeOutFavoritesEvents$lambda$1;
        }
    }
}
