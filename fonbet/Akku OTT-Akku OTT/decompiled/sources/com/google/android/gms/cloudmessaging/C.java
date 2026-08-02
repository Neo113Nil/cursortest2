package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.internal.cloudmessaging.zze;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes4.dex */
public final class C {

    @Nullable
    public static C e;
    public final Context a;
    public final ScheduledExecutorService b;
    public w c = new w(this);
    public int d = 1;

    @VisibleForTesting
    public C(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
        this.a = context.getApplicationContext();
    }

    public static synchronized C a(Context context) {
        C c;
        synchronized (C.class) {
            try {
                if (e == null) {
                    zze.zza();
                    e = new C(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new NamedThreadFactory("MessengerIpcClient"))));
                }
                c = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    public final synchronized Task b(z zVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Queueing ".concat(zVar.toString());
            }
            if (!this.c.d(zVar)) {
                w wVar = new w(this);
                this.c = wVar;
                wVar.d(zVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return zVar.b.getTask();
    }
}
