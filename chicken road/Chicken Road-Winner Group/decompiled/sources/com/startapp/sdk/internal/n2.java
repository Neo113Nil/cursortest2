package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.cache.FailuresHandler;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class n2 extends p2 {

    /* renamed from: e, reason: collision with root package name */
    public final FailuresHandler f4083e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4084g;

    public n2(w2 w2Var) {
        super(w2Var);
        this.f4083e = CacheMetaData.b().a().c();
        this.f = 0;
        this.f4084g = false;
    }

    @Override // com.startapp.sdk.internal.p2
    public final boolean a() {
        FailuresHandler failuresHandler;
        gh ghVar = fh.f3695a;
        if (ghVar.f3778c || ghVar.f3780e || (failuresHandler = this.f4083e) == null || failuresHandler.a() == null) {
            return false;
        }
        if (this.f4084g) {
            return this.f4083e.b();
        }
        return true;
    }

    @Override // com.startapp.sdk.internal.p2
    public final long b() {
        Long l3;
        if (this.f >= this.f4083e.a().size() || (l3 = this.f4201c) == null) {
            return -1L;
        }
        long millis = TimeUnit.SECONDS.toMillis(((Integer) this.f4083e.a().get(this.f)).intValue()) - (System.currentTimeMillis() - l3.longValue());
        if (millis >= 0) {
            return millis;
        }
        return 0L;
    }

    @Override // com.startapp.sdk.internal.p2
    public final void c() {
        if (this.f == this.f4083e.a().size() - 1) {
            this.f4084g = true;
        } else {
            this.f++;
        }
        super.c();
    }
}
