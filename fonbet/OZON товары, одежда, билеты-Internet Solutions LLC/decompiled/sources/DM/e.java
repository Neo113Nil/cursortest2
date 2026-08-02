package DM;

import io.reactivex.C;
import kotlin.jvm.functions.Function1;
import qc.o;
import qc.q;
import ru.ozon.app.android.favorites.data.favoriteslist.FavoritesListsRepositoryImpl;
import ru.ozon.app.android.favorites.data.shoppinglists.models.CreateFavoritesList;
import ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModel;
import ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModelImpl;
import ru.ozon.app.android.marketing.coupon.data.CouponActivationRepositoryImpl;
import ru.ozon.app.android.pdp.widgets.othersellers.presentation.seller.OtherSellerViewHolder;
import ru.ozon.app.android.ugc.core.widgets.singlereview.commentFooter.actionHandler.CommentFooterViewModel;

/* loaded from: classes10.dex */
public final /* synthetic */ class e implements qc.g, o, q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6249a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f6250b;

    public /* synthetic */ e(Function1 function1, int i11) {
        this.f6249a = i11;
        this.f6250b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f6249a) {
            case 0:
                this.f6250b.invoke(obj);
                break;
            case 1:
                this.f6250b.invoke(obj);
                break;
            case 2:
            case 4:
            case 5:
            case 9:
            default:
                this.f6250b.invoke(obj);
                break;
            case 3:
                this.f6250b.invoke(obj);
                break;
            case 6:
                this.f6250b.invoke(obj);
                break;
            case 7:
                this.f6250b.invoke(obj);
                break;
            case 8:
                this.f6250b.invoke(obj);
                break;
            case 10:
                this.f6250b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        AddressEditMapViewModel.Action.MoveToLocation checkLocationSettings$lambda$14;
        CreateFavoritesList createFavoritesList$lambda$2;
        C activateCode$lambda$0;
        Boolean onAttach$lambda$4;
        switch (this.f6249a) {
            case 2:
                checkLocationSettings$lambda$14 = AddressEditMapViewModelImpl.checkLocationSettings$lambda$14(this.f6250b, obj);
                return checkLocationSettings$lambda$14;
            case 3:
            default:
                onAttach$lambda$4 = OtherSellerViewHolder.onAttach$lambda$4(this.f6250b, obj);
                return onAttach$lambda$4;
            case 4:
                createFavoritesList$lambda$2 = FavoritesListsRepositoryImpl.createFavoritesList$lambda$2(this.f6250b, obj);
                return createFavoritesList$lambda$2;
            case 5:
                activateCode$lambda$0 = CouponActivationRepositoryImpl.activateCode$lambda$0(this.f6250b, obj);
                return activateCode$lambda$0;
        }
    }

    @Override // qc.q
    public boolean test(Object obj) {
        boolean checkAuthorise$lambda$0;
        checkAuthorise$lambda$0 = CommentFooterViewModel.checkAuthorise$lambda$0(this.f6250b, obj);
        return checkAuthorise$lambda$0;
    }
}
