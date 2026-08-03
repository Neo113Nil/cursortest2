package com.fyber.inneractive.sdk.cache.session;

/* loaded from: classes3.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.cache.session.enums.a f3563a;
    public final /* synthetic */ com.fyber.inneractive.sdk.cache.session.enums.c b;
    public final /* synthetic */ com.fyber.inneractive.sdk.cache.session.e c;

    public d(com.fyber.inneractive.sdk.cache.session.e eVar, com.fyber.inneractive.sdk.cache.session.enums.a aVar, com.fyber.inneractive.sdk.cache.session.enums.c cVar) {
        this.c = eVar;
        this.f3563a = aVar;
        this.b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.c.c) {
            com.fyber.inneractive.sdk.cache.session.enums.a aVar = this.f3563a;
            if (aVar != com.fyber.inneractive.sdk.cache.session.enums.a.NEW_SESSION) {
                com.fyber.inneractive.sdk.cache.session.g gVar = (com.fyber.inneractive.sdk.cache.session.g) this.c.f3564a.f3568a.get(this.b);
                if (gVar != null) {
                    int i = com.fyber.inneractive.sdk.cache.session.f.f3566a[aVar.ordinal()];
                    if (i == 1) {
                        gVar.b++;
                    } else if (i == 2) {
                        gVar.c++;
                    } else if (i == 3) {
                        gVar.f3567a++;
                    }
                }
            } else {
                this.c.f3564a = new com.fyber.inneractive.sdk.cache.session.i();
            }
            try {
                com.fyber.inneractive.sdk.util.o.a(com.fyber.inneractive.sdk.util.o.f4302a, com.fyber.inneractive.sdk.cache.session.e.a(this.c).toString().getBytes("UTF-8"));
            } catch (java.io.UnsupportedEncodingException unused) {
            }
            this.c.getClass();
        }
    }
}
