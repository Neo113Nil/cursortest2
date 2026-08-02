package CJ;

import io.reactivex.C;
import kotlin.jvm.functions.Function1;
import qc.g;
import qc.o;
import ru.ozon.app.android.favorites.data.favoriteslist.FavoritesListsRepositoryImpl;
import ru.ozon.app.android.favorites.data.shoppinglists.models.FavoriteShareListVO;
import ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.presentation.ConfirmDeleteOtpViewModelImpl;
import ru.ozon.app.android.web.webview.cache.WebViewResourcesManagerImpl;
import ru.ozon.app.android.web.webview.cache.models.BothCacheStates;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements g, o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4535a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f4536b;

    public /* synthetic */ a(Function1 function1, int i11) {
        this.f4535a = i11;
        this.f4536b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f4535a) {
            case 0:
                this.f4536b.invoke(obj);
                break;
            case 1:
                this.f4536b.invoke(obj);
                break;
            case 2:
            case 5:
            default:
                this.f4536b.invoke(obj);
                break;
            case 3:
                this.f4536b.invoke(obj);
                break;
            case 4:
                this.f4536b.invoke(obj);
                break;
            case 6:
                this.f4536b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        BothCacheStates actualizeCache$lambda$1;
        FavoriteShareListVO shareFavoritesList$lambda$7;
        C processOtpResponse$lambda$5;
        switch (this.f4535a) {
            case 2:
                actualizeCache$lambda$1 = WebViewResourcesManagerImpl.actualizeCache$lambda$1(this.f4536b, obj);
                return actualizeCache$lambda$1;
            case 5:
                shareFavoritesList$lambda$7 = FavoritesListsRepositoryImpl.shareFavoritesList$lambda$7(this.f4536b, obj);
                return shareFavoritesList$lambda$7;
            default:
                processOtpResponse$lambda$5 = ConfirmDeleteOtpViewModelImpl.processOtpResponse$lambda$5(this.f4536b, obj);
                return processOtpResponse$lambda$5;
        }
    }
}
