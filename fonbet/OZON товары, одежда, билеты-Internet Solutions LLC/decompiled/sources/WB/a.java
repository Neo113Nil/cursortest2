package WB;

import androidx.lifecycle.W;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.Action;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchBinder;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchView;
import ru.ozon.app.android.partpayment.formpage.view.FormPageBinder;
import ru.ozon.app.android.partpayment.formpage.view.FormPageViewModel;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements W {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33327a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33328b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f33327a = i11;
        this.f33328b = obj;
    }

    @Override // androidx.lifecycle.W
    public final void onChanged(Object obj) {
        switch (this.f33327a) {
            case 0:
                FormPageBinder._init_$lambda$1((FormPageBinder) this.f33328b, (FormPageViewModel.Action) obj);
                break;
            default:
                ProductPickerSearchBinder.bind$lambda$1((ProductPickerSearchView) this.f33328b, (Action) obj);
                break;
        }
    }
}
