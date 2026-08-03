package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public abstract class Xe {

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f5301c = "Xe";

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Ha f5302a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f5303b;

    public Xe(io.appmetrica.analytics.impl.Ha ha, java.lang.String str) {
        this.f5302a = ha;
        this.f5303b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends io.appmetrica.analytics.impl.Xe> T a(java.lang.String str, float f2) {
        synchronized (this) {
            this.f5302a.a(str, f2);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends io.appmetrica.analytics.impl.Xe> T b(java.lang.String str, java.lang.String str2) {
        synchronized (this) {
            this.f5302a.a(str, str2);
        }
        return this;
    }

    public final io.appmetrica.analytics.impl.Ye c(java.lang.String str) {
        return new io.appmetrica.analytics.impl.Ye(str, this.f5303b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends io.appmetrica.analytics.impl.Xe> T d(java.lang.String str) {
        synchronized (this) {
            this.f5302a.remove(str);
        }
        return this;
    }

    public java.util.Set<java.lang.String> c() {
        return this.f5302a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends io.appmetrica.analytics.impl.Xe> T a(java.lang.String str, java.lang.String[] strArr) {
        java.lang.String str2;
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (java.lang.String str3 : strArr) {
                jSONArray.put(str3);
            }
            str2 = jSONArray.toString();
        } catch (java.lang.Throwable unused) {
            str2 = null;
        }
        this.f5302a.a(str, str2);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends io.appmetrica.analytics.impl.Xe> T b(java.lang.String str, long j2) {
        synchronized (this) {
            this.f5302a.a(str, j2);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends io.appmetrica.analytics.impl.Xe> T b(java.lang.String str, int i2) {
        synchronized (this) {
            this.f5302a.a(i2, str);
        }
        return this;
    }

    public final <T extends io.appmetrica.analytics.impl.Xe> T a(java.lang.String str, java.util.List<java.lang.String> list) {
        return (T) a(str, (java.lang.String[]) list.toArray(new java.lang.String[list.size()]));
    }

    public final long a(java.lang.String str, long j2) {
        return this.f5302a.getLong(str, j2);
    }

    public final int a(java.lang.String str, int i2) {
        return this.f5302a.getInt(str, i2);
    }

    public final java.lang.String a(java.lang.String str, java.lang.String str2) {
        return this.f5302a.getString(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends io.appmetrica.analytics.impl.Xe> T b(java.lang.String str, boolean z2) {
        synchronized (this) {
            this.f5302a.a(str, z2);
        }
        return this;
    }

    public final boolean a(java.lang.String str, boolean z2) {
        return this.f5302a.getBoolean(str, z2);
    }

    public final void b() {
        synchronized (this) {
            this.f5302a.b();
        }
    }

    public final boolean b(java.lang.String str) {
        return this.f5302a.a(str);
    }
}
