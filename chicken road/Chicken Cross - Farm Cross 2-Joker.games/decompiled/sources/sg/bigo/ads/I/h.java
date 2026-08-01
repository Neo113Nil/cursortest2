package sg.bigo.ads.I;

import android.view.View;

/* loaded from: classes3.dex */
public final class h implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f12325a;

    public h(l lVar) {
        this.f12325a = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f12325a.dismiss();
    }
}
