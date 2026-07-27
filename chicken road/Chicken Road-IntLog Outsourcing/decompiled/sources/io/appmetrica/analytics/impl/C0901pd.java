package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.pd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0901pd extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1030ud f9004a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModuleEvent f9005b;

    public C0901pd(C1030ud c1030ud, ModuleEvent moduleEvent) {
        this.f9004a = c1030ud;
        this.f9005b = moduleEvent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C1030ud.a(this.f9004a).reportEvent(this.f9005b);
    }
}
