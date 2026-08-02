package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.internal.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0858j {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f11312a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static N f11313b;

    /* renamed from: c, reason: collision with root package name */
    public static HandlerThread f11314c;

    public static N a(Context context) {
        synchronized (f11312a) {
            try {
                if (f11313b == null) {
                    f11313b = new N(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f11313b;
    }

    public final void b(String str, String str2, ServiceConnection serviceConnection, boolean z4) {
        K k7 = new K(str, str2, z4);
        N n2 = (N) this;
        D.j(serviceConnection, "ServiceConnection must not be null");
        synchronized (n2.f11285d) {
            try {
                L l7 = (L) n2.f11285d.get(k7);
                if (l7 == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(k7.toString()));
                }
                if (!l7.f11268a.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(k7.toString()));
                }
                l7.f11268a.remove(serviceConnection);
                if (l7.f11268a.isEmpty()) {
                    n2.f11287f.sendMessageDelayed(n2.f11287f.obtainMessage(0, k7), n2.f11289h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract boolean c(K k7, H h6, String str, Executor executor);
}
