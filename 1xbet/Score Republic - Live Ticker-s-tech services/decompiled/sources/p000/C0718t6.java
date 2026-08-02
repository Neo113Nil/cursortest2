package p000;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: t6 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0718t6 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0792v6 f7325j;

    public C0718t6(C0792v6 c0792v6) {
        this.f7325j = c0792v6;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C0792v6 c0792v6 = this.f7325j;
        C0903y6 c0903y6 = c0792v6.f8105M;
        c0903y6.setSelection(i);
        if (c0903y6.getOnItemClickListener() != null) {
            c0903y6.performItemClick(view, i, c0792v6.f8102J.getItemId(i));
        }
        c0792v6.dismiss();
    }
}
