package com.fyber.inneractive.sdk.click;

/* loaded from: classes3.dex */
public final class e implements com.fyber.inneractive.sdk.network.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f3573a;
    public final /* synthetic */ android.net.Uri b;
    public final /* synthetic */ com.fyber.inneractive.sdk.click.g c;

    public e(com.fyber.inneractive.sdk.click.g gVar, java.util.List list, android.net.Uri uri) {
        this.c = gVar;
        this.f3573a = list;
        this.b = uri;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(java.lang.Object obj, java.lang.Exception exc, boolean z) {
        com.fyber.inneractive.sdk.click.c cVar = (com.fyber.inneractive.sdk.click.c) obj;
        if (this.c.f) {
            return;
        }
        if (exc != null || cVar == null) {
            java.lang.String uri = this.b.toString();
            com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
            com.fyber.inneractive.sdk.util.r.b.post(new com.fyber.inneractive.sdk.config.f0(uri, null));
            android.net.Uri uri2 = this.b;
            this.c.getClass();
            com.fyber.inneractive.sdk.click.b a2 = com.fyber.inneractive.sdk.click.r.a(uri2.toString(), "IgniteGooglePlay", "failed getting redirects");
            java.util.List list = this.f3573a;
            if (list != null) {
                list.add(new com.fyber.inneractive.sdk.click.j(this.b.toString(), false, com.fyber.inneractive.sdk.click.q.INTERNAL_REDIRECT, "failed getting redirects. ignite click handler"));
                java.util.List list2 = this.f3573a;
                a2.f.clear();
                a2.f.addAll(list2);
            }
            com.fyber.inneractive.sdk.click.g gVar = this.c;
            com.fyber.inneractive.sdk.click.f fVar = gVar.c;
            if (fVar != null) {
                fVar.a(a2, gVar.d, gVar.e);
                return;
            }
            return;
        }
        if (cVar.f3571a.size() > 0) {
            java.util.ArrayList arrayList = cVar.f3571a;
            java.lang.String str = (java.lang.String) arrayList.get(arrayList.size() - 1);
            if (this.f3573a != null) {
                java.util.Iterator it = cVar.f3571a.iterator();
                while (it.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it.next();
                    if (!android.text.TextUtils.equals(str2, str)) {
                        this.f3573a.add(new com.fyber.inneractive.sdk.click.j(str2, true, com.fyber.inneractive.sdk.click.q.INTERNAL_REDIRECT, null));
                    }
                }
                java.util.List list3 = this.f3573a;
                com.fyber.inneractive.sdk.click.q qVar = com.fyber.inneractive.sdk.click.q.OPEN_INTERNAL_STORE;
                list3.add(new com.fyber.inneractive.sdk.click.j(str, true, qVar, null));
                this.c.getClass();
                com.fyber.inneractive.sdk.click.b bVar = new com.fyber.inneractive.sdk.click.b(str, qVar, "IgniteGooglePlay", null);
                java.util.List list4 = this.f3573a;
                bVar.f.clear();
                bVar.f.addAll(list4);
                com.fyber.inneractive.sdk.click.g gVar2 = this.c;
                com.fyber.inneractive.sdk.click.f fVar2 = gVar2.c;
                if (fVar2 != null) {
                    fVar2.a(bVar, gVar2.d, gVar2.e);
                }
            }
            if (str.startsWith("market")) {
                java.lang.String replace = str.replace("market://details?id=", "https://play.google.com/store/apps/details?id=");
                com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager2 = com.fyber.inneractive.sdk.config.IAConfigManager.N;
                com.fyber.inneractive.sdk.util.r.b.post(new com.fyber.inneractive.sdk.config.f0(replace, null));
            } else {
                java.lang.String str3 = cVar.b;
                com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager3 = com.fyber.inneractive.sdk.config.IAConfigManager.N;
                com.fyber.inneractive.sdk.util.r.b.post(new com.fyber.inneractive.sdk.config.f0(str, str3));
            }
        }
    }
}
