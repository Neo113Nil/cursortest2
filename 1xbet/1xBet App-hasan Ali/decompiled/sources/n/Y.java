package n;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class Y implements AdapterView.OnItemSelectedListener {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ AbstractC2131e0 f18211k;

    public Y(AbstractC2131e0 abstractC2131e0) {
        this.f18211k = abstractC2131e0;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j5) {
        C2139i0 c2139i0;
        if (i == -1 || (c2139i0 = this.f18211k.f18230m) == null) {
            return;
        }
        c2139i0.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
