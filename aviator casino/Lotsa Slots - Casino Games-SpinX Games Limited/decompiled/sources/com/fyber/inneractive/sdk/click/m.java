package com.fyber.inneractive.sdk.click;

/* loaded from: classes3.dex */
public final class m implements com.fyber.inneractive.sdk.network.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f3579a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ com.fyber.inneractive.sdk.click.r c;

    public m(com.fyber.inneractive.sdk.click.r rVar, java.lang.String str, java.lang.String str2) {
        this.c = rVar;
        this.f3579a = str;
        this.b = str2;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(java.lang.Object obj, java.lang.Exception exc, boolean z) {
        com.fyber.inneractive.sdk.click.c cVar = (com.fyber.inneractive.sdk.click.c) obj;
        if (this.c.f) {
            return;
        }
        if (exc != null) {
            com.fyber.inneractive.sdk.click.r.a(this.c, null, this.f3579a, this.b, exc);
            return;
        }
        if (cVar != null) {
            java.lang.String str = this.f3579a;
            if (cVar.f3571a.size() > 1) {
                java.util.ArrayList arrayList = cVar.f3571a;
                str = (java.lang.String) arrayList.get(arrayList.size() - 1);
            }
            com.fyber.inneractive.sdk.click.b a2 = this.c.a(str);
            if ((a2 == null || a2.f3570a == com.fyber.inneractive.sdk.click.q.FAILED) && !android.text.TextUtils.isEmpty(cVar.b)) {
                com.fyber.inneractive.sdk.click.r rVar = this.c;
                rVar.getClass();
                java.util.Iterator it = cVar.f3571a.iterator();
                while (it.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it.next();
                    if (!android.text.TextUtils.equals(str2, str)) {
                        rVar.g.add(new com.fyber.inneractive.sdk.click.j(str2, true, com.fyber.inneractive.sdk.click.q.INTERNAL_REDIRECT, null));
                    }
                }
                com.fyber.inneractive.sdk.click.r.a(this.c, cVar.b, str, this.b, null);
                return;
            }
            com.fyber.inneractive.sdk.click.r rVar2 = this.c;
            rVar2.getClass();
            java.util.Iterator it2 = cVar.f3571a.iterator();
            while (it2.hasNext()) {
                java.lang.String str3 = (java.lang.String) it2.next();
                if (!android.text.TextUtils.equals(str3, str)) {
                    rVar2.g.add(new com.fyber.inneractive.sdk.click.j(str3, false, com.fyber.inneractive.sdk.click.q.INTERNAL_REDIRECT, null));
                }
            }
            if (this.c.g.size() == 0) {
                this.c.g.add(new com.fyber.inneractive.sdk.click.j(str, false, com.fyber.inneractive.sdk.click.q.INTERNAL_REDIRECT, null));
            }
            this.c.a(com.fyber.inneractive.sdk.click.r.a(str, "followRedirects", "Invalid response"));
        }
    }
}
