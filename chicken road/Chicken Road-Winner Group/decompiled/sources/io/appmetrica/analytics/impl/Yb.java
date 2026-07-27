package io.appmetrica.analytics.impl;

import d2.C0279i;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;

/* loaded from: classes.dex */
public final class Yb extends kotlin.jvm.internal.k implements o2.l {

    /* renamed from: a, reason: collision with root package name */
    public static final Yb f6863a = new Yb();

    public Yb() {
        super(1);
    }

    @Override // o2.l
    public final Object invoke(Object obj) {
        ((LocationControllerObserver) obj).stopLocationTracking();
        return C0279i.f4852a;
    }
}
