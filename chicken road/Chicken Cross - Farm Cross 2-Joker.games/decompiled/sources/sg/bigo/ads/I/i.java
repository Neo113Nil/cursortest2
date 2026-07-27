package sg.bigo.ads.I;

import android.view.View;

/* loaded from: classes3.dex */
public final class i implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f12326a;

    public i(l lVar) {
        this.f12326a = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        k kVar = this.f12326a.f12328a;
        if (kVar != null) {
            kVar.a();
        }
        this.f12326a.dismiss();
    }
}
