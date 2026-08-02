package com.amplitude.android.utilities;

import android.content.Context;
import android.net.Network;
import com.amplitude.android.plugins.e;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g {
    public final com.amplitude.common.a a;
    public final e.c b;

    public static final class a {
        public final Network a;
        public final e.c b;
        public boolean c;
        public boolean d;

        public a(Network network, e.c networkCallback, boolean z) {
            Intrinsics.checkNotNullParameter(network, "network");
            Intrinsics.checkNotNullParameter(networkCallback, "networkCallback");
            this.a = network;
            this.b = networkCallback;
            this.c = z;
            this.d = false;
            if (!z) {
                networkCallback.a();
                return;
            }
            com.amplitude.core.b bVar = networkCallback.a;
            bVar.i().c("AndroidNetworkListener, onNetworkAvailable.");
            bVar.a.z = Boolean.FALSE;
            bVar.e();
        }

        public static void a(a aVar, Network network, boolean z, boolean z2, int i) {
            if ((i & 2) != 0) {
                z = aVar.c;
            }
            if ((i & 4) != 0) {
                z2 = aVar.d;
            }
            aVar.getClass();
            Intrinsics.checkNotNullParameter(network, "network");
            if (Intrinsics.areEqual(aVar.a, network)) {
                boolean z3 = (aVar.c == z && aVar.d == z2) ? false : true;
                aVar.c = z;
                aVar.d = z2;
                if (z3) {
                    e.c cVar = aVar.b;
                    if (!z || z2) {
                        cVar.a();
                        return;
                    }
                    com.amplitude.core.b bVar = cVar.a;
                    bVar.i().c("AndroidNetworkListener, onNetworkAvailable.");
                    bVar.a.z = Boolean.FALSE;
                    bVar.e();
                }
            }
        }
    }

    public g(Context context, com.amplitude.common.a logger, e.c networkCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(networkCallback, "networkCallback");
        this.a = logger;
        this.b = networkCallback;
    }
}
