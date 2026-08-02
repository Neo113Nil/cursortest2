package WB;

import android.view.View;
import ru.ozon.app.android.partpayment.formpage.view.FormPageView;
import ru.ozon.app.android.returns.cancels.cancelReasons.presentation.reasons.SelectCancelReasonViewHolder;

/* loaded from: classes13.dex */
public final /* synthetic */ class b implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33329a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33330b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f33329a = i11;
        this.f33330b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        switch (this.f33329a) {
            case 0:
                FormPageView._init_$lambda$3((FormPageView) this.f33330b, view, i11, i12, i13, i14, i15, i16, i17, i18);
                break;
            default:
                SelectCancelReasonViewHolder.textAreaOnLayoutChangeListener$lambda$1((SelectCancelReasonViewHolder) this.f33330b, view, i11, i12, i13, i14, i15, i16, i17, i18);
                break;
        }
    }
}
