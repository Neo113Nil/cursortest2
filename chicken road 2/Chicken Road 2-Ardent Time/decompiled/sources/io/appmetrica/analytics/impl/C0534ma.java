package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ma, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0534ma implements io.appmetrica.analytics.impl.InterfaceC0518lk {
    @Override // io.appmetrica.analytics.impl.InterfaceC0518lk
    public final void onCreate() {
        io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator.getInstance().onCreate();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0518lk
    public final void onDestroy() {
        io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator.getInstance().onDestroy();
    }
}
