package com.fyber.inneractive.sdk.response.nativead;

/* loaded from: classes3.dex */
public final class k extends com.fyber.inneractive.sdk.response.e {
    public com.fyber.inneractive.sdk.response.nativead.i K;

    @Override // com.fyber.inneractive.sdk.response.e
    public final com.fyber.inneractive.sdk.external.InneractiveErrorCode a(com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.config.global.r rVar) {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.response.e
    public final com.fyber.inneractive.sdk.external.InneractiveErrorCode b() {
        return null;
    }

    public final com.fyber.inneractive.sdk.response.nativead.e c() {
        com.fyber.inneractive.sdk.response.nativead.f fVar;
        java.util.ArrayList arrayList;
        com.fyber.inneractive.sdk.response.nativead.i iVar = this.K;
        if (iVar != null && (arrayList = iVar.f4261a) != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                fVar = (com.fyber.inneractive.sdk.response.nativead.f) it.next();
                if (fVar.c != null) {
                    break;
                }
            }
        }
        fVar = null;
        if (fVar != null) {
            return fVar.c;
        }
        return null;
    }

    public final boolean d() {
        java.lang.String str;
        com.fyber.inneractive.sdk.response.nativead.e c = c();
        return (c == null || (str = c.f4257a) == null || str.isEmpty()) ? false : true;
    }
}
