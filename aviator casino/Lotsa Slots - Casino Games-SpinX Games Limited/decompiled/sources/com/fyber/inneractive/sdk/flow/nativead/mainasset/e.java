package com.fyber.inneractive.sdk.flow.nativead.mainasset;

/* loaded from: classes3.dex */
public abstract class e {
    public static com.fyber.inneractive.sdk.flow.nativead.mainasset.d a(com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.response.nativead.j jVar, com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.nativead.i iVar, java.lang.String str, com.fyber.inneractive.sdk.flow.nativead.f fVar) {
        com.fyber.inneractive.sdk.response.nativead.c cVar;
        java.lang.String str2;
        java.util.ArrayList arrayList = iVar.f4261a;
        if (arrayList != null && !arrayList.isEmpty()) {
            java.util.Iterator it = iVar.f4261a.iterator();
            while (it.hasNext()) {
                com.fyber.inneractive.sdk.response.nativead.f fVar2 = (com.fyber.inneractive.sdk.response.nativead.f) it.next();
                if (fVar2.f4258a == 3 && jVar.Q.d()) {
                    return new com.fyber.inneractive.sdk.flow.nativead.mainasset.f(fVar2, rVar, jVar, inneractiveAdRequest, str, fVar);
                }
                if (fVar2.f4258a == 2 && (cVar = fVar2.d) != null && (str2 = cVar.f4255a) != null && !str2.trim().isEmpty()) {
                    return new com.fyber.inneractive.sdk.flow.nativead.mainasset.b(fVar2, fVar, jVar, rVar);
                }
            }
        }
        return null;
    }
}
