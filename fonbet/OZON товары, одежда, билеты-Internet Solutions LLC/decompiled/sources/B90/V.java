package B90;

import ai0.ComponentCallbacks2C5026b;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.search.dialogsearchscreen.withTopFilters.DialogSearchTopFiltersFragment;
import ru.ozon.app.android.travel.feature.general.main.widgets.mainTabs.presentation.view.MainTabsView;
import ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewFragmentBase;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class V implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3123a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3124b;

    public /* synthetic */ V(Object obj, int i11) {
        this.f3123a = i11;
        this.f3124b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f3124b;
        switch (this.f3123a) {
            case 0:
                FintechPreferencesFragment.N((FintechPreferencesFragment) obj);
                break;
            case 1:
                J2.a this$0 = (J2.a) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.l().a(new D2.r("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                break;
            case 2:
                ((RecyclerView) obj).scrollToPosition(0);
                break;
            case 3:
                ((ComponentCallbacks2C5026b) obj).d();
                break;
            case 4:
                DialogSearchTopFiltersFragment.onComposerCreated$lambda$17((DialogSearchTopFiltersFragment) obj);
                break;
            case 5:
                ((MainTabsView) obj).alignTabsContentToCenter();
                break;
            case 6:
                int i11 = l80.f.f72971Z;
                ComponentCallbacksC5392m U10 = ((l80.f) obj).f0().U();
                FintechWebViewFragmentBase fintechWebViewFragmentBase = U10 instanceof FintechWebViewFragmentBase ? (FintechWebViewFragmentBase) U10 : null;
                if (fintechWebViewFragmentBase != null) {
                    androidx.activity.M activity = fintechWebViewFragmentBase.getActivity();
                    E30.g.a(new t60.g(1), activity instanceof I30.a ? (I30.a) activity : null, fintechWebViewFragmentBase.N().Q0().M());
                    break;
                }
                break;
            default:
                ((View) obj).setVisibility(0);
                break;
        }
    }
}
