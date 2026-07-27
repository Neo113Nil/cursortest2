package sg.bigo.ads.Y0;

import android.view.View;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class B implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12625a;
    public final /* synthetic */ sg.bigo.ads.e.h b;
    public final /* synthetic */ sg.bigo.ads.P.e c;

    public B(View view, sg.bigo.ads.e.h hVar, sg.bigo.ads.P.e eVar) {
        this.f12625a = view;
        this.b = hVar;
        this.c = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC5446j.a(1, new A(this, this.f12625a.isShown()));
    }
}
