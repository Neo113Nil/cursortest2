package com.startapp.sdk.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;

/* loaded from: classes.dex */
public final class m0 extends e6 {
    public m0(Context context, ConnectivityManager connectivityManager) {
        super(context, connectivityManager);
    }

    @Override // com.startapp.sdk.internal.e6
    public final int a() {
        if (!p0.a(this.f3614a, "android.permission.ACCESS_NETWORK_STATE")) {
            return 0;
        }
        int i3 = 0;
        for (Network network : this.f3615b.getAllNetworks()) {
            if (network != null) {
                i3 |= f6.a(this.f3615b.getNetworkCapabilities(network));
            }
        }
        return i3;
    }
}
