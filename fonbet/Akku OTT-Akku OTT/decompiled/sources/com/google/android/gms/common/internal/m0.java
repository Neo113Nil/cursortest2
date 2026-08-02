package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0852b;
import com.google.android.gms.internal.common.zzh;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class m0 extends AbstractC0867i {
    public final HashMap d = new HashMap();
    public final Context e;
    public volatile zzh f;
    public final com.google.android.gms.common.stats.a g;
    public final long h;
    public final long i;

    public m0(Context context, Looper looper) {
        l0 l0Var = new l0(this);
        this.e = context.getApplicationContext();
        this.f = new zzh(looper, l0Var);
        this.g = com.google.android.gms.common.stats.a.b();
        this.h = 5000L;
        this.i = 300000L;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0867i
    public final C0852b b(j0 j0Var, c0 c0Var, String str, @Nullable Executor executor) {
        synchronized (this.d) {
            try {
                k0 k0Var = (k0) this.d.get(j0Var);
                C0852b c0852b = null;
                if (executor == null) {
                    executor = null;
                }
                if (k0Var == null) {
                    k0Var = new k0(this, j0Var);
                    k0Var.a.put(c0Var, c0Var);
                    c0852b = k0.a(k0Var, str, executor);
                    this.d.put(j0Var, k0Var);
                } else {
                    this.f.removeMessages(0, j0Var);
                    if (k0Var.a.containsKey(c0Var)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(j0Var.toString()));
                    }
                    k0Var.a.put(c0Var, c0Var);
                    int i = k0Var.b;
                    if (i == 1) {
                        c0Var.onServiceConnected(k0Var.f, k0Var.d);
                    } else if (i == 2) {
                        c0852b = k0.a(k0Var, str, executor);
                    }
                }
                if (k0Var.c) {
                    return C0852b.e;
                }
                if (c0852b == null) {
                    c0852b = new C0852b(-1);
                }
                return c0852b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC0867i
    public final void c(j0 j0Var, ServiceConnection serviceConnection) {
        C0875q.h(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.d) {
            try {
                k0 k0Var = (k0) this.d.get(j0Var);
                if (k0Var == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(j0Var.toString()));
                }
                if (!k0Var.a.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(j0Var.toString()));
                }
                k0Var.a.remove(serviceConnection);
                if (k0Var.a.isEmpty()) {
                    this.f.sendMessageDelayed(this.f.obtainMessage(0, j0Var), this.h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
