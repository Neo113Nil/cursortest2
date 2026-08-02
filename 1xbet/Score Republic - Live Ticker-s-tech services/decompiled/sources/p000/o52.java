package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class o52 implements ServiceConnection {

    /* JADX INFO: renamed from: j */
    public final HashMap f5630j = new HashMap();

    /* JADX INFO: renamed from: k */
    public int f5631k = 2;

    /* JADX INFO: renamed from: l */
    public boolean f5632l;

    /* JADX INFO: renamed from: m */
    public IBinder f5633m;

    /* JADX INFO: renamed from: n */
    public final k42 f5634n;

    /* JADX INFO: renamed from: o */
    public ComponentName f5635o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ j72 f5636p;

    public o52(j72 j72Var, k42 k42Var) {
        this.f5636p = j72Var;
        this.f5634n = k42Var;
    }

    /* JADX INFO: renamed from: a */
    public final C0253gl m3629a(String str, Executor executor) {
        try {
            Intent intentM2697a = ir1.m2697a(this.f5636p.f3843b, this.f5634n);
            this.f5631k = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(pu1.m3993a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                j72 j72Var = this.f5636p;
                b90 b90Var = j72Var.f3845d;
                Context context = j72Var.f3843b;
                k42 k42Var = this.f5634n;
                boolean zM627y = b90Var.m627y(context, str, intentM2697a, this, 4225, executor);
                this.f5632l = zM627y;
                if (zM627y) {
                    j72Var.f3844c.sendMessageDelayed(j72Var.f3844c.obtainMessage(1, k42Var), j72Var.f3847f);
                    return C0253gl.f2794o;
                }
                this.f5631k = 2;
                try {
                    j72Var.f3845d.m625w(j72Var.f3843b, this);
                } catch (IllegalArgumentException unused) {
                }
                return new C0253gl(16, null, null);
            } finally {
                StrictMode.setVmPolicy(vmPolicy);
            }
        } catch (wp1 e) {
            return e.f8625j;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        j72 j72Var = this.f5636p;
        synchronized (j72Var.f3842a) {
            try {
                j72Var.f3844c.removeMessages(1, this.f5634n);
                this.f5633m = iBinder;
                this.f5635o = componentName;
                Iterator it = this.f5630j.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f5631k = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        j72 j72Var = this.f5636p;
        synchronized (j72Var.f3842a) {
            try {
                j72Var.f3844c.removeMessages(1, this.f5634n);
                this.f5633m = null;
                this.f5635o = componentName;
                Iterator it = this.f5630j.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f5631k = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
