package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0852b;
import com.google.android.gms.common.util.zzc;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class k0 implements ServiceConnection, n0 {
    public final HashMap a = new HashMap();
    public int b = 2;
    public boolean c;

    @Nullable
    public IBinder d;
    public final j0 e;
    public ComponentName f;
    public final /* synthetic */ m0 i;

    public k0(m0 m0Var, j0 j0Var) {
        this.i = m0Var;
        this.e = j0Var;
    }

    public static C0852b a(k0 k0Var, String str, Executor executor) {
        try {
            Intent a = k0Var.e.a(k0Var.i.e);
            k0Var.b = 3;
            StrictMode.VmPolicy zza = zzc.zza();
            try {
                m0 m0Var = k0Var.i;
                boolean d = m0Var.g.d(m0Var.e, str, a, k0Var, 4225, executor);
                k0Var.c = d;
                if (d) {
                    k0Var.i.f.sendMessageDelayed(k0Var.i.f.obtainMessage(1, k0Var.e), k0Var.i.i);
                    C0852b c0852b = C0852b.e;
                    StrictMode.setVmPolicy(zza);
                    return c0852b;
                }
                k0Var.b = 2;
                try {
                    m0 m0Var2 = k0Var.i;
                    m0Var2.g.c(m0Var2.e, k0Var);
                } catch (IllegalArgumentException unused) {
                }
                C0852b c0852b2 = new C0852b(16);
                StrictMode.setVmPolicy(zza);
                return c0852b2;
            } catch (Throwable th) {
                StrictMode.setVmPolicy(zza);
                throw th;
            }
        } catch (X e) {
            return e.a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.i.d) {
            try {
                this.i.f.removeMessages(1, this.e);
                this.d = iBinder;
                this.f = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.i.d) {
            try {
                this.i.f.removeMessages(1, this.e);
                this.d = null;
                this.f = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
