package io.appmetrica.analytics.location.impl;

/* loaded from: classes.dex */
public final class h implements io.appmetrica.analytics.coreapi.internal.backport.Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.location.impl.m f7214a;

    public h(io.appmetrica.analytics.location.impl.m mVar) {
        this.f7214a = mVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(android.location.Location location) {
        if (location != null) {
            this.f7214a.updateData(location);
        }
    }
}
