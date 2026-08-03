package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class F1 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0224aa f4281a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4282b;

    public F1() {
        this(new io.appmetrica.analytics.impl.C0224aa());
    }

    public final synchronized long a(android.content.Context context) {
        java.lang.String a2;
        try {
            this.f4281a.getClass();
            a2 = io.appmetrica.analytics.impl.Ja.a(io.appmetrica.analytics.coreutils.internal.io.FileUtils.getFileFromAppStorage(context, "metrica_service_settings.dat"));
        } catch (java.lang.Throwable unused) {
        }
        return android.text.TextUtils.isEmpty(a2) ? 0L : new org.json.JSONObject(a2).optLong("delay");
    }

    public final void b(android.content.Context context) {
        synchronized (this) {
        }
        if (this.f4282b) {
            return;
        }
        long a2 = a(context);
        if (a2 > 0) {
            try {
                java.lang.Thread.sleep(a2);
            } catch (java.lang.Throwable unused) {
            }
        }
        this.f4282b = true;
    }

    public F1(io.appmetrica.analytics.impl.C0224aa c0224aa) {
        this.f4282b = false;
        this.f4281a = c0224aa;
    }
}
