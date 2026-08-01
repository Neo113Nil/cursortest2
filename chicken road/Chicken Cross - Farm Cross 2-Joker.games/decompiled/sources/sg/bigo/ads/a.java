package sg.bigo.ads;

import android.content.Context;
import java.util.Iterator;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.d.C5063i;
import sg.bigo.ads.d.RunnableC5058d;
import sg.bigo.ads.d.RunnableC5061g;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12664a;
    public final /* synthetic */ Context b;

    public a(String str, Context context) {
        this.f12664a = str;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BigoAdSdk.f12220a.set(true);
        BigoAdSdk.b.set(false);
        AbstractC5446j.a(1, null, new RunnableC5058d(this.f12664a), 0L);
        BigoAdSdk.b(this.b);
        Iterator it = BigoAdSdk.f.iterator();
        while (it.hasNext()) {
            BigoAdSdk.InitListener initListener = (BigoAdSdk.InitListener) it.next();
            if (initListener != null) {
                initListener.onInitialized();
            }
        }
        BigoAdSdk.f.clear();
        if (C5063i.h.isEmpty()) {
            return;
        }
        AbstractC5446j.a(3, null, new RunnableC5061g(), 0L);
    }
}
