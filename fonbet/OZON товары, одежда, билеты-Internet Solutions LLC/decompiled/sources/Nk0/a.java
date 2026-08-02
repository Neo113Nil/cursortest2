package Nk0;

import android.view.View;
import ru.ozon.app.android.csma.tips.core.rv.v2.TipItemInputV2ViewHolder;
import ru.ozon.uni.android.wrappers.main.button.ButtonWrapper;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19604a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19605b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f19604a = i11;
        this.f19605b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z11) {
        switch (this.f19604a) {
            case 0:
                ButtonWrapper._init_$lambda$0((ButtonWrapper) this.f19605b, view, z11);
                break;
            default:
                TipItemInputV2ViewHolder.onFocusChangeListener$lambda$0((TipItemInputV2ViewHolder) this.f19605b, view, z11);
                break;
        }
    }
}
