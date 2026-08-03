package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class J1 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0612pa f4474a = new io.appmetrica.analytics.impl.C0612pa();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedHashMap f4475b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedHashMap f4476c = new java.util.LinkedHashMap();

    public final void a() {
    }

    public final void b() {
    }

    public final void c(android.content.Intent intent) {
        if (intent != null) {
            java.lang.String action = intent.getAction();
            if (!android.text.TextUtils.isEmpty(action)) {
                this.f4474a.a(action, java.lang.Integer.valueOf(a(intent)));
            }
            for (java.util.Map.Entry entry : this.f4475b.entrySet()) {
                io.appmetrica.analytics.impl.I1 i12 = (io.appmetrica.analytics.impl.I1) entry.getKey();
                if (((io.appmetrica.analytics.impl.H1) entry.getValue()).a(intent)) {
                    i12.a(intent);
                }
            }
        }
    }

    public final void d(android.content.Intent intent) {
        if (intent != null) {
            java.lang.String action = intent.getAction();
            if (!android.text.TextUtils.isEmpty(action)) {
                io.appmetrica.analytics.impl.C0612pa c0612pa = this.f4474a;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(a(intent));
                java.util.Collection collection = (java.util.Collection) c0612pa.f6642a.get(action);
                if (collection != null && collection.remove(valueOf)) {
                    if (collection.isEmpty() && c0612pa.f6643b) {
                        c0612pa.f6642a.remove(action);
                    }
                    new java.util.ArrayList(collection);
                }
            }
            for (java.util.Map.Entry entry : this.f4476c.entrySet()) {
                io.appmetrica.analytics.impl.I1 i12 = (io.appmetrica.analytics.impl.I1) entry.getKey();
                if (((io.appmetrica.analytics.impl.H1) entry.getValue()).a(intent)) {
                    i12.a(intent);
                }
            }
        }
    }

    public final void a(android.content.Intent intent, int i2) {
    }

    public final void b(android.content.Intent intent) {
        if (intent != null) {
            java.lang.String action = intent.getAction();
            if (!android.text.TextUtils.isEmpty(action)) {
                this.f4474a.a(action, java.lang.Integer.valueOf(a(intent)));
            }
            for (java.util.Map.Entry entry : this.f4475b.entrySet()) {
                io.appmetrica.analytics.impl.I1 i12 = (io.appmetrica.analytics.impl.I1) entry.getKey();
                if (((io.appmetrica.analytics.impl.H1) entry.getValue()).a(intent)) {
                    i12.a(intent);
                }
            }
        }
    }

    public final void a(android.content.Intent intent, int i2, int i3) {
    }

    public final void a(android.content.res.Configuration configuration) {
    }

    public final void a(io.appmetrica.analytics.impl.I1 i12) {
        this.f4476c.put(i12, new io.appmetrica.analytics.impl.Lo(this, 1));
    }

    public static final boolean a(io.appmetrica.analytics.impl.J1 j12, android.content.Intent intent) {
        java.util.Collection collection;
        j12.getClass();
        return "io.appmetrica.analytics.IAppMetricaService".equals(intent.getAction()) && ((collection = (java.util.Collection) j12.f4474a.f6642a.get("io.appmetrica.analytics.IAppMetricaService")) == null || collection.size() == 0);
    }

    public final void c(io.appmetrica.analytics.impl.I1 i12) {
        this.f4475b.put(i12, new io.appmetrica.analytics.impl.Lo(this, 2));
    }

    public static final boolean c(io.appmetrica.analytics.impl.J1 j12, android.content.Intent intent) {
        j12.getClass();
        return "io.appmetrica.analytics.IAppMetricaService".equals(intent.getAction());
    }

    public final void b(io.appmetrica.analytics.impl.I1 i12) {
        this.f4475b.put(i12, new io.appmetrica.analytics.impl.Lo(this, 0));
    }

    public static final boolean b(io.appmetrica.analytics.impl.J1 j12, android.content.Intent intent) {
        java.util.Collection collection;
        j12.getClass();
        return "io.appmetrica.analytics.IAppMetricaService".equals(intent.getAction()) && (collection = (java.util.Collection) j12.f4474a.f6642a.get("io.appmetrica.analytics.IAppMetricaService")) != null && collection.size() == 1;
    }

    public static int a(android.content.Intent intent) {
        android.net.Uri data = intent.getData();
        if (data != null && kotlin.jvm.internal.i.a(data.getPath(), "/client")) {
            try {
                java.lang.String queryParameter = data.getQueryParameter("pid");
                kotlin.jvm.internal.i.b(queryParameter);
                return java.lang.Integer.parseInt(queryParameter);
            } catch (java.lang.Throwable unused) {
            }
        }
        return -1;
    }
}
