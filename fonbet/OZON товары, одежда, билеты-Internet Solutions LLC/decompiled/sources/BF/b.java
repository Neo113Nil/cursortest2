package BF;

import io.reactivex.f;
import io.reactivex.u;
import java.util.List;
import kotlin.jvm.functions.Function1;
import qc.g;
import qc.o;
import qc.q;
import ru.ozon.app.android.favorites.data.favoriteslist.FavoritesListsRepositoryImpl;
import ru.ozon.app.android.favorites.ui.delegate.RemoveFavoritesListDelegate;
import ru.ozon.app.android.fresh.main.widgets.promoCarousel.presentation.PromoCarouselViewHolder;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.data.ConcreteStepCellDataSource;

/* loaded from: classes13.dex */
public final /* synthetic */ class b implements g, o, q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3246a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f3247b;

    public /* synthetic */ b(Function1 function1, int i11) {
        this.f3246a = i11;
        this.f3247b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f3246a) {
            case 0:
                this.f3247b.invoke(obj);
                break;
            case 1:
                this.f3247b.invoke(obj);
                break;
            case 2:
            case 7:
            case 9:
            default:
                this.f3247b.invoke(obj);
                break;
            case 3:
                this.f3247b.invoke(obj);
                break;
            case 4:
                this.f3247b.invoke(obj);
                break;
            case 5:
                this.f3247b.invoke(obj);
                break;
            case 6:
                this.f3247b.invoke(obj);
                break;
            case 8:
                this.f3247b.invoke(obj);
                break;
            case 10:
                this.f3247b.invoke(obj);
                break;
            case 11:
                this.f3247b.invoke(obj);
                break;
            case 12:
                this.f3247b.invoke(obj);
                break;
            case 13:
                this.f3247b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        u startAnimation$lambda$6;
        List subscribeCells$lambda$0;
        f renameFavoritesList$lambda$4;
        switch (this.f3246a) {
            case 2:
                startAnimation$lambda$6 = PromoCarouselViewHolder.startAnimation$lambda$6(this.f3247b, obj);
                return startAnimation$lambda$6;
            case 7:
                subscribeCells$lambda$0 = ConcreteStepCellDataSource.subscribeCells$lambda$0(this.f3247b, obj);
                return subscribeCells$lambda$0;
            default:
                renameFavoritesList$lambda$4 = FavoritesListsRepositoryImpl.renameFavoritesList$lambda$4(this.f3247b, obj);
                return renameFavoritesList$lambda$4;
        }
    }

    @Override // qc.q
    public boolean test(Object obj) {
        boolean _init_$lambda$0;
        _init_$lambda$0 = RemoveFavoritesListDelegate._init_$lambda$0(this.f3247b, obj);
        return _init_$lambda$0;
    }
}
