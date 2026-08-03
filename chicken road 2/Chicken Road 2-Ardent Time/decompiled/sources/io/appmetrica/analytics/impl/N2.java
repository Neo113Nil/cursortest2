package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class N2 implements io.appmetrica.analytics.coreapi.internal.backport.BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.O2 f4701a;

    public N2(io.appmetrica.analytics.impl.O2 o2) {
        this.f4701a = o2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.BiConsumer
    public final void consume(java.lang.Object obj, java.lang.Object obj2) {
        android.content.Intent intent = (android.content.Intent) obj2;
        synchronized (this.f4701a) {
            try {
                io.appmetrica.analytics.impl.O2 o2 = this.f4701a;
                o2.f4759b = intent;
                java.util.Iterator it = o2.f4758a.iterator();
                while (it.hasNext()) {
                    ((io.appmetrica.analytics.coreapi.internal.backport.Consumer) it.next()).consume(intent);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
