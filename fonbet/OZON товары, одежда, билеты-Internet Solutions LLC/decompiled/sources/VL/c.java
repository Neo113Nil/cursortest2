package VL;

import io.reactivex.C;
import kotlin.jvm.functions.Function1;
import qc.o;
import ru.ozon.app.android.account.favorites.seller.SellerFavoriteServiceImpl;
import ru.ozon.app.android.tabbar.data.TabConfig;
import ru.ozon.app.android.tabbar.data.TabConfigManagerImpl;

/* loaded from: classes7.dex */
public final /* synthetic */ class c implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28452a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f28453b;

    public /* synthetic */ c(Function1 function1, int i11) {
        this.f28452a = i11;
        this.f28453b = function1;
    }

    @Override // qc.o
    public final Object apply(Object obj) {
        TabConfig loadCachedConfig$lambda$5;
        C _init_$lambda$0;
        switch (this.f28452a) {
            case 0:
                loadCachedConfig$lambda$5 = TabConfigManagerImpl.loadCachedConfig$lambda$5(this.f28453b, obj);
                return loadCachedConfig$lambda$5;
            default:
                _init_$lambda$0 = SellerFavoriteServiceImpl._init_$lambda$0(this.f28453b, obj);
                return _init_$lambda$0;
        }
    }
}
