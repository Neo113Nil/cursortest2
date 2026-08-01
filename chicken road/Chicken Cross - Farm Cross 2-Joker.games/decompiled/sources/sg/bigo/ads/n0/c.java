package sg.bigo.ads.n0;

import android.view.View;

/* loaded from: classes3.dex */
public final class c implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f13201a;

    public c(d dVar) {
        this.f13201a = dVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.f13201a.a(2);
        } else {
            this.f13201a.a();
        }
    }
}
