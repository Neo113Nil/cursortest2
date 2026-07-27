package l;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class D implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10762a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10763b;

    public /* synthetic */ D(int i2, Object obj) {
        this.f10762a = i2;
        this.f10763b = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i2, long j2) {
        J j6;
        switch (this.f10762a) {
            case 0:
                if (i2 != -1 && (j6 = ((H) this.f10763b).f10772c) != null) {
                    j6.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) this.f10763b).m(i2);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i2 = this.f10762a;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
