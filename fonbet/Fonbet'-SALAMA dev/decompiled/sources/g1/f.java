package g1;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import d1.n;
import n1.AbstractC1455j;
import n1.ExecutorC1453h;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13086a;

    /* renamed from: b, reason: collision with root package name */
    public final g f13087b;

    public /* synthetic */ f(g gVar, int i7) {
        this.f13086a = i7;
        this.f13087b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar;
        f fVar;
        boolean isEmpty;
        boolean isEmpty2;
        switch (this.f13086a) {
            case 0:
                synchronized (this.f13087b.f13097y) {
                    g gVar2 = this.f13087b;
                    gVar2.f13098z = (Intent) gVar2.f13097y.get(0);
                }
                Intent intent = this.f13087b.f13098z;
                if (intent != null) {
                    String action = intent.getAction();
                    int intExtra = this.f13087b.f13098z.getIntExtra("KEY_START_ID", 0);
                    n d7 = n.d();
                    String str = g.f13088B;
                    d7.b(str, String.format("Processing command %s, %s", this.f13087b.f13098z, Integer.valueOf(intExtra)), new Throwable[0]);
                    PowerManager.WakeLock a2 = AbstractC1455j.a(this.f13087b.f13090a, action + " (" + intExtra + ")");
                    try {
                        n.d().b(str, "Acquiring operation wake lock (" + action + ") " + a2, new Throwable[0]);
                        a2.acquire();
                        g gVar3 = this.f13087b;
                        gVar3.f13095f.d(gVar3.f13098z, intExtra, gVar3);
                        n.d().b(str, "Releasing operation wake lock (" + action + ") " + a2, new Throwable[0]);
                        a2.release();
                        gVar = this.f13087b;
                        fVar = new f(gVar, 1);
                    } catch (Throwable th) {
                        try {
                            n d8 = n.d();
                            String str2 = g.f13088B;
                            d8.c(str2, "Unexpected error in onHandleIntent", th);
                            n.d().b(str2, "Releasing operation wake lock (" + action + ") " + a2, new Throwable[0]);
                            a2.release();
                            gVar = this.f13087b;
                            fVar = new f(gVar, 1);
                        } catch (Throwable th2) {
                            n.d().b(g.f13088B, "Releasing operation wake lock (" + action + ") " + a2, new Throwable[0]);
                            a2.release();
                            g gVar4 = this.f13087b;
                            gVar4.e(new f(gVar4, 1));
                            throw th2;
                        }
                    }
                    gVar.e(fVar);
                    return;
                }
                return;
            default:
                g gVar5 = this.f13087b;
                gVar5.getClass();
                n d9 = n.d();
                String str3 = g.f13088B;
                d9.b(str3, "Checking if commands are complete.", new Throwable[0]);
                gVar5.c();
                synchronized (gVar5.f13097y) {
                    try {
                        if (gVar5.f13098z != null) {
                            n.d().b(str3, String.format("Removing command %s", gVar5.f13098z), new Throwable[0]);
                            if (!((Intent) gVar5.f13097y.remove(0)).equals(gVar5.f13098z)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            gVar5.f13098z = null;
                        }
                        ExecutorC1453h executorC1453h = (ExecutorC1453h) gVar5.f13091b.f17925b;
                        b bVar = gVar5.f13095f;
                        synchronized (bVar.f13070c) {
                            isEmpty = bVar.f13069b.isEmpty();
                        }
                        if (isEmpty && gVar5.f13097y.isEmpty()) {
                            synchronized (executorC1453h.f15313c) {
                                isEmpty2 = executorC1453h.f15311a.isEmpty();
                            }
                            if (isEmpty2) {
                                n.d().b(str3, "No more commands & intents.", new Throwable[0]);
                                SystemAlarmService systemAlarmService = gVar5.f13089A;
                                if (systemAlarmService != null) {
                                    systemAlarmService.a();
                                }
                            }
                        }
                        if (!gVar5.f13097y.isEmpty()) {
                            gVar5.f();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
        }
    }
}
