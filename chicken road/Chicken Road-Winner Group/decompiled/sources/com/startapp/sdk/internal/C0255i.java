package com.startapp.sdk.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashMap;

/* renamed from: com.startapp.sdk.internal.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0255i extends e6 {

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3847c;

    public C0255i(Context context, ConnectivityManager connectivityManager) {
        super(context, connectivityManager);
        this.f3847c = new HashMap();
    }

    @Override // com.startapp.sdk.internal.e6
    public final int a() {
        int i3;
        synchronized (this.f3847c) {
            try {
                i3 = 0;
                for (Integer num : this.f3847c.values()) {
                    if (num != null) {
                        i3 |= num.intValue();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i3;
    }

    @Override // com.startapp.sdk.internal.e6
    public final void b() {
        if (p0.a(this.f3614a, "android.permission.ACCESS_NETWORK_STATE")) {
            this.f3615b.registerDefaultNetworkCallback(new C0254h(this));
        }
    }
}
