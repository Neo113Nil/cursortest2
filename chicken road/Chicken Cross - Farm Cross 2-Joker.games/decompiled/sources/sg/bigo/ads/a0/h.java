package sg.bigo.ads.a0;

import android.app.Activity;
import java.util.Iterator;
import java.util.Map;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f12672a;
    public final /* synthetic */ o b;

    public h(o oVar, Activity activity) {
        this.b = oVar;
        this.f12672a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.b.b.entrySet().iterator();
        while (it.hasNext()) {
            m mVar = (m) ((Map.Entry) it.next()).getKey();
            if (mVar != null) {
                AbstractC5446j.b(new g(this, mVar));
            }
        }
    }
}
