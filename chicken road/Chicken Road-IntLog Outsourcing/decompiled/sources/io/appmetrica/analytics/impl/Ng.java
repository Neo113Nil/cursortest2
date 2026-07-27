package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* loaded from: classes.dex */
public final class Ng implements Ol {

    /* renamed from: a, reason: collision with root package name */
    public final Em f7183a;

    public Ng(Em em) {
        this.f7183a = em;
    }

    @Override // io.appmetrica.analytics.impl.Ol
    public final void a() {
        NetworkTask c2 = this.f7183a.c();
        if (c2 != null) {
            C1027ua.f9366H.getClass();
            NetworkServiceLocator.getInstance().getNetworkCore().startTask(c2);
        }
    }
}
