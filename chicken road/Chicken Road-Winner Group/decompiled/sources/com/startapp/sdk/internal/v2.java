package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class v2 implements AdEventListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4506a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4507b = false;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w2 f4508c;

    public v2(w2 w2Var) {
        this.f4508c = w2Var;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
        ConcurrentHashMap concurrentHashMap;
        List<StartAppAd> list;
        if (this.f4507b) {
            concurrentHashMap = null;
        } else {
            synchronized (this.f4508c.f4574v) {
                concurrentHashMap = new ConcurrentHashMap(this.f4508c.f4574v);
                w2 w2Var = this.f4508c;
                w2Var.f4567o = null;
                w2Var.f4574v.clear();
            }
        }
        this.f4507b = true;
        this.f4508c.f4573u.d();
        this.f4508c.f4572t.e();
        this.f4508c.f4568p.set(false);
        if (concurrentHashMap != null) {
            for (AdEventListener adEventListener : concurrentHashMap.keySet()) {
                if (adEventListener != null) {
                    this.f4508c.getClass();
                    try {
                        list = (List) concurrentHashMap.get(adEventListener);
                    } catch (Throwable th) {
                        d9.a(th);
                        list = null;
                    }
                    if (list != null) {
                        for (StartAppAd startAppAd : list) {
                            if (ad != null) {
                                startAppAd.setErrorMessage(ad.getErrorMessage());
                            }
                            adEventListener.onFailedToReceiveAd(startAppAd);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        List list;
        ?? r02 = this.f4508c.f4567o;
        boolean z3 = r02 != 0 && r02.getVideoCancelCallBack();
        this.f4508c.f4572t.d();
        n2 n2Var = this.f4508c.f4573u;
        n2Var.e();
        n2Var.f = 0;
        n2Var.f4084g = false;
        this.f4508c.f4568p.set(false);
        if (this.f4506a || z3) {
            return;
        }
        this.f4506a = true;
        synchronized (this.f4508c.f4574v) {
            try {
                for (AdEventListener adEventListener : this.f4508c.f4574v.keySet()) {
                    if (adEventListener != null) {
                        try {
                            list = (List) this.f4508c.f4574v.get(adEventListener);
                        } catch (Throwable th) {
                            d9.a(th);
                            list = null;
                        }
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                ((StartAppAd) it.next()).setErrorMessage(ad.getErrorMessage());
                                adEventListener.onReceiveAd(ad);
                            }
                        }
                    }
                }
                this.f4508c.f4574v.clear();
            } finally {
            }
        }
    }
}
