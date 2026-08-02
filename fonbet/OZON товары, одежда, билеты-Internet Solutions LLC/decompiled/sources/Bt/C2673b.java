package Bt;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import qc.g;
import qc.o;
import ru.ozon.app.android.action.sheet.ActionSheetVO;
import ru.ozon.app.android.action.sheet.ActionSheetViewModelImpl;
import ru.ozon.app.android.autopicker.view.productpickersearch.domain.ProductPickerSearchInteractor;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.localstorage.FavoriteStateStore;

/* renamed from: Bt.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C2673b implements g, o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4046a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f4047b;

    public /* synthetic */ C2673b(Function1 function1, int i11) {
        this.f4046a = i11;
        this.f4047b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f4046a) {
            case 0:
                this.f4047b.invoke(obj);
                break;
            case 1:
                this.f4047b.invoke(obj);
                break;
            case 2:
                this.f4047b.invoke(obj);
                break;
            case 3:
                this.f4047b.invoke(obj);
                break;
            case 4:
            default:
                this.f4047b.invoke(obj);
                break;
            case 5:
                this.f4047b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        Map subscribeOnFavoriteUpdate$lambda$2;
        List observeSearch$lambda$0;
        ActionSheetVO bindInitialRemote$lambda$0;
        switch (this.f4046a) {
            case 4:
                subscribeOnFavoriteUpdate$lambda$2 = FavoriteStateStore.subscribeOnFavoriteUpdate$lambda$2(this.f4047b, obj);
                return subscribeOnFavoriteUpdate$lambda$2;
            case 5:
            default:
                bindInitialRemote$lambda$0 = ActionSheetViewModelImpl.bindInitialRemote$lambda$0(this.f4047b, obj);
                return bindInitialRemote$lambda$0;
            case 6:
                observeSearch$lambda$0 = ProductPickerSearchInteractor.observeSearch$lambda$0(this.f4047b, obj);
                return observeSearch$lambda$0;
        }
    }
}
