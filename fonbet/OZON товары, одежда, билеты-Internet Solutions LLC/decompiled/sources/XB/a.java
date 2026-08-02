package XB;

import androidx.lifecycle.W;
import java.util.List;
import ru.ozon.app.android.partpayment.formpage.view.modalpickerfragment.ModalPickerBinder;
import ru.ozon.app.android.pdfviewer.presentation.PdfViewerFragment;
import ru.ozon.app.android.pdfviewer.presentation.PdfViewerViewModel;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements W {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34188a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f34189b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f34188a = i11;
        this.f34189b = obj;
    }

    @Override // androidx.lifecycle.W
    public final void onChanged(Object obj) {
        switch (this.f34188a) {
            case 0:
                ModalPickerBinder._init_$lambda$0((ModalPickerBinder) this.f34189b, (List) obj);
                break;
            default:
                PdfViewerFragment.onCreate$lambda$1((PdfViewerFragment) this.f34189b, (PdfViewerViewModel.Action) obj);
                break;
        }
    }
}
