package IJ;

import io.reactivex.C;
import java.io.File;
import kotlin.jvm.functions.Function1;
import qc.g;
import qc.o;
import qc.q;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.viewmodel.CreateShoppingListViewModel;
import ru.ozon.app.android.pdfviewer.data.FileDownloaderRepositoryImpl;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.StoryV3UpdateStore;
import ru.ozon.app.android.ui.switchingbutton.state.SwitchingButtonStateStorage;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements g, o, q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12093a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f12094b;

    public /* synthetic */ a(Function1 function1, int i11) {
        this.f12093a = i11;
        this.f12094b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f12093a) {
            case 0:
                this.f12094b.invoke(obj);
                break;
            case 1:
                this.f12094b.invoke(obj);
                break;
            case 2:
                this.f12094b.invoke(obj);
                break;
            case 3:
            case 5:
            case 8:
            case 9:
            default:
                this.f12094b.invoke(obj);
                break;
            case 4:
                this.f12094b.invoke(obj);
                break;
            case 6:
                this.f12094b.invoke(obj);
                break;
            case 7:
                this.f12094b.invoke(obj);
                break;
            case 10:
                this.f12094b.invoke(obj);
                break;
            case 11:
                this.f12094b.invoke(obj);
                break;
            case 12:
                this.f12094b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        C createListAndAdd$lambda$0;
        File downloadFile$lambda$0;
        switch (this.f12093a) {
            case 3:
                createListAndAdd$lambda$0 = CreateShoppingListViewModel.createListAndAdd$lambda$0(this.f12094b, obj);
                return createListAndAdd$lambda$0;
            default:
                downloadFile$lambda$0 = FileDownloaderRepositoryImpl.downloadFile$lambda$0(this.f12094b, obj);
                return downloadFile$lambda$0;
        }
    }

    @Override // qc.q
    public boolean test(Object obj) {
        boolean subscribeOnStoryViewed$lambda$1;
        boolean observeState$lambda$0;
        switch (this.f12093a) {
            case 5:
                subscribeOnStoryViewed$lambda$1 = StoryV3UpdateStore.subscribeOnStoryViewed$lambda$1(this.f12094b, obj);
                return subscribeOnStoryViewed$lambda$1;
            default:
                observeState$lambda$0 = SwitchingButtonStateStorage.observeState$lambda$0(this.f12094b, obj);
                return observeState$lambda$0;
        }
    }
}
