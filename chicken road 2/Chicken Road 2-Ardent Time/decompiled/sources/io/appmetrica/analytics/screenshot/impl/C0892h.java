package io.appmetrica.analytics.screenshot.impl;

/* renamed from: io.appmetrica.analytics.screenshot.impl.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0892h implements io.appmetrica.analytics.modulesapi.internal.client.BundleToServiceConfigConverter {
    @Override // io.appmetrica.analytics.modulesapi.internal.client.BundleToServiceConfigConverter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.screenshot.impl.D fromBundle(android.os.Bundle bundle) {
        bundle.setClassLoader(io.appmetrica.analytics.screenshot.impl.D.class.getClassLoader());
        io.appmetrica.analytics.screenshot.impl.D d2 = (io.appmetrica.analytics.screenshot.impl.D) bundle.getParcelable("config");
        return d2 == null ? new io.appmetrica.analytics.screenshot.impl.D(new io.appmetrica.analytics.screenshot.impl.j0()) : d2;
    }
}
