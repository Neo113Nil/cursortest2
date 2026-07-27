package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class Ai extends C0736on {

    /* renamed from: d, reason: collision with root package name */
    public final RunnableC1014zi f5704d;

    /* renamed from: e, reason: collision with root package name */
    public final ICommonExecutor f5705e;

    public Ai(C0459e5 c0459e5, Ol ol, ICommonExecutor iCommonExecutor) {
        super(c0459e5, ol);
        this.f5704d = new RunnableC1014zi(this);
        this.f5705e = iCommonExecutor;
    }

    @Override // io.appmetrica.analytics.impl.C0736on
    public final void a() {
        this.f5705e.remove(this.f5704d);
    }

    @Override // io.appmetrica.analytics.impl.C0736on
    public final void f() {
        this.f8024b.a();
        C0756ph c0756ph = (C0756ph) ((C0459e5) this.f8023a).f7202k.a();
        if (c0756ph.f8077k.a(c0756ph.f8076j)) {
            String str = c0756ph.f8079m;
            if (TextUtils.isEmpty(str) || "-1".equals(str)) {
                return;
            }
            try {
                a(C0417ce.a((C0459e5) this.f8023a));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.C0736on
    public final void g() {
        this.f5705e.executeDelayed(this.f5704d, TimeUnit.SECONDS.toMillis(1L));
    }

    public final void h() {
        if (this.f8025c.get()) {
            return;
        }
        this.f5705e.remove(this.f5704d);
        if (((C0756ph) ((C0459e5) this.f8023a).f7202k.a()).f8073g > 0) {
            this.f5705e.executeDelayed(this.f5704d, TimeUnit.SECONDS.toMillis(((C0756ph) ((C0459e5) this.f8023a).f7202k.a()).f8073g));
        }
    }
}
