package p047g1;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import p023d1.n;
import p096n1.h;
import p096n1.j;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f13093b;

    public /* synthetic */ f(g gVar, int i7) {
        this.f13092a = i7;
        this.f13093b = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0093 A[Catch: all -> 0x004b, TryCatch #4 {all -> 0x004b, blocks: (B:6:0x001e, B:8:0x0022, B:10:0x0047, B:13:0x004d, B:14:0x0054, B:15:0x0055, B:16:0x005f, B:20:0x0069, B:22:0x0071, B:23:0x0073, B:27:0x007d, B:29:0x008c, B:37:0x009e, B:33:0x0092, B:34:0x0093, B:36:0x009b, B:41:0x00a2, B:24:0x0074, B:25:0x007a, B:17:0x0060, B:18:0x0066), top: B:72:0x001e, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x009b A[Catch: all -> 0x004b, TryCatch #4 {all -> 0x004b, blocks: (B:6:0x001e, B:8:0x0022, B:10:0x0047, B:13:0x004d, B:14:0x0054, B:15:0x0055, B:16:0x005f, B:20:0x0069, B:22:0x0071, B:23:0x0073, B:27:0x007d, B:29:0x008c, B:37:0x009e, B:33:0x0092, B:34:0x0093, B:36:0x009b, B:41:0x00a2, B:24:0x0074, B:25:0x007a, B:17:0x0060, B:18:0x0066), top: B:72:0x001e, inners: #1, #2 }] */
    @Override // java.lang.Runnable
    public final void run() {
        g gVar;
        f fVar;
        boolean zIsEmpty;
        boolean zIsEmpty2;
        switch (this.f13092a) {
            case 0:
                synchronized (this.f13093b.f13103y) {
                    g gVar2 = this.f13093b;
                    gVar2.f13104z = (Intent) gVar2.f13103y.get(0);
                    break;
                }
                Intent intent = this.f13093b.f13104z;
                if (intent != null) {
                    String action = intent.getAction();
                    int intExtra = this.f13093b.f13104z.getIntExtra("KEY_START_ID", 0);
                    n nVarD = n.d();
                    String str = g.f13094B;
                    nVarD.b(str, String.format("Processing command %s, %s", this.f13093b.f13104z, Integer.valueOf(intExtra)), new Throwable[0]);
                    PowerManager.WakeLock wakeLockA = j.a(this.f13093b.f13096a, action + " (" + intExtra + ")");
                    try {
                        n.d().b(str, "Acquiring operation wake lock (" + action + ") " + wakeLockA, new Throwable[0]);
                        wakeLockA.acquire();
                        g gVar3 = this.f13093b;
                        gVar3.f13101f.d(gVar3.f13104z, intExtra, gVar3);
                        n.d().b(str, "Releasing operation wake lock (" + action + ") " + wakeLockA, new Throwable[0]);
                        wakeLockA.release();
                        gVar = this.f13093b;
                        fVar = new f(gVar, 1);
                    } catch (Throwable th) {
                        try {
                            n nVarD2 = n.d();
                            String str2 = g.f13094B;
                            nVarD2.c(str2, "Unexpected error in onHandleIntent", th);
                            n.d().b(str2, "Releasing operation wake lock (" + action + ") " + wakeLockA, new Throwable[0]);
                            wakeLockA.release();
                            gVar = this.f13093b;
                            fVar = new f(gVar, 1);
                        } catch (Throwable th2) {
                            n.d().b(g.f13094B, "Releasing operation wake lock (" + action + ") " + wakeLockA, new Throwable[0]);
                            wakeLockA.release();
                            g gVar4 = this.f13093b;
                            gVar4.e(new f(gVar4, 1));
                            throw th2;
                        }
                    }
                    gVar.e(fVar);
                    return;
                }
                return;
            default:
                g gVar5 = this.f13093b;
                gVar5.getClass();
                n nVarD3 = n.d();
                String str3 = g.f13094B;
                nVarD3.b(str3, "Checking if commands are complete.", new Throwable[0]);
                gVar5.c();
                synchronized (gVar5.f13103y) {
                    try {
                        if (gVar5.f13104z != null) {
                            n.d().b(str3, String.format("Removing command %s", gVar5.f13104z), new Throwable[0]);
                            if (!((Intent) gVar5.f13103y.remove(0)).equals(gVar5.f13104z)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            gVar5.f13104z = null;
                        }
                        h hVar = (h) gVar5.f13097b.f17931b;
                        b bVar = gVar5.f13101f;
                        synchronized (bVar.f13076c) {
                            zIsEmpty = bVar.f13075b.isEmpty();
                            break;
                        }
                        if (zIsEmpty && gVar5.f13103y.isEmpty()) {
                            synchronized (hVar.f15319c) {
                                zIsEmpty2 = hVar.f15317a.isEmpty();
                                break;
                            }
                            if (zIsEmpty2) {
                                n.d().b(str3, "No more commands & intents.", new Throwable[0]);
                                SystemAlarmService systemAlarmService = gVar5.f13095A;
                                if (systemAlarmService != null) {
                                    systemAlarmService.a();
                                }
                            } else if (!gVar5.f13103y.isEmpty()) {
                                gVar5.f();
                            }
                        } else if (!gVar5.f13103y.isEmpty()) {
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
