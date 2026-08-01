package sg.bigo.ads.h;

import android.view.View;

/* loaded from: classes3.dex */
public final class p2 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s2 f12915a;

    public p2(s2 s2Var) {
        this.f12915a = s2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f12915a.f12925a.mute(!r2.isMuted());
    }
}
