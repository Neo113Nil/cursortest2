package i2;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import f2.m;
import p2.AbstractC2253k;
import p2.ExecutorC2251i;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f17324k;

    /* renamed from: l, reason: collision with root package name */
    public final h f17325l;

    public /* synthetic */ f(h hVar, int i) {
        this.f17324k = i;
        this.f17325l = hVar;
    }

    private final void a() {
        int i = 1;
        synchronized (this.f17325l.f17338r) {
            h hVar = this.f17325l;
            hVar.f17339s = (Intent) hVar.f17338r.get(0);
        }
        Intent intent = this.f17325l.f17339s;
        if (intent != null) {
            String action = intent.getAction();
            int intExtra = this.f17325l.f17339s.getIntExtra("KEY_START_ID", 0);
            m d5 = m.d();
            String str = h.f17330u;
            d5.a(str, String.format("Processing command %s, %s", this.f17325l.f17339s, Integer.valueOf(intExtra)), new Throwable[0]);
            PowerManager.WakeLock a5 = AbstractC2253k.a(this.f17325l.f17331k, action + " (" + intExtra + ")");
            try {
                m.d().a(str, "Acquiring operation wake lock (" + action + ") " + a5, new Throwable[0]);
                a5.acquire();
                h hVar2 = this.f17325l;
                hVar2.f17336p.e(hVar2.f17339s, intExtra, hVar2);
                m.d().a(str, "Releasing operation wake lock (" + action + ") " + a5, new Throwable[0]);
                a5.release();
                h hVar3 = this.f17325l;
                hVar3.f(new f(hVar3, i));
            } catch (Throwable th) {
                try {
                    m d6 = m.d();
                    String str2 = h.f17330u;
                    d6.b(str2, "Unexpected error in onHandleIntent", th);
                    m.d().a(str2, "Releasing operation wake lock (" + action + ") " + a5, new Throwable[0]);
                    a5.release();
                    h hVar4 = this.f17325l;
                    hVar4.f(new f(hVar4, i));
                } catch (Throwable th2) {
                    m.d().a(h.f17330u, "Releasing operation wake lock (" + action + ") " + a5, new Throwable[0]);
                    a5.release();
                    h hVar5 = this.f17325l;
                    hVar5.f(new f(hVar5, i));
                    throw th2;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17324k) {
            case 0:
                a();
                return;
            default:
                h hVar = this.f17325l;
                hVar.getClass();
                m d5 = m.d();
                String str = h.f17330u;
                d5.a(str, "Checking if commands are complete.", new Throwable[0]);
                hVar.c();
                synchronized (hVar.f17338r) {
                    try {
                        if (hVar.f17339s != null) {
                            m.d().a(str, String.format("Removing command %s", hVar.f17339s), new Throwable[0]);
                            if (!((Intent) hVar.f17338r.remove(0)).equals(hVar.f17339s)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            hVar.f17339s = null;
                        }
                        ExecutorC2251i executorC2251i = (ExecutorC2251i) hVar.f17332l.f20432l;
                        if (!hVar.f17336p.d() && hVar.f17338r.isEmpty() && !executorC2251i.a()) {
                            m.d().a(str, "No more commands & intents.", new Throwable[0]);
                            SystemAlarmService systemAlarmService = hVar.f17340t;
                            if (systemAlarmService != null) {
                                systemAlarmService.c();
                            }
                        } else if (!hVar.f17338r.isEmpty()) {
                            hVar.g();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
