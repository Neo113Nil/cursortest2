package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0445j implements io.appmetrica.analytics.coreapi.internal.system.ActiveNetworkTypeProvider {
    @Override // io.appmetrica.analytics.coreapi.internal.system.ActiveNetworkTypeProvider
    public final io.appmetrica.analytics.coreapi.internal.system.NetworkType getNetworkType(android.content.Context context) {
        io.appmetrica.analytics.impl.Ce ce = io.appmetrica.analytics.impl.Ge.f4329a;
        return (io.appmetrica.analytics.coreapi.internal.system.NetworkType) io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils.accessSystemServiceSafelyOrDefault((android.net.ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", io.appmetrica.analytics.coreapi.internal.system.NetworkType.UNDEFINED, new io.appmetrica.analytics.impl.Fe());
    }
}
