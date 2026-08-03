package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Z9 {

    /* renamed from: c, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.Z9 f5399c;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f5400a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f5401b = new java.util.HashMap();

    public Z9(android.content.Context context) {
        this.f5400a = context;
    }

    public static final io.appmetrica.analytics.impl.Z9 a(android.content.Context context) {
        if (f5399c == null) {
            synchronized (kotlin.jvm.internal.q.a(io.appmetrica.analytics.impl.Z9.class)) {
                if (f5399c == null) {
                    f5399c = new io.appmetrica.analytics.impl.Z9(context);
                }
            }
        }
        io.appmetrica.analytics.impl.Z9 z9 = f5399c;
        if (z9 != null) {
            return z9;
        }
        kotlin.jvm.internal.i.i("INSTANCE");
        throw null;
    }

    public final synchronized io.appmetrica.analytics.impl.C0818x9 b(java.lang.String str) {
        java.lang.Object obj;
        try {
            java.util.HashMap hashMap = this.f5401b;
            obj = hashMap.get(str);
            if (obj == null) {
                obj = new io.appmetrica.analytics.impl.C0818x9(this.f5400a, str);
                hashMap.put(str, obj);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return (io.appmetrica.analytics.impl.C0818x9) obj;
    }

    public final synchronized void a(java.lang.String str) {
        this.f5401b.remove(str);
    }
}
