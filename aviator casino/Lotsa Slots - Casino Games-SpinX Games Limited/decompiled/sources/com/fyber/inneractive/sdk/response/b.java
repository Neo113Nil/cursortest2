package com.fyber.inneractive.sdk.response;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.response.e f4250a;
    public java.lang.String b;
    public com.fyber.inneractive.sdk.response.j c;
    public boolean d = true;

    public abstract com.fyber.inneractive.sdk.response.e a();

    public final com.fyber.inneractive.sdk.response.e a(java.lang.String str) {
        this.d = str != null;
        com.fyber.inneractive.sdk.response.e eVar = this.f4250a;
        eVar.getClass();
        eVar.c = java.lang.System.currentTimeMillis();
        this.c.a(this);
        java.lang.String a2 = this.c.a();
        this.f4250a.h = a2;
        com.fyber.inneractive.sdk.config.r0 a3 = com.fyber.inneractive.sdk.config.a.a(this.b);
        com.fyber.inneractive.sdk.util.IAlog.a("%sGot unit config for unitId: %s from config manager", com.fyber.inneractive.sdk.util.IAlog.a(this), this.b);
        com.fyber.inneractive.sdk.util.IAlog.a("%s%s", com.fyber.inneractive.sdk.util.IAlog.a(this), a3);
        if (this.d) {
            a(str, a3);
        } else if (!(this instanceof com.fyber.inneractive.sdk.response.l)) {
            com.fyber.inneractive.sdk.response.h hVar = new com.fyber.inneractive.sdk.response.h(a2);
            if (hVar.f4252a) {
                java.lang.String str2 = hVar.b;
                if (str2 == null || android.text.TextUtils.isEmpty(str2.trim())) {
                    throw new java.lang.Exception("empty ad content detected. failing fast.");
                }
                a(str2, a3);
            }
        } else {
            a(a2, a3);
        }
        return this.f4250a;
    }

    public abstract void a(java.lang.String str, com.fyber.inneractive.sdk.config.r0 r0Var);

    public boolean b() {
        return this instanceof com.fyber.inneractive.sdk.response.c;
    }
}
