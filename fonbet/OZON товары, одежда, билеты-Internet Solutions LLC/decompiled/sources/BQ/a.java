package BQ;

import com.google.android.material.appbar.AppBarLayout;
import ru.ozon.app.android.fresh.main.widgets.addressCommunication.presentation.AddressCommunicationViewHolderFF;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchFormBar.view.SearchFormBarBehavior;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements AppBarLayout.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3274a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3275b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f3274a = i11;
        this.f3275b = obj;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.a
    public final void onOffsetChanged(AppBarLayout appBarLayout, int i11) {
        switch (this.f3274a) {
            case 0:
                SearchFormBarBehavior.offsetChangeListener$lambda$0((SearchFormBarBehavior) this.f3275b, appBarLayout, i11);
                break;
            default:
                AddressCommunicationViewHolderFF.offsetChangeListener$lambda$0((AddressCommunicationViewHolderFF) this.f3275b, appBarLayout, i11);
                break;
        }
    }
}
