package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class T9 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Tl f5010a = new io.appmetrica.analytics.impl.Tl();

    /* renamed from: b, reason: collision with root package name */
    public io.appmetrica.analytics.impl.V9 f5011b = new io.appmetrica.analytics.impl.V9();

    public final synchronized void a(io.appmetrica.analytics.impl.V9 v9) {
        this.f5011b = v9;
    }

    public final synchronized void a(java.util.List list, java.util.HashMap hashMap) {
        java.lang.Boolean bool;
        java.lang.String str;
        try {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.i.a((java.lang.String) it.next(), "appmetrica_lib_ssl_enabled") && (bool = this.f5011b.f5134a) != null) {
                    boolean booleanValue = bool.booleanValue();
                    io.appmetrica.analytics.impl.V9 v9 = this.f5011b;
                    io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus identifierStatus = v9.f5135b;
                    java.lang.String str2 = v9.f5136c;
                    if (booleanValue) {
                        str = "true";
                    } else {
                        if (booleanValue) {
                            throw new E1.A();
                        }
                        str = "false";
                    }
                    hashMap.put("appmetrica_lib_ssl_enabled", this.f5010a.a(new io.appmetrica.analytics.internal.IdentifiersResult(str, identifierStatus, str2)));
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }
}
