package p058i;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: i.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0906c implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0909f f13660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0907d f13661b;

    public C0906c(C0907d c0907d, C0909f c0909f) {
        this.f13661b = c0907d;
        this.f13660a = c0909f;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j) {
        C0907d c0907d = this.f13661b;
        DialogInterface.OnClickListener onClickListener = c0907d.f13674n;
        C0909f c0909f = this.f13660a;
        onClickListener.onClick(c0909f.f13684b, i7);
        if (c0907d.f13675o) {
            return;
        }
        c0909f.f13684b.dismiss();
    }
}
