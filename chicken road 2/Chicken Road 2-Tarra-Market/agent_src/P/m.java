package P;

import android.content.Context;
import android.util.Log;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f324a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f325b;

    public /* synthetic */ m(int i2, Object obj) {
        this.f324a = i2;
        this.f325b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j2;
        switch (this.f324a) {
            case 0:
                ((o) this.f325b).h();
                return;
            case 1:
                O.c cVar = ((o) ((C0.a) this.f325b).f51b).f329b;
                cVar.i(cVar.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 2:
                ((y) this.f325b).f374h.b(new N.b(4));
                return;
            case 3:
                throw null;
            case 4:
                Y.e eVar = (Y.e) this.f325b;
                long j3 = Y.e.r((Context) eVar.f523b).getLong("app_set_id_last_used_time", -1L);
                long j4 = j3 != -1 ? j3 + 33696000000L : -1L;
                if (j4 == -1 || System.currentTimeMillis() <= j4) {
                    return;
                }
                Context context = (Context) eVar.f523b;
                if (!Y.e.r(context).edit().remove(CommonUrlParts.APP_SET_ID).commit()) {
                    String valueOf = String.valueOf(context.getPackageName());
                    Log.e("AppSet", valueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(valueOf) : new String("Failed to clear app set ID generated for App "));
                }
                if (context.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                    return;
                }
                String valueOf2 = String.valueOf(context.getPackageName());
                Log.e("AppSet", valueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(valueOf2) : new String("Failed to clear app set ID last used time for App "));
                return;
            case 5:
                synchronized (((e0.g) this.f325b).f963c) {
                    e0.f fVar = ((e0.g) this.f325b).f964d;
                    if (fVar != null) {
                        e0.k kVar = (e0.k) fVar.f960d;
                        synchronized (kVar.f968a) {
                            try {
                                if (!kVar.f970c) {
                                    kVar.f970c = true;
                                    kVar.f971d = true;
                                    kVar.f969b.d(kVar);
                                }
                            } finally {
                            }
                        }
                    }
                }
                return;
            case 6:
                break;
            default:
                ((C0.b) this.f325b).getClass();
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        while (true) {
            i1.g gVar = (i1.g) this.f325b;
            long nanoTime = System.nanoTime();
            synchronized (gVar) {
                try {
                    Iterator it = gVar.f1335d.iterator();
                    l1.c cVar2 = null;
                    long j5 = Long.MIN_VALUE;
                    int i2 = 0;
                    int i3 = 0;
                    while (it.hasNext()) {
                        l1.c cVar3 = (l1.c) it.next();
                        if (gVar.a(cVar3, nanoTime) > 0) {
                            i3++;
                        } else {
                            i2++;
                            long j6 = nanoTime - cVar3.f6102o;
                            if (j6 > j5) {
                                cVar2 = cVar3;
                                j5 = j6;
                            }
                        }
                    }
                    j2 = gVar.f1333b;
                    if (j5 < j2 && i2 <= gVar.f1332a) {
                        if (i2 > 0) {
                            j2 -= j5;
                        } else if (i3 <= 0) {
                            gVar.f1337f = false;
                            j2 = -1;
                        }
                    }
                    gVar.f1335d.remove(cVar2);
                    j1.d.d(cVar2.f6092e);
                    j2 = 0;
                } finally {
                }
            }
            if (j2 == -1) {
                return;
            }
            if (j2 > 0) {
                long j7 = j2 / 1000000;
                long j8 = j2 - (1000000 * j7);
                synchronized (((i1.g) this.f325b)) {
                    try {
                        ((i1.g) this.f325b).wait(j7, (int) j8);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    public m(j jVar, B b2) {
        this.f324a = 3;
        this.f325b = b2;
    }
}
