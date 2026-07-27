package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.od, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0726od extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0881ud f7993a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f7994b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f7995c;

    public C0726od(C0881ud c0881ud, AdRevenue adRevenue, boolean z3) {
        this.f7993a = c0881ud;
        this.f7994b = adRevenue;
        this.f7995c = z3;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0881ud.a(this.f7993a).reportAdRevenue(this.f7994b, this.f7995c);
    }
}
