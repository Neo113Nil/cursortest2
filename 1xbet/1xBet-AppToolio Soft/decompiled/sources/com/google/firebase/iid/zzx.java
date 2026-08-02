package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.data.DataBufferSafeParcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
final class zzx implements ServiceConnection {

    @GuardedBy("this")
    int state;
    final Messenger zzbq;
    zzac zzbr;

    @GuardedBy("this")
    final Queue<zzae<?>> zzbs;

    @GuardedBy("this")
    final SparseArray<zzae<?>> zzbt;
    final /* synthetic */ zzv zzbu;

    private zzx(zzv zzvVar) {
        this.zzbu = zzvVar;
        this.state = 0;
        this.zzbq = new Messenger(new Handler(Looper.getMainLooper(), new Handler.Callback(this) { // from class: com.google.firebase.iid.zzy
            private final zzx zzbv;

            {
                this.zzbv = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.zzbv.zza(message);
            }
        }));
        this.zzbs = new ArrayDeque();
        this.zzbt = new SparseArray<>();
    }

    private final void zzs() {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.zzbu.zzbn;
        scheduledExecutorService.execute(new Runnable(this) { // from class: com.google.firebase.iid.zzaa
            private final zzx zzbv;

            {
                this.zzbv = this;
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // java.lang.Runnable
            public final void run() {
                final zzae<?> poll;
                ScheduledExecutorService scheduledExecutorService2;
                Context context;
                final zzx zzxVar = this.zzbv;
                while (true) {
                    synchronized (zzxVar) {
                        if (zzxVar.state != 2) {
                            return;
                        }
                        if (zzxVar.zzbs.isEmpty()) {
                            zzxVar.zzt();
                            return;
                        }
                        poll = zzxVar.zzbs.poll();
                        zzxVar.zzbt.put(poll.zzby, poll);
                        scheduledExecutorService2 = zzxVar.zzbu.zzbn;
                        scheduledExecutorService2.schedule(new Runnable(zzxVar, poll) { // from class: com.google.firebase.iid.zzab
                            private final zzx zzbv;
                            private final zzae zzbw;

                            {
                                this.zzbv = zzxVar;
                                this.zzbw = poll;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zzbv.zza(this.zzbw.zzby);
                            }
                        }, 30L, TimeUnit.SECONDS);
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String valueOf = String.valueOf(poll);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
                        sb.append("Sending ");
                        sb.append(valueOf);
                        Log.d("MessengerIpcClient", sb.toString());
                    }
                    context = zzxVar.zzbu.zzz;
                    Messenger messenger = zzxVar.zzbq;
                    Message obtain = Message.obtain();
                    obtain.what = poll.what;
                    obtain.arg1 = poll.zzby;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", poll.zzv());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle(DataBufferSafeParcelable.DATA_FIELD, poll.zzca);
                    obtain.setData(bundle);
                    try {
                        zzxVar.zzbr.send(obtain);
                    } catch (RemoteException e) {
                        zzxVar.zza(2, e.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        if (iBinder == null) {
            zza(0, "Null service connection");
            return;
        }
        try {
            this.zzbr = new zzac(iBinder);
            this.state = 2;
            zzs();
        } catch (RemoteException e) {
            zza(0, e.getMessage());
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        zza(2, "Service disconnected");
    }

    final synchronized void zza(int i) {
        zzae<?> zzaeVar = this.zzbt.get(i);
        if (zzaeVar != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i);
            Log.w("MessengerIpcClient", sb.toString());
            this.zzbt.remove(i);
            zzaeVar.zza(new zzaf(3, "Timed out waiting for response"));
            zzt();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    final synchronized void zza(int i, String str) {
        Context context;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
        }
        switch (this.state) {
            case 0:
                throw new IllegalStateException();
            case 1:
            case 2:
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Unbinding service");
                }
                this.state = 4;
                ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
                context = this.zzbu.zzz;
                connectionTracker.unbindService(context, this);
                zzaf zzafVar = new zzaf(i, str);
                Iterator<zzae<?>> it = this.zzbs.iterator();
                while (it.hasNext()) {
                    it.next().zza(zzafVar);
                }
                this.zzbs.clear();
                for (int i2 = 0; i2 < this.zzbt.size(); i2++) {
                    this.zzbt.valueAt(i2).zza(zzafVar);
                }
                this.zzbt.clear();
                return;
            case 3:
                this.state = 4;
                return;
            case 4:
                return;
            default:
                int i3 = this.state;
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unknown state: ");
                sb.append(i3);
                throw new IllegalStateException(sb.toString());
        }
    }

    final boolean zza(Message message) {
        int i = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Received response to request: ");
            sb.append(i);
            Log.d("MessengerIpcClient", sb.toString());
        }
        synchronized (this) {
            zzae<?> zzaeVar = this.zzbt.get(i);
            if (zzaeVar == null) {
                StringBuilder sb2 = new StringBuilder(50);
                sb2.append("Received response for unknown request: ");
                sb2.append(i);
                Log.w("MessengerIpcClient", sb2.toString());
                return true;
            }
            this.zzbt.remove(i);
            zzt();
            Bundle data = message.getData();
            if (data.getBoolean("unsupported", false)) {
                zzaeVar.zza(new zzaf(4, "Not supported by GmsCore"));
            } else {
                zzaeVar.zzb(data);
            }
            return true;
        }
    }

    final synchronized boolean zzb(zzae zzaeVar) {
        Context context;
        ScheduledExecutorService scheduledExecutorService;
        switch (this.state) {
            case 0:
                this.zzbs.add(zzaeVar);
                Preconditions.checkState(this.state == 0);
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                }
                this.state = 1;
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
                context = this.zzbu.zzz;
                if (connectionTracker.bindService(context, intent, this, 1)) {
                    scheduledExecutorService = this.zzbu.zzbn;
                    scheduledExecutorService.schedule(new Runnable(this) { // from class: com.google.firebase.iid.zzz
                        private final zzx zzbv;

                        {
                            this.zzbv = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zzbv.zzu();
                        }
                    }, 30L, TimeUnit.SECONDS);
                } else {
                    zza(0, "Unable to bind to service");
                }
                return true;
            case 1:
                this.zzbs.add(zzaeVar);
                return true;
            case 2:
                this.zzbs.add(zzaeVar);
                zzs();
                return true;
            case 3:
            case 4:
                return false;
            default:
                int i = this.state;
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unknown state: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }

    final synchronized void zzt() {
        Context context;
        if (this.state == 2 && this.zzbs.isEmpty() && this.zzbt.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.state = 3;
            ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
            context = this.zzbu.zzz;
            connectionTracker.unbindService(context, this);
        }
    }

    final synchronized void zzu() {
        if (this.state == 1) {
            zza(1, "Timed out while binding");
        }
    }
}
