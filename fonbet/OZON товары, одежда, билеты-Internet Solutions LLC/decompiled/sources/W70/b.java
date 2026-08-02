package W70;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.pdf.PdfPreviewListItemView;

/* loaded from: classes3.dex */
public final class b implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final PdfPreviewListItemView f33299a;

    private b(@NonNull PdfPreviewListItemView pdfPreviewListItemView) {
        this.f33299a = pdfPreviewListItemView;
    }

    @NonNull
    public static b b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.pdf_page_fragment, viewGroup, false);
        if (inflate != null) {
            return new b((PdfPreviewListItemView) inflate);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public final PdfPreviewListItemView a() {
        return this.f33299a;
    }

    @Override // X4.a
    @NonNull
    public final View getRoot() {
        return this.f33299a;
    }
}
