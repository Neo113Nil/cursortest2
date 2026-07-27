package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.yb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0982yb extends InterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1007zb f8637a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0982yb(C1007zb c1007zb, String str) {
        super(str);
        this.f8637a = c1007zb;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        HashMap hashMap;
        synchronized (this.f8637a.f8665a) {
            C1007zb.a(this.f8637a);
            this.f8637a.f8669e = true;
            this.f8637a.f8665a.notifyAll();
        }
        while (isRunning()) {
            synchronized (this) {
                if (this.f8637a.f8666b.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                hashMap = new HashMap(this.f8637a.f8666b);
                this.f8637a.f8666b.clear();
            }
            if (hashMap.size() > 0) {
                C1007zb.a(this.f8637a, hashMap);
                hashMap.clear();
            }
        }
    }
}
