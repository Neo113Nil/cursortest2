package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class F0 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Bb f4278a = new io.appmetrica.analytics.impl.Bb(io.appmetrica.analytics.impl.C0244b4.l().d());

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Cb f4279b = new io.appmetrica.analytics.impl.Cb();

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Eb f4280c = new io.appmetrica.analytics.impl.Eb();

    public final void a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        io.appmetrica.analytics.impl.Bb bb = this.f4278a;
        if (bb.f4108c.a((java.lang.Void) null).f6701a && bb.f4109d.a(str).f6701a && bb.f4110e.a(str2).f6701a && bb.f4111f.a(str3).f6701a) {
            this.f4279b.getClass();
            ((io.appmetrica.analytics.impl.C0870z9) io.appmetrica.analytics.impl.C0244b4.l().f5493c.a()).f7180b.post(new io.appmetrica.analytics.impl.Ko(this, str, str2, str3, 0));
            return;
        }
        io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger.Companion.getAnonymousInstance().warning(B1.a.i("[AppMetricaLibraryAdapterProxy]", "Failed report event from sender: " + str + " with name = " + str2 + " and payload = " + str3), new java.lang.Object[0]);
    }

    public static final void a(io.appmetrica.analytics.impl.F0 f0, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.util.List list;
        android.content.Context a2;
        io.appmetrica.analytics.impl.Eb eb = f0.f4280c;
        eb.getClass();
        if (str == null) {
            str = "null";
        }
        h1.C0172d c0172d = new h1.C0172d("sender", str);
        if (str2 == null) {
            str2 = "null";
        }
        h1.C0172d c0172d2 = new h1.C0172d("event", str2);
        if (str3 == null) {
            str3 = "null";
        }
        h1.C0172d[] c0172dArr = {c0172d, c0172d2, new h1.C0172d("payload", str3)};
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(i1.AbstractC0203v.E(3));
        i1.AbstractC0202u.H(linkedHashMap, c0172dArr);
        io.appmetrica.analytics.ModuleEvent.Builder withName = io.appmetrica.analytics.ModuleEvent.newBuilder(4).withName("appmetrica_system_event_42");
        synchronized (eb) {
            try {
                if (eb.f4259a == null && (a2 = io.appmetrica.analytics.impl.C0244b4.l().f5497g.a()) != null) {
                    eb.f4259a = i1.AbstractC0191j.H(new io.appmetrica.analytics.impl.Pd(), new io.appmetrica.analytics.impl.C0366fn(a2), new io.appmetrica.analytics.impl.Jo());
                }
                list = eb.f4259a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((io.appmetrica.analytics.impl.InterfaceC0704t) it.next()).a(linkedHashMap);
            }
        }
        io.appmetrica.analytics.ModulesFacade.reportEvent(withName.withAttributes(linkedHashMap).build());
    }
}
