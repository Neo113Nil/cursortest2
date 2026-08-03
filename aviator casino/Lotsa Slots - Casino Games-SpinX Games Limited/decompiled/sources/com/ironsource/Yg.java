package com.ironsource;

/* loaded from: classes5.dex */
public final class Yg {

    /* renamed from: a, reason: collision with root package name */
    private volatile java.lang.String f6106a;
    private volatile boolean b;
    private volatile int c;
    private volatile int d = -1;

    public final void a(int i, java.lang.String controllerUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(controllerUrl, "controllerUrl");
        this.c = i;
        this.d = i;
        this.b = true;
        this.f6106a = controllerUrl;
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("Reset load state for attempt " + i + ", pending URL: " + controllerUrl);
    }

    public final java.lang.String b() {
        if (this.d != this.c) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("Ignoring stale onPageFinished callback from attempt " + this.d + ", current attempt is " + this.c);
            return null;
        }
        this.b = false;
        if (this.f6106a == null) {
            return null;
        }
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("BLANK_PAGE load completed for attempt " + this.c + ", now loading controller");
        java.lang.String str = this.f6106a;
        this.f6106a = null;
        return str;
    }

    public final boolean c() {
        return this.b;
    }

    public final void a() {
        this.f6106a = null;
        this.b = false;
        this.c = 0;
        this.d = -1;
    }
}
