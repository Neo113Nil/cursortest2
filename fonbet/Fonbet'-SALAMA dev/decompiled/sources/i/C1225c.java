package i;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: i.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1225c implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1228f f13654a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1226d f13655b;

    public C1225c(C1226d c1226d, C1228f c1228f) {
        this.f13655b = c1226d;
        this.f13654a = c1228f;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j) {
        C1226d c1226d = this.f13655b;
        DialogInterface.OnClickListener onClickListener = c1226d.f13668n;
        C1228f c1228f = this.f13654a;
        onClickListener.onClick(c1228f.f13678b, i7);
        if (c1226d.f13669o) {
            return;
        }
        c1228f.f13678b.dismiss();
    }
}
