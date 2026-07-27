package com.unity3d.player.a;

import android.content.Context;
import android.net.ConnectivityManager;

/* renamed from: com.unity3d.player.a.w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4893w extends C4891u {
    public int b;
    public final C4892v c;

    public C4893w(Context context) {
        super(context);
        this.b = 0;
        C4892v c4892v = new C4892v(this);
        this.c = c4892v;
        if (this.f11776a == null) {
            return;
        }
        this.b = super.b();
        this.f11776a.registerDefaultNetworkCallback(c4892v);
    }

    @Override // com.unity3d.player.a.C4891u
    public final int b() {
        return this.b;
    }

    @Override // com.unity3d.player.a.C4891u
    public final void a() {
        ConnectivityManager connectivityManager = this.f11776a;
        if (connectivityManager == null) {
            return;
        }
        connectivityManager.unregisterNetworkCallback(this.c);
    }
}
