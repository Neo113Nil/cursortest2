package LW;

import android.view.View;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.header.SelectionFormHeaderVH;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16656a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16657b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f16656a = i11;
        this.f16657b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        switch (this.f16656a) {
            case 0:
                SelectionFormHeaderVH.configureToolbar$lambda$2$lambda$1((SelectionFormHeaderVH) this.f16657b, view, i11, i12, i13, i14, i15, i16, i17, i18);
                break;
            default:
                androidx.media3.ui.d.a((androidx.media3.ui.d) this.f16657b, view, i11, i12, i13, i14, i15, i16, i17, i18);
                break;
        }
    }
}
