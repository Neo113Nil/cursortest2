package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class De extends io.appmetrica.analytics.impl.Dc {
    public De(io.appmetrica.analytics.coreapi.internal.system.NetworkType networkType) {
        super(networkType);
        a(1, io.appmetrica.analytics.coreapi.internal.system.NetworkType.WIFI);
        a(0, io.appmetrica.analytics.coreapi.internal.system.NetworkType.CELL);
        a(3, io.appmetrica.analytics.coreapi.internal.system.NetworkType.ETHERNET);
        a(2, io.appmetrica.analytics.coreapi.internal.system.NetworkType.BLUETOOTH);
        a(4, io.appmetrica.analytics.coreapi.internal.system.NetworkType.VPN);
        if (io.appmetrica.analytics.coreutils.internal.AndroidUtils.isApiAchieved(27)) {
            a(6, io.appmetrica.analytics.coreapi.internal.system.NetworkType.LOWPAN);
        }
        if (io.appmetrica.analytics.coreutils.internal.AndroidUtils.isApiAchieved(26)) {
            a(5, io.appmetrica.analytics.coreapi.internal.system.NetworkType.WIFI_AWARE);
        }
    }
}
