package sg.bigo.ads.r1;

import android.view.View;

/* loaded from: classes3.dex */
public final class o implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f13279a;

    public o(q qVar) {
        this.f13279a = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view != null) {
            int id = view.getId();
            if (id == 200011) {
                this.f13279a.setMute(!r2.b());
            } else {
                if (id != 200012) {
                    return;
                }
                this.f13279a.e();
            }
        }
    }
}
