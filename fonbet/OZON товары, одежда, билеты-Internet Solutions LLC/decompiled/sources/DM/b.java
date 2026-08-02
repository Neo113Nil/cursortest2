package DM;

import kotlin.jvm.functions.Function1;
import qc.o;
import qc.q;
import ru.ozon.app.android.favorites.data.favoriteslist.FavoritesListsRepositoryImpl;
import ru.ozon.app.android.pdp.widgets.othersellers.presentation.seller.OtherSellerViewHolder;
import ru.ozon.app.android.storefront.stories.playstories.data.PlayStoriesVO;
import ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories.PlayStoriesViewModelImpl;

/* loaded from: classes10.dex */
public final /* synthetic */ class b implements qc.g, o, q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6243a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f6244b;

    public /* synthetic */ b(Function1 function1, int i11) {
        this.f6243a = i11;
        this.f6244b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f6243a) {
            case 0:
                this.f6244b.invoke(obj);
                break;
            case 1:
                this.f6244b.invoke(obj);
                break;
            case 2:
                this.f6244b.invoke(obj);
                break;
            case 3:
                this.f6244b.invoke(obj);
                break;
            case 4:
            case 5:
            default:
                this.f6244b.invoke(obj);
                break;
            case 6:
                this.f6244b.invoke(obj);
                break;
            case 7:
                this.f6244b.invoke(obj);
                break;
            case 8:
                this.f6244b.invoke(obj);
                break;
            case 9:
                this.f6244b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        io.reactivex.f changeAccess$lambda$10;
        PlayStoriesVO bind$lambda$1;
        switch (this.f6243a) {
            case 4:
                changeAccess$lambda$10 = FavoritesListsRepositoryImpl.changeAccess$lambda$10(this.f6244b, obj);
                return changeAccess$lambda$10;
            default:
                bind$lambda$1 = PlayStoriesViewModelImpl.bind$lambda$1(this.f6244b, obj);
                return bind$lambda$1;
        }
    }

    @Override // qc.q
    public boolean test(Object obj) {
        boolean onAttach$lambda$1;
        onAttach$lambda$1 = OtherSellerViewHolder.onAttach$lambda$1(this.f6244b, obj);
        return onAttach$lambda$1;
    }
}
