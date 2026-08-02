package DM;

import io.reactivex.C;
import kotlin.jvm.functions.Function1;
import qc.o;
import ru.ozon.app.android.cart.common.data.CartAddItemDTO;
import ru.ozon.app.android.favorites.ui.atomactionsheethandlers.FavoritesListAtomActionSheetHandler;
import ru.ozon.app.android.marketing.coupon.data.ApplyCouponResponse;
import ru.ozon.app.android.marketing.coupon.data.CouponActivationRepositoryImpl;
import ru.ozon.app.android.pdp.widgets.othersellers.presentation.seller.OtherSellerViewHolder;

/* loaded from: classes10.dex */
public final /* synthetic */ class f implements qc.g, o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6251a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f6252b;

    public /* synthetic */ f(Function1 function1, int i11) {
        this.f6251a = i11;
        this.f6252b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f6251a) {
            case 0:
                this.f6252b.invoke(obj);
                break;
            case 1:
                this.f6252b.invoke(obj);
                break;
            case 2:
                this.f6252b.invoke(obj);
                break;
            case 3:
                this.f6252b.invoke(obj);
                break;
            case 4:
            default:
                this.f6252b.invoke(obj);
                break;
            case 5:
                this.f6252b.invoke(obj);
                break;
            case 6:
                this.f6252b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        ApplyCouponResponse activateCode$lambda$1;
        CartAddItemDTO addAllToCart$lambda$12;
        C onFavoriteClick$lambda$12$lambda$11;
        switch (this.f6251a) {
            case 4:
                activateCode$lambda$1 = CouponActivationRepositoryImpl.activateCode$lambda$1(this.f6252b, obj);
                return activateCode$lambda$1;
            case 7:
                addAllToCart$lambda$12 = FavoritesListAtomActionSheetHandler.addAllToCart$lambda$12(this.f6252b, obj);
                return addAllToCart$lambda$12;
            default:
                onFavoriteClick$lambda$12$lambda$11 = OtherSellerViewHolder.onFavoriteClick$lambda$12$lambda$11(this.f6252b, obj);
                return onFavoriteClick$lambda$12$lambda$11;
        }
    }
}
