package DM;

import io.reactivex.C;
import kotlin.jvm.functions.Function1;
import qc.o;
import ru.ozon.app.android.favorites.data.favoriteslist.FavoritesListsRepositoryImpl;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.data.CheckLegalAddressRepositoryImpl;

/* loaded from: classes10.dex */
public final /* synthetic */ class c implements qc.g, o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6245a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f6246b;

    public /* synthetic */ c(Function1 function1, int i11) {
        this.f6245a = i11;
        this.f6246b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f6245a) {
            case 0:
                this.f6246b.invoke(obj);
                break;
            case 1:
                this.f6246b.invoke(obj);
                break;
            case 2:
                this.f6246b.invoke(obj);
                break;
            case 3:
            case 5:
            default:
                this.f6246b.invoke(obj);
                break;
            case 4:
                this.f6246b.invoke(obj);
                break;
            case 6:
                this.f6246b.invoke(obj);
                break;
            case 7:
                this.f6246b.invoke(obj);
                break;
            case 8:
                this.f6246b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        C checkLegalAddress$lambda$1;
        C createFavoritesList$lambda$0;
        switch (this.f6245a) {
            case 3:
                checkLegalAddress$lambda$1 = CheckLegalAddressRepositoryImpl.checkLegalAddress$lambda$1(this.f6246b, obj);
                return checkLegalAddress$lambda$1;
            default:
                createFavoritesList$lambda$0 = FavoritesListsRepositoryImpl.createFavoritesList$lambda$0(this.f6246b, obj);
                return createFavoritesList$lambda$0;
        }
    }
}
