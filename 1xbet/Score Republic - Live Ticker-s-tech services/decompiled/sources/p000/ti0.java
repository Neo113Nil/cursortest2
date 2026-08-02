package p000;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ti0 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ zi0 f7452j;

    public ti0(zi0 zi0Var) {
        this.f7452j = zi0Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C0151dv c0151dv;
        if (i == -1 || (c0151dv = this.f7452j.f9782l) == null) {
            return;
        }
        c0151dv.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
