package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.gms.internal.ads.zF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1872zF {

    /* renamed from: a, reason: collision with root package name */
    public final C1603tG f16578a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f16579b;

    public /* synthetic */ C1872zF(CopyOnWriteArrayList copyOnWriteArrayList, C1603tG c1603tG) {
        this.f16579b = copyOnWriteArrayList;
        this.f16578a = c1603tG;
    }

    public void a(InterfaceC1883zi interfaceC1883zi) {
        Iterator it = this.f16579b.iterator();
        while (it.hasNext()) {
            C1738wG c1738wG = (C1738wG) it.next();
            RunnableC1081hn runnableC1081hn = new RunnableC1081hn(17, interfaceC1883zi, c1738wG.f16107b);
            int i = AbstractC1260lo.f14419a;
            Handler handler = c1738wG.f16106a;
            if (handler.getLooper().getThread().isAlive()) {
                if (handler.getLooper() == Looper.myLooper()) {
                    runnableC1081hn.run();
                } else {
                    handler.post(runnableC1081hn);
                }
            }
        }
    }
}
