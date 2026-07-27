package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.rd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0803rd extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0881ud f8222a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f8223b;

    public C0803rd(C0881ud c0881ud, boolean z3) {
        this.f8222a = c0881ud;
        this.f8223b = z3;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0881ud.a(this.f8222a).a(this.f8223b, false);
    }
}
