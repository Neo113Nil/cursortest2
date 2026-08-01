package sg.bigo.ads.s0;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import sg.bigo.ads.q0.C5447k;

/* loaded from: classes3.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Executor f13293a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ WeakReference d;
    public final /* synthetic */ p e;

    public l(p pVar, C5447k c5447k, String str, boolean z, WeakReference weakReference) {
        this.e = pVar;
        this.f13293a = c5447k;
        this.b = str;
        this.c = z;
        this.d = weakReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.e;
        Executor executor = this.f13293a;
        String str = this.b;
        boolean z = this.c;
        WeakReference weakReference = this.d;
        pVar.getClass();
        m mVar = new m(pVar, weakReference);
        Context applicationContext = pVar.f13297a.getContext().getApplicationContext();
        if (pVar.b) {
            u.f13300a.a(applicationContext, executor, str, z, mVar);
        } else {
            x.a(applicationContext, executor, str, z, mVar);
        }
    }
}
