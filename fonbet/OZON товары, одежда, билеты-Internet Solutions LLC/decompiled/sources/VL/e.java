package VL;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import qc.g;
import qc.o;
import ru.ozon.app.android.account.favorites.seller.SellerFavoriteServiceImpl;

/* loaded from: classes7.dex */
public final /* synthetic */ class e implements g, o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f28456a;

    public /* synthetic */ e(Function1 function1) {
        this.f28456a = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        this.f28456a.invoke(obj);
    }

    @Override // qc.o
    public Object apply(Object obj) {
        Map fillSellerFavoritesCache$lambda$17;
        fillSellerFavoritesCache$lambda$17 = SellerFavoriteServiceImpl.fillSellerFavoritesCache$lambda$17(this.f28456a, obj);
        return fillSellerFavoritesCache$lambda$17;
    }
}
