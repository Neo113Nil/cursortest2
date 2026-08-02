package Gy;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import org.joda.time.LocalDate;
import qc.g;
import qc.o;
import qc.q;
import ru.ozon.app.android.cabinet.profiledatasettings.presentation.viewmodel.ProfileDataSettingsViewModel;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.FavoriteChangeResponse;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct.FavoriteProductMoleculeInteractor;
import ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModel;
import ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModelImpl;
import ru.ozon.app.android.marketing.widgets.couponList.presentation.CouponBlockViewHolder;
import ru.ozon.app.android.product.molecules.countbutton.presentation.CountButtonViewModelImpl;
import ru.ozon.app.android.travel.map.viewModel.HotelMapInfoViewModel;

/* loaded from: classes12.dex */
public final /* synthetic */ class c implements o, g, q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10326a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f10327b;

    public /* synthetic */ c(Function1 function1, int i11) {
        this.f10326a = i11;
        this.f10327b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f10326a) {
            case 2:
                this.f10327b.invoke(obj);
                break;
            case 6:
                this.f10327b.invoke(obj);
                break;
            default:
                this.f10327b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        AddressEditMapViewModel.Action.MoveToLocation fetchAndMoveToLastLocation$lambda$7;
        Map attach$lambda$1;
        LocalDate userBirthday$lambda$0;
        HotelMapInfoViewModel.Action.MoveToLocation checkLocationSettings$lambda$3;
        FavoriteChangeResponse processFavoriteChange$lambda$9;
        switch (this.f10326a) {
            case 0:
                fetchAndMoveToLastLocation$lambda$7 = AddressEditMapViewModelImpl.fetchAndMoveToLastLocation$lambda$7(this.f10327b, obj);
                return fetchAndMoveToLastLocation$lambda$7;
            case 1:
                attach$lambda$1 = CountButtonViewModelImpl.attach$lambda$1(this.f10327b, obj);
                return attach$lambda$1;
            case 2:
            default:
                processFavoriteChange$lambda$9 = FavoriteProductMoleculeInteractor.processFavoriteChange$lambda$9(this.f10327b, obj);
                return processFavoriteChange$lambda$9;
            case 3:
                userBirthday$lambda$0 = ProfileDataSettingsViewModel.getUserBirthday$lambda$0(this.f10327b, obj);
                return userBirthday$lambda$0;
            case 4:
                checkLocationSettings$lambda$3 = HotelMapInfoViewModel.checkLocationSettings$lambda$3(this.f10327b, obj);
                return checkLocationSettings$lambda$3;
        }
    }

    @Override // qc.q
    public boolean test(Object obj) {
        boolean observeActivatedCoupons$lambda$6;
        observeActivatedCoupons$lambda$6 = CouponBlockViewHolder.observeActivatedCoupons$lambda$6(this.f10327b, obj);
        return observeActivatedCoupons$lambda$6;
    }
}
