package com.fyber.inneractive.sdk.flow.storepromo.loader;

/* loaded from: classes3.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.flow.storepromo.loader.d f3739a;
    public final /* synthetic */ com.fyber.inneractive.sdk.flow.storepromo.loader.f b;

    public e(com.fyber.inneractive.sdk.flow.storepromo.loader.f fVar, com.fyber.inneractive.sdk.flow.storepromo.loader.d dVar) {
        this.b = fVar;
        this.f3739a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.flow.storepromo.model.c cVar;
        com.fyber.inneractive.sdk.flow.storepromo.loader.f fVar = this.b;
        if (fVar.f == null || (cVar = fVar.b) == null) {
            return;
        }
        com.fyber.inneractive.sdk.flow.storepromo.loader.d dVar = this.f3739a;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\n<script>\n");
        java.util.ArrayList arrayList = cVar.f3750a;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        java.util.Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            com.fyber.inneractive.sdk.flow.storepromo.model.a aVar = (com.fyber.inneractive.sdk.flow.storepromo.model.a) it.next();
            int i3 = com.fyber.inneractive.sdk.flow.storepromo.loader.h.f3742a[aVar.f3749a.ordinal()];
            if (i3 == 1) {
                i++;
                java.lang.String str = com.fyber.inneractive.sdk.flow.storepromo.loader.i.f3743a;
                java.lang.String format = java.lang.String.format("app_screen_%d", java.lang.Integer.valueOf(i));
                sb2.append("var " + format + "_el = document.createElement('img');\n" + format + "_el.id = '" + format + "';\ndocument.getElementById('carousel').appendChild(" + format + "_el);\n");
                sb2.append(java.lang.String.format(com.fyber.inneractive.sdk.flow.storepromo.loader.i.f3743a, java.lang.Integer.valueOf(i), aVar.b));
                sb2.append(java.lang.String.format(com.fyber.inneractive.sdk.flow.storepromo.loader.i.b, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i)));
            } else if (i3 == 2) {
                i2++;
                java.lang.String str2 = com.fyber.inneractive.sdk.flow.storepromo.loader.i.f3743a;
                java.lang.String format2 = java.lang.String.format("app_video_url_%d", java.lang.Integer.valueOf(i2));
                sb2.append("var " + format2 + "_el = document.createElement('video');\n" + format2 + "_el.id = '" + format2 + "';\ndocument.getElementById('carousel').appendChild(" + format2 + "_el);\n");
                sb2.append(java.lang.String.format(com.fyber.inneractive.sdk.flow.storepromo.loader.i.c, java.lang.Integer.valueOf(i2), aVar.b));
                sb2.append(java.lang.String.format(com.fyber.inneractive.sdk.flow.storepromo.loader.i.d, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i2)));
            } else if (i3 == 3) {
                sb2.append(java.lang.String.format(com.fyber.inneractive.sdk.flow.storepromo.loader.i.e, aVar.b));
                sb2.append(com.fyber.inneractive.sdk.flow.storepromo.loader.i.f);
            } else if (i3 == 4) {
                sb2.append(java.lang.String.format(com.fyber.inneractive.sdk.flow.storepromo.loader.i.q, aVar.b));
                sb2.append(com.fyber.inneractive.sdk.flow.storepromo.loader.i.r);
            }
        }
        sb.append(sb2.toString());
        sb.append(java.lang.String.format(com.fyber.inneractive.sdk.flow.storepromo.loader.i.g, cVar.b.replace("`", "\\`")) + com.fyber.inneractive.sdk.flow.storepromo.loader.i.h + java.lang.String.format(com.fyber.inneractive.sdk.flow.storepromo.loader.i.i, cVar.f.replace("`", "\\`")) + com.fyber.inneractive.sdk.flow.storepromo.loader.i.j + java.lang.String.format(com.fyber.inneractive.sdk.flow.storepromo.loader.i.k, cVar.g.b.replace("`", "\\`")) + com.fyber.inneractive.sdk.flow.storepromo.loader.i.l + java.lang.String.format(com.fyber.inneractive.sdk.flow.storepromo.loader.i.o, cVar.g.f3751a.replace("`", "\\`")) + com.fyber.inneractive.sdk.flow.storepromo.loader.i.p + java.lang.String.format(com.fyber.inneractive.sdk.flow.storepromo.loader.i.m, cVar.g.c.replace("`", "\\`")) + com.fyber.inneractive.sdk.flow.storepromo.loader.i.n);
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        boolean parseBoolean = java.lang.Boolean.parseBoolean(cVar.d);
        boolean parseBoolean2 = java.lang.Boolean.parseBoolean(cVar.e);
        sb3.append(com.fyber.inneractive.sdk.flow.storepromo.loader.i.a(parseBoolean, "in_app_purchases"));
        sb3.append(com.fyber.inneractive.sdk.flow.storepromo.loader.i.a(parseBoolean2, "app_contains_ads"));
        sb3.append(com.fyber.inneractive.sdk.flow.storepromo.loader.i.a(parseBoolean2 && parseBoolean, "app_subtitle_separator"));
        sb.append(sb3.toString());
        sb.append("</script>");
        java.lang.String str3 = cVar.c + sb.toString();
        dVar.getClass();
        com.fyber.inneractive.sdk.util.r.b.post(new com.fyber.inneractive.sdk.flow.storepromo.loader.c(dVar, str3));
    }
}
