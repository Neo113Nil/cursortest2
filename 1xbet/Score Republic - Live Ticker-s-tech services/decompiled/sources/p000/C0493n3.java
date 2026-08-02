package p000;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: n3 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0493n3 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0641r3 f5264j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0530o3 f5265k;

    public C0493n3(C0530o3 c0530o3, C0641r3 c0641r3) {
        this.f5265k = c0530o3;
        this.f5264j = c0641r3;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C0530o3 c0530o3 = this.f5265k;
        DialogInterface.OnClickListener onClickListener = c0530o3.f5598m;
        C0641r3 c0641r3 = this.f5264j;
        onClickListener.onClick(c0641r3.f6674b, i);
        if (c0530o3.f5599n) {
            return;
        }
        c0641r3.f6674b.dismiss();
    }
}
