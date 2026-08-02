package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class s62 implements ServiceConnection {

    /* JADX INFO: renamed from: j */
    public int f7039j = 0;

    /* JADX INFO: renamed from: k */
    public final Messenger f7040k;

    /* JADX INFO: renamed from: l */
    public a81 f7041l;

    /* JADX INFO: renamed from: m */
    public final ArrayDeque f7042m;

    /* JADX INFO: renamed from: n */
    public final SparseArray f7043n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ g92 f7044o;

    public s62(g92 g92Var) {
        this.f7044o = g92Var;
        bm1 bm1Var = new bm1(Looper.getMainLooper(), new g80(1, this));
        Looper.getMainLooper();
        this.f7040k = new Messenger(bm1Var);
        this.f7042m = new ArrayDeque();
        this.f7043n = new SparseArray();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m4486a(String str) {
        m4487b(str, null);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m4487b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i = this.f7039j;
            if (i == 0) {
                throw new IllegalStateException();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.f7039j = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f7039j = 4;
            b90.m606u().m625w((Context) this.f7044o.f2672k, this);
            p61 p61Var = new p61(str, securityException);
            Iterator it = this.f7042m.iterator();
            while (it.hasNext()) {
                ((a82) it.next()).m101b(p61Var);
            }
            this.f7042m.clear();
            int i2 = 0;
            while (true) {
                int size = this.f7043n.size();
                SparseArray sparseArray = this.f7043n;
                if (i2 >= size) {
                    sparseArray.clear();
                    return;
                } else {
                    ((a82) sparseArray.valueAt(i2)).m101b(p61Var);
                    i2++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m4488c() {
        try {
            if (this.f7039j == 2 && this.f7042m.isEmpty() && this.f7043n.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f7039j = 3;
                b90.m606u().m625w((Context) this.f7044o.f2672k, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized boolean m4489d(a82 a82Var) {
        int i = this.f7039j;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                this.f7042m.add(a82Var);
                return true;
            }
            int i3 = 0;
            if (i != 2) {
                return false;
            }
            this.f7042m.add(a82Var);
            ((ScheduledExecutorService) this.f7044o.f2673l).execute(new z02(this, i3));
            return true;
        }
        this.f7042m.add(a82Var);
        if (this.f7039j != 0) {
            throw new IllegalStateException();
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f7039j = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (b90.m606u().m623s((Context) this.f7044o.f2672k, intent, this, 1)) {
                ((ScheduledExecutorService) this.f7044o.f2673l).schedule(new z02(this, i2), 30L, TimeUnit.SECONDS);
            } else {
                m4486a("Unable to bind to service");
            }
        } catch (SecurityException e) {
            m4487b("Unable to bind to service", e);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f7044o.f2673l).execute(new f31(this, iBinder, 12, false));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i = 2;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f7044o.f2673l).execute(new z02(this, i));
    }
}
