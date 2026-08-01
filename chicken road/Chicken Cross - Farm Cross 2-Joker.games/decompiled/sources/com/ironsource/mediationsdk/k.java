package com.ironsource.mediationsdk;

import com.ironsource.C4293aa;
import com.ironsource.C4561o2;
import com.ironsource.C4629s;
import com.ironsource.C4749yb;
import com.ironsource.V8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    private HashSet<ImpressionDataListener> f8412a;
    protected C4629s b;
    protected C4293aa c;
    protected AdInfo d;

    public k(HashSet<ImpressionDataListener> hashSet, C4293aa c4293aa) {
        new HashSet();
        this.f8412a = hashSet;
        this.b = new C4629s();
        this.c = c4293aa;
    }

    public void a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f8412a.add(impressionDataListener);
        }
    }

    public void b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f8412a.remove(impressionDataListener);
        }
    }

    public void c() {
        this.d = null;
    }

    public void a(C4293aa c4293aa) {
        this.c = c4293aa;
    }

    public void b() {
        synchronized (this) {
            this.f8412a.clear();
        }
    }

    public void a(V8 v8, C4749yb c4749yb) {
        if (v8 != null) {
            this.d = new AdInfo(v8, c4749yb);
        }
    }

    protected void a(C4561o2 c4561o2, String str) {
        HashSet hashSet;
        if (c4561o2 != null) {
            V8 a2 = c4561o2.a(str);
            if (a2 != null) {
                synchronized (this) {
                    hashSet = (HashSet) this.f8412a.clone();
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ImpressionDataListener impressionDataListener = (ImpressionDataListener) it.next();
                    IronLog.CALLBACK.info("onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + a2);
                    impressionDataListener.onImpressionSuccess(a2);
                }
                return;
            }
            return;
        }
        IronLog.INTERNAL.verbose("no auctionResponseItem or listener");
    }

    protected String a() {
        return "fallback_" + System.currentTimeMillis();
    }

    protected void a(JSONObject jSONObject, IronSource.a aVar) {
        this.b.a(aVar, jSONObject != null ? jSONObject.optBoolean(d.f, false) : false);
    }

    protected void a(IronSource.a aVar) {
        this.b.a(aVar, false);
    }
}
