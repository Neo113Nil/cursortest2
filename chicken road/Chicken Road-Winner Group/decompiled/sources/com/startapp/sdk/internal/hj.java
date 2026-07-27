package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.ads.video.VideoAdDetails;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.cache.CachedVideoAd;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class hj {

    /* renamed from: a, reason: collision with root package name */
    public LinkedList f3838a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final Context f3839b;

    /* renamed from: c, reason: collision with root package name */
    public final ib f3840c;

    /* renamed from: d, reason: collision with root package name */
    public final ib f3841d;

    public hj(Context context, ib ibVar, ib ibVar2) {
        this.f3839b = context;
        this.f3840c = ibVar;
        this.f3841d = ibVar2;
    }

    public final boolean a(int i3) {
        ArrayList arrayList;
        ij ijVar;
        VideoAdDetails videoAdDetails;
        Iterator it = this.f3838a.iterator();
        boolean z3 = false;
        while (it.hasNext() && this.f3838a.size() > i3) {
            CachedVideoAd cachedVideoAd = (CachedVideoAd) it.next();
            p pVar = (p) this.f3841d.a();
            String a3 = cachedVideoAd.a();
            synchronized (pVar) {
                arrayList = new ArrayList(pVar.f4179a.values());
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    Ad ad = ((w2) it2.next()).f4567o;
                    if (!(ad instanceof ij) || (videoAdDetails = (ijVar = (ij) ad).f3886r) == null || videoAdDetails.getLocalVideoPath() == null || !ijVar.f3886r.getLocalVideoPath().equals(a3)) {
                    }
                } else {
                    it.remove();
                    if (cachedVideoAd.a() != null) {
                        new File(cachedVideoAd.a()).delete();
                    }
                    z3 = true;
                }
            }
        }
        return z3;
    }
}
