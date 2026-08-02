package Hs;

import io.reactivex.C;
import io.reactivex.f;
import kotlin.jvm.functions.Function1;
import qc.g;
import qc.o;
import ru.ozon.app.android.domain.session.interactors.BiometryInteractorImpl;
import ru.ozon.app.android.favorites.data.favoriteslist.FavoritesListsRepositoryImpl;

/* loaded from: classes11.dex */
public final /* synthetic */ class e implements o, g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11234a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f11235b;

    public /* synthetic */ e(Function1 function1, int i11) {
        this.f11234a = i11;
        this.f11235b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f11234a) {
            case 1:
                this.f11235b.invoke(obj);
                break;
            case 2:
                this.f11235b.invoke(obj);
                break;
            case 3:
                this.f11235b.invoke(obj);
                break;
            case 4:
            default:
                this.f11235b.invoke(obj);
                break;
            case 5:
                this.f11235b.invoke(obj);
                break;
            case 6:
                this.f11235b.invoke(obj);
                break;
            case 7:
                this.f11235b.invoke(obj);
                break;
            case 8:
                this.f11235b.invoke(obj);
                break;
            case 9:
                this.f11235b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        C auth$lambda$1;
        f removeFavoritesList$lambda$5;
        switch (this.f11234a) {
            case 0:
                auth$lambda$1 = BiometryInteractorImpl.auth$lambda$1(this.f11235b, obj);
                return auth$lambda$1;
            default:
                removeFavoritesList$lambda$5 = FavoritesListsRepositoryImpl.removeFavoritesList$lambda$5(this.f11235b, obj);
                return removeFavoritesList$lambda$5;
        }
    }
}
