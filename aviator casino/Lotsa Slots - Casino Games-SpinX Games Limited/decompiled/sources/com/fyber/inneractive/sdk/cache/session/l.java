package com.fyber.inneractive.sdk.cache.session;

/* loaded from: classes3.dex */
public final class l implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.fyber.inneractive.sdk.cache.session.g gVar = (com.fyber.inneractive.sdk.cache.session.g) obj;
        com.fyber.inneractive.sdk.cache.session.g gVar2 = (com.fyber.inneractive.sdk.cache.session.g) obj2;
        if (gVar == null || gVar2 == null) {
            return 0;
        }
        return gVar.d < gVar2.d ? -1 : 1;
    }
}
