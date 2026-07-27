package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.qd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0778qd extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0881ud f8152a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8153b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f8154c;

    public C0778qd(C0881ud c0881ud, int i3, String str) {
        this.f8152a = c0881ud;
        this.f8153b = i3;
        this.f8154c = str;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0881ud.a(this.f8152a).a(new M9(this.f8153b, this.f8154c));
    }
}
