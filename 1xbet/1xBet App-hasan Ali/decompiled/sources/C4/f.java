package C4;

import com.google.android.gms.internal.ads.C1071hd;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import t3.AbstractC2425d;
import y4.n;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final y4.e f871k;

    /* renamed from: l, reason: collision with root package name */
    public volatile AtomicInteger f872l = new AtomicInteger(0);

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f873m;

    public f(i iVar, y4.e eVar) {
        this.f873m = iVar;
        this.f871k = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1071hd c1071hd;
        String concat = "OkHttp ".concat(((n) this.f873m.f877l.f811b).g());
        i iVar = this.f873m;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(concat);
        try {
            iVar.f879n.h();
            boolean z3 = false;
            try {
                try {
                } catch (Throwable th) {
                    iVar.f876k.f21411k.d(this);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f871k.k(iVar.i());
                c1071hd = iVar.f876k.f21411k;
            } catch (IOException e5) {
                e = e5;
                z3 = true;
                if (z3) {
                    G4.n nVar = G4.n.f2016a;
                    G4.n nVar2 = G4.n.f2016a;
                    String str = "Callback failure for " + i.a(iVar);
                    nVar2.getClass();
                    G4.n.i(4, str, e);
                } else {
                    this.f871k.l(iVar, e);
                }
                c1071hd = iVar.f876k.f21411k;
                c1071hd.d(this);
            } catch (Throwable th3) {
                th = th3;
                z3 = true;
                iVar.cancel();
                if (!z3) {
                    IOException iOException = new IOException("canceled due to " + th);
                    AbstractC2425d.j(iOException, th);
                    this.f871k.l(iVar, iOException);
                }
                throw th;
            }
            c1071hd.d(this);
        } finally {
            currentThread.setName(name);
        }
    }
}
