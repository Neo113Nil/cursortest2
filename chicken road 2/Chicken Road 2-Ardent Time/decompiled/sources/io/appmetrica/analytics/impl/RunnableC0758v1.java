package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.v1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0758v1 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f6944a;

    public RunnableC0758v1(android.content.Context context) {
        this.f6944a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.Qj qj = io.appmetrica.analytics.impl.AbstractC0595oj.f6598a;
        android.content.Context context = this.f6944a;
        synchronized (qj) {
            try {
                if (qj.f4871b == null) {
                    qj.f4871b = io.appmetrica.analytics.impl.AbstractC0568ni.f6537a.a(context, "20799a27-fa80-4b36-b2db-0f8141f24180");
                    java.util.Iterator it = qj.f4870a.iterator();
                    while (it.hasNext()) {
                        ((io.appmetrica.analytics.impl.Qa) it.next()).a(qj.f4871b);
                    }
                    qj.f4870a.clear();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
