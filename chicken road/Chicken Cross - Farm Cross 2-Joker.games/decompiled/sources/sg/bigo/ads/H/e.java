package sg.bigo.ads.H;

import android.view.View;

/* loaded from: classes3.dex */
public final class e implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f12312a;

    public e(g gVar) {
        this.f12312a = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        n nVar = this.f12312a.d;
        if (nVar != null) {
            nVar.o();
        }
    }
}
