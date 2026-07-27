package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.rd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0952rd extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1030ud f9166a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f9167b;

    public C0952rd(C1030ud c1030ud, boolean z) {
        this.f9166a = c1030ud;
        this.f9167b = z;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C1030ud.a(this.f9166a).a(this.f9167b, false);
    }
}
