package Ec0;

import C.s0;
import M3.j;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import d0.InterfaceC6000k;
import kotlin.jvm.functions.Function0;
import ru.ozon.app.android.search.searchscreen.presentation.fragment.SearchBarViewDelegate;
import ru.ozon.app.android.search.searchscreen.presentation.fragment.SearchBarViewDelegate$observeLifecycleContainer$1;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelSorting.v2.view.TravelSortingV2View;
import ru.ozon.fintech.ui.container.NestedRecyclerHelper;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7831a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7832b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f7831a = i11;
        this.f7832b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7831a) {
            case 0:
                ((Function0) this.f7832b).invoke();
                break;
            case 1:
                j.a((j) this.f7832b);
                break;
            case 2:
                ((s0) this.f7832b).n();
                break;
            case 3:
                TravelSortingV2View.bind$lambda$6((TravelSortingV2View) this.f7832b);
                break;
            case 4:
                View view = (View) this.f7832b;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
            case 5:
                ((InterfaceC6000k) this.f7832b).a();
                break;
            case 6:
                SearchBarViewDelegate$observeLifecycleContainer$1.onResume$lambda$0((SearchBarViewDelegate) this.f7832b);
                break;
            default:
                NestedRecyclerHelper.handleNestedAccepted$lambda$1((NestedRecyclerHelper) this.f7832b);
                break;
        }
    }
}
