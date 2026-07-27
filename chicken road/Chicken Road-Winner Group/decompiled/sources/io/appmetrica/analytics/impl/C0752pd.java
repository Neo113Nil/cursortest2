package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.pd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0752pd extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0881ud f8068a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModuleEvent f8069b;

    public C0752pd(C0881ud c0881ud, ModuleEvent moduleEvent) {
        this.f8068a = c0881ud;
        this.f8069b = moduleEvent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0881ud.a(this.f8068a).reportEvent(this.f8069b);
    }
}
