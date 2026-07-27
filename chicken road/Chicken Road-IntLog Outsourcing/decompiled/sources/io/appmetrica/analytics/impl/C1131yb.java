package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.yb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1131yb extends InterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1156zb f9596a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1131yb(C1156zb c1156zb, String str) {
        super(str);
        this.f9596a = c1156zb;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        HashMap hashMap;
        synchronized (this.f9596a.f9625a) {
            C1156zb.a(this.f9596a);
            this.f9596a.f9629e = true;
            this.f9596a.f9625a.notifyAll();
        }
        while (isRunning()) {
            synchronized (this) {
                if (this.f9596a.f9626b.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                hashMap = new HashMap(this.f9596a.f9626b);
                this.f9596a.f9626b.clear();
            }
            if (hashMap.size() > 0) {
                C1156zb.a(this.f9596a, hashMap);
                hashMap.clear();
            }
        }
    }
}
