package com.fyber.inneractive.sdk.metrics;

/* loaded from: classes3.dex */
public final class d {
    public static final com.fyber.inneractive.sdk.metrics.d d = new com.fyber.inneractive.sdk.metrics.d();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f3794a = new java.util.HashMap();
    public final java.util.HashMap b = new java.util.HashMap();
    public final com.fyber.inneractive.sdk.metrics.f c = new com.fyber.inneractive.sdk.metrics.f();

    public final com.fyber.inneractive.sdk.metrics.g a(java.lang.String str) {
        try {
            if (str == null) {
                return this.c;
            }
            com.fyber.inneractive.sdk.metrics.g gVar = (com.fyber.inneractive.sdk.metrics.g) this.f3794a.get(str);
            if (gVar != null) {
                return gVar;
            }
            com.fyber.inneractive.sdk.metrics.e eVar = new com.fyber.inneractive.sdk.metrics.e();
            this.f3794a.put(str, eVar);
            return eVar;
        } catch (java.lang.Exception unused) {
            return this.c;
        }
    }

    public final com.fyber.inneractive.sdk.metrics.i b(java.lang.String str) {
        com.fyber.inneractive.sdk.metrics.i iVar = (com.fyber.inneractive.sdk.metrics.i) this.b.get(str);
        if (iVar == null) {
            iVar = new com.fyber.inneractive.sdk.metrics.i();
        }
        this.b.put(str, iVar);
        return iVar;
    }
}
