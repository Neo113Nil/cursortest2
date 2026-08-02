package AF;

import kotlin.jvm.functions.Function1;
import qc.o;
import qc.q;
import ru.ozon.app.android.favorites.domain.favorite.FavoriteInteractorImpl;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.data.AddLegalInnMobileRepository;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.presentation.AddLegalInnMobileVO;
import ru.ozon.app.android.pdp.widgets.helpfulHints.presentation.HelpfulHintsViewModel;

/* loaded from: classes13.dex */
public final /* synthetic */ class b implements qc.g, o, q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f609a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f610b;

    public /* synthetic */ b(Function1 function1, int i11) {
        this.f609a = i11;
        this.f610b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f609a) {
            case 0:
                this.f610b.invoke(obj);
                break;
            case 1:
                this.f610b.invoke(obj);
                break;
            case 2:
                this.f610b.invoke(obj);
                break;
            case 3:
                this.f610b.invoke(obj);
                break;
            case 4:
                this.f610b.invoke(obj);
                break;
            case 5:
            case 7:
            case 9:
            default:
                this.f610b.invoke(obj);
                break;
            case 6:
                this.f610b.invoke(obj);
                break;
            case 8:
                this.f610b.invoke(obj);
                break;
            case 10:
                this.f610b.invoke(obj);
                break;
            case 11:
                this.f610b.invoke(obj);
                break;
            case 12:
                this.f610b.invoke(obj);
                break;
            case 13:
                this.f610b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        AddLegalInnMobileVO.StateVO legalsByInn$lambda$0;
        Boolean isFavorite$lambda$14;
        switch (this.f609a) {
            case 5:
                legalsByInn$lambda$0 = AddLegalInnMobileRepository.getLegalsByInn$lambda$0(this.f610b, obj);
                return legalsByInn$lambda$0;
            default:
                isFavorite$lambda$14 = FavoriteInteractorImpl.isFavorite$lambda$14(this.f610b, obj);
                return isFavorite$lambda$14;
        }
    }

    @Override // qc.q
    public boolean test(Object obj) {
        boolean observeFavorites$lambda$2;
        observeFavorites$lambda$2 = HelpfulHintsViewModel.observeFavorites$lambda$2(this.f610b, obj);
        return observeFavorites$lambda$2;
    }
}
