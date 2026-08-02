package KX;

import android.view.View;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantsAdapter;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantsViewHolder;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.footer.FooterVHOptimized;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.FooterVO;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15435a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15436b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15437c;

    public /* synthetic */ b(int i11, Object obj, Object obj2) {
        this.f15435a = i11;
        this.f15436b = obj;
        this.f15437c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f15435a) {
            case 0:
                FooterVHOptimized.bind$lambda$4((FooterVO) this.f15436b, (FooterVHOptimized) this.f15437c, view);
                break;
            default:
                VariantsAdapter.onCreateViewHolder$lambda$4$lambda$3((VariantsViewHolder) this.f15436b, (VariantsAdapter) this.f15437c, view);
                break;
        }
    }
}
