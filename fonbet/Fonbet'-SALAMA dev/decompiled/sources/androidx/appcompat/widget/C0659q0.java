package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: androidx.appcompat.widget.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0659q0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8732a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8733b;

    public /* synthetic */ C0659q0(Object obj, int i7) {
        this.f8732a = i7;
        this.f8733b = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i7, long j) {
        C0649l0 c0649l0;
        switch (this.f8732a) {
            case 0:
                if (i7 != -1 && (c0649l0 = ((ListPopupWindow) this.f8733b).f8400c) != null) {
                    c0649l0.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) this.f8733b).p(i7);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i7 = this.f8732a;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
