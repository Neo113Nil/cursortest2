package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;

/* renamed from: io.appmetrica.analytics.impl.ta, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0852ta implements InterfaceC0759pk {
    @Override // io.appmetrica.analytics.impl.InterfaceC0759pk
    public final void onCreate() {
        NetworkServiceLocator.getInstance().onCreate();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0759pk
    public final void onDestroy() {
        NetworkServiceLocator.getInstance().onDestroy();
    }
}
