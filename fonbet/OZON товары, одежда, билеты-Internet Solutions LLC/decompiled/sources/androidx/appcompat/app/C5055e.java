package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* renamed from: androidx.appcompat.app.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5055e implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AlertController.RecycleListView f37114a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AlertController f37115b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AlertController.b f37116c;

    C5055e(AlertController.b bVar, AlertController.RecycleListView recycleListView, AlertController alertController) {
        this.f37116c = bVar;
        this.f37114a = recycleListView;
        this.f37115b = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i11, long j11) {
        AlertController.b bVar = this.f37116c;
        boolean[] zArr = bVar.f37045u;
        AlertController.RecycleListView recycleListView = this.f37114a;
        if (zArr != null) {
            zArr[i11] = recycleListView.isItemChecked(i11);
        }
        bVar.f37049y.onClick(this.f37115b.f36997b, i11, recycleListView.isItemChecked(i11));
    }
}
