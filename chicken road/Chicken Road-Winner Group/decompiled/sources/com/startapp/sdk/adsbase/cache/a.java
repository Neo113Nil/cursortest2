package com.startapp.sdk.adsbase.cache;

import com.startapp.sdk.internal.C0256j;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.o;
import com.startapp.sdk.internal.o6;
import com.startapp.sdk.internal.p;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3195a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o6 f3196b;

    public a(o6 o6Var, ArrayList arrayList) {
        this.f3196b = o6Var;
        this.f3195a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0256j c0256j = this.f3196b.f4131b;
        ArrayList arrayList = this.f3195a;
        if (arrayList != null) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    DiskAdCacheManager$DiskCacheKey diskAdCacheManager$DiskCacheKey = (DiskAdCacheManager$DiskCacheKey) it.next();
                    c0256j.f3888a.a(null, diskAdCacheManager$DiskCacheKey.placement, diskAdCacheManager$DiskCacheKey.adPreferences, true, diskAdCacheManager$DiskCacheKey.a(), null, null);
                }
            } catch (Throwable th) {
                d9.a(th);
            }
        }
        p pVar = c0256j.f3888a;
        pVar.f4181c = false;
        Iterator it2 = pVar.f4182d.iterator();
        while (it2.hasNext()) {
            o oVar = (o) it2.next();
            pVar.a(oVar.f4121a, oVar.f4122b, oVar.f4123c, false, 0, oVar.f4124d, null);
        }
        pVar.f4182d.clear();
    }
}
