package O0;

import android.view.View;
import android.view.ViewGroup;
import com.salamadev.nabilalawadi.kisaskoran.R;

/* JADX INFO: loaded from: classes.dex */
public final class w extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f4903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f4904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f4905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f4906d;

    public w(i iVar, ViewGroup viewGroup, View view, View view2) {
        this.f4906d = iVar;
        this.f4903a = viewGroup;
        this.f4904b = view;
        this.f4905c = view2;
    }

    @Override // O0.n, O0.l
    public final void a() {
        this.f4903a.getOverlay().remove(this.f4904b);
    }

    @Override // O0.n, O0.l
    public final void d() {
        View view = this.f4904b;
        if (view.getParent() == null) {
            this.f4903a.getOverlay().add(view);
        } else {
            this.f4906d.c();
        }
    }

    @Override // O0.l
    public final void e(m mVar) {
        this.f4905c.setTag(R.id.save_overlay_view, null);
        this.f4903a.getOverlay().remove(this.f4904b);
        mVar.v(this);
    }
}
