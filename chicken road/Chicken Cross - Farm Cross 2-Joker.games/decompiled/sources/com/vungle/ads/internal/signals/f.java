package com.vungle.ads.internal.signals;

import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.model.w2;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;

/* loaded from: classes7.dex */
public final class f extends com.vungle.ads.internal.util.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f12123a;

    public f(j jVar) {
        this.f12123a = jVar;
    }

    @Override // com.vungle.ads.internal.util.b
    public final void a() {
        boolean z = u.f12190a;
        t.a("SignalManager", "SignalManager#onBackground()");
        this.f12123a.c = System.currentTimeMillis();
        j jVar = this.f12123a;
        jVar.e = (jVar.c - jVar.d) + jVar.e;
    }

    @Override // com.vungle.ads.internal.util.b
    public final void b() {
        Integer num;
        boolean z = u.f12190a;
        t.a("SignalManager", "SignalManager#onForeground()");
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.f12123a.c;
        ConfigManager.INSTANCE.getClass();
        w2 w2Var = ConfigManager.f11882a;
        if (j > ((w2Var == null || (num = w2Var.l) == null) ? 1800 : num.intValue()) * 1000) {
            j jVar = this.f12123a;
            jVar.f();
            jVar.h = new c(jVar.f);
        }
        j jVar2 = this.f12123a;
        jVar2.d = currentTimeMillis;
        jVar2.c = 0L;
    }
}
