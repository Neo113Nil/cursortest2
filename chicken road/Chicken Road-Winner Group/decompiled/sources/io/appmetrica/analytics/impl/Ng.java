package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* loaded from: classes.dex */
public final class Ng implements Ol {

    /* renamed from: a, reason: collision with root package name */
    public final Em f6326a;

    public Ng(Em em) {
        this.f6326a = em;
    }

    @Override // io.appmetrica.analytics.impl.Ol
    public final void a() {
        NetworkTask c3 = this.f6326a.c();
        if (c3 != null) {
            C0878ua.f8414H.getClass();
            NetworkServiceLocator.getInstance().getNetworkCore().startTask(c3);
        }
    }
}
