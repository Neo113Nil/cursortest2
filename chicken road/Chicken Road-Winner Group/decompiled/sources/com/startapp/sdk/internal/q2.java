package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.model.AdPreferences;

/* loaded from: classes.dex */
public final class q2 extends p2 {
    public q2(w2 w2Var) {
        super(w2Var);
    }

    @Override // com.startapp.sdk.internal.p2
    public final boolean a() {
        gh ghVar = fh.f3695a;
        AdPreferences.Placement placement = this.f4199a.f4564l;
        return (ghVar.f3780e || ghVar.f3778c) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    @Override // com.startapp.sdk.internal.p2
    public final long b() {
        ?? r02 = this.f4199a.f4567o;
        if (r02 == 0) {
            return -1L;
        }
        Long adCacheTtl = r02.getAdCacheTtl();
        Long lastLoadTime = r02.getLastLoadTime();
        if (adCacheTtl == null || lastLoadTime == null) {
            return -1L;
        }
        long longValue = adCacheTtl.longValue() - (System.currentTimeMillis() - lastLoadTime.longValue());
        if (longValue >= 0) {
            return longValue;
        }
        return 0L;
    }
}
