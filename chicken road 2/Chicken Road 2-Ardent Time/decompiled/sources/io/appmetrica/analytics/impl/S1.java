package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class S1 implements io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f4930a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public volatile io.appmetrica.analytics.impl.C0842y7 f4931b = null;

    public final void a(io.appmetrica.analytics.impl.C0842y7 c0842y7) {
        java.util.ArrayList a2;
        synchronized (this) {
            this.f4931b = c0842y7;
            a2 = a();
        }
        java.util.Iterator it = a2.iterator();
        while (it.hasNext()) {
            ((io.appmetrica.analytics.impl.InterfaceC0228ae) it.next()).consume(c0842y7);
        }
    }

    public final void b() {
        io.appmetrica.analytics.impl.C0244b4.l().f5495e.registerListener(this, io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent.CREATED);
    }

    public final void c() {
        io.appmetrica.analytics.impl.C0244b4.l().f5495e.unregisterListener(this, io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent.CREATED);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(android.app.Activity activity, io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent activityEvent) {
        android.content.Intent intent = (android.content.Intent) io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", "activity", new io.appmetrica.analytics.impl.Q1());
        java.lang.String dataString = intent == null ? null : intent.getDataString();
        if (android.text.TextUtils.isEmpty(dataString)) {
            return;
        }
        io.appmetrica.analytics.impl.R1 r12 = new io.appmetrica.analytics.impl.R1(dataString);
        synchronized (this) {
            try {
                io.appmetrica.analytics.impl.C0842y7 c0842y7 = this.f4931b;
                if (c0842y7 == null) {
                    this.f4930a.add(r12);
                } else {
                    ((io.appmetrica.analytics.impl.C0870z9) io.appmetrica.analytics.impl.C0244b4.l().f5493c.a()).f7180b.post(new io.appmetrica.analytics.impl.P1(r12, c0842y7));
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized java.util.ArrayList a() {
        java.util.ArrayList arrayList;
        arrayList = new java.util.ArrayList(this.f4930a);
        this.f4930a.clear();
        return arrayList;
    }
}
