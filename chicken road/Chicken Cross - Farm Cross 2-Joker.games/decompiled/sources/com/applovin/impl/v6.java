package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;

/* loaded from: classes5.dex */
class v6 extends n5 {
    private final y7 g;
    private final AppLovinAdLoadListener h;

    v6(y7 y7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
        super("TaskResolveVastWrapper", lVar);
        this.h = appLovinAdLoadListener;
        this.g = y7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        String a2 = g8.a(this.g);
        if (!StringUtils.isValidString(a2)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.b(this.b, "Resolving VAST failed. Could not find resolution URL");
            }
            a(-1);
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a(this.b, "Resolving VAST ad with depth " + this.g.d() + " at " + a2);
        }
        try {
            this.f4351a.s0().a(new a(com.applovin.impl.sdk.network.a.a(this.f4351a).b(a2).c("GET").a(t8.f).a(((Integer) this.f4351a.a(c5.e5)).intValue()).c(((Integer) this.f4351a.a(c5.f5)).intValue()).a(false).a(), this.f4351a));
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Unable to resolve VAST wrapper", th);
            }
            a(-1);
        }
    }

    class a extends r6 {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar) {
            super(aVar, lVar);
        }

        @Override // com.applovin.impl.r6, com.applovin.impl.r0.e
        public void a(String str, t8 t8Var, int i) {
            this.f4351a.s0().a(n6.a(t8Var, v6.this.g, v6.this.h, v6.this.f4351a));
        }

        @Override // com.applovin.impl.r6, com.applovin.impl.r0.e
        public void a(String str, int i, String str2, t8 t8Var) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.b(this.b, "Unable to resolve VAST wrapper. Server returned " + i);
            }
            v6.this.a(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.b(this.b, "Failed to resolve VAST wrapper due to error code " + i);
        }
        if (i == -1009) {
            AppLovinAdLoadListener appLovinAdLoadListener = this.h;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(i);
                return;
            }
            return;
        }
        g8.a(this.g, this.h, i == -1001 ? z7.TIMED_OUT : z7.GENERAL_WRAPPER_ERROR, i, this.f4351a);
    }
}
