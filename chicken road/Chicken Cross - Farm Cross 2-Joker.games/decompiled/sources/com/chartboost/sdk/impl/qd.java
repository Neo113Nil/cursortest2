package com.chartboost.sdk.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class qd {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f4974a;
    public final ConnectivityManager b;
    public a c;
    public Object d;

    public interface a {
        void a();

        void b();
    }

    public static final class b extends ConnectivityManager.NetworkCallback {
        public b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
        
            if (r3.hasCapability(12) == true) goto L8;
         */
        @Override // android.net.ConnectivityManager.NetworkCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onAvailable(Network network) {
            a aVar;
            Intrinsics.checkNotNullParameter(network, "network");
            NetworkCapabilities networkCapabilities = qd.this.b.getNetworkCapabilities(network);
            qd qdVar = qd.this;
            boolean z = networkCapabilities != null;
            qdVar.f4974a = z;
            if (!qd.this.f4974a || (aVar = qd.this.c) == null) {
                return;
            }
            aVar.a();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            qd.this.f4974a = false;
            a aVar = qd.this.c;
            if (aVar != null) {
                aVar.b();
            }
        }
    }

    public qd(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.b = (ConnectivityManager) systemService;
    }

    public final ConnectivityManager.NetworkCallback a() {
        return new b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002f, code lost:
    
        if (r0.hasCapability(12) == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(a aVar) {
        this.c = aVar;
        NetworkRequest build = new NetworkRequest.Builder().addCapability(12).build();
        ConnectivityManager.NetworkCallback a2 = a();
        this.d = a2;
        this.b.registerNetworkCallback(build, a2);
        NetworkCapabilities networkCapabilities = this.b.getNetworkCapabilities(this.b.getActiveNetwork());
        boolean z = networkCapabilities != null;
        this.f4974a = z;
        if (!this.f4974a || aVar == null) {
            return;
        }
        aVar.a();
    }

    public final boolean b() {
        return this.f4974a;
    }
}
