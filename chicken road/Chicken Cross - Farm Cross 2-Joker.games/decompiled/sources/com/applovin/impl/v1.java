package com.applovin.impl;

import com.applovin.impl.sdk.a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class v1 implements a.InterfaceC0082a {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f4534a;
    private final Map b = new HashMap();
    private final Object c = new Object();

    public v1(com.applovin.impl.sdk.l lVar) {
        this.f4534a = lVar;
    }

    public void a(g3 g3Var) {
        if (a4.b(g3Var)) {
            if (!this.f4534a.f().a(g3Var, this)) {
                this.f4534a.Z().destroyAd(g3Var);
                return;
            }
            synchronized (this.c) {
                String adUnitId = g3Var.getAdUnitId();
                List list = (List) this.b.get(adUnitId);
                if (list == null) {
                    list = new ArrayList();
                    this.b.put(adUnitId, list);
                }
                double H = g3Var.H();
                int i = 0;
                while (i < list.size() && H <= ((g3) list.get(i)).H()) {
                    i++;
                }
                list.add(i, g3Var);
                if (list.size() > ((Integer) this.f4534a.a(v3.Q8)).intValue()) {
                    g3 g3Var2 = (g3) list.remove(list.size() - 1);
                    this.f4534a.f().a(g3Var2);
                    this.f4534a.Z().destroyAd(g3Var2);
                    this.f4534a.R().a(h2.M0, g3Var2);
                }
            }
        }
    }

    public void b(g3 g3Var) {
        synchronized (this.c) {
            List list = (List) this.b.get(g3Var.getAdUnitId());
            if (CollectionUtils.isEmpty(list)) {
                return;
            }
            list.remove(g3Var);
            this.f4534a.f().a(g3Var);
        }
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0082a
    public void onAdExpired(u1 u1Var) {
        g3 g3Var = (g3) u1Var;
        this.f4534a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f4534a.Q().a("FailoverAdCacheManager", "Failover ad expired for ad unit: " + g3Var.getAdUnitId() + ". Removing from cache");
        }
        b(g3Var);
        this.f4534a.Z().destroyAd(g3Var);
        this.f4534a.R().a(h2.L0, g3Var);
    }

    public g3 a(String str) {
        synchronized (this.c) {
            List list = (List) this.b.get(str);
            if (CollectionUtils.isEmpty(list)) {
                return null;
            }
            return (g3) list.get(0);
        }
    }
}
