package com.fyber.inneractive.sdk.flow.nativead;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.network.z0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f5370a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ com.fyber.inneractive.sdk.util.g c;
    public final /* synthetic */ p d;

    public m(p pVar, i iVar, boolean z, com.fyber.inneractive.sdk.util.g gVar) {
        this.d = pVar;
        this.f5370a = iVar;
        this.b = z;
        this.c = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0073  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        com.fyber.inneractive.sdk.click.o oVar;
        Iterator it;
        p pVar = this.d;
        i iVar = this.f5370a;
        boolean z = this.b;
        com.fyber.inneractive.sdk.util.g gVar = this.c;
        pVar.getClass();
        String str = iVar.f5368a;
        String str2 = iVar.b;
        if (v.a(str)) {
            oVar = new n(pVar, iVar, str2, gVar);
        } else {
            if (!v.a(str2)) {
                j jVar = (j) pVar.f5375a;
                i iVar2 = jVar.f5369a;
                if (iVar2 == null || iVar2.equals(iVar)) {
                    IAlog.a("%s : No valid link object, origin: %s", j.d, gVar);
                } else {
                    p pVar2 = jVar.c;
                    i iVar3 = jVar.f5369a;
                    pVar2.getClass();
                    com.fyber.inneractive.sdk.util.r.f5965a.execute(new m(pVar2, iVar3, true, gVar));
                }
                p pVar3 = this.d;
                i iVar4 = this.f5370a;
                pVar3.getClass();
                it = iVar4.c.iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    if (!TextUtils.isEmpty(str3)) {
                        z0.b(str3);
                    }
                }
            }
            oVar = new o(pVar, iVar, gVar);
            str = str2;
        }
        k kVar = ((j) pVar.f5375a).b;
        if (kVar != null) {
            kVar.a(str, z, gVar, oVar);
        }
        p pVar32 = this.d;
        i iVar42 = this.f5370a;
        pVar32.getClass();
        it = iVar42.c.iterator();
        while (it.hasNext()) {
        }
    }
}
