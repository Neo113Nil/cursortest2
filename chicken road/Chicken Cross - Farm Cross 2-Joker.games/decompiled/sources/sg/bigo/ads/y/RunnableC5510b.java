package sg.bigo.ads.y;

import android.view.View;
import sg.bigo.ads.h.C5158e;

/* renamed from: sg.bigo.ads.y.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5510b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5158e f13408a;
    public final /* synthetic */ i b;

    public RunnableC5510b(i iVar, C5158e c5158e) {
        this.b = iVar;
        this.f13408a = c5158e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5158e c5158e = this.f13408a;
        if (c5158e != null) {
            c5158e.f12881a.a((View) this.b.l);
        }
        i iVar = this.b;
        iVar.getClass();
        iVar.a(1, new RunnableC5512d(iVar));
    }
}
