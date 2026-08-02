package N9;

import com.esiasdk.android.EsiaAuthActivity;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.search.dialogsearchscreen.withTopFilters.DialogSearchTopFiltersFragment;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.presentation.input.FeedbackInputV2ViewHolder;
import ru.ozon.app.android.tabbar.ui.BottomNavigationController;

/* loaded from: classes9.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18800a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18801b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f18800a = i11;
        this.f18801b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f18801b;
        switch (this.f18800a) {
            case 0:
                com.journeyapps.barcodescanner.g.c((com.journeyapps.barcodescanner.g) obj);
                break;
            case 1:
                BottomNavigationController.hideWithTranslationAnimation$lambda$9((BottomNavigationController) obj);
                break;
            case 2:
                ((DialogSearchTopFiltersFragment) obj).goToPreviousPage();
                break;
            case 3:
                int i11 = EsiaAuthActivity.f57722j;
                EsiaAuthActivity this$0 = (EsiaAuthActivity) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.finish();
                break;
            default:
                FeedbackInputV2ViewHolder.scrollToEnd$lambda$11((FeedbackInputV2ViewHolder) obj);
                break;
        }
    }
}
