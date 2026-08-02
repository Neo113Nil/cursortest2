package GH;

import io.reactivex.C;
import kotlin.jvm.functions.Function1;
import qc.g;
import qc.o;
import ru.ozon.app.android.cart.alltocart.presentation.AllToCartViewModel;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct.FavoriteProductMoleculeInteractor;
import ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModelImpl;
import ru.ozon.app.android.mapcommon.map.model.CoordinateModel;

/* loaded from: classes13.dex */
public final /* synthetic */ class b implements g, o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9822a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f9823b;

    public /* synthetic */ b(Function1 function1, int i11) {
        this.f9822a = i11;
        this.f9823b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f9822a) {
            case 0:
                this.f9823b.invoke(obj);
                break;
            case 1:
            case 5:
            case 8:
            default:
                this.f9823b.invoke(obj);
                break;
            case 2:
                this.f9823b.invoke(obj);
                break;
            case 3:
                this.f9823b.invoke(obj);
                break;
            case 4:
                this.f9823b.invoke(obj);
                break;
            case 6:
                this.f9823b.invoke(obj);
                break;
            case 7:
                this.f9823b.invoke(obj);
                break;
            case 9:
                this.f9823b.invoke(obj);
                break;
            case 10:
                this.f9823b.invoke(obj);
                break;
            case 11:
                this.f9823b.invoke(obj);
                break;
            case 12:
                this.f9823b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        CoordinateModel defineUserLocation$lambda$11;
        C addAllSkuAction$lambda$4;
        FavoriteProductMolecule onFavoriteChanged$lambda$5$lambda$2;
        switch (this.f9822a) {
            case 1:
                defineUserLocation$lambda$11 = AddressEditMapViewModelImpl.defineUserLocation$lambda$11(this.f9823b, obj);
                return defineUserLocation$lambda$11;
            case 5:
                addAllSkuAction$lambda$4 = AllToCartViewModel.addAllSkuAction$lambda$4(this.f9823b, obj);
                return addAllSkuAction$lambda$4;
            default:
                onFavoriteChanged$lambda$5$lambda$2 = FavoriteProductMoleculeInteractor.onFavoriteChanged$lambda$5$lambda$2(this.f9823b, obj);
                return onFavoriteChanged$lambda$5$lambda$2;
        }
    }
}
