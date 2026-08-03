package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ig implements io.appmetrica.analytics.impl.Kl {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Am f4453a;

    public Ig(io.appmetrica.analytics.impl.Am am) {
        this.f4453a = am;
    }

    @Override // io.appmetrica.analytics.impl.Kl
    public final void a() {
        io.appmetrica.analytics.networktasks.internal.NetworkTask c2 = this.f4453a.c();
        if (c2 != null) {
            io.appmetrica.analytics.impl.C0560na.f6484I.getClass();
            io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator.getInstance().getNetworkCore().startTask(c2);
        }
    }
}
