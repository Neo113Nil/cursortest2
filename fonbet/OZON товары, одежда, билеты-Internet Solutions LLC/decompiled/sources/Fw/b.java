package Fw;

import io.reactivex.C;
import kotlin.jvm.functions.Function1;
import qc.g;
import qc.o;
import qc.q;
import ru.ozon.app.android.common.filterWidgets.filtervalues.data.FilterValuesRepository;
import ru.ozon.app.android.favorites.data.favoriteslist.FavoritesListsRepositoryImpl;
import ru.ozon.app.android.favorites.data.shoppinglists.models.CreateFavoritesListResponse;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.data.CheckLegalAddressRepositoryImpl;
import ru.ozon.app.android.marketing.coupon.data.CouponActivationRepositoryImpl;
import ru.ozon.app.android.marketing.widgets.couponPromo.presentation.CouponPromoViewHolder;
import ru.ozon.app.android.pdp.widgets.othersellers.presentation.seller.OtherSellerViewHolder;

/* loaded from: classes12.dex */
public final /* synthetic */ class b implements g, o, q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9565a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f9566b;

    public /* synthetic */ b(Function1 function1, int i11) {
        this.f9565a = i11;
        this.f9566b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f9565a) {
            case 0:
                this.f9566b.invoke(obj);
                break;
            case 1:
                this.f9566b.invoke(obj);
                break;
            case 2:
            case 3:
            case 5:
            case 7:
            default:
                this.f9566b.invoke(obj);
                break;
            case 4:
                this.f9566b.invoke(obj);
                break;
            case 6:
                this.f9566b.invoke(obj);
                break;
            case 8:
                this.f9566b.invoke(obj);
                break;
            case 9:
                this.f9566b.invoke(obj);
                break;
            case 10:
                this.f9566b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        C executeApplySearchFilters$lambda$1;
        String checkLegalAddress$lambda$2;
        CreateFavoritesListResponse createFavoritesList$lambda$1;
        C applyCoupon$lambda$3;
        switch (this.f9565a) {
            case 2:
                executeApplySearchFilters$lambda$1 = FilterValuesRepository.executeApplySearchFilters$lambda$1(this.f9566b, obj);
                return executeApplySearchFilters$lambda$1;
            case 3:
                checkLegalAddress$lambda$2 = CheckLegalAddressRepositoryImpl.checkLegalAddress$lambda$2(this.f9566b, obj);
                return checkLegalAddress$lambda$2;
            case 4:
            default:
                applyCoupon$lambda$3 = CouponActivationRepositoryImpl.applyCoupon$lambda$3(this.f9566b, obj);
                return applyCoupon$lambda$3;
            case 5:
                createFavoritesList$lambda$1 = FavoritesListsRepositoryImpl.createFavoritesList$lambda$1(this.f9566b, obj);
                return createFavoritesList$lambda$1;
        }
    }

    @Override // qc.q
    public boolean test(Object obj) {
        boolean onAttach$lambda$3;
        boolean observeActivateResult$lambda$10;
        switch (this.f9565a) {
            case 12:
                onAttach$lambda$3 = OtherSellerViewHolder.onAttach$lambda$3(this.f9566b, obj);
                return onAttach$lambda$3;
            default:
                observeActivateResult$lambda$10 = CouponPromoViewHolder.observeActivateResult$lambda$10(this.f9566b, obj);
                return observeActivateResult$lambda$10;
        }
    }
}
