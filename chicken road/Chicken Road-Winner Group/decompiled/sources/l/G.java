package l;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class G implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9704a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9705b;

    public /* synthetic */ G(int i3, Object obj) {
        this.f9704a = i3;
        this.f9705b = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i3, long j3) {
        M m3;
        switch (this.f9704a) {
            case 0:
                if (i3 != -1 && (m3 = ((K) this.f9705b).f9714c) != null) {
                    m3.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) this.f9705b).m(i3);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i3 = this.f9704a;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
