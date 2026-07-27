package com.fyber.inneractive.sdk.flow.nativead.mainasset;

import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.response.nativead.i;
import com.fyber.inneractive.sdk.response.nativead.j;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class e {
    public static d a(r rVar, j jVar, InneractiveAdRequest inneractiveAdRequest, i iVar, String str, com.fyber.inneractive.sdk.flow.nativead.f fVar) {
        com.fyber.inneractive.sdk.response.nativead.c cVar;
        String str2;
        ArrayList arrayList = iVar.f5918a;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = iVar.f5918a.iterator();
            while (it.hasNext()) {
                com.fyber.inneractive.sdk.response.nativead.f fVar2 = (com.fyber.inneractive.sdk.response.nativead.f) it.next();
                if (fVar2.f5915a == 3 && jVar.S.d()) {
                    return new f(fVar2, rVar, jVar, inneractiveAdRequest, str, fVar);
                }
                if (fVar2.f5915a == 2 && (cVar = fVar2.d) != null && (str2 = cVar.f5912a) != null && !str2.trim().isEmpty()) {
                    return new b(fVar2, fVar, jVar, rVar);
                }
            }
        }
        return null;
    }
}
