package Hs;

import com.google.android.gms.tasks.OnSuccessListener;
import io.reactivex.C;
import io.reactivex.f;
import java.util.List;
import kotlin.jvm.functions.Function1;
import qc.g;
import qc.o;
import qc.q;
import ru.ozon.app.android.domain.session.interactors.BiometryInteractorImpl;
import ru.ozon.app.android.favorites.data.favoriteslist.FavoritesListsRepositoryImpl;
import ru.ozon.app.android.favorites.data.service.FavoritesServiceProviderImpl;
import ru.ozon.app.android.pdp.ui.configurators.pdp.PdpConfigurator;

/* loaded from: classes11.dex */
public final /* synthetic */ class d implements o, g, OnSuccessListener, q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11232a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f11233b;

    public /* synthetic */ d(Function1 function1, int i11) {
        this.f11232a = i11;
        this.f11233b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f11232a) {
            case 1:
                this.f11233b.invoke(obj);
                break;
            case 2:
                this.f11233b.invoke(obj);
                break;
            case 3:
                this.f11233b.invoke(obj);
                break;
            case 4:
            case 5:
            case 7:
            default:
                this.f11233b.invoke(obj);
                break;
            case 6:
                this.f11233b.invoke(obj);
                break;
            case 8:
                this.f11233b.invoke(obj);
                break;
            case 9:
                this.f11233b.invoke(obj);
                break;
            case 10:
                this.f11233b.invoke(obj);
                break;
            case 11:
                this.f11233b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        C auth$lambda$0;
        f changePinStatus$lambda$9;
        List checkFavorite$lambda$0;
        switch (this.f11232a) {
            case 0:
                auth$lambda$0 = BiometryInteractorImpl.auth$lambda$0(this.f11233b, obj);
                return auth$lambda$0;
            case 4:
                changePinStatus$lambda$9 = FavoritesListsRepositoryImpl.changePinStatus$lambda$9(this.f11233b, obj);
                return changePinStatus$lambda$9;
            default:
                checkFavorite$lambda$0 = FavoritesServiceProviderImpl.checkFavorite$lambda$0(this.f11233b, obj);
                return checkFavorite$lambda$0;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        this.f11233b.invoke(obj);
    }

    @Override // qc.q
    public boolean test(Object obj) {
        boolean observeChangeFavoritesEvents$lambda$7;
        observeChangeFavoritesEvents$lambda$7 = PdpConfigurator.observeChangeFavoritesEvents$lambda$7(this.f11233b, obj);
        return observeChangeFavoritesEvents$lambda$7;
    }
}
