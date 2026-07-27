package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class bh {

    /* renamed from: a, reason: collision with root package name */
    private volatile String f8104a;
    private volatile boolean b;
    private volatile int c;
    private volatile int d = -1;

    public final void a(int i, String controllerUrl) {
        Intrinsics.checkNotNullParameter(controllerUrl, "controllerUrl");
        this.c = i;
        this.d = i;
        this.b = true;
        this.f8104a = controllerUrl;
        IronLog.INTERNAL.verbose("Reset load state for attempt " + i + ", pending URL: " + controllerUrl);
    }

    public final String b() {
        if (this.d != this.c) {
            IronLog.INTERNAL.verbose("Ignoring stale onPageFinished callback from attempt " + this.d + ", current attempt is " + this.c);
            return null;
        }
        this.b = false;
        if (this.f8104a == null) {
            return null;
        }
        IronLog.INTERNAL.verbose("BLANK_PAGE load completed for attempt " + this.c + ", now loading controller");
        String str = this.f8104a;
        this.f8104a = null;
        return str;
    }

    public final boolean c() {
        return this.b;
    }

    public final void a() {
        this.f8104a = null;
        this.b = false;
        this.c = 0;
        this.d = -1;
    }
}
