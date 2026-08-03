package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.rb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0664rb extends io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0690sb f6727a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0664rb(io.appmetrica.analytics.impl.C0690sb c0690sb, java.lang.String str) {
        super(str);
        this.f6727a = c0690sb;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        java.util.HashMap hashMap;
        synchronized (this.f6727a.f6799a) {
            io.appmetrica.analytics.impl.C0690sb.a(this.f6727a);
            this.f6727a.f6803e = true;
            this.f6727a.f6799a.notifyAll();
        }
        while (isRunning()) {
            synchronized (this) {
                if (this.f6727a.f6800b.size() == 0) {
                    try {
                        wait();
                    } catch (java.lang.InterruptedException unused) {
                    }
                }
                hashMap = new java.util.HashMap(this.f6727a.f6800b);
                this.f6727a.f6800b.clear();
            }
            if (hashMap.size() > 0) {
                io.appmetrica.analytics.impl.C0690sb.a(this.f6727a, hashMap);
                hashMap.clear();
            }
        }
    }
}
