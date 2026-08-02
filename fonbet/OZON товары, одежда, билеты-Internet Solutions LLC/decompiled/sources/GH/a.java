package GH;

import io.reactivex.C;
import kotlin.jvm.functions.Function1;
import qc.g;
import qc.o;
import qc.q;
import ru.ozon.app.android.checkoutcomposer.total.sticky.v2.presentation.TotalStickyV2ViewModel;
import ru.ozon.app.android.favorites.domain.favoriteslist.FavoritesListsInteractorImpl;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.presentation.AddLegalInnMobileViewModel;
import ru.ozon.app.android.fresh.unsorted.widgets.tagList.presentation.TagListView;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.core.HighlightsWrapperStateManagerImpl;
import ru.ozon.app.android.travel.actionhandler.travelResultAction.TravelResultActionHandler;
import ru.ozon.app.android.travel.actionhandler.travelResultAction.TravelResultActionResponseVO;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements g, q, TagListView.ClickCallback, o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9820a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f9821b;

    public /* synthetic */ a(Function1 function1, int i11) {
        this.f9820a = i11;
        this.f9821b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f9820a) {
            case 0:
                this.f9821b.invoke(obj);
                break;
            case 1:
                this.f9821b.invoke(obj);
                break;
            case 2:
            case 4:
            case 6:
            case 7:
            case 8:
            case 13:
            default:
                this.f9821b.invoke(obj);
                break;
            case 3:
                this.f9821b.invoke(obj);
                break;
            case 5:
                this.f9821b.invoke(obj);
                break;
            case 9:
                this.f9821b.invoke(obj);
                break;
            case 10:
                this.f9821b.invoke(obj);
                break;
            case 11:
                this.f9821b.invoke(obj);
                break;
            case 12:
                this.f9821b.invoke(obj);
                break;
            case 14:
                this.f9821b.invoke(obj);
                break;
            case 15:
                this.f9821b.invoke(obj);
                break;
            case 16:
                this.f9821b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        C _init_$lambda$0;
        TravelResultActionResponseVO processAction$lambda$0;
        C removeProductFromFavoritesList$lambda$1;
        switch (this.f9820a) {
            case 7:
                _init_$lambda$0 = AddLegalInnMobileViewModel._init_$lambda$0(this.f9821b, obj);
                return _init_$lambda$0;
            case 8:
                processAction$lambda$0 = TravelResultActionHandler.processAction$lambda$0(this.f9821b, obj);
                return processAction$lambda$0;
            default:
                removeProductFromFavoritesList$lambda$1 = FavoritesListsInteractorImpl.removeProductFromFavoritesList$lambda$1(this.f9821b, obj);
                return removeProductFromFavoritesList$lambda$1;
        }
    }

    @Override // qc.q
    public boolean test(Object obj) {
        boolean observeCart$lambda$3;
        boolean _init_$lambda$0;
        switch (this.f9820a) {
            case 2:
                observeCart$lambda$3 = HighlightsWrapperStateManagerImpl.observeCart$lambda$3(this.f9821b, obj);
                return observeCart$lambda$3;
            default:
                _init_$lambda$0 = TotalStickyV2ViewModel._init_$lambda$0(this.f9821b, obj);
                return _init_$lambda$0;
        }
    }
}
