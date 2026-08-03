package com.fyber.inneractive.sdk.network.timeouts.request;

/* loaded from: classes3.dex */
public final class c extends com.fyber.inneractive.sdk.network.timeouts.request.a {
    public double m;

    public c(java.lang.String str, com.fyber.inneractive.sdk.config.global.features.k kVar, java.lang.String str2) {
        super(str, kVar, str2);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int a(com.fyber.inneractive.sdk.config.global.features.k kVar, java.lang.String str) {
        return kVar.b(str, this.l);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int b(com.fyber.inneractive.sdk.config.global.features.k kVar, java.lang.String str) {
        java.lang.String str2 = this.l;
        kVar.getClass();
        java.lang.String a2 = com.fyber.inneractive.sdk.config.global.features.k.a(str, "min", "rat", "bidding", com.fyber.inneractive.sdk.config.global.features.k.e(str2));
        java.lang.String a3 = com.fyber.inneractive.sdk.config.global.features.k.a(str, "min", "rat", "bidding", "all_mediators");
        "read".equalsIgnoreCase(str);
        java.lang.Integer a4 = kVar.a(a3);
        int intValue = a4 != null ? a4.intValue() : 5000;
        java.lang.Integer a5 = kVar.a(a2);
        return a5 != null ? a5.intValue() : intValue;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int c(com.fyber.inneractive.sdk.config.global.features.k kVar, java.lang.String str) {
        java.lang.String str2 = this.l;
        kVar.getClass();
        java.lang.String a2 = com.fyber.inneractive.sdk.config.global.features.k.a(str, "rat", "bidding", "perc", com.fyber.inneractive.sdk.config.global.features.k.e(str2));
        java.lang.String a3 = com.fyber.inneractive.sdk.config.global.features.k.a(str, "rat", "bidding", "perc", "all_mediators");
        "read".equalsIgnoreCase(str);
        java.lang.Integer a4 = kVar.a(a3);
        int intValue = a4 != null ? a4.intValue() : 15;
        java.lang.Integer a5 = kVar.a(a2);
        return a5 != null ? a5.intValue() : intValue;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final void d(com.fyber.inneractive.sdk.config.global.features.k kVar, java.lang.String str) {
        super.d(kVar, str);
        java.lang.Boolean c = kVar.c("reverse_retries");
        this.g = c != null ? c.booleanValue() : true;
        java.lang.String a2 = com.fyber.inneractive.sdk.config.global.features.k.a("retry_interval", "rat", "bidding");
        java.lang.Integer a3 = kVar.a(com.fyber.inneractive.sdk.config.global.features.k.a("retry_interval", "all_mediators"));
        int intValue = a3 != null ? a3.intValue() : 100;
        java.lang.Integer a4 = kVar.a(a2);
        if (a4 != null) {
            intValue = a4.intValue();
        }
        this.e = intValue;
        this.c = (this.i + this.h) - (intValue + this.f);
        java.lang.String a5 = com.fyber.inneractive.sdk.config.global.features.k.a("bidding", "irat", com.fyber.inneractive.sdk.config.global.features.k.e(this.l));
        java.lang.Integer a6 = kVar.a(com.fyber.inneractive.sdk.config.global.features.k.a("bidding", "irat", "all_mediators"));
        int intValue2 = a6 != null ? a6.intValue() : 10000;
        java.lang.Integer a7 = kVar.a(a5);
        if (a7 != null) {
            intValue2 = a7.intValue();
        }
        this.d = intValue2;
        this.m = java.lang.Math.min(this.k, this.j) / java.lang.Math.max(this.k, this.j);
        b(this.d);
        this.f3858a = java.lang.Math.max(0, a());
        if (this.g) {
            com.fyber.inneractive.sdk.util.IAlog.a("%s : RequestBiddingAdTimeout shouldReverseRetries - reversing timeouts", com.fyber.inneractive.sdk.util.IAlog.a(this));
            a(0);
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%s : RequestBiddingAdTimeout init timeouts, total retries: %d", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Integer.valueOf(this.f3858a));
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int a(com.fyber.inneractive.sdk.config.global.features.k kVar) {
        java.lang.String str = this.l;
        kVar.getClass();
        java.lang.String a2 = com.fyber.inneractive.sdk.config.global.features.k.a("timeout", "threshold", "rat", "bidding", com.fyber.inneractive.sdk.config.global.features.k.e(str));
        java.lang.Integer a3 = kVar.a(com.fyber.inneractive.sdk.config.global.features.k.a("timeout", "threshold", "rat", "bidding", "all_mediators"));
        int intValue = a3 != null ? a3.intValue() : androidx.compose.animation.core.AnimationConstants.DefaultDurationMillis;
        java.lang.Integer a4 = kVar.a(a2);
        return a4 != null ? a4.intValue() : intValue;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int c() {
        return this.e;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int a(int i) {
        if (this.g) {
            i = this.f3858a - i;
        }
        int i2 = (this.b * i) + this.d;
        com.fyber.inneractive.sdk.util.IAlog.a("%s : RequestBiddingAdTimeout resolveTimeoutForRetry, timeout: %d ms for retry: %d", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i));
        b(i2);
        return i2;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int b() {
        return this.f3858a;
    }

    public final void b(int i) {
        double d = this.m;
        if (d == 1.0d || d == 0.0d) {
            com.fyber.inneractive.sdk.util.IAlog.a("%s : RequestBiddingAdTimeout Ratio: %f, connection and read timeouts should be divided in equal proportions", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Double.valueOf(this.m));
            this.m = 0.5d;
        }
        int i2 = (int) (i * this.m);
        this.h = i2;
        this.i = i - i2;
        com.fyber.inneractive.sdk.util.IAlog.a("%s : RequestBiddingAdTimeout Update timeouts connection: %d read: %d", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Integer.valueOf(this.i), java.lang.Integer.valueOf(this.h));
    }
}
